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

package com.chola.notificationcategorization.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.List;

import com.chola.notificationcategorization.service.base.NoticationCategoryCountLocalServiceBaseImpl;
import com.chola.notificationcategorization.service.persistence.NoticationCategoryCountFinderUtil;

/**
 * The implementation of the notication category count local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.chola.notificationcategorization.service.NoticationCategoryCountLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author cloverliferay03
 * @see NoticationCategoryCountLocalServiceBaseImpl
 * @see com.chola.notificationcategorization.service.NoticationCategoryCountLocalServiceUtil
 */
@ProviderType
public class NoticationCategoryCountLocalServiceImpl extends NoticationCategoryCountLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.chola.notificationcategorization.service.
	 * NoticationCategoryCountLocalServiceUtil} to access the notication
	 * category count local service.
	 */
	public List<Object[]> getNotficationCategoryCount(long userid) {
		System.out.println("USER NOTIFICATION COUNT....LIST");
		return NoticationCategoryCountFinderUtil.getNotficationCategoryCount(userid);
	}

	public List<Object[]> getNotficationCategoryList(long userid, String sysval) {
		System.out.println("USER NOTIFICATION....LIST123123123213213");
		return NoticationCategoryCountFinderUtil.getNotficationCategoryList(userid, sysval);
	}

	public boolean updatenotificationstatus(int status, long userId, long eventId,long contentId,long tableUserId) {
		return NoticationCategoryCountFinderUtil.updatenotificationstatus(status, userId, eventId,contentId,tableUserId);
	}
	
	//Code by Mohit on 14th May 2017
	
	public List<Object[]> getContentBasedOnNotificationTypeAll(long notificationType,String gender,String businessName,String age) {
			return NoticationCategoryCountFinderUtil.getContentBasedOnNotificationTypeAll(notificationType, gender, businessName, age);
	}
	
	public List<Object[]> getContentBasedOnNotificationTypeUserId(long notificationType,String businessName,String userId) {
		return NoticationCategoryCountFinderUtil.getContentBasedOnNotificationTypeUserId(notificationType, businessName, userId);
	}
	
	public List<Object[]> getContentBasedOnNotificationTypeUnit(long notificationType,String gender,String businessName,String unit,String age) {
		return NoticationCategoryCountFinderUtil.getContentBasedOnNotificationTypeUnit(notificationType, gender, businessName, unit, age);
	}
	public List<Object[]> getContentBasedOnNotificationTypeFunction(long notificationType,String gender,String businessName,String function,String age) {
		return NoticationCategoryCountFinderUtil.getContentBasedOnNotificationTypeFunction(notificationType, gender, businessName, function, age);
	}
	
	public List<Object[]> getContentBasedOnNotificationTypeDepartment(long notificationType,String gender,String businessName,String department,String age) {
		return NoticationCategoryCountFinderUtil.getContentBasedOnNotificationTypeDepartment(notificationType, gender, businessName, department, age);
	}
	public List<Object[]> getContentBasedOnNotificationTypeDesignation(long notificationType,String gender,String businessName,String designation,String age) {
		return NoticationCategoryCountFinderUtil.getContentBasedOnNotificationTypeDesignation(notificationType, gender, businessName, designation, age);
	}
	public List<Object[]> getContentBasedOnNotificationTypeProduct(long notificationType,String gender,String businessName,String product,String age) {
		return NoticationCategoryCountFinderUtil.getContentBasedOnNotificationTypeProduct(notificationType, gender, businessName, product, age);
	}
	public List<Object[]> getContentBasedOnNotificationTypeZone(long notificationType,String gender,String businessName,String zone,String age) {
		return NoticationCategoryCountFinderUtil.getContentBasedOnNotificationTypeZone(notificationType, gender, businessName, zone, age);
	}
	public List<Object[]> getContentBasedOnNotificationTypeGrade(long notificationType,String gender,String businessName,String grade,String age) {
		return NoticationCategoryCountFinderUtil.getContentBasedOnNotificationTypeGrade(notificationType, gender, businessName, grade, age);
	}
	public List<Object[]> getContentBasedOnNotificationTypeRegion(long notificationType,String gender,String businessName,String region,String age) {
		return NoticationCategoryCountFinderUtil.getContentBasedOnNotificationTypeRegion(notificationType, gender, businessName, region, age);
	}
	public List<Object[]> getContentBasedOnNotificationTypeBranch(long notificationType,String gender,String businessName,String branch,String age) {
		return NoticationCategoryCountFinderUtil.getContentBasedOnNotificationTypeBranch(notificationType, gender, businessName, branch, age);
	}
	public List<Object[]> getContentBasedOnNotificationTypeLocation(long notificationType,String gender,String businessName,String location,String age) {
		return NoticationCategoryCountFinderUtil.getContentBasedOnNotificationTypeLocation(notificationType, gender, businessName, location, age);
	}
	
	
	public boolean insertIntoCholaUsernotification(long userId,long contentId,int readflag){
		return NoticationCategoryCountFinderUtil.insertIntoCholaUsernotification(userId, contentId, readflag);
	}
	

}