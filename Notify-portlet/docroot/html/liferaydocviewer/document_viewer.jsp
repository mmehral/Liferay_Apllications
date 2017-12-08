<%@page import="com.liferay.portlet.documentlibrary.util.DLUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.util.PDFProcessorUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileVersion"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.service.DLAppHelperLocalServiceUtil"%>
<%@ include file="init.jsp"%>
<%
long fileEntryId=ParamUtil.getLong(renderRequest,"fileEntryId");
FileEntry fileEntry=DLAppLocalServiceUtil.getFileEntry(fileEntryId);
FileVersion fileVersion=fileEntry.getFileVersion();
boolean hasPDFImages = PDFProcessorUtil.hasImages(fileVersion);
int previewFileCount = 0;
String previewFileURL = null;
String[] previewFileURLs = null;
String videoThumbnailURL = null;
String previewQueryString = null;
if (hasPDFImages) {
	previewFileCount = PDFProcessorUtil.getPreviewFileCount(fileVersion);
	previewQueryString = "&previewFileIndex=";
	previewFileURL = DLUtil.getPreviewURL(fileEntry, fileVersion, themeDisplay, previewQueryString);
	%>
	<div class="lfr-preview-file" id="<portlet:namespace />previewFile">
	<div class="lfr-preview-file-content"
		id="<portlet:namespace />previewFileContent">
		<div class="lfr-preview-file-image-current-column">
			<div class="lfr-preview-file-image-container">
				<img class="lfr-preview-file-image-current"
					id="<portlet:namespace />previewFileImage"
					src="<%= previewFileURL + "1" %>" />
			</div>
			<span class="lfr-preview-file-actions aui-helper-hidden"
				id="<portlet:namespace />previewFileActions"> <span
				class="lfr-preview-file-toolbar"
				id="<portlet:namespace />previewToolbar"></span> <span
				class="lfr-preview-file-info"> <span
					class="lfr-preview-file-index"
					id="<portlet:namespace />previewFileIndex">1</span> of <span
					class="lfr-preview-file-count"><%= previewFileCount %></span>
			</span>
			</span>
		</div>

		<div class="lfr-preview-file-images"
			id="<portlet:namespace />previewImagesContent">
			<div class="lfr-preview-file-images-content"></div>
		</div>
	</div>
</div>
<aui:script use="aui-base,liferay-preview">
new Liferay.Preview(
			{
	actionContent: '#<portlet:namespace />previewFileActions',
	baseImageURL: '<%= previewFileURL %>',
	boundingBox: '#<portlet:namespace />previewFile',
    contentBox: '#<portlet:namespace />previewFileContent',
	currentPreviewImage: '#<portlet:namespace />previewFileImage',
	imageListContent: '#<portlet:namespace />previewImagesContent',
	maxIndex: <%= previewFileCount %>,
    previewFileIndexNode: '#<portlet:namespace />previewFileIndex',
	toolbar: '#<portlet:namespace />previewToolbar'
	}).render();
</aui:script>
<%}else{%>
<h2>Unable to view document</h2>
<%}%>