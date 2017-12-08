package com.meera.workflow.customasset;

import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.asset.kernel.model.BaseAssetRenderer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.meera.workflow.db.model.Feedback;

public class FeedbackAssetRenderer extends BaseAssetRenderer {
	private Feedback _feedback;
	
	public FeedbackAssetRenderer(Feedback feedback) {
		_feedback = feedback;
		}
	
	@Override
	public Object getAssetObject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getGroupId() {
		return _feedback.getGroupId();
	}

	@Override
	public long getUserId() {
		return _feedback.getUserId();
	}

	@Override
	public String getUserName() {
		String userName=null;
		try {
		userName= UserLocalServiceUtil.getUser(_feedback.getUserId()).getFullName();
		} catch (PortalException e) {
		e.printStackTrace();
		} catch (SystemException e) {
		e.printStackTrace();
		return userName;
		}
		return userName;
	}

	@Override
	public String getUuid() {
		return _feedback.getUuid();
	}

	@Override
	public String getClassName() {
		return Feedback.class.getName();
	}

	@Override
	public long getClassPK() {
		return _feedback.getFeedbackId();
	}

	@Override
	public String getSummary(PortletRequest arg0, PortletResponse arg1) {
		return _feedback.getFeedbackText();
	}

	@Override
	public String getTitle(Locale arg0) {
		return _feedback.getFeedbackSubject();
	}

	@Override
	public boolean include(HttpServletRequest arg0, HttpServletResponse arg1, String arg2) throws Exception {
		return false;
	}
	
	public String render(RenderRequest request, RenderResponse response, String template)
			throws Exception
			{
			if (template.equals(TEMPLATE_FULL_CONTENT)) {
			request.setAttribute("feedBackObject",_feedback);
			return "/html/workflow/view_feedbck.jsp";
			}
			else
			{
			return null;
			}
			}

}
