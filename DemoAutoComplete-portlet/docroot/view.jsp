<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:resourceURL var="getUsers">
   <portlet:param name="<%=Constants.CMD%>" value="get_users" />
 </portlet:resourceURL>
 <aui:input id="myInputNode" name="myInputNode" label="User Email" helpMessage="Type User Email address in Input Box"/>


<aui:script>


AUI().use('autocomplete-list','aui-base','aui-io-request','autocomplete-filters','autocomplete-highlighters',function (A) {
A.io.request('<%=getUsers%>',{
dataType: 'json',
method: 'GET',
on: {
success: function() {
//continents=this.get('responseData');
//alert(continents[0].name);
new A.AutoCompleteList(
{
allowBrowserAutocomplete: 'true',
activateFirstItem: 'true',
inputNode: '#users',
resultTextLocator: 'email',
resultHighlighter:['phraseMatch'],
resultFilters:['phraseMatch'],
render: 'true',
source:this.get('responseData'),
});
}}
});                  
});
</aui:script>


<div id="singleOptions">
				User Name : <input type="text" name="users" id="users"
					placeholder="Type user name to autofill"> <br>
				<br> Users : <select id="sbThree" name="thirdList"
					multiple="multiple" style="height: 250px; width: 350px;"
					style="display: none"></select><br>
				<br>
			</div>