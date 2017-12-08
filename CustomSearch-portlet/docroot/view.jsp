<%@page import="java.util.List"%>
<%@page import="com.customsearch.SearchAction"%>
<%@page import="org.json.JSONObject"%>
<%@page import="peoplepowerapi.PeoplePowerAPI"%>
<%@page import="com.chola.notificationchannel.service.NoticationCategoryCountLocalServiceUtil"%>
<%@page import="java.util.Enumeration"%>
<%@page import="javax.portlet.PortletSession"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %> 

<portlet:defineObjects />

<portlet:renderURL var="simpleDialogExample"
windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
<portlet:param name="mvcPath" value="/jsp/detail.jsp"/>
</portlet:renderURL>

<link href="<%=request.getContextPath()%>/css/simplePagination.css" type="text/css" rel="stylesheet"/>
<script src="<%=request.getContextPath()%>/js/simplePagination.js"></script>  
        
<aui:script>
	function sendId(empid)
	{
		//alert(empid);
		AUI().use('aui-base',
		'aui-io-plugin-deprecated',
		'liferay-util-window',
		function(A) {
		var popUpWindow=Liferay.Util.Window.getWindow(
		{
		dialog: {
		centered: true,
		constrain2view: true,
		//cssClass: 'yourCSSclassName',
		modal: true,
		resizable: false,
		width: 475
		}
		}
		).plug(
		A.Plugin.IO,
		{
		autoLoad: false
		}).render();
		popUpWindow.show();
		popUpWindow.titleNode.html("Employee Details");
		popUpWindow.io.set('uri','<%=simpleDialogExample%>&id='+empid);
		popUpWindow.io.start();

});   
	}
</aui:script>

  <style>
		.containers{
			width: 800px;
			margin: 0 auto;
		}
		ul.tabs{
			margin: 0px;
			padding: 0px;
			list-style: none;
		}
		ul.tabs li{
			background: none;
			color: #222;
			display: inline-block;
			padding: 10px 15px;
			cursor: pointer;
		}

		ul.tabs li.current{
			background: #ededed;
			color: #222;
		}

		.tab-content{
			display: none;
			background: #ededed;
			padding: 15px;
		}

		.tab-content.current{
			display: inherit;
		}
		.viewprofile
		{
		background: rgb(30, 89, 119) none repeat scroll 0% 0%;
    	color: rgb(255, 255, 255);
    	padding: 2px;
		}
  </style>  
 <script type="text/javascript">
$(document).ready(function(){
	$('ul.tabs li').click(function(){
		var tab_id = $(this).attr('data-tab');

		$('ul.tabs li').removeClass('current');
		$('.tab-content').removeClass('current');

		$(this).addClass('current');
		$("#"+tab_id).addClass('current');
	})
});
</script>     

  
<%
ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	String url=themeDisplay.getURLCurrent();
	String ipPort = themeDisplay.getURLPortal();
	String key = "";
	if(url.contains("="))
	{
		key = url.substring(url.lastIndexOf("=")+1,url.length());
	}
	System.out.println("Key : "+key);
	
	//String screenname=themeDisplay.getUser().getScreenName();
	//String screenname="visuks";
	
	//List<Long> intendedData = SearchAction.getUniqueContentIdBasedOnLoggedInUser(screenname);
	//System.out.println("intendedData : "+intendedData);
	
/* 	String siteName = (String)session.getAttribute("currentSiteName");
	System.out.println("siteName : "+siteName); */
	/* PortletSession portletSessions  = renderRequest.getPortletSession();
	System.out.println("sessionData : "+portletSession); */
	
	//Object value = portletSession.getAttribute("LIFERAY_SHARED_mySpecialVar",PortletSession.APPLICATION_SCOPE);
	//System.out.println("Value : "+value); 
	//portletSession.setAttribute("mySpecialVar",value,PortletSession.APPLICATION_SCOPE);
%> 

