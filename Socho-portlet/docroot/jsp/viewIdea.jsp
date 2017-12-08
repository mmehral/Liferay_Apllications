<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.chola.socho.service.topicsLocalServiceUtil"%>
<%@page import="com.chola.socho.model.topics"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="javax.portlet.RenderResponse"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui"  prefix="liferay-ui"%>
<%@page import="com.chola.socho.model.idea"%>
<%@page import="com.chola.socho.service.ideaLocalServiceUtil"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui"%>

<portlet:defineObjects/>
<portlet:renderURL var="back">
   <portlet:param name="jspPage" value="/view.jsp" />
</portlet:renderURL>

<%-- <portlet:renderURL var="next">
   <portlet:param name="jspPage" value="/jsp/viewIdeaDetail.jsp" />
   <portlet:param name="idea" value="1" />
</portlet:renderURL>  --%>

<portlet:renderURL var="simpleDialogExample"
windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
<portlet:param name="mvcPath"
value="/jsp/viewIdeaDetail.jsp"/>
</portlet:renderURL>

<portlet:resourceURL var="resourceURL"></portlet:resourceURL>

<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery.js"></script>
	<script type="text/javascript">
	$( document ).ready(function() {
		$("#ajaxContainer").hide();
		});	
	function ChangeFunction() {
		var topicId = $("#<portlet:namespace/>topicSelect option:selected").val();
		var topicName = $("#<portlet:namespace/>topicSelect").find("option:selected").text();
		//alert(topicId); 
		if(topicId!="")
			{
			$.ajax({
				url : '<%=resourceURL%>',
				type : 'POST',
				data : {topicId : topicId},
				dataType : 'json',
				success : function(data) {
					//alert("Data : "+JSON.stringify(data));
					//var vals = JSON.stringify(data).replace(/\\/g, "");
					//data=JSON.parse(vals);
					$("#searchContainer").hide();
					$("#ajaxContainer").show();
					$("table tbody").empty();
					//var obj = data.topics;
					//alert(data);
					for(var i in data.monthly)
						{
						//alert(data.monthly[i]);
						
						var id = JSON.stringify(data.monthly[i].id);
						id = id.replace(/["']/g, "");
						var userId = JSON.stringify(data.monthly[i].userid);
						userId = userId.replace(/["']/g, "");
						var topicId = JSON.stringify(data.monthly[i].topic);
						topicId = topicId.replace(/["']/g, "");
						var sharedIdea = JSON.stringify(data.monthly[i].sharedidea);
						sharedIdea = sharedIdea.replace(/["']/g, "");
						var sharedDate = JSON.stringify(data.monthly[i].shareddate);
						sharedDate = sharedDate.replace(/["']/g, "");
						
						console.log(id);
						console.log(userId);
						console.log(topicId);
						console.log(sharedIdea);
						console.log(sharedDate);
					
						  <portlet:renderURL var="next">
						   <portlet:param name="jspPage" value="/jsp/viewIdeaDetail.jsp" />
	   					  </portlet:renderURL> 
						
						var val = '<%=next.toString()%>';
					 	 
				 	$("table tbody").append("<tr><td>"+id+"</td><td>"+userId+"</td><td>"+topicName+"</td><td>"
				 	+"<input type='button' class='btn btn-default' value='Details' onClick='return sendId("+id+")'/></td><td>"+sharedDate+"</td></tr>");
						}
				},
				error : function() {
					alert("There was an error. Try again please!");
				}
			});
			}
	}

	</script>
	<aui:script>
	
		
	var selectId=1;
	
	function sendId(id)
	{
		selectId=id;
		//alert(id);
	
	
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
width: 475
}
}
).plug(
A.Plugin.IO,
{
autoLoad: false
}).render();
popUpWindow.show();
popUpWindow.titleNode.html("Liferay Dialog Window");
popUpWindow.io.set('uri','<%=simpleDialogExample%>&idea='+selectId);
popUpWindow.io.start();

});

	}
</aui:script>

<%-- <script type="text/javascript">
$( document ).ready(function() {
$("#ajaxContainer").hide();
});
   

console.log(val);
function ChangeFunction() {
	var topicId = $("#_Socho_WAR_Sochoportlet_INSTANCE_m59rhHg0HYwG_topicSelect option:selected").val();
	var topicName = $("#_Socho_WAR_Sochoportlet_INSTANCE_m59rhHg0HYwG_topicSelect").find("option:selected").text();
	alert(topicId); 
	if(topicId!="")
		{
		$.ajax({
			url : '<%=resourceURL%>',
			type : 'POST',
			data : {topicId : topicId},
			dataType : 'json',
			success : function(data) {
				console.log("Data : "+JSON.stringify(data));
				$("#searchContainer").hide();
				$("#ajaxContainer").show();
				$("table tbody").empty();
				//var obj = data.topics;
				for(var i in data)
					{
					var id = JSON.stringify(data[i]._id);
					var userId = JSON.stringify(data[i]._userId);
					var topicId = JSON.stringify(data[i]._topic);
					var sharedIdea = JSON.stringify(data[i]._sharedIdea);
					sharedIdea = sharedIdea.replace(/["']/g, "");
					var sharedDate = JSON.stringify(data[i]._sharedDate);
					sharedDate = sharedDate.replace(/["']/g, "");
					
					//console.log(id);
					//console.log(userId);
					//console.log(topicId);
					//console.log(sharedIdea);
					//console.log(sharedDate);
				
					  <portlet:renderURL var="next">
					   <portlet:param name="jspPage" value="/jsp/viewIdeaDetail.jsp" />
   					  </portlet:renderURL> 
					
					var val = '<%=next.toString()%>';
				 	 
			 	$("table tbody").append("<tr><td>"+id+"</td><td>"+userId+"</td><td>"+topicName+"</td><td>"
			 	+"<a href='"+val+"&idea="+id+"'>Details</a></td><td>"+sharedDate+"</td></tr>");
					}
			},
			error : function() {
				console.log("There was an error. Try again please!");
			}
		});
		}
}

</script> --%>

<liferay-ui:header title="Home"
	backLabel="Back" backURL="<%=back%>" />

 
 		<aui:select showEmptyOption="true" name="topicSelect" onChange="return ChangeFunction()" id="topicSelect" label ="Select a Topic to filter">
		<%
		List<topics> topicList = topicsLocalServiceUtil.gettopicses(0, topicsLocalServiceUtil.gettopicsesCount());
		for(topics topics : topicList)
		{
			if(topics.getFlag()==1)
			{
		%>
             <aui:option  value="<%=topics.getId()%>"><%=topics.getTopicName()%></aui:option>
        <%
		}
		}
        %>
          
 		</aui:select>
 
 <%
 PortletURL iteratorURL = renderResponse.createRenderURL();
iteratorURL.setParameter("jspPage", "/jsp/viewIdea.jsp");
 List<idea> ideaList = ideaLocalServiceUtil.getideas(0, ideaLocalServiceUtil.getideasCount());
 %>
 
 <div id="searchContainer">
<liferay-ui:search-container orderByType="asc" delta="5" deltaConfigurable="true" total="<%=ideaLocalServiceUtil.getideasCount() %>" emptyResultsMessage="No Records Found !!!" iteratorURL="<%=iteratorURL%>">
    <liferay-ui:search-container-results  results="<%= ListUtil.subList(ideaList, searchContainer.getStart(), searchContainer.getEnd()) %>" />
    <liferay-ui:search-container-row className="com.chola.socho.model.idea" keyProperty="bookId" modelVar="book">
        <liferay-ui:search-container-column-text name="id" value="${book.id}" />
    	<%
        String topicId = book.getTopic();
        topics topics = topicsLocalServiceUtil.fetchtopics(Long.parseLong(topicId));
        String topicval = topics.getTopicName();
        User userd = UserLocalServiceUtil.getUser(book.getUserId());
        %> 
        <liferay-ui:search-container-column-text name="Shared By" value="<%=userd.getLastName()%>" />
        <liferay-ui:search-container-column-text name="Topic" value="<%=topicval%>" />
        <%-- <liferay-ui:search-container-column-text name="Shared Idea" value="${book.sharedIdea}" />
         --%>
         <portlet:renderURL var="detail">
   		<portlet:param name="jspPage" value="/jsp/viewIdeaDetail.jsp" />
   		<portlet:param name="idea" value="${book.id}" />
		</portlet:renderURL>
         <liferay-ui:search-container-column-text name="Shared Idea">
         <aui:button name="simple-dialog-example"  id="simple-dialog-example_${book.id}" onClick="return sendId('${book.id}')" value="Click Here"> </aui:button>
         <%-- <a href="<%=detail%>">Details</a> --%></liferay-ui:search-container-column-text>
 		<liferay-ui:search-container-column-text name="Shared Date" value="${book.sharedDate}" />
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
</liferay-ui:search-container>
</div>
<div id="ajaxContainer">  
<table border="1px">
<thead>
<tr>
<th>Id </th>
<th>Shared By </th>
<th>Topic </th>
<th>Shared Idea </th>
<th>Shared Date </th>
</tr>
</thead>
<tbody>
</tbody>

</table>
</div>