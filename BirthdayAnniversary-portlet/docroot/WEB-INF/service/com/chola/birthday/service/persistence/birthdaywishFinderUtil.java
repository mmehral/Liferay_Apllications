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

package com.chola.birthday.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author CloverLiferay02
 * @generated
 */
@ProviderType
public class birthdaywishFinderUtil {
	public static java.util.List getEmpInfo(java.lang.String empid) {
		return getFinder().getEmpInfo(empid);
	}

	public static boolean insertData(java.lang.String message,
		java.lang.String postedBy, java.lang.String postedOn) {
		return getFinder().insertData(message, postedBy, postedOn);
	}

	public static java.util.List getEmpData(java.lang.String date) {
		return getFinder().getEmpData(date);
	}

	public static java.util.List getWallPost(java.lang.String userId) {
		return getFinder().getWallPost(userId);
	}

	public static birthdaywishFinder getFinder() {
		if (_finder == null) {
			_finder = (birthdaywishFinder)PortletBeanLocatorUtil.locate(com.chola.birthday.service.ClpSerializer.getServletContextName(),
					birthdaywishFinder.class.getName());

			ReferenceRegistry.registerReference(birthdaywishFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(birthdaywishFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(birthdaywishFinderUtil.class,
			"_finder");
	}

	private static birthdaywishFinder _finder;
}