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

package com.chola.learningbites.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author cloverliferay01
 * @generated
 */
@ProviderType
public class lbdetailsFinderUtil {
	public static lbdetailsFinder getFinder() {
		if (_finder == null) {
			_finder = (lbdetailsFinder)PortletBeanLocatorUtil.locate(com.chola.learningbites.service.ClpSerializer.getServletContextName(),
					lbdetailsFinder.class.getName());

			ReferenceRegistry.registerReference(lbdetailsFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(lbdetailsFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(lbdetailsFinderUtil.class, "_finder");
	}

	private static lbdetailsFinder _finder;
}