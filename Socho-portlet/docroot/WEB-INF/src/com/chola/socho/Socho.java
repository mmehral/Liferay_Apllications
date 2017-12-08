package com.chola.socho;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.chola.socho.model.idea;
import com.chola.socho.model.topics;
import com.chola.socho.service.ideaLocalServiceUtil;
import com.chola.socho.service.topicsLocalServiceUtil;
import com.google.gson.Gson;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;


public class Socho extends MVCPortlet {
	private static Log logger = LogFactoryUtil.getLog(Socho.class);
	/*public void addComment(ActionRequest actionRequest, ActionResponse actionResponse) {
		logger.info("Comment : ");

		try {
			invokeTaglibDiscussion(actionRequest, actionResponse);
			logger.info("Comment added Successfully..............");
		} catch (Exception e) {
			logger.error("Error",e);
		}
	}*/
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		try
		{
		logger.info("Inside Ajax");
		
		String topicId = resourceRequest.getParameter("topicId");
		logger.info("Topic ID : "+topicId);
		
		List<idea> lt = ideaLocalServiceUtil.customFinder(topicId);
		
		logger.info("Datas : "+lt.toString());
		
		/*PrintWriter writer = resourceResponse.getWriter();
		String json = new Gson().toJson(lt);
	    logger.info("Strings : "+json);
		logger.info("Object : " + json);
		writer.print(json);*/
		//Iterator it = lt.iterator();

		 JSONObject obj = new JSONObject();
		 JSONArray jArray = new JSONArray();
		 PrintWriter writer = resourceResponse.getWriter();
		 
		    
		//while (it.hasNext())
		 for(idea ideas:lt)
		 {
			 logger.info("In action class in serve resource method");
		// Object[] object = (Object[]) it.next();
		 JSONObject obj1 = new JSONObject();
		 obj1.put("id", String.valueOf(ideas.getId()));
		 User userd = UserLocalServiceUtil.getUser(ideas.getUserId());
		 obj1.put("userid", String.valueOf(userd.getLastName()));
		 obj1.put("topic", String.valueOf(ideas.getTopic()));
		 obj1.put("sharedidea", String.valueOf(ideas.getSharedIdea()));
		 obj1.put("shareddate", String.valueOf(ideas.getSharedDate()));
		 jArray.add(obj1);
		 }

		 logger.info("Array : "+jArray);
		 obj.put("monthly", jArray);
		 logger.info("Object : "+obj);
		 writer.print(obj);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}

public String fileUpload(ActionRequest request, ActionResponse response) throws IOException
{
	ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	String fileName = null;
	UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(request);
    //Creating the folder Structure in Tomcat as WebApps/SochoUpload/userId folder will create

    String str = "SochoUpload";

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
	logger.info("my directory is : " + destinationFile);
			
	File sourceFile = uploadRequest.getFile("uploadedFile");
	fileName = uploadRequest.getFileName("uploadedFile");
		
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
					properties.getProperty("liferay.home") + "/tomcat-8.0.32/webapps/" + str + "/" + userId + "/" + fileName);

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
	
	public void save(ActionRequest request, ActionResponse response) throws PortalException, IOException {
		
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(request);
		String sourceFileName = uploadPortletRequest.getFileName("uploadedFile");
		
		logger.info("File Name : "+sourceFileName);
		
		String fileName=null;
		if(!"".equalsIgnoreCase(sourceFileName))
		{
			logger.info("File selected by user");
			fileName = fileUpload(request,response);
		}
		else
		{
			logger.info("File not selected by user");
		}
		
		String idea = request.getParameter("idea");
		idea = idea.replace("\n", " ").replace("\r", " ");
		logger.info("Idea : "+idea+" shared by : "+themeDisplay.getUserId());
		
		String topic = request.getParameter("topic");
		logger.info("Topic : "+topic);
		
		//check that a topic already exists
		List list = topicsLocalServiceUtil.customFinder(topic);
		
		if(!list.isEmpty())
		{
			logger.info("Topic already there");
			SessionErrors.add(request, "topic-already-there");
			SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		}
		else
		{
			logger.info("Proceed");
		
		topics topics = topicsLocalServiceUtil.createtopics(CounterLocalServiceUtil.increment());
		topics.setTopicName(topic);
		topics.setFlag(Long.parseLong("1"));
		topics.setCreatedBy(themeDisplay.getUserId());
		topics.setCreatedOn(new Date());
		topics =topicsLocalServiceUtil.addtopics(topics);
				
		
		com.chola.socho.model.idea ideas = ideaLocalServiceUtil.createidea(CounterLocalServiceUtil.increment());
		ideas.setUserId(themeDisplay.getUserId());
		ideas.setTopic(String.valueOf(topics.getId()));
		ideas.setSharedIdea(idea);
		ideas.setSharedDate(new Date());
		ideas.setSharedFile(fileName);
		ideas = ideaLocalServiceUtil.addidea(ideas);
		
		logger.info("Idea created without topic : "+ideas.getId());
		
		}
	}
	
