<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@page import="java.util.List" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects/>
<liferay-ui:error key="error-key" message="Please fill Compliance Description" />
<%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/jsp/viewdetails.jsp");
%>
<liferay-ui:header title="Add Compliance Details" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />

<portlet:actionURL var="action" name="submitCompliancehDetails"></portlet:actionURL>
<aui:form action="${action}"  method="post">

<aui:input type="text" name="title" label="Tite(Enter Maximum 100 Characters)" helpMessage="Please Enter Charcaters less than 100">
<aui:validator name="required" errorMessage="Title is required"/>

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

<aui:input type="textarea" name="shortdescription" label="Short Description(Enter Maximum 250 Characters)" helpMessage="Please Enter Charcaters less than 250">
<aui:validator name="required" errorMessage="Short Description is required"/>

<aui:validator name="maxLength" errorMessage="Short Description should not be greater than 250 Characters">250</aui:validator>
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

<%-- <aui:input type="textarea" name="description" label="Description(Enter Maximum 5000 Characters)" helpMessage="Please Enter Charcaters less than 5000">
<aui:validator name="required" errorMessage="Description is required"/>

<aui:validator name="maxLength" errorMessage="Description should not be greater than 5000 Characters">5000</aui:validator>
</aui:input><br><br>  --%>

Description :<liferay-ui:input-editor name="description" initMethod="initEditor" 
		width="100" height="400" resizable="true" />
	<br><br>

<aui:input type="file" name="fileName" label="Please Select file to upload">
<aui:validator name="required" errorMessage="File is required"/>
<aui:validator name="acceptFiles">'pdf,docx,txt,jpg,jpeg,png,tif,gif'</aui:validator>
</aui:input>

<aui:button-row>
<aui:button type="submit" value="Submit"/>
<aui:button type="reset" value="Reset" last="true"/>
</aui:button-row>
</aui:form>

