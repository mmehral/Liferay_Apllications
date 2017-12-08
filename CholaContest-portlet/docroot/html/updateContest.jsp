
<%@page import="com.contest.service.CholaContestLocalServiceUtil"%>
<%@page import="com.contest.model.CholaContest"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page
	import="com.liferay.counter.kernel.service.CounterLocalServiceUtil"%>
<%@page import="com.liferay.counter.kernel.model.Counter"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
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
		SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
	%>
	<portlet:actionURL var="actionURL" name="addContest">
	</portlet:actionURL>
	
<aui:form action="<%=actionURL.toString() %>" method="post" enctype="multipart/form-data" name="fm">

		<input type="hidden" value="<%=contest.getId()%>" name="id">
		

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

<aui:input name="contenttitle" type="text" value="<%=contest.getContest_title()%>"  label="Contest Title" helpMessage="Please Enter Contest Title">
 <aui:validator name="required" errorMessage="Please Enter Contest Title"/>
  <aui:validator name="max">100</aui:validator>
  
</aui:input>
<aui:input name="content" type="textarea"   rows="5" cols="30"  value="<%=contest.getContent()%>" label="Contest Description" helpMessage="Please Enter Contest Description">
 <aui:validator name="required" errorMessage="Please Enter Contest Description"/>
  <aui:validator name="max">500</aui:validator>
      
</aui:input>
<%
				String strtdt = df.format(contest.getStartdate());
			%>
<aui:input name="startdate" type="text"  label="Start Date" value="<%=strtdt%>" helpMessage="Please Enter Start Date">
 <aui:validator name="required" errorMessage="Please Enter Start Date"/>
  <aui:validator name="date"></aui:validator>
</aui:input>
<%
					String enddt = df.format(contest.getEnddate());
				%>
<aui:input name="enddate" type="text"  label="End Date" value="<%=enddt%>" helpMessage="Please Enter End Date">
 <aui:validator name="required" errorMessage="Please Enter End Date"/>
  <aui:validator name="date"></aui:validator>
</aui:input>
<%
					if (!contest.getContest_doc().isEmpty()) {
				%>
				<%=contest.getContest_doc() %>&nbsp;&nbsp;&nbsp;&nbsp;<a
					href="/contestUpload/<%=contest.getContest_doc()%>" target="_blank">Click</a>
				
				<%
				}
			%>
<aui:input id="contestfile" name="contest_doc" type="file" onchange="return contestupload()"  label="Attachement" helpMessage="Please Attach the document in pdf / jpg format">
<aui:validator name="acceptFiles" errorMessage="Please Attach the document in pdf / jpg format">'jpg,pdf'</aui:validator>
</aui:input>

<aui:button-row>
		          <aui:button type="submit" value="Submit"/>
		         <aui:button type="reset" value="Reset" last="true"/>
		</aui:button-row>
</aui:form>


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