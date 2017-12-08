<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.chola.conferenceroombooking.service.conferenceroombookingdetailsLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<style>
table.formtable2 
{
    margin:0px;
    padding:0px;
    border-top:1px solid #fff !important;
    border-left:1px solid #fff !important;
    font-size:11px;
}


.formtable2 tr
{
    height:0px;
    
    }

.formtable2 a
{
    color: #000 !important;
    text-decoration: underline !important;
}
.formtable2 td
{
    margin:0px;
    padding:2px 6px 2px 6px !important;
    line-height:25px;
    font-size:13px;
    border-bottom:1px solid #a08e8e !important;
    border-right:1px solid #a08e8e !important;
    border-left:1px solid #a08e8e !important;
    text-align:left;
    font-weight:bold;
    
    
}
.formtable2 img
{
    margin:0px 0px 0px ;
    padding:0px;
}

.formtable2 a
{
    color:#666666;
}
.formtable2 th
{
    margin:0px;
    padding:0px 6px 0px 6px;
    line-height:21px;
    font-weight:bold;
    background:#85c1e9;
    font-size:15px;
    text-align:center;
    border:1px solid #a08e8e !important;
   
    color:#fff;
    font-weight:bold;
}
</style>


</head>
<body>
	
	<%
	ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	System.out.println("User ID===" + themeDisplay.getUserId());
	System.out.println("User Name===" + themeDisplay.getUser().getFullName());

	List<Object[]> list = conferenceroombookingdetailsLocalServiceUtil.mybookinglist(themeDisplay.getUserId(), 1);
	System.out.println("LIST OF MY BOOKING4=====" + list.size());
%>
<%
	PortletURL backURL=renderResponse.createRenderURL();
	backURL.setParameter("jpsPage", "/html/view.jsp");
	
	%>
	<liferay-ui:header title="back" backLabel="&laquo; Back to Search" backURL="<%=backURL.toString() %>"></liferay-ui:header>


	<%
	
		if (list.size() != 0) {
	%>
	
	
	
	
 
	<div class="form-group col-md-12 col-sm-12">
	<div class="table-responsive">
	<table class="table formtable2" style="display:inline-block;">
		<tr>
		
			<th>Date</th>
			<th>Start Time</th>
			<th>End Time</th>
			<th>Room Name</th>
			<th>Room Location</th>
					<th>Room Facility</th>
			<!-- <td>Meeting Host Email Id</td>
			<td>Meeting Title</td>
			<td>Agenda</td> -->
			<th>Delete</th>
		</tr>
		<%
		String locationname=null;
			for (Object[] obj : list) {
				System.out.println("Date....."+obj[0].toString());
				 
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); 
				Date date = formatter.parse(obj[0].toString());
				String strDate=formatter.format(date);
				System.out.println("Formatted Date....."+strDate);
				
				System.out.println("Room location....."+obj[8].toString());
				locationname=conferenceroombookingdetailsLocalServiceUtil.getlocationname(Long.parseLong(obj[8].toString()));
				System.out.println("Room location....."+locationname);
		%>
		
		
<tr>
<td><%=strDate %></td>
<td><%=obj[1].toString() %></td>
<td><%=obj[2].toString() %></td>
<td><%=obj[10].toString() %></td>
<td><%=locationname%></td>
<td><%=obj[13].toString() %></td>
<%-- <td><%=obj[4].toString() %></td>
<td><%=obj[5].toString() %></td>
<td><%=obj[6].toString() %></td> --%>
<td>
<portlet:actionURL var="deleteURL" name="deleteMybooking">
		<portlet:param name="roomid" value="<%=String.valueOf(obj[14].toString()) %>"/>
		</portlet:actionURL>
<a href="${deleteURL}">Cancel</a></td>
</tr> 
		<%
			}
		%>
	</table>
	
	</div>
	</div>

	<%
		} else {
	%>
	No Record to Display.
	<%
		}
	%>
</body>
</html>