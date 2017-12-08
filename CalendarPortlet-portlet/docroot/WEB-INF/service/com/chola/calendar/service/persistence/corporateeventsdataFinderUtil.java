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

package com.chola.calendar.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author adms.java1
 * @generated
 */
@ProviderType
public class corporateeventsdataFinderUtil {
	public static boolean deleteCorporateEvents() {
		return getFinder().deleteCorporateEvents();
	}

	public static java.util.List<java.lang.Object[]> getCorporateEventsList() {
		return getFinder().getCorporateEventsList();
	}

	public static java.lang.String getBusinessNames(java.lang.String businessID) {
		return getFinder().getBusinessNames(businessID);
	}

	public static boolean insertIntoCorporatePPContentStore(
		java.lang.String businessId, java.lang.String[] values,
		java.lang.String gender, java.lang.String age, java.lang.String option,
		long uniqueContentId, java.lang.String lessthan_age,
		java.lang.String greaterthan_age, java.lang.String between_from_to_age,
		long notification_type) {
		return getFinder()
				   .insertIntoCorporatePPContentStore(businessId, values,
			gender, age, option, uniqueContentId, lessthan_age,
			greaterthan_age, between_from_to_age, notification_type);
	}

	public static java.lang.Object[] getIntendedUserCorporateEventRecordList(
		long id) {
		return getFinder().getIntendedUserCorporateEventRecordList(id);
	}

	public static java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeAll(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String age) {
		return getFinder()
				   .getContentBasedOnNotificationTypeAll(notificationType,
			gender, businessName, age);
	}

	public static java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeUserId(
		long notificationType, java.lang.String businessName,
		java.lang.String userId) {
		return getFinder()
				   .getContentBasedOnNotificationTypeUserId(notificationType,
			businessName, userId);
	}

	public static java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeUnit(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String unit,
		java.lang.String age) {
		return getFinder()
				   .getContentBasedOnNotificationTypeUnit(notificationType,
			gender, businessName, unit, age);
	}

	public static java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeFunction(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String function,
		java.lang.String age) {
		return getFinder()
				   .getContentBasedOnNotificationTypeFunction(notificationType,
			gender, businessName, function, age);
	}

	public static java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeDepartment(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String department,
		java.lang.String age) {
		return getFinder()
				   .getContentBasedOnNotificationTypeDepartment(notificationType,
			gender, businessName, department, age);
	}

	public static java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeDesignation(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String designation,
		java.lang.String age) {
		return getFinder()
				   .getContentBasedOnNotificationTypeDesignation(notificationType,
			gender, businessName, designation, age);
	}

	public static java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeProduct(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String product,
		java.lang.String age) {
		return getFinder()
				   .getContentBasedOnNotificationTypeProduct(notificationType,
			gender, businessName, product, age);
	}

	public static java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeZone(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String zone,
		java.lang.String age) {
		return getFinder()
				   .getContentBasedOnNotificationTypeZone(notificationType,
			gender, businessName, zone, age);
	}

	public static java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeGrade(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String grade,
		java.lang.String age) {
		return getFinder()
				   .getContentBasedOnNotificationTypeGrade(notificationType,
			gender, businessName, grade, age);
	}

	public static java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeRegion(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String region,
		java.lang.String age) {
		return getFinder()
				   .getContentBasedOnNotificationTypeRegion(notificationType,
			gender, businessName, region, age);
	}

	public static java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeBranch(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String branch,
		java.lang.String age) {
		return getFinder()
				   .getContentBasedOnNotificationTypeBranch(notificationType,
			gender, businessName, branch, age);
	}

	public static java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeLocation(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String location,
		java.lang.String age) {
		return getFinder()
				   .getContentBasedOnNotificationTypeLocation(notificationType,
			gender, businessName, location, age);
	}

	public static corporateeventsdataFinder getFinder() {
		if (_finder == null) {
			_finder = (corporateeventsdataFinder)PortletBeanLocatorUtil.locate(com.chola.calendar.service.ClpSerializer.getServletContextName(),
					corporateeventsdataFinder.class.getName());

			ReferenceRegistry.registerReference(corporateeventsdataFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(corporateeventsdataFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(corporateeventsdataFinderUtil.class,
			"_finder");
	}

	private static corporateeventsdataFinder _finder;
}