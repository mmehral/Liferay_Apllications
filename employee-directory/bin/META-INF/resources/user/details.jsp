<%--
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@ include file="/init.jsp" %>


<style>
  .property-list .center-image{float:left; margin: 0 25px 20px 0px;}
  .property-list > h2 {text-align:left;}
  .property-list {width:80%; display:table; margin:0 auto;}
  .property-list hr {margin-top:10px; margin-bottom:10px;}
  .property-list dt {font-size:16px; position:relative; padding-bottom:8px; margin-bottom:10px;}
  .property-list dt::before{position:absolute; content:""; width:20px;  left:0px; border:1px solid #008ed4; bottom:0px; }
  .user-icon {border-radius: 100%; font-size: 18px; text-align: center;overflow: hidden;height: 80px;line-height: 80px;width: 80px;
}
</style>

<%
User selUser = (User)request.getAttribute("user.selUser");
Contact selContact = (Contact)request.getAttribute("user.selContact");
List<Organization> organizations = (List<Organization>)request.getAttribute("user.organizations");

String organizationsHTML = StringPool.BLANK;

if (!organizations.isEmpty()) {
	organizationsHTML = organizations.get(0).getName();
}

for (int i = 1; i<organizations.size(); i++) {
	organizationsHTML += ", "+ organizations.get(i).getName();
}
%>

 <portlet:renderURL var="simpleDialogExample"
windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
<portlet:param name="mvcPath"
value="/user/popup.jsp"/>
</portlet:renderURL>

<aui:script>
	function sendEmpId(id,type)
	{
		console.log("EmpID : "+id +" Type : "+type);
		
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
		width: 475,
		height:320
		}
		}
		).plug(
		A.Plugin.IO,
		{
		autoLoad: false
		}).render();
		popUpWindow.show();
		popUpWindow.titleNode.html("Appreciation");
		popUpWindow.io.set('uri','<%=simpleDialogExample%>&<portlet:namespace/>id='+id+'&<portlet:namespace/>type='+type);
		popUpWindow.io.start();

});
	}
