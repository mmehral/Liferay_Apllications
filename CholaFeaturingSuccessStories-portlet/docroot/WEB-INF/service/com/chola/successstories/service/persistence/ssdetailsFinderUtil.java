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

package com.chola.successstories.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author cloverliferay01
 * @generated
 */
@ProviderType
public class ssdetailsFinderUtil {
	public static ssdetailsFinder getFinder() {
		if (_finder == null) {
			_finder = (ssdetailsFinder)PortletBeanLocatorUtil.locate(com.chola.successstories.service.ClpSerializer.getServletContextName(),
					ssdetailsFinder.class.getName());

			ReferenceRegistry.registerReference(ssdetailsFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(ssdetailsFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(ssdetailsFinderUtil.class, "_finder");
	}

	private static ssdetailsFinder _finder;
}