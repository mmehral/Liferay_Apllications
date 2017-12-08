package com.chola.videogallery;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.chola.videogallery.model.videogallerypath;
import com.chola.videogallery.service.videogallerypathLocalServiceUtil;
import com.chola.ppcontent.service.contentupdateLocalServiceUtil;
import com.chola.videogallery.model.videogallery;
import com.chola.videogallery.service.videogalleryLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;

public class VideoGallery extends MVCPortlet{
	private static Log logger = LogFactoryUtil.getLog(VideoGallery.class);
	
	public void updateDetails(ActionRequest request,ActionResponse response) throws NumberFormatException, PortalException
	{
		logger.info("Inside Update Method");
		
		String id = request.getParameter("id");
		logger.info("ID : "+id);
		
		String albumName = request.getParameter("albumName");
		logger.info("albumName : "+albumName);
		
		String albumDesc = request.getParameter("albumDesc");
		logger.info("albumDesc : "+albumDesc);
		
		videogallery img = videogalleryLocalServiceUtil.fetchvideogallery(Long.parseLong(id));
		img.setAlbumName(albumName);
		img.setAlbumDesc(albumDesc);
		img = videogalleryLocalServiceUtil.updatevideogallery(img);
		
		logger.info("Updated ID : "+img.getId());
		
		long flag=2;
		String notificationText="Video Album has been Updated";
		long content_id=img.getContent_id();
		boolean updatedeleteSucces=contentupdateLocalServiceUtil.changeContentFlagForUpdateDelete(flag,notificationText, content_id);
		
		logger.info("update status : "+updatedeleteSucces);
		
	}
	public void removeAlbum(ActionRequest request,ActionResponse response)
	{
		logger.info("Inside Remove Method");
		
		String albumSelect = request.getParameter("albumSelect");
		logger.info("albumSelect : "+albumSelect);
		
		videogallery videoGal = videogalleryLocalServiceUtil.fetchvideogallery(Long.parseLong(albumSelect));
		videoGal.setFlag("2");
		videoGal = videogalleryLocalServiceUtil.updatevideogallery(videoGal);
		
		logger.info("Removed Successfully : "+videoGal.getId());
		
		long flag=0;
		String notificationText="Video Album has been Deleted";
		long content_id=videoGal.getContent_id();
		
		boolean updatedeleteSucces=contentupdateLocalServiceUtil.changeContentFlagForUpdateDelete(flag,notificationText, content_id);
		
		logger.info("delete status : "+updatedeleteSucces);
	}
	
	public String fileUpload(ActionRequest request, ActionResponse response,UploadPortletRequest uploadRequest,String fileName,File sourceFile) throws IOException
	{
	
	    String str = "videoGalleryUpload";

		String role="admin";
	    java.util.Properties properties = PortalUtil.getPortalProperties();
		logger.info("my properties is...." + properties);
		File contestfolder = new File(properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str);
		File destinationFile = new File(
				properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str + "/" + role);

		if (!contestfolder.exists()) {
			destinationFile.mkdirs();
		}
		logger.info("my directory is : " + contestfolder);

		if (!destinationFile.exists()) {
			destinationFile.mkdirs();
		}
		logger.info("my directory is : " + destinationFile);
		
			
		if(fileName!=null){
				/**************** SAVE THE DOC ********************************/
			if (destinationFile.exists()) {
				
				String fileNa = fileName.substring(0,fileName.lastIndexOf("."));
				logger.info("fileName : " + fileNa);
				String fileExtension = fileName.substring(fileName.lastIndexOf("."), fileName.length());
				logger.info("fileExtension : "+ fileExtension);
				fileName = fileNa;
				SimpleDateFormat df2 = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
				Date date = new Date();
				String testDateString = df2.format(date);
				fileName = fileName +"_"+testDateString +fileExtension;

				destinationFile = new File(
						properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str + "/" + role + "/" + fileName);

				logger.info("destinationFile : " + destinationFile);

			}
			logger.info("File : " + fileName);
			FileUtil.copyFile(sourceFile, destinationFile);
			
			
			String FilePath = destinationFile.toString();
			logger.info("Successfully Saved the Document");
			/*************** ENDED THE SAVING ******************/
			logger.info(FilePath);
	}
		return fileName;
	}
	
public void uploadData(ActionRequest request, ActionResponse response) throws Exception {
		
	
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		
		String albumName = request.getParameter("albumName");
		logger.info("albumName : "+albumName);
		
		String albumDesc = request.getParameter("albumDesc");
		logger.info("albumDesc : "+albumDesc);
		
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);
	
