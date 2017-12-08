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

package com.chola.business.service;

import aQute.bnd.annotation.ProviderType;

import com.chola.business.model.businesssopDetails;

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
 * Provides the local service interface for businesssopDetails. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author adms.java1
 * @see businesssopDetailsLocalServiceUtil
 * @see com.chola.business.service.base.businesssopDetailsLocalServiceBaseImpl
 * @see com.chola.business.service.impl.businesssopDetailsLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface businesssopDetailsLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link businesssopDetailsLocalServiceUtil} to access the businesssop details local service. Add custom service methods to {@link com.chola.business.service.impl.businesssopDetailsLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public boolean insertNotifyStts(int syscode, int val,
		java.lang.String sysname, int stts, int sttsflag, long usernotifyId);

	/**
	* Adds the businesssop details to the database. Also notifies the appropriate model listeners.
	*
	* @param businesssopDetails the businesssop details
	* @return the businesssop details that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public businesssopDetails addbusinesssopDetails(
		businesssopDetails businesssopDetails);

	/**
	* Creates a new businesssop details with the primary key. Does not add the businesssop details to the database.
	*
	* @param id the primary key for the new businesssop details
	* @return the new businesssop details
	*/
	public businesssopDetails createbusinesssopDetails(long id);

	/**
	* Deletes the businesssop details from the database. Also notifies the appropriate model listeners.
	*
	* @param businesssopDetails the businesssop details
	* @return the businesssop details that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public businesssopDetails deletebusinesssopDetails(
		businesssopDetails businesssopDetails);

	/**
	* Deletes the businesssop details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the businesssop details
	* @return the businesssop details that was removed
	* @throws PortalException if a businesssop details with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public businesssopDetails deletebusinesssopDetails(long id)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public businesssopDetails fetchbusinesssopDetails(long id);

	/**
	* Returns the businesssop details with the primary key.
	*
	* @param id the primary key of the businesssop details
	* @return the businesssop details
	* @throws PortalException if a businesssop details with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public businesssopDetails getbusinesssopDetails(long id)
		throws PortalException;

	/**
	* Updates the businesssop details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param businesssopDetails the businesssop details
	* @return the businesssop details that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public businesssopDetails updatebusinesssopDetails(
		businesssopDetails businesssopDetails);

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
	* Returns the number of businesssop detailses.
	*
	* @return the number of businesssop detailses
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getbusinesssopDetailsesCount();

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.business.model.impl.businesssopDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.business.model.impl.businesssopDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public List<java.lang.String> getAllUser(java.lang.String businessId,
		java.lang.String gender, java.lang.String age, java.lang.String option);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.String> getBranch(java.lang.String businessId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.String> getCompany();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.String> getDepart(java.lang.String businessId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.String> getDesignation(java.lang.String businessId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.String> getFunction(java.lang.String businessId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.String> getGrade(java.lang.String businessId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.String> getIntendedUser(java.lang.String businessId,
		java.lang.String[] values, java.lang.String gender,
		java.lang.String age, java.lang.String option);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.String> getLocation(java.lang.String businessId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.String> getProduct(java.lang.String businessId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.String> getRegion(java.lang.String businessId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.String> getUnit(java.lang.String businessId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.Object[]> getUsers();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<java.lang.String> getZone(java.lang.String businessId);

	/**
	* Returns a range of all the businesssop detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.business.model.impl.businesssopDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesssop detailses
	* @param end the upper bound of the range of businesssop detailses (not inclusive)
	* @return the range of businesssop detailses
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<businesssopDetails> getbusinesssopDetailses(int start, int end);

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