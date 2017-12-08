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

package com.chola.trainingcalendar.service.base;

import aQute.bnd.annotation.ProviderType;

import com.chola.trainingcalendar.model.trainingintendedtable;
import com.chola.trainingcalendar.service.persistence.trainingcalendarFinder;
import com.chola.trainingcalendar.service.persistence.trainingcalendarPersistence;
import com.chola.trainingcalendar.service.persistence.trainingcalendardataPersistence;
import com.chola.trainingcalendar.service.persistence.trainingcontentuniqueinformationPersistence;
import com.chola.trainingcalendar.service.persistence.trainingintendedtablePersistence;
import com.chola.trainingcalendar.service.persistence.trainingpersonalisedparameterscontentstorePersistence;
import com.chola.trainingcalendar.service.trainingintendedtableLocalService;

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
 * Provides the base implementation for the trainingintendedtable local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.chola.trainingcalendar.service.impl.trainingintendedtableLocalServiceImpl}.
 * </p>
 *
 * @author CloverLiferay01
 * @see com.chola.trainingcalendar.service.impl.trainingintendedtableLocalServiceImpl
 * @see com.chola.trainingcalendar.service.trainingintendedtableLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class trainingintendedtableLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements trainingintendedtableLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.chola.trainingcalendar.service.trainingintendedtableLocalServiceUtil} to access the trainingintendedtable local service.
	 */

	/**
	 * Adds the trainingintendedtable to the database. Also notifies the appropriate model listeners.
	 *
	 * @param trainingintendedtable the trainingintendedtable
	 * @return the trainingintendedtable that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public trainingintendedtable addtrainingintendedtable(
		trainingintendedtable trainingintendedtable) {
		trainingintendedtable.setNew(true);

		return trainingintendedtablePersistence.update(trainingintendedtable);
	}

	/**
	 * Creates a new trainingintendedtable with the primary key. Does not add the trainingintendedtable to the database.
	 *
	 * @param id the primary key for the new trainingintendedtable
	 * @return the new trainingintendedtable
	 */
	@Override
	public trainingintendedtable createtrainingintendedtable(long id) {
		return trainingintendedtablePersistence.create(id);
	}

	/**
	 * Deletes the trainingintendedtable with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the trainingintendedtable
	 * @return the trainingintendedtable that was removed
	 * @throws PortalException if a trainingintendedtable with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public trainingintendedtable deletetrainingintendedtable(long id)
		throws PortalException {
		return trainingintendedtablePersistence.remove(id);
	}

	/**
	 * Deletes the trainingintendedtable from the database. Also notifies the appropriate model listeners.
	 *
	 * @param trainingintendedtable the trainingintendedtable
	 * @return the trainingintendedtable that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public trainingintendedtable deletetrainingintendedtable(
		trainingintendedtable trainingintendedtable) {
		return trainingintendedtablePersistence.remove(trainingintendedtable);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(trainingintendedtable.class,
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
		return trainingintendedtablePersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.trainingcalendar.model.impl.trainingintendedtableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return trainingintendedtablePersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.trainingcalendar.model.impl.trainingintendedtableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return trainingintendedtablePersistence.findWithDynamicQuery(dynamicQuery,
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
		return trainingintendedtablePersistence.countWithDynamicQuery(dynamicQuery);
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
		return trainingintendedtablePersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public trainingintendedtable fetchtrainingintendedtable(long id) {
		return trainingintendedtablePersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the trainingintendedtable with the primary key.
	 *
	 * @param id the primary key of the trainingintendedtable
	 * @return the trainingintendedtable
	 * @throws PortalException if a trainingintendedtable with the primary key could not be found
	 */
	@Override
	public trainingintendedtable gettrainingintendedtable(long id)
		throws PortalException {
		return trainingintendedtablePersistence.findByPrimaryKey(id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(trainingintendedtableLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(trainingintendedtable.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(trainingintendedtableLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(trainingintendedtable.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(trainingintendedtableLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(trainingintendedtable.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return trainingintendedtableLocalService.deletetrainingintendedtable((trainingintendedtable)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return trainingintendedtablePersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the trainingintendedtables.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.trainingcalendar.model.impl.trainingintendedtableModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of trainingintendedtables
	 * @param end the upper bound of the range of trainingintendedtables (not inclusive)
	 * @return the range of trainingintendedtables
	 */
	@Override
	public List<trainingintendedtable> gettrainingintendedtables(int start,
		int end) {
		return trainingintendedtablePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of trainingintendedtables.
	 *
	 * @return the number of trainingintendedtables
	 */
	@Override
	public int gettrainingintendedtablesCount() {
		return trainingintendedtablePersistence.countAll();
	}

	/**
	 * Updates the trainingintendedtable in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param trainingintendedtable the trainingintendedtable
	 * @return the trainingintendedtable that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public trainingintendedtable updatetrainingintendedtable(
		trainingintendedtable trainingintendedtable) {
		return trainingintendedtablePersistence.update(trainingintendedtable);
	}

	/**
	 * Returns the trainingcalendar local service.
	 *
	 * @return the trainingcalendar local service
	 */
	public com.chola.trainingcalendar.service.trainingcalendarLocalService gettrainingcalendarLocalService() {
		return trainingcalendarLocalService;
	}

	/**
	 * Sets the trainingcalendar local service.
	 *
	 * @param trainingcalendarLocalService the trainingcalendar local service
	 */
	public void settrainingcalendarLocalService(
		com.chola.trainingcalendar.service.trainingcalendarLocalService trainingcalendarLocalService) {
		this.trainingcalendarLocalService = trainingcalendarLocalService;
	}

	/**
	 * Returns the trainingcalendar persistence.
	 *
	 * @return the trainingcalendar persistence
	 */
	public trainingcalendarPersistence gettrainingcalendarPersistence() {
		return trainingcalendarPersistence;
	}

	/**
	 * Sets the trainingcalendar persistence.
	 *
	 * @param trainingcalendarPersistence the trainingcalendar persistence
	 */
	public void settrainingcalendarPersistence(
		trainingcalendarPersistence trainingcalendarPersistence) {
		this.trainingcalendarPersistence = trainingcalendarPersistence;
	}

	/**
	 * Returns the trainingcalendar finder.
	 *
	 * @return the trainingcalendar finder
	 */
	public trainingcalendarFinder gettrainingcalendarFinder() {
		return trainingcalendarFinder;
	}

	/**
	 * Sets the trainingcalendar finder.
	 *
	 * @param trainingcalendarFinder the trainingcalendar finder
	 */
	public void settrainingcalendarFinder(
		trainingcalendarFinder trainingcalendarFinder) {
		this.trainingcalendarFinder = trainingcalendarFinder;
	}

	/**
	 * Returns the trainingcalendardata local service.
	 *
	 * @return the trainingcalendardata local service
	 */
	public com.chola.trainingcalendar.service.trainingcalendardataLocalService gettrainingcalendardataLocalService() {
		return trainingcalendardataLocalService;
	}

	/**
	 * Sets the trainingcalendardata local service.
	 *
	 * @param trainingcalendardataLocalService the trainingcalendardata local service
	 */
	public void settrainingcalendardataLocalService(
		com.chola.trainingcalendar.service.trainingcalendardataLocalService trainingcalendardataLocalService) {
		this.trainingcalendardataLocalService = trainingcalendardataLocalService;
	}

	/**
	 * Returns the trainingcalendardata persistence.
	 *
	 * @return the trainingcalendardata persistence
	 */
	public trainingcalendardataPersistence gettrainingcalendardataPersistence() {
		return trainingcalendardataPersistence;
	}

	/**
	 * Sets the trainingcalendardata persistence.
	 *
	 * @param trainingcalendardataPersistence the trainingcalendardata persistence
	 */
	public void settrainingcalendardataPersistence(
		trainingcalendardataPersistence trainingcalendardataPersistence) {
		this.trainingcalendardataPersistence = trainingcalendardataPersistence;
	}

	/**
	 * Returns the trainingcontentuniqueinformation local service.
	 *
	 * @return the trainingcontentuniqueinformation local service
	 */
	public com.chola.trainingcalendar.service.trainingcontentuniqueinformationLocalService gettrainingcontentuniqueinformationLocalService() {
		return trainingcontentuniqueinformationLocalService;
	}

	/**
	 * Sets the trainingcontentuniqueinformation local service.
	 *
	 * @param trainingcontentuniqueinformationLocalService the trainingcontentuniqueinformation local service
	 */
	public void settrainingcontentuniqueinformationLocalService(
		com.chola.trainingcalendar.service.trainingcontentuniqueinformationLocalService trainingcontentuniqueinformationLocalService) {
		this.trainingcontentuniqueinformationLocalService = trainingcontentuniqueinformationLocalService;
	}

	/**
	 * Returns the trainingcontentuniqueinformation persistence.
	 *
	 * @return the trainingcontentuniqueinformation persistence
	 */
	public trainingcontentuniqueinformationPersistence gettrainingcontentuniqueinformationPersistence() {
		return trainingcontentuniqueinformationPersistence;
	}

	/**
	 * Sets the trainingcontentuniqueinformation persistence.
	 *
	 * @param trainingcontentuniqueinformationPersistence the trainingcontentuniqueinformation persistence
	 */
	public void settrainingcontentuniqueinformationPersistence(
		trainingcontentuniqueinformationPersistence trainingcontentuniqueinformationPersistence) {
		this.trainingcontentuniqueinformationPersistence = trainingcontentuniqueinformationPersistence;
	}

	/**
	 * Returns the trainingintendedtable local service.
	 *
	 * @return the trainingintendedtable local service
	 */
	public trainingintendedtableLocalService gettrainingintendedtableLocalService() {
		return trainingintendedtableLocalService;
	}

	/**
	 * Sets the trainingintendedtable local service.
	 *
	 * @param trainingintendedtableLocalService the trainingintendedtable local service
	 */
	public void settrainingintendedtableLocalService(
		trainingintendedtableLocalService trainingintendedtableLocalService) {
		this.trainingintendedtableLocalService = trainingintendedtableLocalService;
	}

	/**
	 * Returns the trainingintendedtable persistence.
	 *
	 * @return the trainingintendedtable persistence
	 */
	public trainingintendedtablePersistence gettrainingintendedtablePersistence() {
		return trainingintendedtablePersistence;
	}

	/**
	 * Sets the trainingintendedtable persistence.
	 *
	 * @param trainingintendedtablePersistence the trainingintendedtable persistence
	 */
	public void settrainingintendedtablePersistence(
		trainingintendedtablePersistence trainingintendedtablePersistence) {
		this.trainingintendedtablePersistence = trainingintendedtablePersistence;
	}

	/**
	 * Returns the trainingpersonalisedparameterscontentstore local service.
	 *
	 * @return the trainingpersonalisedparameterscontentstore local service
	 */
	public com.chola.trainingcalendar.service.trainingpersonalisedparameterscontentstoreLocalService gettrainingpersonalisedparameterscontentstoreLocalService() {
		return trainingpersonalisedparameterscontentstoreLocalService;
	}

	/**
	 * Sets the trainingpersonalisedparameterscontentstore local service.
	 *
	 * @param trainingpersonalisedparameterscontentstoreLocalService the trainingpersonalisedparameterscontentstore local service
	 */
	public void settrainingpersonalisedparameterscontentstoreLocalService(
		com.chola.trainingcalendar.service.trainingpersonalisedparameterscontentstoreLocalService trainingpersonalisedparameterscontentstoreLocalService) {
		this.trainingpersonalisedparameterscontentstoreLocalService = trainingpersonalisedparameterscontentstoreLocalService;
	}

	/**
	 * Returns the trainingpersonalisedparameterscontentstore persistence.
	 *
	 * @return the trainingpersonalisedparameterscontentstore persistence
	 */
	public trainingpersonalisedparameterscontentstorePersistence gettrainingpersonalisedparameterscontentstorePersistence() {
		return trainingpersonalisedparameterscontentstorePersistence;
	}

	/**
	 * Sets the trainingpersonalisedparameterscontentstore persistence.
	 *
	 * @param trainingpersonalisedparameterscontentstorePersistence the trainingpersonalisedparameterscontentstore persistence
	 */
	public void settrainingpersonalisedparameterscontentstorePersistence(
		trainingpersonalisedparameterscontentstorePersistence trainingpersonalisedparameterscontentstorePersistence) {
		this.trainingpersonalisedparameterscontentstorePersistence = trainingpersonalisedparameterscontentstorePersistence;
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

		PersistedModelLocalServiceRegistryUtil.register("com.chola.trainingcalendar.model.trainingintendedtable",
			trainingintendedtableLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.chola.trainingcalendar.model.trainingintendedtable");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return trainingintendedtableLocalService.class.getName();
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
		return trainingintendedtable.class;
	}

	protected String getModelClassName() {
		return trainingintendedtable.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = trainingintendedtablePersistence.getDataSource();

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

	@BeanReference(type = com.chola.trainingcalendar.service.trainingcalendarLocalService.class)
	protected com.chola.trainingcalendar.service.trainingcalendarLocalService trainingcalendarLocalService;
	@BeanReference(type = trainingcalendarPersistence.class)
	protected trainingcalendarPersistence trainingcalendarPersistence;
	@BeanReference(type = trainingcalendarFinder.class)
	protected trainingcalendarFinder trainingcalendarFinder;
	@BeanReference(type = com.chola.trainingcalendar.service.trainingcalendardataLocalService.class)
	protected com.chola.trainingcalendar.service.trainingcalendardataLocalService trainingcalendardataLocalService;
	@BeanReference(type = trainingcalendardataPersistence.class)
	protected trainingcalendardataPersistence trainingcalendardataPersistence;
	@BeanReference(type = com.chola.trainingcalendar.service.trainingcontentuniqueinformationLocalService.class)
	protected com.chola.trainingcalendar.service.trainingcontentuniqueinformationLocalService trainingcontentuniqueinformationLocalService;
	@BeanReference(type = trainingcontentuniqueinformationPersistence.class)
	protected trainingcontentuniqueinformationPersistence trainingcontentuniqueinformationPersistence;
	@BeanReference(type = trainingintendedtableLocalService.class)
	protected trainingintendedtableLocalService trainingintendedtableLocalService;
	@BeanReference(type = trainingintendedtablePersistence.class)
	protected trainingintendedtablePersistence trainingintendedtablePersistence;
	@BeanReference(type = com.chola.trainingcalendar.service.trainingpersonalisedparameterscontentstoreLocalService.class)
	protected com.chola.trainingcalendar.service.trainingpersonalisedparameterscontentstoreLocalService trainingpersonalisedparameterscontentstoreLocalService;
	@BeanReference(type = trainingpersonalisedparameterscontentstorePersistence.class)
	protected trainingpersonalisedparameterscontentstorePersistence trainingpersonalisedparameterscontentstorePersistence;
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
	private trainingintendedtableLocalServiceClpInvoker _clpInvoker = new trainingintendedtableLocalServiceClpInvoker();
}