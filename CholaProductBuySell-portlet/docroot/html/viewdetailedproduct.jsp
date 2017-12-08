<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.chola.action.ProductBuySellAction"%>
<%@page import="com.chola.productbuysell.service.BuySellProductsImagesLocalServiceUtil"%>
<%@page import="com.chola.productbuysell.model.BuySellProductsImages"%>
<%@page import="com.chola.productbuysell.service.BuySellProductsLocalServiceUtil"%>
<%@page import="com.chola.productbuysell.model.BuySellProducts"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="java.io.File"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui"  prefix="liferay-ui"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects/>
<html>
<head>
<style>
.hide-bullets {
list-style:none;
margin-left: -40px;
margin-top:20px;
}
.img_buy_size2{width:770px; height:300px !important;}
.img_buy_size3{width:159px; height:94px !important;}

</style>
<script type="text/javascript">

 jQuery(document).ready(function($) {
 
        $('#myCarousel').carousel({
                interval: 5000
        });
 
        $('#carousel-text').html($('#slide-content-0').html());
 
        //Handles the carousel thumbnails
       $('[id^=carousel-selector-]').click( function(){
            var id = this.id.substr(this.id.lastIndexOf("-") + 1);
            var id = parseInt(id);
            $('#myCarousel').carousel(id);
        });
 
 
        // When the carousel slides, auto update the text
        $('#myCarousel').on('slid.bs.carousel', function (e) {
                 var id = $('.item.active').data('slide-number');
                $('#carousel-text').html($('#slide-content-'+id).html());
        });
});

</script>

</head>
<body>
<%

%>
 <portlet:renderURL var="back">
   <portlet:param name="jspPage" value="/view.jsp" />
</portlet:renderURL>
<liferay-ui:header title="Back"
	backLabel="Back" backURL="<%=back%>" /> 
<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
String id = request.getParameter("productId");
 BuySellProducts details = BuySellProductsLocalServiceUtil.fetchBuySellProducts(Long.parseLong(id));
 %>


    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"><span class="abt_text_head abt_text_headcol">Buy / Sell</span>
          <div class="row con_main_panel">


<%-- Title : <%=details.getTitle()%><br>
	<hr>Description : <%=details.getDescription() %><br>
	<hr>View User's Profile : <a href='/web/<%=details.getUserScreenName()%>' target="_blank">Contact User</a> --%>
 	
 		<div class="col-md-12">
                <!-- Slider -->
                <div class="row">
                    <div class="col-xs-12" id="slider">
                        <!-- Top part of the slider -->
                        <div class="row">
                         <div class="col-sm-12" id="carousel-bounding-box">
                          <div class="carousel slide" id="myCarousel">
                          <div class="carousel-inner">
 	<%
 	List<BuySellProductsImages> filesList=BuySellProductsImagesLocalServiceUtil.getProductImages(details.getId());
 	
 	/* for(int i=0;i<filesList.size();i++){
 		BuySellProductsImages kbfiledetails=filesList[i];
 	} */
 	
 	int i=0;
 	for(BuySellProductsImages kbfiledetails:filesList){
 		
 		String filename=kbfiledetails.getImage_path();

			%>
		 <div class="item" data-slide-number="<%=i%>">
                                        <img class="img_buy_size2" src="/BuySellUpload/admin/<%=kbfiledetails.getImage_path()%>"></div>

 			<%
 			i++;
 		 	}
 	%>
 	</div>
 	<script>
      $(document).ready(function(){
    	  $(".item:first").addClass("active");  
      });
</script>
 	<a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                                   <span class="" ><img src="/theme/images/left-arrow.png" style="position: absolute;top: 50%;z-index: 5;display: inline-block;margin-top: -10px;"/></span>                                       
                                    </a>
                                    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                                   <span class=""><img src="/theme/images/right-arrow.png" style="position: absolute;top: 50%;z-index: 5;display: inline-block;margin-top: -10px;margin-left:-15px;"/></span>                                       
                                    </a> 
 	</div>
 	</div>
 	  </div>
 	  </div>
 	  </div>
 	                <div class="" id="slider-thumbs">
                        <!-- Bottom switcher of slider -->
                        <ul class="hide-bullets">
                        <%
                        int j=0;
                     	for(BuySellProductsImages kbfiledetails:filesList){
                        %>
                        <li class="col-xs-4" style="padding:0px;">
                                <a class="thumbnail" id="carousel-selector-<%=j%>"><img class="img_buy_size3" src="/BuySellUpload/admin/<%=kbfiledetails.getImage_path()%>"></a>
                            </li>
                        <%	
                        j++;
                     	}
                        %>
                        </ul>                 
                </div>
 	  </div>
 	   <div class="col-md-12"> <span style="font-size:18px;">Contact:</span></div>
          <div class="col-md-12">
             <div class="col-xs-12" style="padding-left:15px;">
                <div class="col-xs-3" style="padding-left: 0px;padding-right: 0px;"><strong>Name </strong></div>  <div class="col-md-9" style="padding-left: 0px;padding-right: 0px;"> <span class="emp_ddot">:</span><%=details.getSellerName()%></div>
             </div>
              <%
              User user=UserLocalServiceUtil.getUserByScreenName(themeDisplay.getCompanyId(), details.getUserScreenName());
              %>
                <div class="col-xs-12" style="padding-left:15px;">
                 <div class="col-xs-3" style="padding-left: 0px;padding-right: 0px;"><strong>E-mail ID </strong></div>  <div class="col-md-9" style="padding-left: 0px;padding-right: 0px;"> <span class="emp_ddot">:</span><%=user.getEmailAddress() %></div>
             </div>
             
              <div class="col-xs-12" style="padding-left:15px;">
                 <div class="col-xs-3" style="padding-left: 0px;padding-right: 0px;"><strong>Mobile No </strong></div>  <div class="col-md-9" style="padding-left: 0px;padding-right: 0px;"> <span class="emp_ddot">:</span><%=details.getContactNumber()%></div>
             </div>
             
              <div class="col-xs-12" style="padding-left:15px;">
                 <div class="col-xs-3" style="padding-left: 0px;padding-right: 0px;"><strong>Asking Price </strong></div>  <div class="col-md-9" style="padding-left: 0px;padding-right: 0px;"> <span class="emp_ddot">:</span>Rs <%=details.getAskingPrice()%></div>
             </div>
               
                 </div>
 	 <portlet:actionURL var="discussURL1" name="addComment"/>
 	 
 	 
 	 <div>
 	 <br>
 	<br>
<liferay-ui:ratings
className="<%=ProductBuySellAction.class.getName()%>"
classPK="<%=details.getId()%>" type="thumbs"
/> 	 <br>
</div>
 
	<div>
<liferay-ui:ratings
className="<%=ProductBuySellAction.class.getName()%>"
classPK="<%=details.getId()%>"
numberOfStars="5"
/>
</div>
<div>
<liferay-ui:discussion 
userId="<%=themeDisplay.getUserId()%>"
classPK="<%=details.getId()%>"
className="<%=ProductBuySellAction.class.getName()%>" 
formAction="<%=discussURL1%>"
ratingsEnabled="<%=true %>"
redirect="<%=themeDisplay.getURLCurrent() %>"
/>
</div>

</div>
          </div>
          <br>
          <br>
          <br>
          <br>
        </div>
      </div>
</body>
</html>
