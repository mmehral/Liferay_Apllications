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

package com.chola.appcorner.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author CloverLiferay02
 * @generated
 */
@ProviderType
public class postFinderUtil {
	public static boolean insertNotificationData(int syscode, int val,
		java.lang.String sysname, int status, int sttsflag, long usernotifyId) {
		return getFinder()
				   .insertNotificationData(syscode, val, sysname, status,
			sttsflag, usernotifyId);
	}

	public static java.util.List<java.lang.Object[]> SyscodeCustomMsg(
		int syscode) {
		return getFinder().SyscodeCustomMsg(syscode);
	}

	public static postFinder getFinder() {
		if (_finder == null) {
			_finder = (postFinder)PortletBeanLocatorUtil.locate(com.chola.appcorner.service.ClpSerializer.getServletContextName(),
					postFinder.class.getName());

			ReferenceRegistry.registerReference(postFinderUtil.class, "_finder");
		}

		return _finder;
	}

	public void setFinder(postFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(postFinderUtil.class, "_finder");
	}

	private static postFinder _finder;
}