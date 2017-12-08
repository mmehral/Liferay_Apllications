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

package com.chola.personalisedparameters.service.persistence;

import aQute.bnd.annotation.ProviderType;

/**
 * @author cloverliferay01
 * @generated
 */
@ProviderType
public interface bsopdetailsFinder {
	public boolean insertNotifyStts(int syscode, int val,
		java.lang.String sysname, int stts, int sttsflag, long usernotifyId);

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

	public java.lang.String getBusinessName(java.lang.String businessID);

	public boolean insertPersonalisedParameters(java.lang.String businessId,
		java.lang.String[] values, java.lang.String gender,
		java.lang.String age, java.lang.String option, long uniqueContentId,
		java.lang.String lessthan_age, java.lang.String greaterthan_age,
		java.lang.String between_from_to_age,
		java.lang.Object[] notificationDetails, long notification_type);

	public java.util.List<java.lang.String> getIntendedUser(
		java.lang.String businessId, java.lang.String[] values,
		java.lang.String gender, java.lang.String age, java.lang.String option);

	public java.util.List<java.lang.String> getAllUser(
		java.lang.String businessId, java.lang.String gender,
		java.lang.String age, java.lang.String option);
}