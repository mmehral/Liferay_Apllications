<%@page import="com.liferay.portal.kernel.util.UnicodeFormatter"%>
<%@page import="com.service.compliance.service.complianceLocalServiceUtil"%>
<%@page import="com.service.compliance.model.compliance"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>
<html>
<body>
<%

long complianceId = ParamUtil.getInteger(request, "complianceId");
compliance com=null;
com = complianceLocalServiceUtil.getcompliance(complianceId);
	String data=com.getCompliance_description();
System.out.println("Compliance Id before if..." + com.getCompliance_id());
	
	if (complianceId >= 01) 
	{
		
		System.out.print("...........compliance id.........."+complianceId);
		System.out.println("Compliance Id####" + com.getCompliance_id());
	
	
	}
%>
<liferay-ui:error key="error-key" message="Please fill Compliance Description" />
<%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/jsp/editComplianceDetails.jsp");
%>
<liferay-ui:header title="Edit Compliance Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />

<portlet:actionURL var="action" name="submitCompliancehDetails"></portlet:actionURL>

<aui:form action="${action}" method="post">



<aui:input type="text" name="title" label="Tite(Enter Maximum 100 Characters)" helpMessage="Please Enter Charcaters less than 100" value="<%=com.getCompliance_tite()%>">
<aui:validator name="required"></aui:validator>

<aui:validator name="maxLength" errorMessage="Title should not be greater than 100 Characters">100</aui:validator>
<aui:validator name="custom" errorMessage="Only Alphabets are allowed">
 
                                   function (val, fieldNode, ruleValue)
                                       {
                                           var result = true;
                                            var pattern=/[^a-z|^A-Z|^\s]/; 
                                          <!-- var re = /^[ A-Za-z0-9_@./#&+-]*$/ -->
                                          var check = val.match(pattern);
                                          if(check!=null)
                                         {
                                            result=false;
                                          }
                                          val=$.trim(val);
                                         $("#<portlet:namespace />title").val(val);
                                      return result;
                                        }
                            </aui:validator>
</aui:input><br><br>

<aui:input type="text" name="shortdescription" label="Short Description(Enter Maximum 250 Characters)" helpMessage="Please Enter Charcaters less than 250" value="<%=com.getCompliance_shortdescription()%>">
<aui:validator name="required"></aui:validator>

<aui:validator name="maxLength" errorMessage="short description should not be greater than 250 Characters">250</aui:validator>
<aui:validator name="custom" errorMessage="Only Alphabets are allowed">
 
                                   function (val, fieldNode, ruleValue)
                                       {
                                           var result = true;
                                           <!--  var pattern=/[^a-z|^A-Z|^\s]/;  -->
                                          var re = /^[ A-Za-z0-9_@./#&+-]*$/ 
                                          var check = val.match(re);
                                          if(check!=null)
                                         {
                                            result=false;
                                          }
                                          val=$.trim(val);
                                         $("#<portlet:namespace />shortdescription").val(val);
                                      return result;
                                        }
                            </aui:validator>
</aui:input><br><br>

<%-- <aui:input type="text" name="description" label="Description(Enter Maximum 5000 Characters)" helpMessage="Please Enter Charcaters less than 5000" value="<%=com.getCompliance_description()%>">
<aui:validator name="required"></aui:validator>

<aui:validator name="maxLength" errorMessage="Description should not be greater than 5000 Characters">5000</aui:validator>
</aui:input><br><br> --%>

<liferay-ui:input-editor name="description" initMethod="initEditor" 
		width="100" height="400" resizable="true" /><br><br>

<aui:input type="file" name="fileName" label="Please Select file to upload" value="<%=com.getCompliance_document_name()%>">
<aui:validator name="required"></aui:validator>
<aui:validator name="acceptFiles">'pdf,docx,txt,jpg,jpeg,png,tif,gif'</aui:validator>
</aui:input>

<aui:input type="hidden" name="complianceId" value="<%=com.getCompliance_id()%>"></aui:input><br/>

<aui:button-row>
<aui:button type="submit" value="Submit"/>

</aui:button-row>

</aui:form>
<aui:script>
 function <portlet:namespace/>initEditor(){
	return "<%= UnicodeFormatter.toString(data)%>";
 }
</aui:script>
</body>
</html>





