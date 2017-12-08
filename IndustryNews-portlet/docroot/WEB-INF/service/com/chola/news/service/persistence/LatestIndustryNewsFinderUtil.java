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

package com.chola.news.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author CloverLiferay03
 * @generated
 */
@ProviderType
public class LatestIndustryNewsFinderUtil {
	public static java.util.List<java.lang.String> getContent(
		java.lang.String createdate) {
		return getFinder().getContent(createdate);
	}

	public static java.util.List<java.lang.String> getContentNews() {
		return getFinder().getContentNews();
	}

	public static LatestIndustryNewsFinder getFinder() {
		if (_finder == null) {
			_finder = (LatestIndustryNewsFinder)PortletBeanLocatorUtil.locate(com.chola.news.service.ClpSerializer.getServletContextName(),
					LatestIndustryNewsFinder.class.getName());

			ReferenceRegistry.registerReference(LatestIndustryNewsFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(LatestIndustryNewsFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(LatestIndustryNewsFinderUtil.class,
			"_finder");
	}

	private static LatestIndustryNewsFinder _finder;
}