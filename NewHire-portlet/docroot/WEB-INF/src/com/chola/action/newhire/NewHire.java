package com.chola.action.newhire;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

import com.service.model.newhire;
import com.service.service.newhireLocalServiceUtil;


public class NewHire extends MVCPortlet
{
	private static Log logger = LogFactoryUtil.getLog(NewHire.class);
public void submitNewHireDetails(ActionRequest request,ActionResponse response) throws IOException
{
	request.getAttribute(WebKeys.THEME_DISPLAY);

	String Name = request.getParameter("Name");
	logger.info("Name : " + Name);

	String Designation = request.getParameter("Designation");
	logger.info("Designation : " + Designation);
	
	String profileimage = request.getParameter("profileimage");
	logger.info("profileimage : " + profileimage);
	
	String detailedimage = request.getParameter("detailedimage");
	logger.info("detailedimage : " + detailedimage);
	
	long newhireId=ParamUtil.getLong(request, "newhireId");
	logger.info("newhireId..................."+newhireId);
	
	 UploadPortletRequest uploadRequest =
	 PortalUtil.getUploadPortletRequest(request);
	 
			SimpleDateFormat df2 = new SimpleDateFormat("ddMMyyyyHHmmss");
			Date date = new Date();
			df2.format(date);
			File sourceprofileimage = uploadRequest.getFile("profileimage");
			String sourceprofileimageName = uploadRequest.getFileName("profileimage");
			
			File sourcedetailedimage= uploadRequest.getFile("detailedimage");
			String sourcedetailedimageName = uploadRequest.getFileName("detailedimage");
			
			logger.info("sourceprofileimageName" + sourceprofileimageName);
			
			logger.info("sourcedetailedimageName" + sourcedetailedimageName);
			
				
			
			String fileName = null;
		if (!sourceprofileimageName.isEmpty())
		{
					logger.info("File selected by user");
					fileName = fileUpload(request, response, uploadRequest, sourceprofileimageName, sourceprofileimage);
		}
		else
		{
					logger.info("File not selected by user");
		}
		logger.info("File name...."+fileName);
		
		String detailedimagefileName = null;
		if (!sourcedetailedimageName.isEmpty())
		{
					logger.info("File selected by user");
					detailedimagefileName = fileUpload2(request, response, uploadRequest, sourcedetailedimageName, sourcedetailedimage);
		}
		else
		{
					logger.info("File not selected by user");
		}
		logger.info("newhireId  before if loop.."+newhireId);
		
		if(newhireId>=01)
		{
			logger.info("newhireId  in if loop.."+newhireId);
			modifiedorganizationdetails(request, response,newhireId,Name,Designation,sourceprofileimageName,fileName,sourcedetailedimageName,detailedimagefileName);
			response.setRenderParameter("jspPage","/jsp/editnewhiredetails.jsp");
		}
		else
		{
			logger.info("sourcedetailedimageName.. "+sourcedetailedimageName);
			logger.info("detailedimagefileName.. "+detailedimagefileName);
		newhire newh=newhireLocalServiceUtil.createnewhire(CounterLocalServiceUtil.increment());
		newh.setNewhire_name(Name);
		newh.setNewhire_designation(Designation);
		newh.setNewhire_profileimage(sourceprofileimageName);
		newh.setNewhire_profileimage_path(fileName);
		newh.setNewhire_detailedimage(sourcedetailedimageName);
		newh.setNewhire_detailedimage_path(detailedimagefileName);
		newh.setNewhire_createdate(new Date());
		newhireLocalServiceUtil.addnewhire(newh);
		
		logger.info("Organization announcement saved successfully............");
		}
		
}

private void modifiedorganizationdetails(ActionRequest request, ActionResponse response, long newhireId,String Name,String Designation,String sourceprofileimageName,String fileName,String sourcedetailedimageName,String detailedimagefileName)
{
     logger.info("edit the forms======");
     logger.info("complianceId.."+newhireId);
	
	newhire newh = null;
	try
	{
		newh=newhireLocalServiceUtil.fetchnewhire(newhireId);
		logger.info(newh);
	
	if (Validator.isNotNull(newh)) 
	{
		newh.setNewhire_name(Name);
        newh.setNewhire_designation(Designation);
       newh.setNewhire_profileimage(sourceprofileimageName);
       newh.setNewhire_profileimage_path(fileName);
       newh.setNewhire_detailedimage(sourcedetailedimageName);
       newh.setNewhire_detailedimage_path(detailedimagefileName);
       newh.setNewhire_modifieddate(new Date());
     
		newhireLocalServiceUtil.updatenewhire(newh);
			
		logger.info("Updated Successfully");
		}
	}
	catch (SystemException e) 
	{
		logger.error("Error",e);
	}
}	


public void deletenewhiredetailsreference(ActionRequest actionRequest,
		ActionResponse actionResponse) throws Exception
{
 	try {
	logger.info("Delete Vendor======");
	long newhireId = ParamUtil.getInteger(actionRequest, "newhireId");
	logger.info("newhireId===" + newhireId);
	if (newhireId >= 01) {
	
 		newhireLocalServiceUtil.deletenewhire(newhireId);
			logger.info("deleted successfully");
			actionResponse.setRenderParameter("jspPage","/jsp/editnewhiredetails.jsp");
		}
	}
 	catch (Exception e) {
		logger.error("Error",e);
	}
	
}

public String fileUpload(ActionRequest request, ActionResponse response, UploadPortletRequest uploadRequest,
		String sourceprofileimageName, File sourceprofileimage) throws IOException
{
	request.getAttribute(WebKeys.THEME_DISPLAY);
	String str = "NewHireUpload";

	String role="admin";
	java.util.Properties properties = PortalUtil.getPortalProperties();
	logger.info("my properties is...." + properties);
	File contestfolder = new File(properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str);
	File destinationFile = new File(
			properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str + "/" + role);

	if (!contestfolder.exists()) {
		destinationFile.mkdirs();
	}

	if (!destinationFile.exists()) {
		destinationFile.mkdirs();
		logger.info("type directory exists");
	}
	logger.info("my directory is : " + destinationFile);

	
	if (sourceprofileimageName != null) {
		/**************** SAVE THE DOC ********************************/
		if (destinationFile.exists()) {
			String fileNa = sourceprofileimageName.substring(0, sourceprofileimageName.lastIndexOf("."));
			logger.info("fileName : " + fileNa);
			String fileExtension = sourceprofileimageName.substring(sourceprofileimageName.lastIndexOf("."), sourceprofileimageName.length());
			logger.info("fileExtension : " + fileExtension);
			sourceprofileimageName = fileNa;
			SimpleDateFormat df2 = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
			Date date = new Date();
			String testDateString = df2.format(date);
			sourceprofileimageName = sourceprofileimageName + "_" + testDateString + fileExtension;

			destinationFile = new File(properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str
					+ "/" + role + "/" + sourceprofileimageName);

			logger.info("destinationFile : " + destinationFile);

		}
		logger.info("File : " + sourceprofileimageName);
		FileUtil.copyFile(sourceprofileimage, destinationFile);

		String FilePath = destinationFile.toString();
		logger.info("Successfully Saved the Document");
		/*************** ENDED THE SAVING ******************/
		logger.info(FilePath);
	}
	return sourceprofileimageName;
}

public String fileUpload2(ActionRequest request, ActionResponse response, UploadPortletRequest uploadRequest,
		String sourcedetailedimageName, File sourcedetailedimage) throws IOException
{
	request.getAttribute(WebKeys.THEME_DISPLAY);
	

	String str = "NewHireUpload";

	
	String role="admin";
	java.util.Properties properties = PortalUtil.getPortalProperties();
	logger.info("my properties is...." + properties);
	File contestfolder = new File(properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str);
	File destinationFile = new File(
			properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str + "/" + role);

	if (!contestfolder.exists()) {
		destinationFile.mkdirs();
	}

	if (!destinationFile.exists()) {
		destinationFile.mkdirs();
		logger.info("type directory exists");
	}
	logger.info("my directory is : " + destinationFile);

	
	if (sourcedetailedimageName != null) {
		/**************** SAVE THE DOC ********************************/
		if (destinationFile.exists()) {
			String fileNa = sourcedetailedimageName.substring(0, sourcedetailedimageName.lastIndexOf("."));
			logger.info("fileName : " + fileNa);
			String fileExtension = sourcedetailedimageName.substring(sourcedetailedimageName.lastIndexOf("."), sourcedetailedimageName.length());
			logger.info("fileExtension : " + fileExtension);
			sourcedetailedimageName = fileNa;
			SimpleDateFormat df2 = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
			Date date = new Date();
			String testDateString = df2.format(date);
			sourcedetailedimageName = sourcedetailedimageName + "_" + testDateString + fileExtension;

			destinationFile = new File(properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str
					+ "/" + role + "/" + sourcedetailedimageName);

			logger.info("destinationFile : " + destinationFile);

		}
		logger.info("File : " + sourcedetailedimageName);
		FileUtil.copyFile(sourcedetailedimage, destinationFile);

		String FilePath = destinationFile.toString();
		logger.info("Successfully Saved the Document");
		/*************** ENDED THE SAVING ******************/
		logger.info(FilePath);
	}
	return sourcedetailedimageName;
}

}
