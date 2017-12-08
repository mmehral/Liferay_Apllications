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

package com.chola.trainingcalendar.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author CloverLiferay01
 * @generated
 */
@ProviderType
public class trainingcalendarFinderUtil {
	public static boolean deletAllTrainings() {
		return getFinder().deletAllTrainings();
	}

	public static java.lang.String getEmpIdFromUID(java.lang.String uid) {
		return getFinder().getEmpIdFromUID(uid);
	}

	public static java.lang.String getTrainingName(java.lang.String trainingId) {
		return getFinder().getTrainingName(trainingId);
	}

	public static java.lang.String getBusinessNames(java.lang.String businessID) {
		return getFinder().getBusinessNames(businessID);
	}

	public static boolean insertIntoTrainingPPContentStore(
		java.lang.String businessId, java.lang.String[] values,
		java.lang.String gender, java.lang.String age, java.lang.String option,
		long uniqueContentId, java.lang.String lessthan_age,
		java.lang.String greaterthan_age, java.lang.String between_from_to_age,
		long notification_type) {
		return getFinder()
				   .insertIntoTrainingPPContentStore(businessId, values,
			gender, age, option, uniqueContentId, lessthan_age,
			greaterthan_age, between_from_to_age, notification_type);
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

	public static java.util.List<java.lang.Object[]> getTrainingList() {
		return getFinder().getTrainingList();
	}

	public static java.util.List<java.lang.String> getIntendedUser(
		java.lang.String businessId, java.lang.String[] values,
		java.lang.String gender, java.lang.String age, java.lang.String option) {
		return getFinder()
				   .getIntendedUser(businessId, values, gender, age, option);
	}

	public static java.util.List<java.lang.Object[]> getIntendedUserList(
		java.lang.String location, java.lang.String companyName) {
		return getFinder().getIntendedUserList(location, companyName);
	}

	public static boolean insertExtraNotifyStts(int syscode, int val,
		java.lang.String sysname, int stts, int sttsflag, long usernotifyId) {
		return getFinder()
				   .insertExtraNotifyStts(syscode, val, sysname, stts,
			sttsflag, usernotifyId);
	}

	public static java.util.List<java.lang.Object[]> getIntendedUserTrainingList(
		java.lang.String screenName) {
		return getFinder().getIntendedUserTrainingList(screenName);
	}

	public static java.lang.Object[] getIntendedUserTrainingRecordList(long id) {
		return getFinder().getIntendedUserTrainingRecordList(id);
	}

	public static java.util.List<java.lang.String> getAllUser(
		java.lang.String businessId, java.lang.String gender,
		java.lang.String age, java.lang.String option) {
		return getFinder().getAllUser(businessId, gender, age, option);
	}

	public static boolean getExistingintendedUserTrainingList(long trainingId,
		java.lang.String userId, java.lang.String screenName) {
		return getFinder()
				   .getExistingintendedUserTrainingList(trainingId, userId,
			screenName);
	}

	public static boolean addAcceptRejectResponse(int trainingId,
		java.lang.String screenName, long contentId, int statusFlag) {
		return getFinder()
				   .addAcceptRejectResponse(trainingId, screenName, contentId,
			statusFlag);
	}

	public static boolean updateFlag(int trainingId,
		java.lang.String screenName, int statusFlag) {
		return getFinder().updateFlag(trainingId, screenName, statusFlag);
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

	public static java.util.List<java.lang.Object[]> gettrainingresponses() {
		return getFinder().gettrainingresponses();
	}

	public static trainingcalendarFinder getFinder() {
		if (_finder == null) {
			_finder = (trainingcalendarFinder)PortletBeanLocatorUtil.locate(com.chola.trainingcalendar.service.ClpSerializer.getServletContextName(),
					trainingcalendarFinder.class.getName());

			ReferenceRegistry.registerReference(trainingcalendarFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(trainingcalendarFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(trainingcalendarFinderUtil.class,
			"_finder");
	}

	private static trainingcalendarFinder _finder;
}