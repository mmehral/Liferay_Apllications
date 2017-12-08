package com.chola.action;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.chola.ppcontent.service.contentupdateLocalServiceUtil;
import com.chola.productbuysell.model.BuySellProducts;
import com.chola.productbuysell.model.BuySellProductsImages;
import com.chola.productbuysell.service.BuySellLocalServiceUtil;
import com.chola.productbuysell.service.BuySellProductsImagesLocalServiceUtil;
import com.chola.productbuysell.service.BuySellProductsLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.model.DLFolderConstants;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserServiceUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.FileItem;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;

import javax.portlet.ProcessAction;
import com.liferay.util.portlet.*;


public class ProductBuySellAction extends MVCPortlet{
	private static String ROOT_FOLDER_NAME = PortletProps.get("fileupload.folder.name");
	private static String ROOT_FOLDER_DESCRIPTION = PortletProps.get("fileupload.folder.description");
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;
	private static final Log logger = LogFactoryUtil.getLog(ProductBuySellAction.class);
	public void buySellProAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, IOException {
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
	
		
		String contestlist = uploadPortletRequest.getParameter("contestlist");
		int contesttableId = Integer.parseInt(contestlist);
		logger.info(contestlist);
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		
		logger.info("In BuySellAction");
		User user=UserServiceUtil.getUserById(themeDisplay.getUserId());
		
	String productTitle=ParamUtil.getString(actionRequest, "productTitle");
	String productDescription=ParamUtil.getString(actionRequest, "productDescription");
	String contactNumber=ParamUtil.getString(actionRequest, "contactNumber");
	String askingPrice=ParamUtil.getString(actionRequest, "askingPrice");
	int productCategory=ParamUtil.getInteger(actionRequest, "productCategory");
	int productLocation=ParamUtil.getInteger(actionRequest, "productLocation");
	
	
	//BuySellProducts buySellProducts=null;
	
	SimpleDateFormat df2 = new SimpleDateFormat("ddMMyyyyHHmmssSSS");
	Date date = new Date();
	long uniqueContentId = Long.parseLong(df2.format(date));
	
	String currentPageUrl=themeDisplay.getURLCurrent();
	if(currentPageUrl.contains("?"))
	{
		currentPageUrl = currentPageUrl.substring(0, currentPageUrl.indexOf("?"));
	}
	

	BuySellProducts buy = BuySellProductsLocalServiceUtil.createBuySellProducts(CounterLocalServiceUtil.increment());
	buy.setCategory_id(productCategory);
	buy.setContent_id(uniqueContentId);
	buy.setTitle(productTitle);
	buy.setDescription(productDescription);
	buy.setContactNumber(contactNumber);
	buy.setAskingPrice(askingPrice);
	buy.setApprovedstatus(2);
	buy.setSellerName(user.getFirstName()+" "+user.getLastName());
	buy.setUserScreenName(user.getScreenName());
	buy.setStatus(1);
	buy.setLocation(productLocation);
	buy.setCreated_date(new Date());
	
	buy=BuySellProductsLocalServiceUtil.addBuySellProducts(buy);
	
	
	//Map<String, FileItem[]> files= uploadPortletRequest.getMultipartParameterMap();
		if (contesttableId == 0) {
		File sourceFile = uploadPortletRequest.getFile("contesttable[0].upload");
		String sourceFileName = uploadPortletRequest.getFileName("contesttable[0].upload");

		String fileName = null;
		if (!sourceFileName.isEmpty()) {
			logger.info("File selected by user");
			fileName = fileUpload(actionRequest, actionResponse, uploadPortletRequest, sourceFileName, sourceFile);
		} else {
			logger.info("File not selected by user");
		}

		BuySellProductsImages buysellimage=BuySellProductsImagesLocalServiceUtil.createBuySellProductsImages(CounterLocalServiceUtil.increment());
		buysellimage.setImage_name(sourceFileName);
		buysellimage.setImage_path(fileName);
		buysellimage.setProduct_id(buy.getId());
		buysellimage.setContent_id(buy.getContent_id());
		buysellimage=BuySellProductsImagesLocalServiceUtil.addBuySellProductsImages(buysellimage);

	}

	// The Image upload for more than
	// One.........................................
	for (int i = 0; i < contesttableId - 1; i++) {
		File sourceFile = uploadPortletRequest.getFile("contesttable[" + i + "].upload");
		String sourceFileName = uploadPortletRequest.getFileName("contesttable[" + i + "].upload");
		String fileName = null;
		if (!sourceFileName.isEmpty()) {
			logger.info("File selected by user");
			fileName = fileUpload(actionRequest, actionResponse, uploadPortletRequest, sourceFileName, sourceFile);
		} else {
			logger.info("File not selected by user");
		}
		BuySellProductsImages buysellimage=BuySellProductsImagesLocalServiceUtil.createBuySellProductsImages(CounterLocalServiceUtil.increment());
		buysellimage.setImage_name(sourceFileName);
		buysellimage.setImage_path(fileName);
		buysellimage.setProduct_id(buy.getId());
		buysellimage.setContent_id(buy.getContent_id());
		buysellimage=BuySellProductsImagesLocalServiceUtil.addBuySellProductsImages(buysellimage);
	}
	
	List<String> lt=contentupdateLocalServiceUtil.getCompany();
	Iterator it = lt.iterator();
	Object[] notificationDetails={buy.getContent_id(),1,1,"Product Buy/Sell",buy.getTitle()+" - New Product has been added",currentPageUrl};
	
	boolean insert1=contentupdateLocalServiceUtil.insertIntoContentUniqueInfo(notificationDetails);
	
	while (it.hasNext()) {
		Object[] object = (Object[]) it.next();
		String businessId=object[0].toString();
		
		if(insert1){
			boolean insert2=contentupdateLocalServiceUtil.insertIntoPPContentStore(businessId, null, "ALL", "all", "All User", buy.getContent_id(), null, null, null, 0);
		}
	}
	
	}
	
