<%@page import="com.chola.learningbites.service.lbdetailsLocalServiceUtil"%>
<%@page import="com.chola.learningbites.model.lbdetails"%>
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
        <div class="tabContent" id="about"> <span class="abt_text_head"> LEARNING <span class="abt_text_headcol">BITES</span></span>
          <div class="row con_main_panel">
          
<%
String id = request.getParameter("id");
 lbdetails details = lbdetailsLocalServiceUtil.fetchlbdetails(Long.parseLong(id));
 %>
    <img class="pht_fixed img-responsive" alt="chola" src="/LearningBitesUpload/admin/<%=details.getLbfilepath()%>"/><br><br>
  
  	Title : <%=details.getLbtitle()%><br><br>
	Description : <%=details.getLbdescription() %><br><br>
 	

		  </div>
		  </div>
		  </div>
		  </div>
		  </div>
</body>
</html>