	public void add(ActionRequest request, ActionResponse response) throws PortalException {
		
		logger.info("Inside Add Method");
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		
		String topic = request.getParameter("topic");
		topic = topic.replace("\n", " ").replace("\r", " ");
		logger.info("topic : "+topic);
		
		List list = topicsLocalServiceUtil.customFinder(topic);
		
		if(!list.isEmpty())
		{
			logger.info("Topic already there");
			SessionErrors.add(request, "topic-already-there");
			SessionMessages.add(request, PortalUtil.getPortletId(request) + SessionMessages.KEY_SUFFIX_HIDE_DEFAULT_ERROR_MESSAGE);
		}
		else
		{
			logger.info("Proceed");
		
		topics topicClass = topicsLocalServiceUtil.createtopics(CounterLocalServiceUtil.increment());
		topicClass.setTopicName(topic);
		topicClass.setFlag(1);
		topicClass.setCreatedBy(themeDisplay.getUserId());
		topicClass.setCreatedOn(new Date());
		
		topicClass = topicsLocalServiceUtil.addtopics(topicClass);
		
		logger.info("Topic created and ID generated : "+topicClass.getId());
		}
	}
	
	public void share(ActionRequest request, ActionResponse response) throws PortalException, IOException {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(request);
		String sourceFileName = uploadPortletRequest.getFileName("uploadedFile");
		
		logger.info("File Name : "+sourceFileName);
		
		String fileName=null;
		if(!"".equalsIgnoreCase(sourceFileName))
		{
			logger.info("File selected by user");
			fileName = fileUpload(request,response);
		}
		else
		{
			logger.info("File not selected by user");
		}
		
		
		String topic = request.getParameter("topicSelect");
		logger.info("topic : "+topic);
		
		String idea = request.getParameter("idea");
		idea = idea.replace("\n", " ").replace("\r", " ");
		logger.info("idea : "+idea);
		
		com.chola.socho.model.idea ideas = ideaLocalServiceUtil.createidea(CounterLocalServiceUtil.increment());
		ideas.setUserId(themeDisplay.getUserId());
		ideas.setTopic(topic);
		ideas.setSharedIdea(idea);
		ideas.setSharedDate(new Date());
		ideas.setSharedFile(fileName);
		ideas = ideaLocalServiceUtil.addidea(ideas);
		
		logger.info("Idea created with topic : "+ideas.getId());
		
	}
	
	public void deleteTopic(ActionRequest request, ActionResponse response) throws PortalException {
		
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		
		logger.info("Inside Delete Topic");
		long id = ParamUtil.getInteger(request, "id");
		
		logger.info("ID to be deleted : "+id);
		
		if(id>=1)
		{
			topics topics = topicsLocalServiceUtil.fetchtopics(id);
			topics.setFlag(2);
			topics.setModifiedBy(themeDisplay.getUserId());
			topics.setModifiedOn(new Date());
			topicsLocalServiceUtil.updatetopics(topics);
			logger.info("Record deleted Successfully");
			response.setRenderParameter("jspPage", "/view.jsp");
		}
	}
	
public void updateTopic(ActionRequest request, ActionResponse response) throws PortalException {
		
	ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	
		logger.info("Inside Update Topic");
		long id = ParamUtil.getInteger(request, "id");
		
		String topic = ParamUtil.getString(request, "topic");
		
		logger.info("ID to be updated : "+id+" Content : "+topic);
		
		
			topics topics = topicsLocalServiceUtil.fetchtopics(id);
			topics.setTopicName(topic);
			topics.setModifiedBy(themeDisplay.getUserId());
			topics.setModifiedOn(new Date());
			topicsLocalServiceUtil.updatetopics(topics);
			logger.info("Record Updated Successfully");
		
	}
	
}
