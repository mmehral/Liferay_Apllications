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

package com.chola.notificationcategorization.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author cloverliferay03
 * @generated
 */
@ProviderType
public class NoticationCategoryCountFinderUtil {
	public static java.util.List<java.lang.Object[]> getNotficationCategoryCount(
		long userid) {
		return getFinder().getNotficationCategoryCount(userid);
	}

	public static java.util.List<java.lang.Object[]> getNotficationCategoryList(
		long userid, java.lang.String sysval) {
		return getFinder().getNotficationCategoryList(userid, sysval);
	}

	public static boolean updatenotificationstatus(int status, long userId,
		long eventId, long contentId, long tableUserId) {
		return getFinder()
				   .updatenotificationstatus(status, userId, eventId,
			contentId, tableUserId);
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

	public static boolean insertIntoCholaUsernotification(long userId,
		long contentId, int readflag) {
		return getFinder()
				   .insertIntoCholaUsernotification(userId, contentId, readflag);
	}

	public static NoticationCategoryCountFinder getFinder() {
		if (_finder == null) {
			_finder = (NoticationCategoryCountFinder)PortletBeanLocatorUtil.locate(com.chola.notificationcategorization.service.ClpSerializer.getServletContextName(),
					NoticationCategoryCountFinder.class.getName());

			ReferenceRegistry.registerReference(NoticationCategoryCountFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(NoticationCategoryCountFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(NoticationCategoryCountFinderUtil.class,
			"_finder");
	}

	private static NoticationCategoryCountFinder _finder;
}