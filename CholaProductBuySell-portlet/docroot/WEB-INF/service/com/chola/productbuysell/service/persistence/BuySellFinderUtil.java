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

package com.chola.productbuysell.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author CloverLiferay03
 * @generated
 */
@ProviderType
public class BuySellFinderUtil {
	public static java.util.List<java.lang.Object[]> getLocationList() {
		return getFinder().getLocationList();
	}

	public static java.util.List<java.lang.Object[]> getProductCategoryList() {
		return getFinder().getProductCategoryList();
	}

	public static BuySellFinder getFinder() {
		if (_finder == null) {
			_finder = (BuySellFinder)PortletBeanLocatorUtil.locate(com.chola.productbuysell.service.ClpSerializer.getServletContextName(),
					BuySellFinder.class.getName());

			ReferenceRegistry.registerReference(BuySellFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(BuySellFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(BuySellFinderUtil.class, "_finder");
	}

	private static BuySellFinder _finder;
}