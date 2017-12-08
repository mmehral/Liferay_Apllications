package com.chola.EmployeeRef.Action;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import com.chola.EmployeeRef.model.EmployeeRefrence;
import com.chola.EmployeeRef.service.EmployeeRefrenceLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

public class EmployeeRefMainAction extends MVCPortlet{
	private static Log logger = LogFactoryUtil.getLog(EmployeeRefMainAction.class);
	
	public void submitRefferal(ActionRequest request,ActionResponse response)
	{
		ThemeDisplay td  =(ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		String user = td.getUser().getEmailAddress();
		System.out.println("Email Address.."+user);
		logger.info("Email Address..."+user);
		String Title=request.getParameter("Title");
		logger.info("Title :"+Title);
		String From=request.getParameter("From");
		logger.info("Title :"+From);
		String To=request.getParameter("To");
		logger.info("To :"+To);
		String Body=request.getParameter("Body");
		logger.info("Body :"+Body);
		long referenceId = ParamUtil.getInteger(request, "referenceId");
		logger.info("referenceId=========="+referenceId);
		if(referenceId>=01){
			modifiedcompany(request, response, referenceId,
					Title,From,To,Body);
			response.setRenderParameter("jspPage",
					"/html/edit.jsp");
		}else{
		
		EmployeeRefrence ref=EmployeeRefrenceLocalServiceUtil.createEmployeeRefrence(CounterLocalServiceUtil.increment());
		ref.setBody(Body);
		ref.setFrom(From);
		ref.setFlag(1);
		ref.setTitle(Title);
		ref.setTo(To);
		ref.setCreateDate(new Date());
		EmployeeRefrenceLocalServiceUtil.addEmployeeRefrence(ref);
		}
		
	}

	private void modifiedcompany(ActionRequest request, ActionResponse response, long referenceId, String title,
			String from, String to, String body) {
	     logger.info("edit the forms======");
		
		logger.info("myyyyy CompanyId====" + referenceId);
		EmployeeRefrence ref = null;
		try {
			ref = EmployeeRefrenceLocalServiceUtil.fetchEmployeeRefrence(referenceId);
			logger.info("!!!!!!" + ref);
		
		if (Validator.isNotNull(ref)) {
			ref.setBody(body);
			ref.setFrom(from);
			ref.setFlag(1);
			ref.setTitle(title);
			ref.setTo(to);
			ref.setModifiedDate(new Date());
			
				EmployeeRefrenceLocalServiceUtil.updateEmployeeRefrence(ref);
				logger.info("Your Updated Successfully");
		}} catch (Exception e) {
			logger.error("Error",e);
		}
	}
	public void deletereference(ActionRequest actionRequest,
			ActionResponse actionResponse) throws Exception {
		logger.info("Delete Vendor======");
		long referenceId = ParamUtil.getInteger(actionRequest, "referenceId");
		logger.info("referenceId===" + referenceId);
		if (referenceId >= 01) {
		
	 	try {
	 		EmployeeRefrenceLocalServiceUtil.deleteEmployeeRefrence(referenceId);
				logger.info("your deleted successfully");
				actionResponse.setRenderParameter("jspPage","/html/edit.jsp");
			
			} catch (Exception e) {
				logger.error("Error",e);
			} 
		}
		
	}
	/*public void addComment(ActionRequest actionRequest, ActionResponse actionResponse)
	{
		logger.info("Comment=======");

		try {
			invokeTaglibDiscussion(actionRequest, actionResponse);
			logger.info("Comment added Successfully..............");
		} catch (Exception e) {
			logger.error("Error",e);
		}
	}*/
	
}
