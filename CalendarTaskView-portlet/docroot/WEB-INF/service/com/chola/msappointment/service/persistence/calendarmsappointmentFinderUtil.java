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

package com.chola.msappointment.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author CloverLiferay01
 * @generated
 */
@ProviderType
public class calendarmsappointmentFinderUtil {
	public static java.util.List<java.lang.String> getEmailIdsFromUserTable() {
		return getFinder().getEmailIdsFromUserTable();
	}

	public static java.lang.String getScreenNameFromTable(
		java.lang.String empId) {
		return getFinder().getScreenNameFromTable(empId);
	}

	public static calendarmsappointmentFinder getFinder() {
		if (_finder == null) {
			_finder = (calendarmsappointmentFinder)PortletBeanLocatorUtil.locate(com.chola.msappointment.service.ClpSerializer.getServletContextName(),
					calendarmsappointmentFinder.class.getName());

			ReferenceRegistry.registerReference(calendarmsappointmentFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(calendarmsappointmentFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(calendarmsappointmentFinderUtil.class,
			"_finder");
	}

	private static calendarmsappointmentFinder _finder;
}