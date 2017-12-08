<%@page import="com.liferay.document.library.kernel.service.DLAppHelperLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.util.DLUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.document.library.kernel.util.PDFProcessorUtil"%>
<%@page import="com.liferay.document.library.kernel.util.DLPreviewableProcessor"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.image.ImageTool"%>
<%@page import="com.liferay.portal.kernel.util.TextFormatter"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.Folder"%>
<%@page import="com.liferay.portal.kernel.workflow.WorkflowConstants"%>
<%@page import="com.liferay.portal.kernel.util.HtmlUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@ include file="init.jsp"%>

<style>
#documentsContainer{
height:300px;
border: 1px solid #dedede;
border-color: #c0c2c5;
overflow-y:scroll;
padding:10px 5px 10px 5px;

}
.fileEntryCheckBox{
margin-right:5px;
}
table td{
padding:5px 10px 5px 10px;
font-weight: bold;
font-size: 13px;
}
table td a{
color:blue;
}
.lfr-preview-file-image-current-column{
background: none;
padding: 20px;
position: relative;
}
</style>
<%
long folderId=ParamUtil.getLong(renderRequest,"folderId");
List<FileEntry>  fileEntries=DLAppLocalServiceUtil.getfilegetFileEntries(themeDisplay.getScopeGroupId(), 0);
List<String> extensionList=new ArrayList<String>();
extensionList.add("pdf");
extensionList.add("doc");
extensionList.add("docx");
%>
	<aui:layout>
		<aui:column>
			<%
				Folder folder = null;
							if (folderId != 0) {
								folder = DLAppLocalServiceUtil.getFolder(folderId);
								DLUtil.addPortletBreadcrumbEntries(folder, request,
										liferayPortletResponse);
							}
			%>
			<liferay-ui:breadcrumb showCurrentGroup="<%=false%>"
				showCurrentPortlet="<%=false%>" showGuestGroup="<%=false%>"
				showLayout="<%=false%>" showParentGroups="<%=false%>" />
		</aui:column>
	</aui:layout>
	<div id="documentsContainer">
	<aui:layout>
		<aui:column>
			<%
			Folder folder = null;
			if (folderId != 0) {
				folder = DLAppLocalServiceUtil.getFolder(folderId);
				DLUtil.addPortletBreadcrumbEntries(folder, request,liferayPortletResponse);
			}
				if (folderId == 0) {
								folderId = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
							}
							List<Folder> folderList = DLAppLocalServiceUtil.getFolder(folderId);
							List<FileEntry> filesList = DLAppLocalServiceUtil.getFileEntries(themeDisplay.getScopeGroupId(),
											folderId);
			%>
			<%
				
			%>
			<table>
				<%
					for (Folder curFolder : folderList) {
									/* int foldersCount = DLAppLocalServiceUtil
											.getFoldersCount(
													curFolder.getRepositoryId(),
													curFolder.getFolderId());
									int fileEntriesCount = DLAppLocalServiceUtil
											.getFileEntriesAndFileShortcutsCount(
													curFolder.getRepositoryId(),
													curFolder.getFolderId(),
													WorkflowConstants.STATUS_ANY);
									String folderImage = "folder_empty";

									if ((foldersCount + fileEntriesCount) > 0) {
										folderImage = "folder_full_document";
									} */
				%>
				<portlet:renderURL var="curentFolderURL"
					windowState="<%=WindowState.NORMAL.toString()%>">
					<portlet:param name="folderId"
						value="<%=String.valueOf(curFolder
										.getFolderId())%>" />
				</portlet:renderURL>
				<tr>
				<tr>
					<td>&nbsp;</td>
					<td colspan="2" align="left"><a class="document-link"
						data-folder="<%=Boolean.TRUE.toString()%>"
						data-folder-id="<%=curFolder.getFolderId()%>"
						href="<%=curentFolderURL%>"
						title="<%=HtmlUtil.escape(curFolder.getName())
									+ " - "
									+ HtmlUtil.escape(curFolder
											.getDescription())%>">
					<%-- 		<span class="document-thumbnail"> <img alt="" border="no"
								src="<%=themeDisplay.getPathThemeImages()
									+ "/common/" + folderImage
									+ ".png"%>"/>
						</span> --%> <span class="entry-title"> <%=HtmlUtil.escape(StringUtil.shorten(
									curFolder.getName(), 60))%>
						</span>
					</a>
					</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				</tr>

				<%
					}
				%>
				<%
					for (FileEntry fileEntry : filesList) {
				if(extensionList.contains(fileEntry.getExtension())){
				%>
				<portlet:renderURL var="documentRenderURL1">
				<portlet:param name="fileEntryId" value="<%=String.valueOf(fileEntry.getFileEntryId())%>"/>
				<portlet:param name="mvcPath" value="/html/liferaydocviewer/document_viewer.jsp"/>
				</portlet:renderURL>
				<tr>
					<td>&nbsp;</td>
					<td><liferay-ui:icon
							cssClass="document-display-style selectable"
							image='<%="../file_system/small/"
									+ DLUtil.getFileIcon(fileEntry.getExtension())%>'
							label="<%=true%>" message="<%=fileEntry.getTitle()%>"
							method="get" />
							
					</td>
					<td><%=fileEntry.getVersion()%></td>
					<td><a href="<%=documentRenderURL1%>">View Document</a></td>
					<%-- <td><liferay-ui:icon
								image="download"
								label="<%= true %>"
								message='<%= LanguageUtil.get(pageContext, "download") + " (" + TextFormatter.formatKB(fileEntry.getFileVersion().getSize(), locale) + "k)" %>'
								url="<%= DLUtil.getPreviewURL(fileEntry, fileEntry.getFileVersion(), themeDisplay, StringPool.BLANK) %>"
							/></td> --%>
				
				</tr>

				<%
				}}
				%>
			</table>
		</aui:column>
	</aui:layout>
	</div>
	
	<%
	
	%>