	public String fileUpload(ActionRequest request, ActionResponse response, UploadPortletRequest uploadRequest,
			String fileName, File sourceFile) throws IOException {
	
		String str = "BuySellUpload";

		String role = "admin";
		java.util.Properties properties = PortalUtil.getPortalProperties();
		File contestfolder = new File(properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str);
		File destinationFile = new File(
				properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str + "/" + role);

		if (!contestfolder.exists()) {
			destinationFile.mkdirs();
		}

		if (!destinationFile.exists()) {
			destinationFile.mkdirs();
		}

		// File sourceFile = uploadRequest.getFile("uploadedFile");
		// fileName = uploadRequest.getFileName("uploadedFile");

		if (fileName != null) {
			/**************** SAVE THE DOC ********************************/
			if (destinationFile.exists()) {
				fileName.lastIndexOf(".");
				String fileNa = fileName.substring(0, fileName.lastIndexOf("."));
				logger.info("fileName : " + fileNa);
				String fileExtension = fileName.substring(fileName.lastIndexOf("."), fileName.length());
				logger.info("fileExtension : " + fileExtension);
				fileName = fileNa;
				SimpleDateFormat df2 = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
				Date date = new Date();
				String testDateString = df2.format(date);
				fileName = fileName + "_" + testDateString + fileExtension;

				destinationFile = new File(properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str
						+ "/" + role + "/" + fileName);


			}
			FileUtil.copyFile(sourceFile, destinationFile);

			String FilePath = destinationFile.toString();
			logger.info("Successfully Saved the Document");
			/*************** ENDED THE SAVING ******************/
		}
		return fileName;
	}
	
