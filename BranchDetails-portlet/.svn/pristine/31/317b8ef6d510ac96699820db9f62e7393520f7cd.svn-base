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

package com.branchdetails.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author adms.java1
 * @generated
 */
@ProviderType
public class productFinderUtil {
	public static java.util.List<java.lang.String> getProducts() {
		return getFinder().getProducts();
	}

	public static java.util.List<java.lang.String> getState(long product_id) {
		return getFinder().getState(product_id);
	}

	public static java.util.List<java.lang.String> getCity(long product_id,
		long state_id) {
		return getFinder().getCity(product_id, state_id);
	}

	public static java.util.List<java.lang.String> getBranch(long product_id,
		long state_id, long city_id) {
		return getFinder().getBranch(product_id, state_id, city_id);
	}

	public static productFinder getFinder() {
		if (_finder == null) {
			_finder = (productFinder)PortletBeanLocatorUtil.locate(com.branchdetails.service.ClpSerializer.getServletContextName(),
					productFinder.class.getName());

			ReferenceRegistry.registerReference(productFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(productFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(productFinderUtil.class, "_finder");
	}

	private static productFinder _finder;
}