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

package com.contest.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * @author CloverLiferay01
 * @generated
 */
@ProviderType
public class CholaContestFinderUtil {
	public static java.util.List<java.lang.Object[]> syscodeCustomMsg(
		int syscode) {
		return getFinder().syscodeCustomMsg(syscode);
	}

	public static java.util.List<java.lang.Object[]> ContestList() {
		return getFinder().ContestList();
	}

	public static java.lang.Integer getContestType(java.lang.String id) {
		return getFinder().getContestType(id);
	}

	public static boolean insertNotifyStts(int syscode, int val,
		java.lang.String sysname, int stts, int sttsflag, long usernotifyId) {
		return getFinder()
				   .insertNotifyStts(syscode, val, sysname, stts, sttsflag,
			usernotifyId);
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

	public static CholaContestFinder getFinder() {
		if (_finder == null) {
			_finder = (CholaContestFinder)PortletBeanLocatorUtil.locate(com.contest.service.ClpSerializer.getServletContextName(),
					CholaContestFinder.class.getName());

			ReferenceRegistry.registerReference(CholaContestFinderUtil.class,
				"_finder");
		}

		return _finder;
	}

	public void setFinder(CholaContestFinder finder) {
		_finder = finder;

		ReferenceRegistry.registerReference(CholaContestFinderUtil.class,
			"_finder");
	}

	private static CholaContestFinder _finder;
}