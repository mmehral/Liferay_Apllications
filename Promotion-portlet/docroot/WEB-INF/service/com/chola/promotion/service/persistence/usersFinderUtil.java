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

package com.chola.promotion.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author CloverLiferay02
 * @generated
 */
@ProviderType
public class usersFinderUtil {
	public static boolean insertData(java.lang.String message,
		java.lang.String postedBy, java.lang.String postedOn) {
		return getFinder().insertData(message, postedBy, postedOn);
	}

	public static java.util.List getEmpData(java.lang.String empId) {
		return getFinder().getEmpData(empId);
	}

	public static usersFinder getFinder() {
		if (_finder == null) {
			_finder = (usersFinder)PortletBeanLocatorUtil.locate(com.chola.promotion.service.ClpSerializer.getServletContextName(),
					usersFinder.class.getName());

			ReferenceRegistry.registerReference(usersFinderUtil.class, "_finder");
		}

		return _finder;
	}

	public void setFinder(usersFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(usersFinderUtil.class, "_finder");
	}

	private static usersFinder _finder;
}