<script>
$(document).ready(function(){
	
	var URL_PREFIX = "http://10.9.50.123:8983/solr/chola/select?q=DATA:";
	var URL_SUFFIX = "&wt=json&rows=500";
	var keywrd ='<%=key%>';
	
	alert(keywrd);
	
        	var URL = URL_PREFIX + keywrd + URL_SUFFIX;
			var id = [];
			$.ajax({
				url : URL,
				dataType : 'jsonp',
				jsonp : 'json.wrf',
				success : function(dataresponse) {
					var j=0;
					var l=0;
					var m=0;
					$('.page').empty();
					$('.contentdetails').empty();
					$('#count').empty();
					$('.user').empty();
					$('.doc').empty();
					
					for(var i=0;i<dataresponse.response.docs.length;i++)
						{
						var results = JSON.stringify(dataresponse.response.docs[i]);
						//alert(results);
						
						if(dataresponse.response.docs[i].hasOwnProperty('PAGEURL'))
						{
							//alert(dataresponse.response.docs[i].id);
							$.ajax({
								url : "<portlet:resourceURL id='SearchCall'/>",
								type : 'POST',
								dataType : 'json',
								async: false,
								data : { content_id : dataresponse.response.docs[i].id},
								success : function(datas) {
									//alert(datas.STATUS);
									if(datas.STATUS=="TRUE")
									{
									for(var n=0;n<dataresponse.response.docs[i].FILENAME.length;n++)
									{
									m++;
									$( ".doc" ).append("<div class='doccon'>Page Name : "+dataresponse.response.docs[i].PAGEURL+"<br>Title : "+dataresponse.response.docs[i].TITLE+"<br>Description : "+dataresponse.response.docs[i].DESC+"<br>Documents : "+dataresponse.response.docs[i].FILENAME[n]+"<br><span class='con_more'><a target='_blank' class='all_text_link' href='http://10.9.50.123:8080/group/cholamandalam-investment-and-finance/"+dataresponse.response.docs[i].PAGEURL+"'>View Page</a></span><hr></div>");						
									}
									}
								},
								error : function() {
									console.log("There was an error. Try again please!");
								}
							});
							console.log("DOC");
						}
						 if(dataresponse.response.docs[i].hasOwnProperty('SCREENNAME'))
							{
								console.log("USER");
								l++;
								$( ".user" ).append("<div class='usercon'>Emp Id : "+dataresponse.response.docs[i].SCREENNAME+"<br>Name : "+dataresponse.response.docs[i].FIRSTNAME+" "+dataresponse.response.docs[i].LASTNAME+" "+'<br><input class="viewprofile" type="button" onclick="return sendId(\''+dataresponse.response.docs[i].SCREENNAME+'\')" value="View Profile"/> <hr></div>');
							}
						 if(dataresponse.response.docs[i].hasOwnProperty('PAGE'))
							{
								console.log("PAGE");
								j++;
								$( ".page" ).append("<div class='pagecon'>Page Name : "+dataresponse.response.docs[i].PAGE+"<br><span class='con_more'><a target='_blank' class='all_text_link' href='http://10.9.50.123:8080/group/cholamandalam-investment-and-finance/"+dataresponse.response.docs[i].PAGE+"'>View Page</a></span><hr></div>");
							}
						
						/*  if(data.response.docs[i].hasOwnProperty('DOC'))
						{
							console.log("DOC");
							m++;
							$( ".doc" ).append("<div class='doccon'><a target='_blank' href='http://10.9.50.123:8080/documents/"+results.substring(2,results.length-2)+"'>"+results.substring(2,results.length-2)+"</a><hr></div>");
						}  */
						}
					
					 /* if ($('.page').is(':empty')){
						$( ".page" ).append( "No Pages Found <br>");
						}
					if ($('.content').is(':empty')){
						$( ".content" ).append( "No content Found <br>");
						}
					if ($('.user').is(':empty')){
						$( ".user" ).append( "No Users Found <br>");
						}
					if ($('.doc').is(':empty')){
						$( ".doc" ).append( "No Documents Found <br>");
						}  */
				    var k = j+l+m;
				    $('#count').append($('<div id="data">').html('(' + k + ')'));
					$('#pagecount').append($('<div id="data">').html('(' + j + ')'));
					$('#usercount').append($('<div id="data">').html('(' + l + ')'));
					$('#documentcount').append($('<div id="data">').html('(' + m + ')'));
					
				}

			 });
});
	
