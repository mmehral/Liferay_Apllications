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

package com.chola.listbranch.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author adms.java1
 * @generated
 */
@ProviderType
public class cityFinderUtil {
	public static java.util.List<java.lang.String> getCity() {
		return getFinder().getCity();
	}

	public static java.util.List<java.lang.String> getCities(long stateId) {
		return getFinder().getCities(stateId);
	}

	public static java.util.List<java.lang.String> getProducts() {
		return getFinder().getProducts();
	}

	public static java.util.List<java.lang.String> getState() {
		return getFinder().getState();
	}

	public static java.util.List getBranchNamedetails(long cityId) {
		return getFinder().getBranchNamedetails(cityId);
	}

	public static java.lang.String getstateName(long stateId) {
		return getFinder().getstateName(stateId);
	}

	public static java.lang.String getcityName(long cityId) {
		return getFinder().getcityName(cityId);
	}

	public static java.lang.String getproductName(long productId) {
		return getFinder().getproductName(productId);
	}

	public static java.lang.String getbranchName(long branchId) {
		return getFinder().getbranchName(branchId);
	}

	public static cityFinder getFinder() {
		if (_finder == null) {
			_finder = (cityFinder)PortletBeanLocatorUtil.locate(com.chola.listbranch.service.ClpSerializer.getServletContextName(),
					cityFinder.class.getName());

			ReferenceRegistry.registerReference(cityFinderUtil.class, "_finder");
		}

		return _finder;
	}

	public void setFinder(cityFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(cityFinderUtil.class, "_finder");
	}

	private static cityFinder _finder;
}