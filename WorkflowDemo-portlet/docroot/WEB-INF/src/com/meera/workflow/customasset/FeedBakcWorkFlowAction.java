package com.meera.workflow.customasset;
import java.io.IOException;
import java.util.Date;
import javax.mail.internet.AddressException;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.servlet.http.HttpServletRequest;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.NoSuchWorkflowDefinitionLinkException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;
import com.liferay.portal.kernel.model.WorkflowDefinitionLink;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.WorkflowDefinitionLinkLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.asset.kernel.service.AssetEntryLocalServiceUtil;
import com.meera.workflow.db.model.Feedback;
import com.meera.workflow.db.service.FeedbackLocalServiceUtil;

/**
* Portlet implementation class FeedBakcWorkFlowAction
*/
public class FeedBakcWorkFlowAction extends MVCPortlet {
public void submitFeedback(ActionRequest actionRequest,
ActionResponse actionResponse) throws IOException,
AddressException,com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {
ThemeDisplay themeDisplay = (ThemeDisplay)actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
String feedBackMessage = ParamUtil.getString(actionRequest, "feedbackMessage");
String feedbackSubject = ParamUtil.getString(actionRequest, "feedbackSubject");
ServiceContext serviceContext = ServiceContextFactory.getInstance(Feedback.class.getName(), actionRequest);
try {
Feedback feedback=FeedbackLocalServiceUtil.createFeedback(CounterLocalServiceUtil.increment());
feedback.setCompanyId(themeDisplay.getCompanyId());
feedback.setGroupId(themeDisplay.getScopeGroupId());
feedback.setFeedbackDate(new Date());
feedback.setFeedbackText(feedBackMessage);
feedback.setFeedbackSubject(feedbackSubject);
feedback.setFeedBackStatus(WorkflowConstants.STATUS_DRAFT);
feedback.setUserId(themeDisplay.getUserId());
feedback.setStatusByUserId(themeDisplay.getUserId());
feedback=FeedbackLocalServiceUtil.addFeedback(feedback);
WorkflowDefinitionLink workflowDefinitionLink=null;
try{
workflowDefinitionLink=
WorkflowDefinitionLinkLocalServiceUtil.
getDefaultWorkflowDefinitionLink(themeDisplay.getCompanyId(), Feedback.class.getName(), 0, 0);
}catch (Exception e) {
if(e instanceof NoSuchWorkflowDefinitionLinkException){
SessionMessages.add((HttpServletRequest) actionRequest.getPortletSession(),"workflow-not-enabled");
}
e.printStackTrace();
}
//checking workflow defintion is enabled to feedback asset or not
if(feedback!=null&&workflowDefinitionLink!=null){
//add feedback asset in asset entry table
AssetEntryLocalServiceUtil.updateEntry(themeDisplay.getUserId(), feedback.getGroupId(),
Feedback.class.getName(), feedback.getFeedbackId(),
serviceContext.getAssetCategoryIds(),
serviceContext.getAssetTagNames());
//start workflow instance to feedback.
WorkflowHandlerRegistryUtil.startWorkflowInstance(
feedback.getCompanyId(), feedback.getGroupId(), themeDisplay.getUserId(),
Feedback.class.getName(), feedback.getPrimaryKey(), feedback,
serviceContext);
}
if(feedback==null){
SessionErrors.add((HttpServletRequest) actionRequest.getPortletSession(),"feedback-submit-failed");
}else{
SessionMessages.add((HttpServletRequest) actionRequest.getPortletSession(),"feedback-submit-success");
}
} catch (Exception e) {
if(e instanceof NoSuchWorkflowDefinitionLinkException){
SessionMessages.add((HttpServletRequest) actionRequest.getPortletSession(),"workflow-not-enabled");
}
e.printStackTrace();
}
actionResponse.setRenderParameter("mvcPath", "/html/workflow/feedback.jsp");
}
}
