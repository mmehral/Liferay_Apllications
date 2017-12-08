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

package com.usertheme.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author CloverLiferay02
 * @generated
 */
@ProviderType
public class themecolorFinderUtil {
	public static java.util.List getEmpData(java.lang.String empid) {
		return getFinder().getEmpData(empid);
	}

	public static themecolorFinder getFinder() {
		if (_finder == null) {
			_finder = (themecolorFinder)PortletBeanLocatorUtil.locate(com.usertheme.service.ClpSerializer.getServletContextName(),
					themecolorFinder.class.getName());

			ReferenceRegistry.registerReference(themecolorFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(themecolorFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(themecolorFinderUtil.class,
			"_finder");
	}

	private static themecolorFinder _finder;
}