</aui:script> 

	
 <div class="row property-list">
 
 <a href="/web/<%=selUser.getScreenName()%>">
   <div class="center-image">
  	<liferay-ui:user-portrait
		imageCssClass="user-icon-lg "
		user="<%= selUser %>"
	/>
	</div>
	</a>
	
	  <h2><a href="/web/<%=selUser.getScreenName()%>"><%= selUser.getFullName() %></a></h2>
	  
	  <%
     if(selUser.getUserId()!=themeDisplay.getUser().getUserId())
    	 {
    	 %>
		    <button style="float: right;" class="btn btn-default" onclick="sendEmpId('<%=selUser.getUserId()%>','AP')">Appreciate <%=selUser.getFirstName()%></button>
     	<%
     	} 
     	%>
   
   <div class="col-md-12">
     <div class="col-md-6">
    	<c:if test="<%= Validator.isNotNull(selUser.getDisplayEmailAddress()) %>">
      		<dt>
				<liferay-ui:message key="email-address" />
			</dt>
			<dd>
				<%= selUser.getDisplayEmailAddress() %>
			</dd>
		<hr>
		</c:if>
     </div>
      <div class="col-md-6">
    <c:if test="<%= PrefsPropsUtil.getBoolean(company.getCompanyId(), PropsKeys.FIELD_ENABLE_COM_LIFERAY_PORTAL_MODEL_CONTACT_MALE) %>">
			<dt>
				<liferay-ui:message key="gender" />
			</dt>
			<dd>
				<%= LanguageUtil.get(request, selUser.isMale() ? "male" : "female") %>
			</dd>
			<hr>
		</c:if>
     </div>
   </div>
   
   <div class="col-md-12">
     <div class="col-md-6">
     <c:if test="<%= Validator.isNotNull((String) selUser.getExpandoBridge().getAttribute("Business",false)) %>">
			
     	<dt>
				<liferay-ui:message key="Business" />
			</dt>
			<dd>
				<%=(String) selUser.getExpandoBridge().getAttribute("Business",false) %>
			</dd>
			<hr>
		</c:if>
     </div>
     <div class="col-md-6">
     <c:if test="<%= Validator.isNotNull((String) selUser.getExpandoBridge().getAttribute("Business",false)) %>">
			
      	<dt>
				<liferay-ui:message key="Jvbranch" />
			</dt>
			<dd>
				<%=(String) selUser.getExpandoBridge().getAttribute("Jvbranch",false) %>
			</dd>
			<hr>
			</c:if>
     </div>
   </div>
   
   <div class="col-md-12">
     <div class="col-md-6">
     <c:if test="<%= Validator.isNotNull((String) selUser.getExpandoBridge().getAttribute("Designation",false)) %>">
			
     	<dt>
				<liferay-ui:message key="Designation" />
			</dt>
			<dd>
				<%=(String) selUser.getExpandoBridge().getAttribute("Designation",false) %>
			</dd>
			<hr>
		</c:if>
     </div>
     <div class="col-md-6">
     <c:if test="<%= Validator.isNotNull((String) selUser.getExpandoBridge().getAttribute("Department",false)) %>">
			
      	<dt>
				<liferay-ui:message key="Department" />
			</dt>
			<dd>
				<%=(String) selUser.getExpandoBridge().getAttribute("Department",false) %>
			</dd>
			<hr>
			</c:if>
     </div>
   </div>
   
   <div class="col-md-12">
     <div class="col-md-6">
     <c:if test="<%= Validator.isNotNull((String) selUser.getExpandoBridge().getAttribute("Branch",false)) %>">
			
     	<dt>
				<liferay-ui:message key="Branch" />
			</dt>
			<dd>
				<%=(String) selUser.getExpandoBridge().getAttribute("Branch",false) %>
			</dd>
			<hr>
		</c:if>
     </div>
     <div class="col-md-6">
     <c:if test="<%= Validator.isNotNull((String) selUser.getExpandoBridge().getAttribute("Product",false)) %>">
			
      	<dt>
				<liferay-ui:message key="Product" />
			</dt>
			<dd>
				<%=(String) selUser.getExpandoBridge().getAttribute("Product",false) %>
			</dd>
			<hr>
			</c:if>
     </div>
   </div>
   
   
   <div class="col-md-12">
     <div class="col-md-6">
     <c:if test="<%= Validator.isNotNull((String) selUser.getExpandoBridge().getAttribute("Empid",false)) %>">
			
     	<dt>
				<liferay-ui:message key="Employee Id" />
			</dt>
			<dd>
				<%=(String) selUser.getExpandoBridge().getAttribute("Empid",false) %>
			</dd>
			<hr>
		</c:if>
     </div>
     <div class="col-md-6">
     <c:if test="<%= Validator.isNotNull((String) selUser.getExpandoBridge().getAttribute("Unit",false)) %>">
			
      	<dt>
				<liferay-ui:message key="Unit" />
			</dt>
			<dd>
				<%=(String) selUser.getExpandoBridge().getAttribute("Unit",false) %>
			</dd>
			<hr>
			</c:if>
     </div>
   </div>
   
   <div class="col-md-12">
     <div class="col-md-6">
     <c:if test="<%= Validator.isNotNull((String) selUser.getExpandoBridge().getAttribute("Functionname",false)) %>">
			
     	<dt>
				<liferay-ui:message key="Function Name" />
			</dt>
			<dd>
				<%=(String) selUser.getExpandoBridge().getAttribute("Functionname",false) %>
			</dd>
			<hr>
		</c:if>
     </div>
     <div class="col-md-6">
     <c:if test="<%= Validator.isNotNull((String) selUser.getExpandoBridge().getAttribute("Location",false)) %>">
			
      	<dt>
				<liferay-ui:message key="Location" />
			</dt>
			<dd>
				<%=(String) selUser.getExpandoBridge().getAttribute("Location",false) %>
			</dd>
			<hr>
			</c:if>
     </div>
   </div>
   
   <div class="col-md-12">
     <div class="col-md-6">
     <c:if test="<%= Validator.isNotNull((String) selUser.getExpandoBridge().getAttribute("Zone",false)) %>">
			
     	<dt>
				<liferay-ui:message key="Zone" />
			</dt>
			<dd>
				<%=(String) selUser.getExpandoBridge().getAttribute("Zone",false) %>
			</dd>
			<hr>
		</c:if>
     </div>
     <div class="col-md-6">
     <c:if test="<%= Validator.isNotNull((String) selUser.getExpandoBridge().getAttribute("Grade",false)) %>">
			
      	<dt>
				<liferay-ui:message key="Grade" />
			</dt>
			<dd>
				<%=(String) selUser.getExpandoBridge().getAttribute("Grade",false) %>
			</dd>
			<hr>
			</c:if>
     </div>
   </div>
   
   <div class="col-md-12">
    
     <div class="col-md-6">
    		<dt>
				<liferay-ui:message key="Profile" />
			</dt>
			<dd>
			<a href="/web/<%=selUser.getScreenName()%>" target="_blank">View Profile</a>
			</dd>
			<hr>
     </div>
    
   </div>
   
 </div>
