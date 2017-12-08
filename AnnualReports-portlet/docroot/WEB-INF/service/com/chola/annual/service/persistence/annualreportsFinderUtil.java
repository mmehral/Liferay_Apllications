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

package com.chola.annual.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author CloverLiferay02
 * @generated
 */
@ProviderType
public class annualreportsFinderUtil {
	public static java.util.List<java.lang.String> getdata() {
		return getFinder().getdata();
	}

	public static annualreportsFinder getFinder() {
		if (_finder == null) {
			_finder = (annualreportsFinder)PortletBeanLocatorUtil.locate(com.chola.annual.service.ClpSerializer.getServletContextName(),
					annualreportsFinder.class.getName());

			ReferenceRegistry.registerReference(annualreportsFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(annualreportsFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(annualreportsFinderUtil.class,
			"_finder");
	}

	private static annualreportsFinder _finder;
}