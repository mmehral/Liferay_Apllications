package com.clover.myaction;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.PortalUtil;

public class MyAction extends MVCPortlet {
	public void save(ActionRequest actionRequest, ActionResponse actionResponse)
			throws ParseException, IOException, PortalException {
		
		
		String lbtitle = actionRequest.getParameter("lbtitle");
		
		
		String lbDesc = actionRequest.getParameter("lbDesc");
		
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
		String sourceFileName = uploadRequest.getFileName("uploadedFile");
		
		
		String fileName=null;
		if(!sourceFileName.equalsIgnoreCase(""))
		{
			fileName = fileUpload(actionRequest,actionResponse);
		}
		else
		{
		}
	}
	
	public String fileUpload(ActionRequest request, ActionResponse response) throws IOException
{
	String fileName = null;
	UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);
    //Creating the folder Structure in Tomcat as WebApps/SochoUpload/userId folder will create

    String str = "DemoUpload";

	//long userId = themeDisplay.getUserId();
	String userId="admin";
	
	java.util.Properties properties = PortalUtil.getPortalProperties();
	File contestfolder = new File(properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str);
	File destinationFile = new File(
			properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str + "/" + userId);

	if (!contestfolder.exists()) {
		destinationFile.mkdirs();
	}

	if (!destinationFile.exists()) {
		destinationFile.mkdirs();
	}
	
			
			
	File sourceFile = uploadRequest.getFile("uploadedFile");
	fileName = uploadRequest.getFileName("uploadedFile");
		
	if(fileName!=null){
			/**************** SAVE THE DOC ********************************/
		if (destinationFile.exists()) {
			fileName.lastIndexOf(".");
			String fileNa = fileName.substring(0,fileName.lastIndexOf("."));
			String fileExtension = fileName.substring(fileName.lastIndexOf("."), fileName.length());
			fileName = fileNa;
			SimpleDateFormat df2 = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
			Date date = new Date();
			String testDateString = df2.format(date);
			fileName = fileName +"_"+testDateString +fileExtension;

			destinationFile = new File(
					properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str + "/" + userId + "/" + fileName);


		}
		FileUtil.copyFile(sourceFile, destinationFile);
		
		
		String FilePath = destinationFile.toString();
		/*************** ENDED THE SAVING ******************/
}
	return fileName;
}
}
