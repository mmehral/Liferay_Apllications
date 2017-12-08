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

package com.chola.swagatam.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author CloverLiferay02
 * @generated
 */
@ProviderType
public class swagatamdataFinderUtil {
	public static java.util.List<com.chola.swagatam.model.swagatamdata> getEmpData(
		java.lang.String empId) {
		return getFinder().getEmpData(empId);
	}

	public static swagatamdataFinder getFinder() {
		if (_finder == null) {
			_finder = (swagatamdataFinder)PortletBeanLocatorUtil.locate(com.chola.swagatam.service.ClpSerializer.getServletContextName(),
					swagatamdataFinder.class.getName());

			ReferenceRegistry.registerReference(swagatamdataFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(swagatamdataFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(swagatamdataFinderUtil.class,
			"_finder");
	}

	private static swagatamdataFinder _finder;
}