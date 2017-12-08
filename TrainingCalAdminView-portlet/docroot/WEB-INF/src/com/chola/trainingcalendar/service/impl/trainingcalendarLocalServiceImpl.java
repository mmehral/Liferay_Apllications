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

package com.chola.trainingcalendar.service.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.trainingcalendar.service.base.trainingcalendarLocalServiceBaseImpl;
import com.chola.trainingcalendar.service.persistence.trainingcalendarFinderUtil;

import java.util.List;


@ProviderType
public class trainingcalendarLocalServiceImpl
	extends trainingcalendarLocalServiceBaseImpl {
	
	public boolean deletAllTrainings(){
		return trainingcalendarFinderUtil.deletAllTrainings();
	}
	public List<Object[]> gettrainingresponses() {
		return trainingcalendarFinderUtil.gettrainingresponses();
	}
	public boolean addAcceptRejectResponse(int trainingId,String screenName,long contentId,int statusFlag){
		return trainingcalendarFinderUtil.addAcceptRejectResponse(trainingId, screenName, contentId, statusFlag);
	}
	
	public List<Object[]> getUsersData(){
		return trainingcalendarFinderUtil.getUsers();
	}
	
	
	public List<Object[]> getTrainingList(){
		return trainingcalendarFinderUtil.getTrainingList();
	}
	
	public List<Object[]> getIntendedUserList(String location,String companyname){
		return trainingcalendarFinderUtil.getIntendedUserList(location, companyname);
	}
	

	
	public List<Object[]> getIntendedUserTrainingList(String screenName){
		return trainingcalendarFinderUtil.getIntendedUserTrainingList(screenName);
	}
	
	public Object[] getIntendedUserTrainingRecordList(long id){
		return trainingcalendarFinderUtil.getIntendedUserTrainingRecordList(id);
	}
	
	public boolean getExistingintendedUserTrainingList(long trainingId, String userId, String screenName) {
		return trainingcalendarFinderUtil.getExistingintendedUserTrainingList(trainingId, userId, screenName);
	}
	
	public boolean updateFlag(int trainingId,String screenName,int statusFlag) {
		return trainingcalendarFinderUtil.updateFlag(trainingId, screenName,statusFlag);
	}

	public String getTrainingName(String trainingId){
		return trainingcalendarFinderUtil.getTrainingName(trainingId);
	}
	
	public String getBusinessNames(String businessID){
		return trainingcalendarFinderUtil.getBusinessNames(businessID);
	}
	
	public  boolean insertIntoTrainingPPContentStore(String businessId, String[] values, String gender, String age,
			String option, long uniqueContentId, String lessthan_age, String greaterthan_age,
			String between_from_to_age, long notification_type) {
		return trainingcalendarFinderUtil.insertIntoTrainingPPContentStore(businessId, values, gender, age, option, uniqueContentId, lessthan_age, greaterthan_age, between_from_to_age, notification_type);
	}
	
	//Code by Mohit on 14th May 2017
	
		public List<Object[]> getContentBasedOnNotificationTypeAll(long notificationType,String gender,String businessName,String age) {
				return trainingcalendarFinderUtil.getContentBasedOnNotificationTypeAll(notificationType, gender, businessName, age);
		}
		
		public List<Object[]> getContentBasedOnNotificationTypeUserId(long notificationType,String businessName,String userId) {
			return trainingcalendarFinderUtil.getContentBasedOnNotificationTypeUserId(notificationType, businessName, userId);
		}
		
		public List<Object[]> getContentBasedOnNotificationTypeUnit(long notificationType,String gender,String businessName,String unit,String age) {
			return trainingcalendarFinderUtil.getContentBasedOnNotificationTypeUnit(notificationType, gender, businessName, unit, age);
		}
		public List<Object[]> getContentBasedOnNotificationTypeFunction(long notificationType,String gender,String businessName,String function,String age) {
			return trainingcalendarFinderUtil.getContentBasedOnNotificationTypeFunction(notificationType, gender, businessName, function, age);
		}
		
		public List<Object[]> getContentBasedOnNotificationTypeDepartment(long notificationType,String gender,String businessName,String department,String age) {
			return trainingcalendarFinderUtil.getContentBasedOnNotificationTypeDepartment(notificationType, gender, businessName, department, age);
		}
		public List<Object[]> getContentBasedOnNotificationTypeDesignation(long notificationType,String gender,String businessName,String designation,String age) {
			return trainingcalendarFinderUtil.getContentBasedOnNotificationTypeDesignation(notificationType, gender, businessName, designation, age);
		}
		public List<Object[]> getContentBasedOnNotificationTypeProduct(long notificationType,String gender,String businessName,String product,String age) {
			return trainingcalendarFinderUtil.getContentBasedOnNotificationTypeProduct(notificationType, gender, businessName, product, age);
		}
		public List<Object[]> getContentBasedOnNotificationTypeZone(long notificationType,String gender,String businessName,String zone,String age) {
			return trainingcalendarFinderUtil.getContentBasedOnNotificationTypeZone(notificationType, gender, businessName, zone, age);
		}
		public List<Object[]> getContentBasedOnNotificationTypeGrade(long notificationType,String gender,String businessName,String grade,String age) {
			return trainingcalendarFinderUtil.getContentBasedOnNotificationTypeGrade(notificationType, gender, businessName, grade, age);
		}
		public List<Object[]> getContentBasedOnNotificationTypeRegion(long notificationType,String gender,String businessName,String region,String age) {
			return trainingcalendarFinderUtil.getContentBasedOnNotificationTypeRegion(notificationType, gender, businessName, region, age);
		}
		public List<Object[]> getContentBasedOnNotificationTypeBranch(long notificationType,String gender,String businessName,String branch,String age) {
			return trainingcalendarFinderUtil.getContentBasedOnNotificationTypeBranch(notificationType, gender, businessName, branch, age);
		}
		public List<Object[]> getContentBasedOnNotificationTypeLocation(long notificationType,String gender,String businessName,String location,String age) {
			return trainingcalendarFinderUtil.getContentBasedOnNotificationTypeLocation(notificationType, gender, businessName, location, age);
		}
		
		public String getEmpIdFromUID(String uid){
			return trainingcalendarFinderUtil.getEmpIdFromUID(uid);
		}
	
}