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

package com.chola.milestone.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author CloverLiferay02
 * @generated
 */
@ProviderType
public class milestoneFinderUtil {
	public static boolean insertData(java.lang.String message,
		java.lang.String postedBy, java.lang.String empId) {
		return getFinder().insertData(message, postedBy, empId);
	}

	public static java.util.List getEmpData(java.lang.String date) {
		return getFinder().getEmpData(date);
	}

	public static java.util.List getEmpProfile(java.lang.String empId) {
		return getFinder().getEmpProfile(empId);
	}

	public static milestoneFinder getFinder() {
		if (_finder == null) {
			_finder = (milestoneFinder)PortletBeanLocatorUtil.locate(com.chola.milestone.service.ClpSerializer.getServletContextName(),
					milestoneFinder.class.getName());

			ReferenceRegistry.registerReference(milestoneFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(milestoneFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(milestoneFinderUtil.class, "_finder");
	}

	private static milestoneFinder _finder;
}