		String[] sourceFileName = uploadRequest.getFileNames("uploadedFile");
		File[] sourceFile = uploadRequest.getFiles("uploadedFile");
				
		SimpleDateFormat df2 = new SimpleDateFormat("ddMMyyyyHHmmss");
		Date date = new Date();
		String albumId = df2.format(date);
		
		SimpleDateFormat df3 = new SimpleDateFormat("ddMMyyyyHHmmssSSS");
		long uniqueContentId = Long.parseLong(df3.format(date));
		
		String currentPageUrl=themeDisplay.getURLCurrent();
		if(currentPageUrl.contains("?"))
		{
			currentPageUrl = currentPageUrl.substring(0, currentPageUrl.indexOf("?"));
		}
		
		videogallerypath path = null;
		
		for(int i=0;i<sourceFileName.length;i++)
		{
			logger.info("File Name : "+sourceFileName[i]);
		
		String fileName=null;
		if(!"".equalsIgnoreCase(sourceFileName[i]))
		{
			logger.info("File selected by user");
			fileName = fileUpload(request,response,uploadRequest,sourceFileName[i],sourceFile[i]);
		}
		else
		{
			logger.info("File not selected by user");
		}
		
					path = videogallerypathLocalServiceUtil.createvideogallerypath(CounterLocalServiceUtil.increment());
					path.setAlbumVideoPath("/videoGalleryUpload/admin/"+fileName);
					path.setCreatedBy(String.valueOf(themeDisplay.getUserId()));
					path.setCreatedDate(date);
					path.setFlag("1");
					path.setAlbumId(albumId);
					path.setContent_id(uniqueContentId);
					path = videogallerypathLocalServiceUtil.addvideogallerypath(path);
					
		}
		if(path!=null)
		{
		videogallery imgGallery = videogalleryLocalServiceUtil.createvideogallery(CounterLocalServiceUtil.increment());
		imgGallery.setAlbumName(albumName);
		imgGallery.setAlbumDesc(albumDesc);
		imgGallery.setAlbumId(path.getAlbumId());
		imgGallery.setCreatedBy(String.valueOf(themeDisplay.getUserId()));
		imgGallery.setCreatedDate(date);
		imgGallery.setContent_id(path.getContent_id());
		imgGallery.setFlag("1");
		
		imgGallery = videogalleryLocalServiceUtil.addvideogallery(imgGallery);
		
		logger.info("video Gallery Created with ID : "+imgGallery.getId());
		
	    List<String> lt=contentupdateLocalServiceUtil.getCompany();
		Iterator it = lt.iterator();
		 Object[] notificationDetails={imgGallery.getContent_id(),1,1,"Video Gallery","New Album has been added",currentPageUrl};
		
		boolean insert1=contentupdateLocalServiceUtil.insertIntoContentUniqueInfo(notificationDetails);
		
		while (it.hasNext()) {
			Object[] object = (Object[]) it.next();
			String businessId=object[0].toString();
			
			if(insert1){
				boolean insert2=contentupdateLocalServiceUtil.insertIntoPPContentStore(businessId, null, "ALL", "all", "All User", imgGallery.getContent_id(), null, null, null, 0);
				logger.info(insert2);
			}
		}
		}
		
}
public void addComment(ActionRequest actionRequest, ActionResponse actionResponse) {
	logger.info("Comment=======");

	try {
		invokeTaglibDiscussion(actionRequest, actionResponse);
		logger.info("Comment is successfully added........");
	} catch (Exception e) {
		logger.error("Error",e);
	}
}
}
