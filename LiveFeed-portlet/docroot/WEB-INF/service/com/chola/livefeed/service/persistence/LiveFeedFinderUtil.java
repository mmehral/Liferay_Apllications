/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.chola.livefeed.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author adms.java1
 * @generated
 */
@ProviderType
public class LiveFeedFinderUtil {
	public static java.util.List<java.lang.String> getContentLiveNews() {
		return getFinder().getContentLiveNews();
	}

	public static java.util.List<java.lang.String> getLiveContent(
		java.lang.String createdate) {
		return getFinder().getLiveContent(createdate);
	}

	public static boolean getduplicate(java.lang.String createdate) {
		return getFinder().getduplicate(createdate);
	}

	public static LiveFeedFinder getFinder() {
		if (_finder == null) {
			_finder = (LiveFeedFinder)PortletBeanLocatorUtil.locate(com.chola.livefeed.service.ClpSerializer.getServletContextName(),
					LiveFeedFinder.class.getName());

			ReferenceRegistry.registerReference(LiveFeedFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(LiveFeedFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(LiveFeedFinderUtil.class, "_finder");
	}

	private static LiveFeedFinder _finder;
}