	public void addImages(Map<String, FileItem[]> files,ThemeDisplay themeDisplay,BuySellProducts buy,ActionRequest actionRequest){
		
		
		Folder folder = getFolder(themeDisplay);
		InputStream is;
		File file;
		String title, description,mimeType;
		long repositoryId;
		for (java.util.Map.Entry<String, FileItem[]> file2 : files.entrySet()) {
			
			FileItem item[] =file2.getValue();

			try {
				for (FileItem fileItem : item) {
					title = fileItem.getFileName();
					description = title +" is added via programatically";
					repositoryId = themeDisplay.getScopeGroupId();
					mimeType = fileItem.getContentType();	
					file = fileItem.getStoreLocation();
					is =fileItem.getInputStream();
			
						try {
						ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), actionRequest);
						logger.info("Repository Id : "+repositoryId);
						DLAppServiceUtil.addFileEntry(repositoryId, folder.getFolderId(), title, mimeType, 
								title, description, "", is, file.getTotalSpace(), serviceContext);
						
						//String url = themeDisplay.getPortalURL() + themeDisplay.getPathContext() + "/documents/" + themeDisplay.getScopeGroupId() + "/56401/" +fileItem.getFullFileName() ;
						String url = "/documents/" + themeDisplay.getScopeGroupId() + "/56401/" +fileItem.getFullFileName() ;
					
			    	
						BuySellProductsImages buysellimage=BuySellProductsImagesLocalServiceUtil.createBuySellProductsImages(CounterLocalServiceUtil.increment());
						buysellimage.setImage_name(fileItem.getFileName());
						buysellimage.setImage_path(url);
						buysellimage.setProduct_id(buy.getId());
						
						buysellimage=BuySellProductsImagesLocalServiceUtil.addBuySellProductsImages(buysellimage);
			    	} catch (PortalException e) {
						logger.error(e.getMessage());
					} catch (SystemException e) {
						logger.error(e.getMessage());
					}
				}
			} catch (IOException e) {
				logger.error(e.getMessage());
			}
		}
	}
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		if (resourceRequest.getResourceID().equalsIgnoreCase("productCategoryList")) {
			try {
			logger.info("In Product Category List Fetch Method");
			List<Object[]> lt = BuySellLocalServiceUtil.getProductCategoryList();
			
			PrintWriter writer = resourceResponse.getWriter();
			JSONArray finalOb = new JSONArray();
			for (Object[] obje : lt) {
			
			JSONObject obj = new JSONObject();
			obj.put("id", obje[0]);
			obj.put("name", obje[1]);
			finalOb.add(obj);

			}

			writer.print(finalOb);
			} catch (Exception e) {

			}
			}
		
		
		if (resourceRequest.getResourceID().equalsIgnoreCase("getLocationList")) {
			try {
			logger.info("In Location List Fetch Method");
			List<Object[]> lt = BuySellLocalServiceUtil.getLocationList();
			
			PrintWriter writer = resourceResponse.getWriter();
			JSONArray finalOb = new JSONArray();
			for (Object[] obje : lt) {
			
			JSONObject obj = new JSONObject();
			obj.put("id", obje[0]);
			obj.put("name", obje[1]);
			finalOb.add(obj);

			}
			logger.info("Location List : "+finalOb);

			writer.print(finalOb);
			} catch (Exception e) {
			}
			}
		
		
		if (resourceRequest.getResourceID().equalsIgnoreCase("categoryWiseProductsList")) {
			try {
				String categoryId=resourceRequest.getParameter("categoryId");
				
			
			List<BuySellProducts> products=BuySellProductsLocalServiceUtil.getProductsCategoryWise(Integer.parseInt(categoryId));
			
			PrintWriter writer = resourceResponse.getWriter();
			JSONArray finalOb = new JSONArray();
			
			
			if(!products.isEmpty()){
				for(BuySellProducts buy:products){
					
					JSONObject obj = new JSONObject();
					obj.put("id", buy.getId());
					
			JSONArray finalImageArray=new JSONArray();
					
					List<BuySellProductsImages> productImagesList=BuySellProductsImagesLocalServiceUtil.getProductImages((int) buy.getId());
					
					for(BuySellProductsImages productImage:productImagesList){
						JSONObject imgObj = new JSONObject();
						imgObj.put("image_name",productImage.getImage_name());
						imgObj.put("image_path", productImage.getImage_path());
						finalImageArray.add(imgObj);
					}
					obj.put("image_list",finalImageArray);
					obj.put("category_id", buy.getCategory_id());
					obj.put("title", buy.getTitle());
					obj.put("description", buy.getDescription());
					obj.put("user_id", buy.getUserScreenName());
					obj.put("location", buy.getLocation());
					obj.put("status", buy.getStatus());
					//obj.put("created_date", buy.getCreated_date());
					finalOb.add(obj);
					}
			}else{
				SessionErrors.add(resourceRequest, "No_Products");
				SessionMessages.add(resourceRequest,PortalUtil.getPortletId(resourceRequest)+SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			}

			logger.info(finalOb.toString());
			writer.print(finalOb);
			}
		 catch (Exception e) {
			 logger.error(e.getMessage());
		 }
			
			}
		
		
		
		
		if (resourceRequest.getResourceID().equalsIgnoreCase("locationBasedProductsList")) {
			try {
				String locationId=resourceRequest.getParameter("locId");
				
			
			List<BuySellProducts> products=BuySellProductsLocalServiceUtil.getProductsLocationWise(Integer.parseInt(locationId));
			
			PrintWriter writer = resourceResponse.getWriter();
			JSONArray finalOb = new JSONArray();
			
			if(!products.isEmpty()){
				for(BuySellProducts buy:products){
					
					JSONObject obj = new JSONObject();
					
					
					obj.put("id", buy.getId());
JSONArray finalImageArray=new JSONArray();
					
					List<BuySellProductsImages> productImagesList=BuySellProductsImagesLocalServiceUtil.getProductImages((int) buy.getId());
					
					
					for(BuySellProductsImages productImage:productImagesList){
						JSONObject imgObj = new JSONObject();
						imgObj.put("image_name",productImage.getImage_name());
						imgObj.put("image_path", productImage.getImage_path());
						finalImageArray.add(imgObj);
					}
					obj.put("image_list",finalImageArray);
					obj.put("category_id", buy.getCategory_id());
					obj.put("title", buy.getTitle());
					obj.put("description", buy.getDescription());
					obj.put("user_id", buy.getUserScreenName());
					obj.put("location", buy.getLocation());
					obj.put("status", buy.getStatus());
					finalOb.add(obj);
					}
			}else{
				SessionErrors.add(resourceRequest, "No_Products");
				SessionMessages.add(resourceRequest,PortalUtil.getPortletId(resourceRequest)+SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			}

			logger.info(finalOb.toString());
			writer.print(finalOb);
			}
		 catch (Exception e) {
			 logger.error(e.getMessage());
		 }
			
			}
		
		
		//Category and location based products
		if (resourceRequest.getResourceID().equalsIgnoreCase("categoryAndLocaionWiseProductsList")) {
			try {
				String locationId=resourceRequest.getParameter("locId");
				String categoryId=resourceRequest.getParameter("categoryId");
			
			List<BuySellProducts> products=BuySellProductsLocalServiceUtil.getProductsCategoryAndLocationWise(Integer.parseInt(locationId), Integer.parseInt(categoryId));
			
			PrintWriter writer = resourceResponse.getWriter();
			JSONArray finalOb = new JSONArray();
			
			if(!products.isEmpty()){
				for(BuySellProducts buy:products){
					
					JSONObject obj = new JSONObject();
					obj.put("id", buy.getId());
					
JSONArray finalImageArray=new JSONArray();
					List<BuySellProductsImages> productImagesList=BuySellProductsImagesLocalServiceUtil.getProductImages((int) buy.getId());
					
					for(BuySellProductsImages productImage:productImagesList){
						JSONObject imgObj = new JSONObject();
						imgObj.put("image_name",productImage.getImage_name());
						imgObj.put("image_path", productImage.getImage_path());
						finalImageArray.add(imgObj);
					}
					obj.put("image_list",finalImageArray);
					obj.put("category_id", buy.getCategory_id());
					obj.put("title", buy.getTitle());
					obj.put("description", buy.getDescription());
					obj.put("user_id", buy.getUserScreenName());
					obj.put("location", buy.getLocation());
					obj.put("status", buy.getStatus());
					//obj.put("created_date", buy.getCreated_date());
					finalOb.add(obj);
					}
			}else{
				SessionErrors.add(resourceRequest, "No_Products");
				SessionMessages.add(resourceRequest,PortalUtil.getPortletId(resourceRequest)+SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			}

			logger.info(finalOb.toString());
			writer.print(finalOb);
			}
		 catch (Exception e) {
			 logger.error(e.getMessage());
		 }
			
			}
		
		//Category and Search based products
		if (resourceRequest.getResourceID().equalsIgnoreCase("categoryAndSearchWiseProductsList")) {
			try {
				String searchTitle=resourceRequest.getParameter("searchKeyword");
				String categoryId=resourceRequest.getParameter("categoryId");
			
			
			if((!searchTitle.equals(""))){
				searchTitle="%"+searchTitle+"%";
			}
			List<BuySellProducts> products=BuySellProductsLocalServiceUtil.getProductsCategorySearchWise(Integer.parseInt(categoryId),searchTitle);
			
			PrintWriter writer = resourceResponse.getWriter();
			JSONArray finalOb = new JSONArray();
			
			if(!products.isEmpty()){
				for(BuySellProducts buy:products){
					
					JSONObject obj = new JSONObject();
					obj.put("id", buy.getId());
					JSONArray finalImageArray=new JSONArray();
					List<BuySellProductsImages> productImagesList=BuySellProductsImagesLocalServiceUtil.getProductImages((int) buy.getId());
					
					for(BuySellProductsImages productImage:productImagesList){
						JSONObject imgObj = new JSONObject();
						imgObj.put("image_name",productImage.getImage_name());
						imgObj.put("image_path", productImage.getImage_path());
						finalImageArray.add(imgObj);
					}
					obj.put("image_list",finalImageArray);
					obj.put("category_id", buy.getCategory_id());
					obj.put("title", buy.getTitle());
					obj.put("description", buy.getDescription());
					obj.put("user_id", buy.getUserScreenName());
					obj.put("location", buy.getLocation());
					obj.put("status", buy.getStatus());
					//obj.put("created_date", buy.getCreated_date());
					finalOb.add(obj);
					}
			}else{
				SessionErrors.add(resourceRequest, "No_Products");
				SessionMessages.add(resourceRequest,PortalUtil.getPortletId(resourceRequest)+SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			}

			writer.print(finalOb);
			}
		 catch (Exception e) {
			 logger.error(e.getMessage());
		 }
			
			}
		
		
		//Location and Search based products
		if (resourceRequest.getResourceID().equalsIgnoreCase("LocationAndSearchWiseProductsList")) {
			try {
				String locationId=resourceRequest.getParameter("locId");
				String searchTitle=resourceRequest.getParameter("searchKeyword");
			
			
			if((!searchTitle.equals(""))){
				searchTitle="%"+searchTitle+"%";
			}
			List<BuySellProducts> products=BuySellProductsLocalServiceUtil.getProductsLocationSearchWise(Integer.parseInt(locationId), searchTitle);
			
			PrintWriter writer = resourceResponse.getWriter();
			JSONArray finalOb = new JSONArray();
			
			if(!products.isEmpty()){
				for(BuySellProducts buy:products){
					
					JSONObject obj = new JSONObject();
					obj.put("id", buy.getId());
					JSONArray finalImageArray=new JSONArray();
					List<BuySellProductsImages> productImagesList=BuySellProductsImagesLocalServiceUtil.getProductImages((int) buy.getId());
					
					for(BuySellProductsImages productImage:productImagesList){
						JSONObject imgObj = new JSONObject();
						imgObj.put("image_name",productImage.getImage_name());
						imgObj.put("image_path", productImage.getImage_path());
						finalImageArray.add(imgObj);
					}
					obj.put("image_list",finalImageArray);
					obj.put("category_id", buy.getCategory_id());
					obj.put("title", buy.getTitle());
					obj.put("description", buy.getDescription());
					obj.put("user_id", buy.getUserScreenName());
					obj.put("location", buy.getLocation());
					obj.put("status", buy.getStatus());
					//obj.put("created_date", buy.getCreated_date());
					finalOb.add(obj);
					}
			}else{
				SessionErrors.add(resourceRequest, "No_Products");
				SessionMessages.add(resourceRequest,PortalUtil.getPortletId(resourceRequest)+SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			}

			writer.print(finalOb);
			}
		 catch (Exception e) {
			 logger.error(e.getMessage());
		 }
			
			}
		
		//Category, Location and Search based products
		if (resourceRequest.getResourceID().equalsIgnoreCase("categoryLocationAndSearchWiseProductsList")) {
			try {
				String locationId=resourceRequest.getParameter("locId");
				String categoryId=resourceRequest.getParameter("categoryId");
				String searchTitle=resourceRequest.getParameter("searchKeyword");
			if((!searchTitle.equals(""))){
				searchTitle="%"+searchTitle+"%";
			}
			List<BuySellProducts> products=BuySellProductsLocalServiceUtil.getProductsCategoryLocationSearchWise(Integer.parseInt(categoryId), Integer.parseInt(locationId), searchTitle);
			
			PrintWriter writer = resourceResponse.getWriter();
			JSONArray finalOb = new JSONArray();
			
			if(!products.isEmpty()){
				for(BuySellProducts buy:products){
					
					JSONObject obj = new JSONObject();
					obj.put("id", buy.getId());
					JSONArray finalImageArray=new JSONArray();
					List<BuySellProductsImages> productImagesList=BuySellProductsImagesLocalServiceUtil.getProductImages((int) buy.getId());
					
					for(BuySellProductsImages productImage:productImagesList){
						JSONObject imgObj = new JSONObject();
						imgObj.put("image_name",productImage.getImage_name());
						imgObj.put("image_path", productImage.getImage_path());
						finalImageArray.add(imgObj);
					}
					obj.put("image_list",finalImageArray);
					obj.put("category_id", buy.getCategory_id());
					obj.put("title", buy.getTitle());
					obj.put("description", buy.getDescription());
					obj.put("user_id", buy.getUserScreenName());
					obj.put("location", buy.getLocation());
					obj.put("status", buy.getStatus());
					finalOb.add(obj);
					}
			}else{
				SessionErrors.add(resourceRequest, "No_Products");
				SessionMessages.add(resourceRequest,PortalUtil.getPortletId(resourceRequest)+SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			}

			writer.print(finalOb);
			}
		 catch (Exception e) {
			 logger.error(e.getMessage());
		 }
			
			}
		
		
		
		if (resourceRequest.getResourceID().equalsIgnoreCase("searchResults")) {
			try {
				String searchKeyword=resourceRequest.getParameter("searchKeyword");
				
			
			if((!searchKeyword.equals(""))){
				searchKeyword="%"+searchKeyword+"%";
			}
			
			
			List<BuySellProducts> products=BuySellProductsLocalServiceUtil.getProductsTitleBasedSearch(searchKeyword);
			
			PrintWriter writer = resourceResponse.getWriter();
			JSONArray finalOb = new JSONArray();
			
			if(!products.isEmpty()){
				for(BuySellProducts buy:products){
					
					JSONObject obj = new JSONObject();
					obj.put("id", buy.getId());
					
JSONArray finalImageArray=new JSONArray();
					
					List<BuySellProductsImages> productImagesList=BuySellProductsImagesLocalServiceUtil.getProductImages((int) buy.getId());
					
					for(BuySellProductsImages productImage:productImagesList){
						JSONObject imgObj = new JSONObject();
						imgObj.put("image_name",productImage.getImage_name());
						imgObj.put("image_path", productImage.getImage_path());
						finalImageArray.add(imgObj);
					}
					
					obj.put("image_list",finalImageArray);
					obj.put("category_id", buy.getCategory_id());
					obj.put("title", buy.getTitle());
					obj.put("description", buy.getDescription());
					obj.put("user_id", buy.getUserScreenName());
					obj.put("location", buy.getLocation());
					obj.put("status", buy.getStatus());
					//obj.put("created_date", buy.getCreated_date());
					finalOb.add(obj);
					}
			}else{
				SessionErrors.add(resourceRequest, "No_Products");
				SessionMessages.add(resourceRequest,PortalUtil.getPortletId(resourceRequest)+SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
			}

			writer.print(finalOb);
			}
		 catch (Exception e) {
			 logger.error(e.getMessage());
		 }
			
			}
	}

	@ProcessAction(name = "uploadDocument")
	public void uploadDocument(ActionRequest actionRequest, ActionResponse actionResponse) {
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		createFolder(actionRequest, themeDisplay);
		fileUpload(themeDisplay, actionRequest);
	}

	public void fileUpload(ThemeDisplay themeDisplay,ActionRequest actionRequest){
	UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);
	
	Map<String, FileItem[]> files= uploadPortletRequest.getMultipartParameterMap();
	Folder folder = getFolder(themeDisplay);
	InputStream is;
	File file;
	String title, description,mimeType;
	long repositoryId;
	for (java.util.Map.Entry<String, FileItem[]> file2 : files.entrySet()) {
		
		FileItem item[] =file2.getValue();

		try {
			for (FileItem fileItem : item) {
				title = fileItem.getFileName();
				description = title +" is added via programatically";
				repositoryId = themeDisplay.getScopeGroupId();
				mimeType = fileItem.getContentType();	
				file = fileItem.getStoreLocation();
				is =fileItem.getInputStream();
				
				
		    	try {
					ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), actionRequest);
					DLAppServiceUtil.addFileEntry(repositoryId, folder.getFolderId(), title, mimeType, 
							title, description, "", is, file.getTotalSpace(), serviceContext);
				} catch (PortalException e) {
					logger.error(e.getMessage());
				} catch (SystemException e) {
					logger.error(e.getMessage());
				}
			}
		} catch (IOException e) {
			logger.error(e.getMessage());
		}
	}
	}

	private Folder createFolder(ActionRequest actionRequest, ThemeDisplay themeDisplay) {
		
boolean folderExist = isFolderExist(themeDisplay);
Folder folder = null;
if (!folderExist) {
long repositoryId = themeDisplay.getScopeGroupId();
try {
ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(), actionRequest);
folder = DLAppServiceUtil.addFolder(repositoryId,PARENT_FOLDER_ID, ROOT_FOLDER_NAME,ROOT_FOLDER_DESCRIPTION, serviceContext);
} catch (PortalException e1) {
e1.printStackTrace();
} catch (SystemException e1) {
e1.printStackTrace();
}
}
return folder;
}

	private boolean isFolderExist(ThemeDisplay themeDisplay) {
		boolean folderExist = false;
		try {
		DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
		folderExist = true;
		} catch (Exception e) {
		logger.info(e.getMessage());
		}
		return folderExist;
	}

	@ProcessAction(name = "downloadFiles")
	public void downloadFiles(ActionRequest actionRequest, ActionResponse actionResponse) {

		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		  Map<String,String> urlMap = getAllFileLink(themeDisplay);
		  actionRequest.setAttribute("urlMap", urlMap);
		  actionResponse.setRenderParameter("jspPage","/html/documentupload/download.jsp");
	}
	
	public Folder getFolder(ThemeDisplay themeDisplay){
		Folder folder = null;
		try {
		folder =DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
		} catch (Exception e) {
		logger.info(e.getMessage());
		}
		return folder;
		}
	
	public Map<String, String> getAllFileLink(ThemeDisplay themeDisplay){
		Map<String, String> urlMap = new HashMap<String, String>();//key = file name ,value = url
		long repositoryId = themeDisplay.getScopeGroupId();
		try {
			Folder folder =getFolder(themeDisplay);
			List<FileEntry> fileEntries = DLAppServiceUtil.getFileEntries(repositoryId, folder.getFolderId());
			 for (FileEntry file : fileEntries) {
				String url = themeDisplay.getPortalURL() + themeDisplay.getPathContext() + "/documents/" + themeDisplay.getScopeGroupId() + "/" + 
						      file.getFolderId() +  "/" +file.getTitle() ;
				urlMap.put(file.getTitle().split("\\.")[0], url);// remove jpg or pdf
			   
			}
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return urlMap;
		
	}
	
	public String fileUpload(ActionRequest request,ActionResponse response) throws IOException{
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		String fileName = null;
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);
	    //Creating the folder Structure in Tomcat as WebApps/SochoUpload/userId folder will create

	    String str = "BuySellUpload";

		long userId = themeDisplay.getUserId();
		java.util.Properties properties = PortalUtil.getPortalProperties();
		logger.info("my properties is...." + properties);
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
				//logger.info("FileName:-" + fileNa + " File Extension:-"+ fileExtension4);
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
			logger.info("Successfully Saved the Document");
			/*************** ENDED THE SAVING ******************/
	}
		return fileName;
	}
	
	public void addComment(ActionRequest actionRequest, ActionResponse actionResponse) 
	{

		try {
			invokeTaglibDiscussion(actionRequest, actionResponse);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}

	public void deleteProduct(ActionRequest actionRequest,ActionResponse actionResponse){
		long id = ParamUtil.getInteger(actionRequest, "id");
		if(id>=1)
		{
			BuySellProducts sop = BuySellProductsLocalServiceUtil.fetchBuySellProducts(id);
			sop.setStatus(2);
			BuySellProductsLocalServiceUtil.updateBuySellProducts(sop);
			
			actionResponse.setRenderParameter("jspPage", "/view.jsp");
			long flag=0;
			String notificationText="Product has been deleted";
			long content_id=sop.getContent_id();
			
			boolean updatedeleteSucces=contentupdateLocalServiceUtil.changeContentFlagForUpdateDelete(flag,notificationText, content_id);
			
		}
	}
	
	public void updateProduct(ActionRequest actionRequest,ActionResponse actionResponse){
		
	}
}
