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

package com.chola.conferenceroombooking.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author adms.java1
 * @generated
 */
@ProviderType
public class locationFinderUtil {
	public static java.util.List<java.lang.String> getState() {
		return getFinder().getState();
	}

	public static java.lang.String getStatename(long stateId) {
		return getFinder().getStatename(stateId);
	}

	public static java.util.List<java.lang.String> getlocations(long stateId) {
		return getFinder().getlocations(stateId);
	}

	public static java.util.List<java.lang.String> getfloorname() {
		return getFinder().getfloorname();
	}

	public static java.lang.String getroomvalues(long roomId) {
		return getFinder().getroomvalues(roomId);
	}

	public static java.lang.String getlocationname(long locationId) {
		return getFinder().getlocationname(locationId);
	}

	public static java.lang.String getfloorname(long floorId) {
		return getFinder().getfloorname(floorId);
	}

	public static locationFinder getFinder() {
		if (_finder == null) {
			_finder = (locationFinder)PortletBeanLocatorUtil.locate(com.chola.conferenceroombooking.service.ClpSerializer.getServletContextName(),
					locationFinder.class.getName());

			ReferenceRegistry.registerReference(locationFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(locationFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(locationFinderUtil.class, "_finder");
	}

	private static locationFinder _finder;
}