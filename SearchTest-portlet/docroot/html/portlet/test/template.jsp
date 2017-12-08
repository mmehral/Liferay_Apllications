<%-- <%@ include file="/html/portlet/test/init.jsp" %>
<tiles:useAttribute id="tilesPortletContent" name="portlet_content" classname="java.lang.String" ignore="true" />   
<div>
   <table>
  <tr>   
    <td> 
    	<div style="float:left;">  
	      <jsp:include page='<%= "/html" + tilesPortletContent %>' flush="true" />
      </div>
     </td>
  </tr>
	</table>      
 </div> --%>