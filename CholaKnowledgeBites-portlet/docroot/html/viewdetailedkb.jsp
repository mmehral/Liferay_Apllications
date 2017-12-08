 <%@page import="com.chola.knowledgebites.service.kbpathLocalServiceUtil"%>
<%@page import="com.chola.knowledgebites.model.kbpath"%>
<%@page import="com.chola.knowledgebites.service.kbdetailsLocalServiceUtil"%>
<%@page import="com.chola.knowledgebites.model.kbdetails"%>
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
        <div class="tabContent" id="about"> <span class="abt_text_head"> KNOWLEDGE <span class="abt_text_headcol">BITES</span></span>
          <div class="row con_main_panel">


<%
String id = request.getParameter("id");
 kbdetails details = kbdetailsLocalServiceUtil.fetchkbdetails(Long.parseLong(id));
 %>

Title : <%=details.getKbtitle()%><br><br>
	Description : <%=details.getKbdesc() %><br><br>
 	<%
 	List<kbpath> filesList=kbpathLocalServiceUtil.getKBDetails(details.getContent_id());
 	
 	for(kbpath kbfiledetails:filesList){
 		
 		String filename=kbfiledetails.getKbfiledoc();
 		
 		if(filename.endsWith(".mp4")){
 			%>
 			<video width="400" controls>
  <source src="<%=kbfiledetails.getKbfiledoc()%>" type="video/mp4"/>
</video>
 			<%
 		}
 		if(filename.endsWith(".jpg"))
 		{
			%>
 		
  <a target="_blank" href="<%=kbfiledetails.getKbfiledoc()%>">
    <img src="<%=kbfiledetails.getKbfiledoc()%>" alt="Forest" width="600" height="400">
  </a>
 			<%
 		}
 		else{
			%>
 			<a href="<%=kbfiledetails.getKbfiledoc()%>" target="_blank"><%=kbfiledetails.getKbfilename()%></a>
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
