<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui"  prefix="liferay-ui"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects/>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/addrow.js"></script>
	
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/validation.js"></script>
	<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/validationEngine.jquery.css"
	type="text/css" />
<script
	src="<%=request.getContextPath()%>/js/jquery.validationEngine-en.js"
	type="text/javascript" charset="utf-8"></script>
<script
	src="<%=request.getContextPath()%>/js/jquery.validationEngine.js"
	type="text/javascript" charset="utf-8"></script>
<link href="<%=request.getContextPath()%>/css/jquery-ui.css"
	rel="stylesheet" />	
	<script type="text/javascript">
    $(document).ready(function(){
    	
    	document.getElementById("contesttable[0].srno").value=1;
    	jQuery("#myForm").validationEngine();
  classValidations();

    });
</script>
</head>

<body>
 <portlet:renderURL var="back">
   <portlet:param name="jspPage" value="/view.jsp" />
</portlet:renderURL>
<liferay-ui:header title="Home"
	backLabel="Back" backURL="<%=back%>" /> 
	
<portlet:actionURL name="uploadData" var="saveURL" />
<aui:form action="<%=saveURL %>" method="post" name="fm" enctype="multipart/form-data">
<input type="hidden" id="productlist" name="<portlet:namespace/>contestlist" value="0">

		<aui:input type="text" name="albumName" label="Video Name">
		 <aui:validator name="required"></aui:validator>     
		</aui:input>
		
		<aui:input type="text" name="albumDesc" label="Video Description">
		 <aui:validator name="required"></aui:validator>     
		</aui:input>
		
 <table width="50%" border="1" id="contesttable" class="contesttable"
		style="border: 1px solid #000; width: 100%;">
		<thead style="border: 1px solid #000;">
			<tr style="border: 1px solid #000;">
				<td nowrap="nowrap" style="border: 1px solid #000;">Sr No</td>
				<td style="border: 1px solid #000;">Select Video</td>
				<td style="border: 1px solid #000;">Video Title</td>
				<td style="border: 1px solid #000;">Video Description</td>
				<td style="border: 1px solid #000;"><input type="button"
					value="Add" onclick="addNewRow('contesttable')" /></td>
			</tr>

		</thead>
		<tbody style="border: 1px solid #000;">
			<tr style="border: 1px solid #000;">
				<td style="border: 1px solid #000;"><input type="text"
					id="contesttable[0].srno" name="contesttable[0].srno"
					readonly="readonly" style="max-width: 34px;" size="25"
					class="validate[required]" maxlength="3"/></td>

				<td style="border: 1px solid #000;"><input type="file"
					id="contesttable[0].upload" 
					name="contesttable[0].upload"  class="validate[required]"
					onchange="return imageupload(this)" /></td>
					
				<td style="border: 1px solid #000;"><input type="text"  class="validate[required]"
					name="contesttable[0].title" id="contesttable[0].title" /></td>
					
				<td style="border: 1px solid #000;"><input type="text"  class="validate[required]"
					name="contesttable[0].desc" id="contesttable[0].desc" /></td>
					
				<td style="border: 1px solid #000;"><input type="button"
					name="del[1]" id="del1[1]" value="Delete"
					onclick="removeRow(this,'contesttable')" /></td>
			</tr>


		</tbody>

	</table> 
		<aui:button-row>
          <aui:button type="submit" value="Submit" onClick="return getvalidation()"/>
         <aui:button type="reset" value="Reset" last="true"/>
      </aui:button-row>

</aui:form>
<script>
function getvalidation(){
	//alert("jiii");
	var chequeRows = document.getElementById("contesttable").rows.length;
	//alert(chequeRows);
	 for(var i=0;i<chequeRows-1;i++){
		   var upload=document.getElementById("contesttable["+i+"].upload").value;
		   var title=document.getElementById("contesttable["+i+"].title").value;
		   var desc=document.getElementById("contesttable["+i+"].desc").value;
		   if(upload=="" && title=="" && desc=="") {
			   alert("Please Enter Title , Description , File Upload");
			   return false;
		   }else if(upload!="" && title=="" && desc=="") {
			   alert("Please Enter Title , Description ");
			   return false;
		   }else if(upload=="" && title!="" && desc=="") {
			   alert("Please Enter File Upload , Description ");
			   return false;
		   }else if(upload=="" && title=="" && desc!="") {
			   alert("Please Enter Title , File Upload ");
			   return false;
		   } else if(upload!="" && title!="" && desc=="") {
			   alert("Please Enter Description ");
			   return false;
		   }else if(upload!="" && title=="" && desc!="") {
			   alert("Please Enter Title ");
			   return false;
		   }else if(upload=="" && title!="" && desc!="") {
			   alert("Please Enter File Upload");
			   return false;
		   }
	 }
	
	
	
}

//receipt2upload added 
function imageupload(that)
{
var id=that.id;
var imgpath = document.getElementById(id).value;
if(imgpath == "")
{
//alert("upload your word file");
//document.file.word.focus();
//return false;
}
else
{
// code to get File Extension..

var arr1 = new Array;
arr1 = imgpath.split("\\");
var len = arr1.length;
var img1 = arr1[len-1];
var filext = img1.substring(img1.lastIndexOf(".")+1);
// Checking Extension

if(filext == "mp4")
{
  var fi = document.getElementById(id);
//alert(fi.files.length);
var fsize = fi.files.item(0).size; 

//if(fsize > 100000){//
/* alert("Document size should not be more than 100 KB");
document.getElementById(id).value="";
 return false;
} */
//alert("File has been upload correctly");

//return false;
}
else
{
alert("Invalid File Format,Please select pdf file format");
//document.form.word.focus();
document.getElementById(id).value="";
return false;
}
}
}

</script>

</body>
</html>
