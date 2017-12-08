
<%@page import="com.chola.successstories.service.sspathLocalServiceUtil"%>
<%@page import="com.chola.successstories.model.sspath"%>
<%@page import="com.chola.successstories.model.ssdetails"%>
<%@page import="com.chola.successstories.service.ssdetailsLocalServiceUtil"%>
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
        <div class="tabContent" id="about"> <span class="abt_text_head"> SUCCESS <span class="abt_text_headcol">STORIES</span></span>
          <div class="row con_main_panel">
          
<%
String id = request.getParameter("id");
 ssdetails details = ssdetailsLocalServiceUtil.fetchssdetails(Long.parseLong(id));
 
 %>


Title : <%=details.getSstitle()%><br>
Description : <%=details.getSsdesc() %><br>
 	<%
 	List<sspath> filesList=sspathLocalServiceUtil.getSuccessStoriesDetails(details.getContent_id());
 	
 	for(sspath kbfiledetails:filesList){
 		
 		String filename=kbfiledetails.getSsfiledoc();
 		
 		if(filename.endsWith(".mp4")){
 			%>
 			<video width="400" controls>
  <source src="<%=kbfiledetails.getSsfiledoc()%>" type="video/mp4"/>
</video>
 			<%
 		}
 		if(filename.endsWith(".jpg"))
 		{
			%>
 			
  <a target="_blank" href="<%=kbfiledetails.getSsfiledoc()%>">
    <img src="<%=kbfiledetails.getSsfiledoc()%>" class="pht_fixed img-responsive" alt="chola">
  </a>
 			<%
 		}
 		else{
			%>
 			<a href="<%=kbfiledetails.getSsfiledoc()%>" target="_blank"><%=kbfiledetails.getSsfilename()%></a>
 			<%
 		}
 	}
 	%>
		  </div>
		  </div>
		  </div>
		  </div>
		  </div>
</body>
</html>
