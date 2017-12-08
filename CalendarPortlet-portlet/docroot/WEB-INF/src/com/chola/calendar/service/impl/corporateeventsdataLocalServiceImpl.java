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

package com.chola.calendar.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.List;

import com.chola.calendar.service.base.corporateeventsdataLocalServiceBaseImpl;
import com.chola.calendar.service.persistence.corporateeventsdataFinderUtil;

/**
 * The implementation of the corporateeventsdata local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.chola.calendar.service.corporateeventsdataLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adms.java1
 * @see corporateeventsdataLocalServiceBaseImpl
 * @see com.chola.calendar.service.corporateeventsdataLocalServiceUtil
 */
@ProviderType
public class corporateeventsdataLocalServiceImpl
	extends corporateeventsdataLocalServiceBaseImpl {
	
	public boolean deletCorporateEvents(){
		return corporateeventsdataFinderUtil.deleteCorporateEvents();
	}
	
	public String getBusinessNames(String businessID){
		return corporateeventsdataFinderUtil.getBusinessNames(businessID);
	}
	
	public  boolean insertIntoCorporatePPContentStore(String businessId, String[] values, String gender, String age,
			String option, long uniqueContentId, String lessthan_age, String greaterthan_age,
			String between_from_to_age, long notification_type) {
		return corporateeventsdataFinderUtil.insertIntoCorporatePPContentStore(businessId, values, gender, age, option, uniqueContentId, lessthan_age, greaterthan_age, between_from_to_age, notification_type);
	}
	
	public List<Object[]> getCorporateEventsList(){
		return corporateeventsdataFinderUtil.getCorporateEventsList();
	}
	
	public Object[] getIntendedUserCorporateEventRecordList(long id){
		return corporateeventsdataFinderUtil.getIntendedUserCorporateEventRecordList(id);
	}
	
	//Code by Mohit on 17th June 2017
	
			public List<Object[]> getContentBasedOnNotificationTypeAll(long notificationType,String gender,String businessName,String age) {
					return corporateeventsdataFinderUtil.getContentBasedOnNotificationTypeAll(notificationType, gender, businessName, age);
			}
			
			public List<Object[]> getContentBasedOnNotificationTypeUserId(long notificationType,String businessName,String userId) {
				return corporateeventsdataFinderUtil.getContentBasedOnNotificationTypeUserId(notificationType, businessName, userId);
			}
			
			public List<Object[]> getContentBasedOnNotificationTypeUnit(long notificationType,String gender,String businessName,String unit,String age) {
				return corporateeventsdataFinderUtil.getContentBasedOnNotificationTypeUnit(notificationType, gender, businessName, unit, age);
			}
			public List<Object[]> getContentBasedOnNotificationTypeFunction(long notificationType,String gender,String businessName,String function,String age) {
				return corporateeventsdataFinderUtil.getContentBasedOnNotificationTypeFunction(notificationType, gender, businessName, function, age);
			}
			
			public List<Object[]> getContentBasedOnNotificationTypeDepartment(long notificationType,String gender,String businessName,String department,String age) {
				return corporateeventsdataFinderUtil.getContentBasedOnNotificationTypeDepartment(notificationType, gender, businessName, department, age);
			}
			public List<Object[]> getContentBasedOnNotificationTypeDesignation(long notificationType,String gender,String businessName,String designation,String age) {
				return corporateeventsdataFinderUtil.getContentBasedOnNotificationTypeDesignation(notificationType, gender, businessName, designation, age);
			}
			public List<Object[]> getContentBasedOnNotificationTypeProduct(long notificationType,String gender,String businessName,String product,String age) {
				return corporateeventsdataFinderUtil.getContentBasedOnNotificationTypeProduct(notificationType, gender, businessName, product, age);
			}
			public List<Object[]> getContentBasedOnNotificationTypeZone(long notificationType,String gender,String businessName,String zone,String age) {
				return corporateeventsdataFinderUtil.getContentBasedOnNotificationTypeZone(notificationType, gender, businessName, zone, age);
			}
			public List<Object[]> getContentBasedOnNotificationTypeGrade(long notificationType,String gender,String businessName,String grade,String age) {
				return corporateeventsdataFinderUtil.getContentBasedOnNotificationTypeGrade(notificationType, gender, businessName, grade, age);
			}
			public List<Object[]> getContentBasedOnNotificationTypeRegion(long notificationType,String gender,String businessName,String region,String age) {
				return corporateeventsdataFinderUtil.getContentBasedOnNotificationTypeRegion(notificationType, gender, businessName, region, age);
			}
			public List<Object[]> getContentBasedOnNotificationTypeBranch(long notificationType,String gender,String businessName,String branch,String age) {
				return corporateeventsdataFinderUtil.getContentBasedOnNotificationTypeBranch(notificationType, gender, businessName, branch, age);
			}
			public List<Object[]> getContentBasedOnNotificationTypeLocation(long notificationType,String gender,String businessName,String location,String age) {
				return corporateeventsdataFinderUtil.getContentBasedOnNotificationTypeLocation(notificationType, gender, businessName, location, age);
			}
}