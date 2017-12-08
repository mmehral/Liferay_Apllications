<%@page import="com.service.cholatalkiespathLocalServiceUtil"%>
<%@page import="com.model.cholatalkiespath"%>
<%@page import="com.model.cholatalkies"%>
<%@page import="com.service.cholatalkiesLocalServiceUtil"%>
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

</head>
<body>
 <portlet:renderURL var="back">
   <portlet:param name="jspPage" value="/html/view.jsp" />
</portlet:renderURL>
<liferay-ui:header title="Home"
	backLabel="Back" backURL="<%=back%>" /> 
	
	<div class="col-md-12" style="text-align:justify;">
    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"> <span class="abt_text_head"> CHOLA <span class="abt_text_headcol">TALKIES</span></span>
          <div class="row con_main_panel">
      
<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
String id = request.getParameter("id");
 cholatalkies details = cholatalkiesLocalServiceUtil.fetchcholatalkies(Long.parseLong(id));
 %>
		Title : <%=details.getVideoName()%><br>
		Description : <%=details.getVideoDesc() %><br>
 	<%
 	List<cholatalkiespath> filesList=cholatalkiespathLocalServiceUtil.cholaTalkiesVideoDetails(details.getContent_id());
 	
 	for(cholatalkiespath kbfiledetails:filesList){
 		String filename=kbfiledetails.getVideoPath();
 			%>
 		
 			<video width="400" controls>
  <source src="/videoGalleryUpload/admin/<%=kbfiledetails.getVideoPath()%>" type="video/mp4"/>
</video>
 <div>
 </div>
 
		  </div>
		  </div>
		  </div>
		  </div>
		  </div>
		  
 <portlet:actionURL var="discussURL1" name="addComment"/>
	<div>
<liferay-ui:ratings
className="<%=cholatalkies.class.getName()%>"
classPK="<%=details.getId() %>" 
numberOfStars="5"
/>
</div>
<div>
<liferay-ui:discussion 
classPK="<%=details.getId() %>" 
userId="<%=themeDisplay.getUserId()%>"
className="<%=cholatalkies.class.getName()%>" 
formAction="<%=discussURL1%>"
ratingsEnabled="<%=true %>"
redirect="<%=themeDisplay.getURLCurrent() %>"
/>
</div>
 			<%
 	}
 	%>
</body>
</html>
