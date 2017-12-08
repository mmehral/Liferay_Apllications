package com.meera.workflow.customasset;

import com.liferay.asset.kernel.model.AssetRenderer;
import com.liferay.asset.kernel.model.BaseAssetRendererFactory;
import com.liferay.portal.kernel.exception.PortalException;
import com.meera.workflow.db.model.Feedback;
import com.meera.workflow.db.service.FeedbackLocalServiceUtil;

public class FeedbackAssetRendererFactory extends BaseAssetRendererFactory {

	@Override
	public AssetRenderer getAssetRenderer(long classPK, int type) throws PortalException {
		Feedback feedback = FeedbackLocalServiceUtil.getFeedback(classPK);
		return new FeedbackAssetRenderer(feedback);
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

}
