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

/**
 * @author adms.java1
 * @generated
 */
@ProviderType
public interface eventcalendarFinder {
	public java.util.List twoParams(java.lang.String[] gender,
		java.lang.String[] age);

	public java.util.List threeParams(java.lang.String[] first,
		java.lang.String[] second, java.lang.String[] third);

	public java.util.List<java.lang.String> getEvents(long userId);

	public java.util.List<java.lang.String> getLocation();

	public java.util.List<java.lang.String> getDept();

	public java.util.List<java.lang.String> getSubDept();

	public java.util.List<java.lang.Object[]> getUsers();

	public java.util.List<java.lang.String> getCompany();

	public java.util.List<java.lang.String> getUnit(java.lang.String businessId);

	public java.util.List<java.lang.String> getFunction(
		java.lang.String businessId);

	public java.util.List<java.lang.String> getDepart(
		java.lang.String businessId);

	public java.util.List<java.lang.String> getIntendedUser(
		java.lang.String businessId, java.lang.String[] values,
		java.lang.String gender, java.lang.String age, java.lang.String option);

	public boolean insertNotifyStts(int syscode, int val,
		java.lang.String sysname, int stts, int sttsflag, long usernotifyId);

	public java.util.List<java.lang.Object[]> SyscodeCustomMsg(int syscode);
}