</script>
<script>
 /* $(window).load(function(){
	setTimeout(Pagination,5000);
	}); 
	
	function Pagination()
	{
	alert(1);
	var str ="";
	 $(".usercon").each(function() {
	    str = str + "<div class='all'>"+$(this).html() + "</div>";
	 })
	 $(".pagecon").each(function() {
		   str = str + "<div class='all'>"+$(this).html() + "</div>";
	 })
	  $(".contentcon").each(function() {
		   str = str + "<div class='all'>"+$(this).html() + "</div>";
	 })
	 
	 $( ".alldata" ).append(str);
	 
				var items1 = $('#results .alldata .all');   
				var numItems1 = items1.length;
				
                var items2 = $("#usercontent tbody .usercon");
                var numItems2 = items2.length;
                
                var items3 = $("#pagecontent tbody .pagecon");
                var numItems3 = items3.length;
                
                var items4 = $("#contentdoc tbody .contentcon");
                var numItems4 = items4.length;
                
                var items5 = $("#content tbody .datacon");
                var numItems5 = items5.length;
                
                var perPage = 5;

                // Only show the first 2 (or first `per_page`) items initially.
                items1.slice(perPage).hide();
                items2.slice(perPage).hide();
                items3.slice(perPage).hide();
                items4.slice(perPage).hide();
                items5.slice(perPage).hide();

                // Now setup the pagination using the `#pagination` div.
                 $("#pagination").pagination({
                    items: numItems1,
                    itemsOnPage: perPage,
                    cssStyle: "light-theme",

                    // This is the actual page changing functionality.
                    onPageClick: function(pageNumber) {
                        // We need to show and hide `tr`s appropriately.
                        var showFrom = perPage * (pageNumber - 1);
                        var showTo = showFrom + perPage;

                        // We'll first hide everything...
                        items1.hide()
                             // ... and then only show the appropriate rows.
                             .slice(showFrom, showTo).show();
                    }
                }); 
                
               $("#pagination2").pagination({
                    items: numItems2,
                    itemsOnPage: perPage,
                    cssStyle: "light-theme",

                    // This is the actual page changing functionality.
                    onPageClick: function(pageNumber) {
                        // We need to show and hide `tr`s appropriately.
                        var showFrom = perPage * (pageNumber - 1);
                        var showTo = showFrom + perPage;

                        // We'll first hide everything...
                        items2.hide()
                             // ... and then only show the appropriate rows.
                             .slice(showFrom, showTo).show();
                    }
                });
                
                $("#pagination3").pagination({
                    items: numItems3,
                    itemsOnPage: perPage,
                    cssStyle: "light-theme",

                    // This is the actual page changing functionality.
                    onPageClick: function(pageNumber) {
                        // We need to show and hide `tr`s appropriately.
                        var showFrom = perPage * (pageNumber - 1);
                        var showTo = showFrom + perPage;

                        // We'll first hide everything...
                        items3.hide()
                             // ... and then only show the appropriate rows.
                             .slice(showFrom, showTo).show();
                    }
                });
                
                $("#pagination4").pagination({
                    items: numItems4,
                    itemsOnPage: perPage,
                    cssStyle: "light-theme",

                    // This is the actual page changing functionality.
                    onPageClick: function(pageNumber) {
                        // We need to show and hide `tr`s appropriately.
                        var showFrom = perPage * (pageNumber - 1);
                        var showTo = showFrom + perPage;

                        // We'll first hide everything...
                        items4.hide()
                             // ... and then only show the appropriate rows.
                             .slice(showFrom, showTo).show();
                    }
                });
                
                $("#pagination5").pagination({
                    items: numItems5,
                    itemsOnPage: perPage,
                    cssStyle: "light-theme",

                    // This is the actual page changing functionality.
                    onPageClick: function(pageNumber) {
                        // We need to show and hide `tr`s appropriately.
                        var showFrom = perPage * (pageNumber - 1);
                        var showTo = showFrom + perPage;

                        // We'll first hide everything...
                        items5.hide()
                             // ... and then only show the appropriate rows.
                             .slice(showFrom, showTo).show();
                    }
                }); 
	} */
        </script>
        
        <body>
<div class="containers">
	<ul class="tabs">
		<li class="tab-link current" data-tab="tab-1">All Results <div id="count"></div></li>
		<li class="tab-link" data-tab="tab-2">People <div id="usercount"></div></li>
		<li class="tab-link" data-tab="tab-3">Page <div id="pagecount"></div></li>
		<li class="tab-link" data-tab="tab-4">Document <div id="documentcount"></div></li>
	</ul>
</div>    

<div id="tab-1" class="tab-content current">
   <table id="results">
   <!--  <tbody class="alldata"> -->
   <tbody class="page user doc">
    </tbody>
</table>
<div id="pagination"></div>
</div>

<div id="tab-2" class="tab-content">
 <table id="usercontent">
    <tbody class="user">
    </tbody>
</table>
<div id="pagination2"></div>
</div>


<div id="tab-3" class="tab-content">
	<table id="pagecontent">
    <tbody class="page">
    </tbody>
</table>
<div id="pagination3"></div>
</div>


<div id="tab-4" class="tab-content">
	<table id="contentdoc">
    <tbody class="doc">
    </tbody>
</table>
<div id="pagination4"></div>
</div> 

<!-- <div id="tab-5" class="tab-content">
	<table id="content">
    <tbody class="contentdetails">
    </tbody>
</table>
<div id="pagination5"></div>
</div>  -->
</body>
