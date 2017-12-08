<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.model.Portlet"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects />
<%-- 
<liferay-ui:error key="error" message="Link is already present in database"></liferay-ui:error>

<portlet:actionURL var="actionURL" name="external"></portlet:actionURL>
<form action="${actionURL}" method="post">
	<input type="text" name="<portlet:namespace/>external"> <input
		type="submit" value="Add">
</form> --%>
<%-- <portlet:resourceURL var="resourceURL" ></portlet:resourceURL> --%>
<!doctype html>
<html lang="en">
<head>
<link href = "<%=request.getContextPath()%>/js/jquery-ui.css"
         rel = "stylesheet">
     
<script src = "<%=request.getContextPath()%>/js/jquery-ui.js"></script>
    
    
  <script>
  $(document).ready(function() {
  $.ajax({
  url : '<portlet:resourceURL id="resourceURL" />',
  type : 'POST',
  dataType : 'json',
  success : function(data) 
  {
  console.log("D - "+data.monthly.length);
  var values = new Array();

  for (var i in data.monthly) 
   {
	  console.log(data.monthly[i].tag);
	  values.push(data.monthly[i].tag);
	}
  console.log(data.monthly);
 
  /* fruits.push('value1');
  fruits.push('value2');
  console.log(fruits); */
  $( "#tags" ).autocomplete({
      source: values
    }); 
  },
  error: function (jqXHR, exception) {
      var msg = '';
      if (jqXHR.status === 0) {
          msg = 'Not connect.\n Verify Network.';
      } else if (jqXHR.status == 404) {
          msg = 'Requested page not found. [404]';
      } else if (jqXHR.status == 500) {
          msg = 'Internal Server Error [500].';
      } else if (exception === 'parsererror') {
          msg = 'Requested JSON parse failed.';
      } else if (exception === 'timeout') {
          msg = 'Time out error.';
      } else if (exception === 'abort') {
          msg = 'Ajax request aborted.';
      } else {
          msg = 'Uncaught Error.\n' + jqXHR.responseText;
      }
  
  console.log("There was an error. Try again please!" +msg);
  }
  });  
 
  });
  
  </script>
  <%
  PortletURL addURL=renderResponse.createActionURL();
  addURL.setParameter(actionRequest.ACTION_NAME, "addExternalURL");
  %>
</head>
<body>
<div class="tabContent"> <span class="abt_text_head">ADD EXTERNAL&nbsp;<span class="abt_text_headcol">LINKS</span></span> <span class="abt_text_head_sub"></span> <span class="abt_pr_dashed"></span>
          <div class="col-md-12 abt_pr_panel">
<form action="<%=addURL.toString()%>" method="post">
<div class="ui-widget">
  <input type="text" id="tags" name="tags">
  <input type="submit" value="Add Link">
</div>
 </form>

 </div>
</div>
</body>
</html>