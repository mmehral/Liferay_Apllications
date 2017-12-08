
<%@page import="com.contest.service.CholaContestLocalServiceUtil"%>
<%@page import="com.contest.model.CholaContest"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page
	import="com.liferay.counter.kernel.service.CounterLocalServiceUtil"%>
<%@page import="com.liferay.counter.kernel.model.Counter"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects />
</head>

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script>
	$(function() {
		$("#datepicker").datepicker();
		$("#datepicker1").datepicker();
	});
</script>

<body>
	<%
		long referenceId = ParamUtil.getInteger(request, "id");
		System.out.println("Contest Id======" + referenceId);
		CholaContest contest = null;
		if (referenceId >= 01) {
			contest = CholaContestLocalServiceUtil.getCholaContest(referenceId);
			System.out.println("####" + contest);
		}
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	%>
	<portlet:actionURL var="actionURL" name="addContest">
	</portlet:actionURL>
	<form action="<%=actionURL.toString()%>" method="post"
		enctype="multipart/form-data">
		<input type="text" value="<%=contest.getId()%>" name="id">
		<table width="100%">

			<%--<tr>
<td>1&nbsp;&nbsp;&nbsp;Contest Type</td>
<td>
<select name="<portlet:namespace/>contest_val" id="contest_val"
				class="validate[required]">
					<option value="">--Select--</option>
					<%
						for (Object[] m : list) {
					%>
					<option value="<%=m[0].toString()%>"><%=m[1].toString()%></option>
					<%
						}
					%>
			</select>

</td>

</tr>--%>
			<tr>
				<td>1&nbsp;&nbsp;&nbsp;Content Title</td>
				<td><textarea rows="4" cols="20" name="contenttitle"> <%=contest.getContest_title()%></textarea>
				</td>
			</tr>
			<tr>
			<tr>
				<td>2&nbsp;&nbsp;&nbsp;Content Description</td>
				<td><textarea rows="4" cols="20" name="content"><%=contest.getContent()%></textarea>
				</td>
			</tr>
			<%
				String strtdt = df.format(contest.getStartdate());
			%>
			<td>3&nbsp;&nbsp;&nbsp;Start Date</td>
			<td><input id="datepicker" type="date" name="startdate"
				value="<%=strtdt%>"></td>
			</tr>
			<tr>
				<%
					String enddt = df.format(contest.getEnddate());
				%>
				<td>4&nbsp;&nbsp;&nbsp;End Date</td>
				<td><input id="datepicker1" type="date" name="enddate"
					value="<%=enddt%>"></td>
			</tr>

			<tr>
				<%
					if (!contest.getContest_doc().isEmpty()) {
				%>
			
			<tr>
				<td colspan="2"><%=contest.getContest_doc() %>&nbsp;&nbsp;&nbsp;&nbsp;<a
					href="/contestUpload/<%=contest.getContest_doc()%>" target="_blank">Click</a></td>
			</tr>
			<%
				}
			%>
			<tr>
				<td>5&nbsp;&nbsp;&nbsp;Attachement(In Case want to change)</td>
				<td><input type="file" id="contestfile" name="contest_doc"
					value="<%=contest.getContest_path()%>"
					onchange="return contestupload()"></td>
			</tr>
			<td colspan="2"><input type="submit" value="Submit"></td>
			</tr>



		</table>
	</form>
	<script>
		//Newlly added  contestupload
		function contestupload() {
			var imgpath = document.getElementById('contestfile').value;
			if (imgpath == "") {
				//alert("upload your word file");
				//document.file.word.focus();
				//return false;
			} else {
				// code to get File Extension..

				var arr1 = new Array;
				arr1 = imgpath.split("\\");
				var len = arr1.length;
				var img1 = arr1[len - 1];
				var filext = img1.substring(img1.lastIndexOf(".") + 1);
				// Checking Extension

				if (filext == "pdf" || filext == "PDF" || filext == "jpg"
						|| filext == "Jpeg" || filext == "JPG"
						|| filext == "JPEG") {
					var fi = document.getElementById('contestfile');
					//alert(fi.files.length);
					var fsize = fi.files.item(0).size;

					if (fsize > 100000) {
						alert("Document size should not be more than 100 KB");
						document.getElementById('contestfile').value = "";
						return false;
					}
					//alert("File has been upload correctly");

					//return false;
				} else {
					alert("Invalid File Format,Please select pdf file format");
					//document.form.word.focus();
					document.getElementById('contestfile').value = "";
					return false;
				}
			}
		}
	</script>

</body>
</html>