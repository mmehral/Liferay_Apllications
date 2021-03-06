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

package com.chola.calendar.service.base;

import aQute.bnd.annotation.ProviderType;

import com.chola.calendar.model.corporatepersonalisedparameterscontentstore;
import com.chola.calendar.service.corporatepersonalisedparameterscontentstoreLocalService;
import com.chola.calendar.service.persistence.corporatecontentuniqueinformationPersistence;
import com.chola.calendar.service.persistence.corporateeventsdataFinder;
import com.chola.calendar.service.persistence.corporateeventsdataPersistence;
import com.chola.calendar.service.persistence.corporatepersonalisedparameterscontentstorePersistence;
import com.chola.calendar.service.persistence.eventcalendarFinder;
import com.chola.calendar.service.persistence.eventcalendarPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the corporatepersonalisedparameterscontentstore local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.chola.calendar.service.impl.corporatepersonalisedparameterscontentstoreLocalServiceImpl}.
 * </p>
 *
 * @author adms.java1
 * @see com.chola.calendar.service.impl.corporatepersonalisedparameterscontentstoreLocalServiceImpl
 * @see com.chola.calendar.service.corporatepersonalisedparameterscontentstoreLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class corporatepersonalisedparameterscontentstoreLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements corporatepersonalisedparameterscontentstoreLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.chola.calendar.service.corporatepersonalisedparameterscontentstoreLocalServiceUtil} to access the corporatepersonalisedparameterscontentstore local service.
	 */

	/**
	 * Adds the corporatepersonalisedparameterscontentstore to the database. Also notifies the appropriate model listeners.
	 *
	 * @param corporatepersonalisedparameterscontentstore the corporatepersonalisedparameterscontentstore
	 * @return the corporatepersonalisedparameterscontentstore that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public corporatepersonalisedparameterscontentstore addcorporatepersonalisedparameterscontentstore(
		corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore) {
		corporatepersonalisedparameterscontentstore.setNew(true);

		return corporatepersonalisedparameterscontentstorePersistence.update(corporatepersonalisedparameterscontentstore);
	}

	/**
	 * Creates a new corporatepersonalisedparameterscontentstore with the primary key. Does not add the corporatepersonalisedparameterscontentstore to the database.
	 *
	 * @param id the primary key for the new corporatepersonalisedparameterscontentstore
	 * @return the new corporatepersonalisedparameterscontentstore
	 */
	@Override
	public corporatepersonalisedparameterscontentstore createcorporatepersonalisedparameterscontentstore(
		long id) {
		return corporatepersonalisedparameterscontentstorePersistence.create(id);
	}

	/**
	 * Deletes the corporatepersonalisedparameterscontentstore with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the corporatepersonalisedparameterscontentstore
	 * @return the corporatepersonalisedparameterscontentstore that was removed
	 * @throws PortalException if a corporatepersonalisedparameterscontentstore with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public corporatepersonalisedparameterscontentstore deletecorporatepersonalisedparameterscontentstore(
		long id) throws PortalException {
		return corporatepersonalisedparameterscontentstorePersistence.remove(id);
	}

	/**
	 * Deletes the corporatepersonalisedparameterscontentstore from the database. Also notifies the appropriate model listeners.
	 *
	 * @param corporatepersonalisedparameterscontentstore the corporatepersonalisedparameterscontentstore
	 * @return the corporatepersonalisedparameterscontentstore that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public corporatepersonalisedparameterscontentstore deletecorporatepersonalisedparameterscontentstore(
		corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore) {
		return corporatepersonalisedparameterscontentstorePersistence.remove(corporatepersonalisedparameterscontentstore);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(corporatepersonalisedparameterscontentstore.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return corporatepersonalisedparameterscontentstorePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.calendar.model.impl.corporatepersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) {
		return corporatepersonalisedparameterscontentstorePersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.calendar.model.impl.corporatepersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator) {
		return corporatepersonalisedparameterscontentstorePersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return corporatepersonalisedparameterscontentstorePersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) {
		return corporatepersonalisedparameterscontentstorePersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public corporatepersonalisedparameterscontentstore fetchcorporatepersonalisedparameterscontentstore(
		long id) {
		return corporatepersonalisedparameterscontentstorePersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the corporatepersonalisedparameterscontentstore with the primary key.
	 *
	 * @param id the primary key of the corporatepersonalisedparameterscontentstore
	 * @return the corporatepersonalisedparameterscontentstore
	 * @throws PortalException if a corporatepersonalisedparameterscontentstore with the primary key could not be found
	 */
	@Override
	public corporatepersonalisedparameterscontentstore getcorporatepersonalisedparameterscontentstore(
		long id) throws PortalException {
		return corporatepersonalisedparameterscontentstorePersistence.findByPrimaryKey(id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(corporatepersonalisedparameterscontentstoreLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(corporatepersonalisedparameterscontentstore.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(corporatepersonalisedparameterscontentstoreLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(corporatepersonalisedparameterscontentstore.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(corporatepersonalisedparameterscontentstoreLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(corporatepersonalisedparameterscontentstore.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return corporatepersonalisedparameterscontentstoreLocalService.deletecorporatepersonalisedparameterscontentstore((corporatepersonalisedparameterscontentstore)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return corporatepersonalisedparameterscontentstorePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the corporatepersonalisedparameterscontentstores.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.calendar.model.impl.corporatepersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of corporatepersonalisedparameterscontentstores
	 * @param end the upper bound of the range of corporatepersonalisedparameterscontentstores (not inclusive)
	 * @return the range of corporatepersonalisedparameterscontentstores
	 */
	@Override
	public List<corporatepersonalisedparameterscontentstore> getcorporatepersonalisedparameterscontentstores(
		int start, int end) {
		return corporatepersonalisedparameterscontentstorePersistence.findAll(start,
			end);
	}

	/**
	 * Returns the number of corporatepersonalisedparameterscontentstores.
	 *
	 * @return the number of corporatepersonalisedparameterscontentstores
	 */
	@Override
	public int getcorporatepersonalisedparameterscontentstoresCount() {
		return corporatepersonalisedparameterscontentstorePersistence.countAll();
	}

	/**
	 * Updates the corporatepersonalisedparameterscontentstore in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param corporatepersonalisedparameterscontentstore the corporatepersonalisedparameterscontentstore
	 * @return the corporatepersonalisedparameterscontentstore that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public corporatepersonalisedparameterscontentstore updatecorporatepersonalisedparameterscontentstore(
		corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore) {
		return corporatepersonalisedparameterscontentstorePersistence.update(corporatepersonalisedparameterscontentstore);
	}

	/**
	 * Returns the corporatecontentuniqueinformation local service.
	 *
	 * @return the corporatecontentuniqueinformation local service
	 */
	public com.chola.calendar.service.corporatecontentuniqueinformationLocalService getcorporatecontentuniqueinformationLocalService() {
		return corporatecontentuniqueinformationLocalService;
	}

	/**
	 * Sets the corporatecontentuniqueinformation local service.
	 *
	 * @param corporatecontentuniqueinformationLocalService the corporatecontentuniqueinformation local service
	 */
	public void setcorporatecontentuniqueinformationLocalService(
		com.chola.calendar.service.corporatecontentuniqueinformationLocalService corporatecontentuniqueinformationLocalService) {
		this.corporatecontentuniqueinformationLocalService = corporatecontentuniqueinformationLocalService;
	}

	/**
	 * Returns the corporatecontentuniqueinformation persistence.
	 *
	 * @return the corporatecontentuniqueinformation persistence
	 */
	public corporatecontentuniqueinformationPersistence getcorporatecontentuniqueinformationPersistence() {
		return corporatecontentuniqueinformationPersistence;
	}

	/**
	 * Sets the corporatecontentuniqueinformation persistence.
	 *
	 * @param corporatecontentuniqueinformationPersistence the corporatecontentuniqueinformation persistence
	 */
	public void setcorporatecontentuniqueinformationPersistence(
		corporatecontentuniqueinformationPersistence corporatecontentuniqueinformationPersistence) {
		this.corporatecontentuniqueinformationPersistence = corporatecontentuniqueinformationPersistence;
	}

	/**
	 * Returns the corporateeventsdata local service.
	 *
	 * @return the corporateeventsdata local service
	 */
	public com.chola.calendar.service.corporateeventsdataLocalService getcorporateeventsdataLocalService() {
		return corporateeventsdataLocalService;
	}

	/**
	 * Sets the corporateeventsdata local service.
	 *
	 * @param corporateeventsdataLocalService the corporateeventsdata local service
	 */
	public void setcorporateeventsdataLocalService(
		com.chola.calendar.service.corporateeventsdataLocalService corporateeventsdataLocalService) {
		this.corporateeventsdataLocalService = corporateeventsdataLocalService;
	}

	/**
	 * Returns the corporateeventsdata persistence.
	 *
	 * @return the corporateeventsdata persistence
	 */
	public corporateeventsdataPersistence getcorporateeventsdataPersistence() {
		return corporateeventsdataPersistence;
	}

	/**
	 * Sets the corporateeventsdata persistence.
	 *
	 * @param corporateeventsdataPersistence the corporateeventsdata persistence
	 */
	public void setcorporateeventsdataPersistence(
		corporateeventsdataPersistence corporateeventsdataPersistence) {
		this.corporateeventsdataPersistence = corporateeventsdataPersistence;
	}

	/**
	 * Returns the corporateeventsdata finder.
	 *
	 * @return the corporateeventsdata finder
	 */
	public corporateeventsdataFinder getcorporateeventsdataFinder() {
		return corporateeventsdataFinder;
	}

	/**
	 * Sets the corporateeventsdata finder.
	 *
	 * @param corporateeventsdataFinder the corporateeventsdata finder
	 */
	public void setcorporateeventsdataFinder(
		corporateeventsdataFinder corporateeventsdataFinder) {
		this.corporateeventsdataFinder = corporateeventsdataFinder;
	}

	/**
	 * Returns the corporatepersonalisedparameterscontentstore local service.
	 *
	 * @return the corporatepersonalisedparameterscontentstore local service
	 */
	public corporatepersonalisedparameterscontentstoreLocalService getcorporatepersonalisedparameterscontentstoreLocalService() {
		return corporatepersonalisedparameterscontentstoreLocalService;
	}

	/**
	 * Sets the corporatepersonalisedparameterscontentstore local service.
	 *
	 * @param corporatepersonalisedparameterscontentstoreLocalService the corporatepersonalisedparameterscontentstore local service
	 */
	public void setcorporatepersonalisedparameterscontentstoreLocalService(
		corporatepersonalisedparameterscontentstoreLocalService corporatepersonalisedparameterscontentstoreLocalService) {
		this.corporatepersonalisedparameterscontentstoreLocalService = corporatepersonalisedparameterscontentstoreLocalService;
	}

	/**
	 * Returns the corporatepersonalisedparameterscontentstore persistence.
	 *
	 * @return the corporatepersonalisedparameterscontentstore persistence
	 */
	public corporatepersonalisedparameterscontentstorePersistence getcorporatepersonalisedparameterscontentstorePersistence() {
		return corporatepersonalisedparameterscontentstorePersistence;
	}

	/**
	 * Sets the corporatepersonalisedparameterscontentstore persistence.
	 *
	 * @param corporatepersonalisedparameterscontentstorePersistence the corporatepersonalisedparameterscontentstore persistence
	 */
	public void setcorporatepersonalisedparameterscontentstorePersistence(
		corporatepersonalisedparameterscontentstorePersistence corporatepersonalisedparameterscontentstorePersistence) {
		this.corporatepersonalisedparameterscontentstorePersistence = corporatepersonalisedparameterscontentstorePersistence;
	}

	/**
	 * Returns the eventcalendar local service.
	 *
	 * @return the eventcalendar local service
	 */
	public com.chola.calendar.service.eventcalendarLocalService geteventcalendarLocalService() {
		return eventcalendarLocalService;
	}

	/**
	 * Sets the eventcalendar local service.
	 *
	 * @param eventcalendarLocalService the eventcalendar local service
	 */
	public void seteventcalendarLocalService(
		com.chola.calendar.service.eventcalendarLocalService eventcalendarLocalService) {
		this.eventcalendarLocalService = eventcalendarLocalService;
	}

	/**
	 * Returns the eventcalendar persistence.
	 *
	 * @return the eventcalendar persistence
	 */
	public eventcalendarPersistence geteventcalendarPersistence() {
		return eventcalendarPersistence;
	}

	/**
	 * Sets the eventcalendar persistence.
	 *
	 * @param eventcalendarPersistence the eventcalendar persistence
	 */
	public void seteventcalendarPersistence(
		eventcalendarPersistence eventcalendarPersistence) {
		this.eventcalendarPersistence = eventcalendarPersistence;
	}

	/**
	 * Returns the eventcalendar finder.
	 *
	 * @return the eventcalendar finder
	 */
	public eventcalendarFinder geteventcalendarFinder() {
		return eventcalendarFinder;
	}

	/**
	 * Sets the eventcalendar finder.
	 *
	 * @param eventcalendarFinder the eventcalendar finder
	 */
	public void seteventcalendarFinder(eventcalendarFinder eventcalendarFinder) {
		this.eventcalendarFinder = eventcalendarFinder;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("com.chola.calendar.model.corporatepersonalisedparameterscontentstore",
			corporatepersonalisedparameterscontentstoreLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.chola.calendar.model.corporatepersonalisedparameterscontentstore");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return corporatepersonalisedparameterscontentstoreLocalService.class.getName();
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return corporatepersonalisedparameterscontentstore.class;
	}

	protected String getModelClassName() {
		return corporatepersonalisedparameterscontentstore.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = corporatepersonalisedparameterscontentstorePersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.chola.calendar.service.corporatecontentuniqueinformationLocalService.class)
	protected com.chola.calendar.service.corporatecontentuniqueinformationLocalService corporatecontentuniqueinformationLocalService;
	@BeanReference(type = corporatecontentuniqueinformationPersistence.class)
	protected corporatecontentuniqueinformationPersistence corporatecontentuniqueinformationPersistence;
	@BeanReference(type = com.chola.calendar.service.corporateeventsdataLocalService.class)
	protected com.chola.calendar.service.corporateeventsdataLocalService corporateeventsdataLocalService;
	@BeanReference(type = corporateeventsdataPersistence.class)
	protected corporateeventsdataPersistence corporateeventsdataPersistence;
	@BeanReference(type = corporateeventsdataFinder.class)
	protected corporateeventsdataFinder corporateeventsdataFinder;
	@BeanReference(type = corporatepersonalisedparameterscontentstoreLocalService.class)
	protected corporatepersonalisedparameterscontentstoreLocalService corporatepersonalisedparameterscontentstoreLocalService;
	@BeanReference(type = corporatepersonalisedparameterscontentstorePersistence.class)
	protected corporatepersonalisedparameterscontentstorePersistence corporatepersonalisedparameterscontentstorePersistence;
	@BeanReference(type = com.chola.calendar.service.eventcalendarLocalService.class)
	protected com.chola.calendar.service.eventcalendarLocalService eventcalendarLocalService;
	@BeanReference(type = eventcalendarPersistence.class)
	protected eventcalendarPersistence eventcalendarPersistence;
	@BeanReference(type = eventcalendarFinder.class)
	protected eventcalendarFinder eventcalendarFinder;
	@BeanReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@BeanReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@BeanReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private ClassLoader _classLoader;
	private corporatepersonalisedparameterscontentstoreLocalServiceClpInvoker _clpInvoker =
		new corporatepersonalisedparameterscontentstoreLocalServiceClpInvoker();
}