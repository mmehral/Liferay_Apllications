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

package com.chola.ppcontent.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author cloverliferay01
 * @generated
 */
@ProviderType
public class contentupdateFinderUtil {
	public static boolean insertIntoContentUniqueInfo(
		java.lang.Object[] contentDetails) {
		return getFinder().insertIntoContentUniqueInfo(contentDetails);
	}

	public static boolean insertIntoPPContentStore(
		java.lang.String businessId, java.lang.String[] values,
		java.lang.String gender, java.lang.String age, java.lang.String option,
		long uniqueContentId, java.lang.String lessthan_age,
		java.lang.String greaterthan_age, java.lang.String between_from_to_age,
		long notification_type) {
		return getFinder()
				   .insertIntoPPContentStore(businessId, values, gender, age,
			option, uniqueContentId, lessthan_age, greaterthan_age,
			between_from_to_age, notification_type);
	}

	public static java.util.List<java.lang.Object[]> getUsers() {
		return getFinder().getUsers();
	}

	public static java.util.List<java.lang.String> getCompany() {
		return getFinder().getCompany();
	}

	public static java.util.List<java.lang.String> getUnit(
		java.lang.String businessId) {
		return getFinder().getUnit(businessId);
	}

	public static java.util.List<java.lang.String> getFunction(
		java.lang.String businessId) {
		return getFinder().getFunction(businessId);
	}

	public static java.util.List<java.lang.String> getDepart(
		java.lang.String businessId) {
		return getFinder().getDepart(businessId);
	}

	public static java.util.List<java.lang.String> getDesignation(
		java.lang.String businessId) {
		return getFinder().getDesignation(businessId);
	}

	public static java.util.List<java.lang.String> getProduct(
		java.lang.String businessId) {
		return getFinder().getProduct(businessId);
	}

	public static java.util.List<java.lang.String> getZone(
		java.lang.String businessId) {
		return getFinder().getZone(businessId);
	}

	public static java.util.List<java.lang.String> getBranch(
		java.lang.String businessId) {
		return getFinder().getBranch(businessId);
	}

	public static java.util.List<java.lang.String> getGrade(
		java.lang.String businessId) {
		return getFinder().getGrade(businessId);
	}

	public static java.util.List<java.lang.String> getRegion(
		java.lang.String businessId) {
		return getFinder().getRegion(businessId);
	}

	public static java.util.List<java.lang.String> getLocation(
		java.lang.String businessId) {
		return getFinder().getLocation(businessId);
	}

	public static java.lang.String getBusinessNames(java.lang.String businessID) {
		return getFinder().getBusinessNames(businessID);
	}

	public static boolean insertPersonalisedParameters(
		java.lang.String businessId, java.lang.String[] values,
		java.lang.String gender, java.lang.String age, java.lang.String option,
		long uniqueContentId, java.lang.String lessthan_age,
		java.lang.String greaterthan_age, java.lang.String between_from_to_age,
		java.lang.Object[] notificationDetails, long notification_type) {
		return getFinder()
				   .insertPersonalisedParameters(businessId, values, gender,
			age, option, uniqueContentId, lessthan_age, greaterthan_age,
			between_from_to_age, notificationDetails, notification_type);
	}

	public static java.util.List<java.lang.String> getIntendedUser(
		java.lang.String businessId, java.lang.String[] values,
		java.lang.String gender, java.lang.String age, java.lang.String option) {
		return getFinder()
				   .getIntendedUser(businessId, values, gender, age, option);
	}

	public static java.util.List<java.lang.String> getAllUser(
		java.lang.String businessId, java.lang.String gender,
		java.lang.String age, java.lang.String option) {
		return getFinder().getAllUser(businessId, gender, age, option);
	}

	public static boolean changesContentFlagForUpdateDelete(long udflag,
		java.lang.String notificationText, long contentId) {
		return getFinder()
				   .changesContentFlagForUpdateDelete(udflag, notificationText,
			contentId);
	}

	public static contentupdateFinder getFinder() {
		if (_finder == null) {
			_finder = (contentupdateFinder)PortletBeanLocatorUtil.locate(com.chola.ppcontent.service.ClpSerializer.getServletContextName(),
					contentupdateFinder.class.getName());

			ReferenceRegistry.registerReference(contentupdateFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(contentupdateFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(contentupdateFinderUtil.class,
			"_finder");
	}

	private static contentupdateFinder _finder;
}