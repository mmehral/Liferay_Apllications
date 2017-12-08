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

/**
 * @author CloverLiferay01
 * @generated
 */
@ProviderType
public interface trainingcalendarFinder {
	public boolean deletAllTrainings();

	public java.lang.String getEmpIdFromUID(java.lang.String uid);

	public java.lang.String getTrainingName(java.lang.String trainingId);

	public java.lang.String getBusinessNames(java.lang.String businessID);

	public boolean insertIntoTrainingPPContentStore(
		java.lang.String businessId, java.lang.String[] values,
		java.lang.String gender, java.lang.String age, java.lang.String option,
		long uniqueContentId, java.lang.String lessthan_age,
		java.lang.String greaterthan_age, java.lang.String between_from_to_age,
		long notification_type);

	public java.util.List<java.lang.Object[]> getUsers();

	public java.util.List<java.lang.String> getCompany();

	public java.util.List<java.lang.String> getUnit(java.lang.String businessId);

	public java.util.List<java.lang.String> getFunction(
		java.lang.String businessId);

	public java.util.List<java.lang.String> getDepart(
		java.lang.String businessId);

	public java.util.List<java.lang.String> getDesignation(
		java.lang.String businessId);

	public java.util.List<java.lang.String> getProduct(
		java.lang.String businessId);

	public java.util.List<java.lang.String> getZone(java.lang.String businessId);

	public java.util.List<java.lang.String> getBranch(
		java.lang.String businessId);

	public java.util.List<java.lang.String> getGrade(
		java.lang.String businessId);

	public java.util.List<java.lang.String> getRegion(
		java.lang.String businessId);

	public java.util.List<java.lang.String> getLocation(
		java.lang.String businessId);

	public java.util.List<java.lang.Object[]> getTrainingList();

	public java.util.List<java.lang.String> getIntendedUser(
		java.lang.String businessId, java.lang.String[] values,
		java.lang.String gender, java.lang.String age, java.lang.String option);

	public java.util.List<java.lang.Object[]> getIntendedUserList(
		java.lang.String location, java.lang.String companyName);

	public boolean insertExtraNotifyStts(int syscode, int val,
		java.lang.String sysname, int stts, int sttsflag, long usernotifyId);

	public java.util.List<java.lang.Object[]> getIntendedUserTrainingList(
		java.lang.String screenName);

	public java.lang.Object[] getIntendedUserTrainingRecordList(long id);

	public java.util.List<java.lang.String> getAllUser(
		java.lang.String businessId, java.lang.String gender,
		java.lang.String age, java.lang.String option);

	public boolean getExistingintendedUserTrainingList(long trainingId,
		java.lang.String userId, java.lang.String screenName);

	public boolean addAcceptRejectResponse(int trainingId,
		java.lang.String screenName, long contentId, int statusFlag);

	public boolean updateFlag(int trainingId, java.lang.String screenName,
		int statusFlag);

	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeAll(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String age);

	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeUserId(
		long notificationType, java.lang.String businessName,
		java.lang.String userId);

	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeUnit(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String unit,
		java.lang.String age);

	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeFunction(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String function,
		java.lang.String age);

	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeDepartment(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String department,
		java.lang.String age);

	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeDesignation(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String designation,
		java.lang.String age);

	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeProduct(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String product,
		java.lang.String age);

	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeZone(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String zone,
		java.lang.String age);

	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeGrade(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String grade,
		java.lang.String age);

	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeRegion(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String region,
		java.lang.String age);

	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeBranch(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String branch,
		java.lang.String age);

	public java.util.List<java.lang.Object[]> getContentBasedOnNotificationTypeLocation(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String location,
		java.lang.String age);

	public java.util.List<java.lang.Object[]> gettrainingresponses();
}