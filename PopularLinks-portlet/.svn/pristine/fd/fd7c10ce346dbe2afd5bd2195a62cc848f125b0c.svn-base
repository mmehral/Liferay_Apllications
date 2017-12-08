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

package com.chola.popularlinks.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author adms.java1
 * @generated
 */
@ProviderType
public class popularlinksFinderUtil {
	public static boolean findurl(java.lang.String url, long userid) {
		return getFinder().findurl(url, userid);
	}

	public static java.lang.Object[] fetchvalue(java.lang.String url,
		long userid) {
		return getFinder().fetchvalue(url, userid);
	}

	public static boolean findexternalurl(java.lang.String url, long userid) {
		return getFinder().findexternalurl(url, userid);
	}

	public static java.util.List<java.lang.Object[]> getinternallinks(
		long userid) {
		return getFinder().getinternallinks(userid);
	}

	public static java.util.List<java.lang.Object[]> getExternallinks(
		long userid) {
		return getFinder().getExternallinks(userid);
	}

	public static java.util.List<java.lang.Object[]> getExtLinks() {
		return getFinder().getExtLinks();
	}

	public static java.lang.String externalurl(java.lang.String url) {
		return getFinder().externalurl(url);
	}

	public static popularlinksFinder getFinder() {
		if (_finder == null) {
			_finder = (popularlinksFinder)PortletBeanLocatorUtil.locate(com.chola.popularlinks.service.ClpSerializer.getServletContextName(),
					popularlinksFinder.class.getName());

			ReferenceRegistry.registerReference(popularlinksFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(popularlinksFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(popularlinksFinderUtil.class,
			"_finder");
	}

	private static popularlinksFinder _finder;
}