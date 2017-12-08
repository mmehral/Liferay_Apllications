<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.chola.livefeed.action.LiveFeedMainAction"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<portlet:defineObjects />
<liferay-theme:defineObjects />
<script type="text/javascript">
function checkdd(that){
	var id=that.id;
	if (isValidDate(that.value)) {

	} else {
	alert("Please enter valid date formate DD/MM/YYYY ");
	document.getElementById(id).value="";
	}
	}

	function isValidDate(sText) {
	var reDate = /(?:0[1-9]|[12][0-9]|3[01])\/(?:0[1-9]|1[0-2])\/(?:19|20\d{2})/;
	return reDate.test(sText);
	}
</script>
 <script type='text/javascript'>

(function()
{
  if( window.localStorage )
  {
    if( !localStorage.getItem('firstLoad') )
    {
      localStorage['firstLoad'] = true;
      window.location.reload();
    }  
    else
      localStorage.removeItem('firstLoad');
  }
})();

</script> 
  <%-- <link
href="https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css"
rel="stylesheet">
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<link rel="stylesheet"
href="<%=request.getContextPath()%>/css/validationEngine.jquery.css"
type="text/css" />


<script
src="<%=request.getContextPath()%>/js/jquery.validationEngine-en.js"
type="text/javascript" charset="utf-8"></script>
<script
src="<%=request.getContextPath()%>/js/jquery.validationEngine.js"
type="text/javascript" charset="utf-8"></script>
<link href="<%=request.getContextPath()%>/css/jquery-ui.css"
rel="stylesheet" /> 
 --%>
 <script>
$(document).ready(function() {
$("#datepicker-13").datepicker({
dateFormat : 'dd/mm/yy'

});
$("#datepicker-14").datepicker({
dateFormat : 'dd/mm/yy',
minDate : 0
});
jQuery("#myForm").validationEngine();
});
</script> 
<portlet:actionURL var="industryURL" windowState="normal"
	name="industryAction">
</portlet:actionURL>
<%-- <link rel="stylesheet"
	href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="<%=request.getContextPath()%>/js/datepicker.js"></script> --%>
<script>
	$(document).ready(function() {
		// $( "#datepicker" ).datepicker();
		$.ajax({
			url : "<portlet:resourceURL id='ContentNewsCall'/>",
			type : 'POST',
			dataType : 'json',
			success : function(data) {
			//alert(data);
				console.log(JSON.stringify(data));
				for ( var i in data) {

					$("#con").append(data[i].content);

				}
				//alert("Content :"+data[i].content)
			},
			error : function() {
				console.log("There was an error. Try again please!");
			}
		});
	});

	function fetch()
	{		
	
		
	$("#con").empty()
	//alert("in fetch function...")
	 var createDate=$("#datepicker-13").val();  
//	alert("create date..."+createDate);
		if(createDate==""||createDate==null)
		{
			alert("Please Enter date...");
			return false;
			
		}
//		alert("Date is "+createDate);
	
	$.ajax({
		url : "<portlet:resourceURL id='ContentCall'/>",
		type : 'POST',
		dataType : 'json',
		data : {
			create_Date : createDate
		},
		success : function(data) {
    //    alert(data);
       			for ( var i in data) {

				$("#con").append(data[i].content);

			}
			/* alert("content.....");
			$("#content").append(data.content);*/
		//	alert(" after append.." + data[i].content);
		//	alert(" after append con.." + data[i].content);
		},
		error : function() {
			console.log("There was an error. Try again please!");
		}
	});
	}


</script>

<script type="text/javascript">
function checkdd(that){
	var id=that.id;
	if (isValidDate(that.value)) {

	} else {
	alert("Please enter valid date formate DD/MM/YYYY ");
	document.getElementById(id).value="";
	}
	}

	function isValidDate(sText) {
	var reDate = /(?:0[1-9]|[12][0-9]|3[01])\/(?:0[1-9]|1[0-2])\/(?:19|20\d{2})/;
	return reDate.test(sText);
	}
</script>
<portlet:renderURL var="showjspURL">
<portlet:param name="mvcPath" value="/html/addmenu.jsp" />
</portlet:renderURL>
<%
	ThemeDisplay display = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	if (display.isSignedIn()) {
		if (request.isUserInRole("Administrator")) {
%>


<a href="<%= showjspURL.toString() %>"  style="float: right;">Add Live Feed</a><br>

<%
	} 
%>

Select Date :(dd/mm/yyyy format only)<br>
 <!-- <input id="datepicker" type="text" name="createDate" placeholder="DD/MM/YYYY" onchange="return checkdd(this)"/>(dd/mm/yyyy)  -->
  <input type="text" id="datepicker-13" name="createDate" placeholder="dd/mm/yyyy" class="validate[required]"> 
 <!-- Select Date :<input type="text" id="datepicker-13" name="createDate"/><hr> -->
    
<!--     <input id="datepicker" type="text" name="createDate" placeholder="DD/MM/YYYY" onchange="return checkdd(this)"/>(dd/mm/yyyy)  -->
 <input type="submit" value="Fetch Live Feeds" onclick="fetch()">
<br>
<br>
   <div class="col-md-12" style="text-align:justify;">
    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"> <span class="abt_text_head"> Live <span class="abt_text_headcol">Feed's</span></span>
          <div class="row con_main_panel">
            <div class="col-md-12 hel_bg_gradi" id="con">
            </div>
            </div>
            </div>
            </div>
            </div>
            </div>
<%
	
	}
%>

<br><br>
<portlet:actionURL var="discussURL" name="addComment"></portlet:actionURL>


<%-- <div>
<liferay-ui:social-bookmarks
    displayStyle="horizontal"
    target="_blank"
    title="Chola Live Feed"
    url="<%= PortalUtil.getCanonicalURL((PortalUtil.getCurrentURL(request)), themeDisplay, layout) %>" 
/>
</div> --%>
<div>
<liferay-ui:ratings
className="<%=LiveFeedMainAction.class.getName()%>"
classPK="11311" type="thumbs"
/> 
</div>
<div>
<liferay-ui:ratings
className="<%=LiveFeedMainAction.class.getName()%>"
classPK="11311" 
numberOfStars="5"
/>
</div>
<div>
<liferay-ui:discussion 
classPK="11311" 
userId="<%=themeDisplay.getUserId()%>"
className="<%=LiveFeedMainAction.class.getName()%>" 
formAction="<%=discussURL %>"
ratingsEnabled="<%=true %>"
redirect="<%=themeDisplay.getURLCurrent() %>"
/>
</div>