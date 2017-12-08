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

package com.chola.calendar.service;

import aQute.bnd.annotation.ProviderType;

import com.chola.calendar.model.corporateeventsdata;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.InvokableLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for corporateeventsdata. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author adms.java1
 * @see corporateeventsdataLocalServiceUtil
 * @see com.chola.calendar.service.base.corporateeventsdataLocalServiceBaseImpl
 * @see com.chola.calendar.service.impl.corporateeventsdataLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface corporateeventsdataLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link corporateeventsdataLocalServiceUtil} to access the corporateeventsdata local service. Add custom service methods to {@link com.chola.calendar.service.impl.corporateeventsdataLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public boolean deletCorporateEvents();

	public boolean insertIntoCorporatePPContentStore(
		java.lang.String businessId, java.lang.String[] values,
		java.lang.String gender, java.lang.String age, java.lang.String option,
		long uniqueContentId, java.lang.String lessthan_age,
		java.lang.String greaterthan_age, java.lang.String between_from_to_age,
		long notification_type);

	/**
	* Adds the corporateeventsdata to the database. Also notifies the appropriate model listeners.
	*
	* @param corporateeventsdata the corporateeventsdata
	* @return the corporateeventsdata that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public corporateeventsdata addcorporateeventsdata(
		corporateeventsdata corporateeventsdata);

	/**
	* Creates a new corporateeventsdata with the primary key. Does not add the corporateeventsdata to the database.
	*
	* @param id the primary key for the new corporateeventsdata
	* @return the new corporateeventsdata
	*/
	public corporateeventsdata createcorporateeventsdata(long id);

	/**
	* Deletes the corporateeventsdata from the database. Also notifies the appropriate model listeners.
	*
	* @param corporateeventsdata the corporateeventsdata
	* @return the corporateeventsdata that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public corporateeventsdata deletecorporateeventsdata(
		corporateeventsdata corporateeventsdata);

	/**
	* Deletes the corporateeventsdata with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the corporateeventsdata
	* @return the corporateeventsdata that was removed
	* @throws PortalException if a corporateeventsdata with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public corporateeventsdata deletecorporateeventsdata(long id)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public corporateeventsdata fetchcorporateeventsdata(long id);

	/**
	* Returns the corporateeventsdata with the primary key.
	*
	* @param id the primary key of the corporateeventsdata
	* @return the corporateeventsdata
	* @throws PortalException if a corporateeventsdata with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public corporateeventsdata getcorporateeventsdata(long id)
		throws PortalException;

	/**
	* Updates the corporateeventsdata in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param corporateeventsdata the corporateeventsdata
	* @return the corporateeventsdata that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public corporateeventsdata updatecorporateeventsdata(
		corporateeventsdata corporateeventsdata);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Returns the number of corporateeventsdatas.
	*
	* @return the number of corporateeventsdatas
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getcorporateeventsdatasCount();

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.lang.Object[] getIntendedUserCorporateEventRecordList(long id);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.lang.String getBusinessNames(java.lang.String businessID);

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.calendar.model.impl.corporateeventsdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.calendar.model.impl.corporateeventsdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.Object[]> getContentBasedOnNotificationTypeAll(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String age);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.Object[]> getContentBasedOnNotificationTypeBranch(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String branch,
		java.lang.String age);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.Object[]> getContentBasedOnNotificationTypeDepartment(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String department,
		java.lang.String age);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.Object[]> getContentBasedOnNotificationTypeDesignation(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String designation,
		java.lang.String age);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.Object[]> getContentBasedOnNotificationTypeFunction(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String function,
		java.lang.String age);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.Object[]> getContentBasedOnNotificationTypeGrade(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String grade,
		java.lang.String age);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.Object[]> getContentBasedOnNotificationTypeLocation(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String location,
		java.lang.String age);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.Object[]> getContentBasedOnNotificationTypeProduct(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String product,
		java.lang.String age);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.Object[]> getContentBasedOnNotificationTypeRegion(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String region,
		java.lang.String age);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.Object[]> getContentBasedOnNotificationTypeUnit(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String unit,
		java.lang.String age);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.Object[]> getContentBasedOnNotificationTypeUserId(
		long notificationType, java.lang.String businessName,
		java.lang.String userId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.Object[]> getContentBasedOnNotificationTypeZone(
		long notificationType, java.lang.String gender,
		java.lang.String businessName, java.lang.String zone,
		java.lang.String age);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.Object[]> getCorporateEventsList();

	/**
	* Returns a range of all the corporateeventsdatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.calendar.model.impl.corporateeventsdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporateeventsdatas
	* @param end the upper bound of the range of corporateeventsdatas (not inclusive)
	* @return the range of corporateeventsdatas
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<corporateeventsdata> getcorporateeventsdatas(int start, int end);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);
}