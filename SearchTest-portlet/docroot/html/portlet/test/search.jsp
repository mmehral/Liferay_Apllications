<%-- <%@page import="javax.portlet.PortletURL"%>
<%@ include file="/html/portlet/test/init.jsp" %>
<%
	PortletURL searchURL = renderResponse.createActionURL();
	searchURL.setParameter("_spage", "/portlet_action/test/search");
	searchURL.setParameter("search", "search");
	searchURL.setWindowState(WindowState.NORMAL);
	
	
	renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
	
	
	
 %>
<form  name="fm1" action="<%= searchURL%>" method="post">  
 <table cellpadding="5" cellspacing="10"  style="border-spacing: 20px 10px;	 border-collapse: separate; ">     
 <!--  <tr>
  	<td>title :</td>
  	<td>content :</td>
  </tr> -->
  
  <tr>	
  	<td> <input type="text" name="<portlet:namespace/>keyword" /></td>
  	<td> <input type="text" name="<portlet:namespace/>searchContent" /></td>
  	</tr>
  	<tr>
  	<td><input type="Submit" value="  Search    " /></td> 
  	</tr> 	
  </table>
  </form> --%>