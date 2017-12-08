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

package com.chola.topsearch.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author adms.java1
 * @generated
 */
@ProviderType
public class TopSearchFinderUtil {
	public static java.util.List<java.lang.Object[]> gettoplinks() {
		return getFinder().gettoplinks();
	}

	public static TopSearchFinder getFinder() {
		if (_finder == null) {
			_finder = (TopSearchFinder)PortletBeanLocatorUtil.locate(com.chola.topsearch.service.ClpSerializer.getServletContextName(),
					TopSearchFinder.class.getName());

			ReferenceRegistry.registerReference(TopSearchFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(TopSearchFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(TopSearchFinderUtil.class, "_finder");
	}

	private static TopSearchFinder _finder;
}