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

package com.chola.service.conference.service.base;

import aQute.bnd.annotation.ProviderType;

import com.chola.service.conference.model.floorwing;
import com.chola.service.conference.service.floorwingLocalService;
import com.chola.service.conference.service.persistence.facilitymasterPersistence;
import com.chola.service.conference.service.persistence.floorwingPersistence;
import com.chola.service.conference.service.persistence.locationFinder;
import com.chola.service.conference.service.persistence.locationPersistence;
import com.chola.service.conference.service.persistence.roomPersistence;
import com.chola.service.conference.service.persistence.statePersistence;

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
 * Provides the base implementation for the floorwing local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.chola.service.conference.service.impl.floorwingLocalServiceImpl}.
 * </p>
 *
 * @author adms.java1
 * @see com.chola.service.conference.service.impl.floorwingLocalServiceImpl
 * @see com.chola.service.conference.service.floorwingLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class floorwingLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements floorwingLocalService, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.chola.service.conference.service.floorwingLocalServiceUtil} to access the floorwing local service.
	 */

	/**
	 * Adds the floorwing to the database. Also notifies the appropriate model listeners.
	 *
	 * @param floorwing the floorwing
	 * @return the floorwing that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public floorwing addfloorwing(floorwing floorwing) {
		floorwing.setNew(true);

		return floorwingPersistence.update(floorwing);
	}

	/**
	 * Creates a new floorwing with the primary key. Does not add the floorwing to the database.
	 *
	 * @param floorwing_id the primary key for the new floorwing
	 * @return the new floorwing
	 */
	@Override
	public floorwing createfloorwing(long floorwing_id) {
		return floorwingPersistence.create(floorwing_id);
	}

	/**
	 * Deletes the floorwing with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param floorwing_id the primary key of the floorwing
	 * @return the floorwing that was removed
	 * @throws PortalException if a floorwing with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public floorwing deletefloorwing(long floorwing_id)
		throws PortalException {
		return floorwingPersistence.remove(floorwing_id);
	}

	/**
	 * Deletes the floorwing from the database. Also notifies the appropriate model listeners.
	 *
	 * @param floorwing the floorwing
	 * @return the floorwing that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public floorwing deletefloorwing(floorwing floorwing) {
		return floorwingPersistence.remove(floorwing);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(floorwing.class,
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
		return floorwingPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.service.conference.model.impl.floorwingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return floorwingPersistence.findWithDynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.service.conference.model.impl.floorwingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return floorwingPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return floorwingPersistence.countWithDynamicQuery(dynamicQuery);
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
		return floorwingPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public floorwing fetchfloorwing(long floorwing_id) {
		return floorwingPersistence.fetchByPrimaryKey(floorwing_id);
	}

	/**
	 * Returns the floorwing with the primary key.
	 *
	 * @param floorwing_id the primary key of the floorwing
	 * @return the floorwing
	 * @throws PortalException if a floorwing with the primary key could not be found
	 */
	@Override
	public floorwing getfloorwing(long floorwing_id) throws PortalException {
		return floorwingPersistence.findByPrimaryKey(floorwing_id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(floorwingLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(floorwing.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("floorwing_id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(floorwingLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(floorwing.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"floorwing_id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(floorwingLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(floorwing.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("floorwing_id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return floorwingLocalService.deletefloorwing((floorwing)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return floorwingPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the floorwings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.chola.service.conference.model.impl.floorwingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of floorwings
	 * @param end the upper bound of the range of floorwings (not inclusive)
	 * @return the range of floorwings
	 */
	@Override
	public List<floorwing> getfloorwings(int start, int end) {
		return floorwingPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of floorwings.
	 *
	 * @return the number of floorwings
	 */
	@Override
	public int getfloorwingsCount() {
		return floorwingPersistence.countAll();
	}

	/**
	 * Updates the floorwing in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param floorwing the floorwing
	 * @return the floorwing that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public floorwing updatefloorwing(floorwing floorwing) {
		return floorwingPersistence.update(floorwing);
	}

	/**
	 * Returns the facilitymaster local service.
	 *
	 * @return the facilitymaster local service
	 */
	public com.chola.service.conference.service.facilitymasterLocalService getfacilitymasterLocalService() {
		return facilitymasterLocalService;
	}

	/**
	 * Sets the facilitymaster local service.
	 *
	 * @param facilitymasterLocalService the facilitymaster local service
	 */
	public void setfacilitymasterLocalService(
		com.chola.service.conference.service.facilitymasterLocalService facilitymasterLocalService) {
		this.facilitymasterLocalService = facilitymasterLocalService;
	}

	/**
	 * Returns the facilitymaster persistence.
	 *
	 * @return the facilitymaster persistence
	 */
	public facilitymasterPersistence getfacilitymasterPersistence() {
		return facilitymasterPersistence;
	}

	/**
	 * Sets the facilitymaster persistence.
	 *
	 * @param facilitymasterPersistence the facilitymaster persistence
	 */
	public void setfacilitymasterPersistence(
		facilitymasterPersistence facilitymasterPersistence) {
		this.facilitymasterPersistence = facilitymasterPersistence;
	}

	/**
	 * Returns the floorwing local service.
	 *
	 * @return the floorwing local service
	 */
	public floorwingLocalService getfloorwingLocalService() {
		return floorwingLocalService;
	}

	/**
	 * Sets the floorwing local service.
	 *
	 * @param floorwingLocalService the floorwing local service
	 */
	public void setfloorwingLocalService(
		floorwingLocalService floorwingLocalService) {
		this.floorwingLocalService = floorwingLocalService;
	}

	/**
	 * Returns the floorwing persistence.
	 *
	 * @return the floorwing persistence
	 */
	public floorwingPersistence getfloorwingPersistence() {
		return floorwingPersistence;
	}

	/**
	 * Sets the floorwing persistence.
	 *
	 * @param floorwingPersistence the floorwing persistence
	 */
	public void setfloorwingPersistence(
		floorwingPersistence floorwingPersistence) {
		this.floorwingPersistence = floorwingPersistence;
	}

	/**
	 * Returns the location local service.
	 *
	 * @return the location local service
	 */
	public com.chola.service.conference.service.locationLocalService getlocationLocalService() {
		return locationLocalService;
	}

	/**
	 * Sets the location local service.
	 *
	 * @param locationLocalService the location local service
	 */
	public void setlocationLocalService(
		com.chola.service.conference.service.locationLocalService locationLocalService) {
		this.locationLocalService = locationLocalService;
	}

	/**
	 * Returns the location persistence.
	 *
	 * @return the location persistence
	 */
	public locationPersistence getlocationPersistence() {
		return locationPersistence;
	}

	/**
	 * Sets the location persistence.
	 *
	 * @param locationPersistence the location persistence
	 */
	public void setlocationPersistence(locationPersistence locationPersistence) {
		this.locationPersistence = locationPersistence;
	}

	/**
	 * Returns the location finder.
	 *
	 * @return the location finder
	 */
	public locationFinder getlocationFinder() {
		return locationFinder;
	}

	/**
	 * Sets the location finder.
	 *
	 * @param locationFinder the location finder
	 */
	public void setlocationFinder(locationFinder locationFinder) {
		this.locationFinder = locationFinder;
	}

	/**
	 * Returns the room local service.
	 *
	 * @return the room local service
	 */
	public com.chola.service.conference.service.roomLocalService getroomLocalService() {
		return roomLocalService;
	}

	/**
	 * Sets the room local service.
	 *
	 * @param roomLocalService the room local service
	 */
	public void setroomLocalService(
		com.chola.service.conference.service.roomLocalService roomLocalService) {
		this.roomLocalService = roomLocalService;
	}

	/**
	 * Returns the room persistence.
	 *
	 * @return the room persistence
	 */
	public roomPersistence getroomPersistence() {
		return roomPersistence;
	}

	/**
	 * Sets the room persistence.
	 *
	 * @param roomPersistence the room persistence
	 */
	public void setroomPersistence(roomPersistence roomPersistence) {
		this.roomPersistence = roomPersistence;
	}

	/**
	 * Returns the state local service.
	 *
	 * @return the state local service
	 */
	public com.chola.service.conference.service.stateLocalService getstateLocalService() {
		return stateLocalService;
	}

	/**
	 * Sets the state local service.
	 *
	 * @param stateLocalService the state local service
	 */
	public void setstateLocalService(
		com.chola.service.conference.service.stateLocalService stateLocalService) {
		this.stateLocalService = stateLocalService;
	}

	/**
	 * Returns the state persistence.
	 *
	 * @return the state persistence
	 */
	public statePersistence getstatePersistence() {
		return statePersistence;
	}

	/**
	 * Sets the state persistence.
	 *
	 * @param statePersistence the state persistence
	 */
	public void setstatePersistence(statePersistence statePersistence) {
		this.statePersistence = statePersistence;
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

		PersistedModelLocalServiceRegistryUtil.register("com.chola.service.conference.model.floorwing",
			floorwingLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.chola.service.conference.model.floorwing");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return floorwingLocalService.class.getName();
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
		return floorwing.class;
	}

	protected String getModelClassName() {
		return floorwing.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = floorwingPersistence.getDataSource();

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

	@BeanReference(type = com.chola.service.conference.service.facilitymasterLocalService.class)
	protected com.chola.service.conference.service.facilitymasterLocalService facilitymasterLocalService;
	@BeanReference(type = facilitymasterPersistence.class)
	protected facilitymasterPersistence facilitymasterPersistence;
	@BeanReference(type = floorwingLocalService.class)
	protected floorwingLocalService floorwingLocalService;
	@BeanReference(type = floorwingPersistence.class)
	protected floorwingPersistence floorwingPersistence;
	@BeanReference(type = com.chola.service.conference.service.locationLocalService.class)
	protected com.chola.service.conference.service.locationLocalService locationLocalService;
	@BeanReference(type = locationPersistence.class)
	protected locationPersistence locationPersistence;
	@BeanReference(type = locationFinder.class)
	protected locationFinder locationFinder;
	@BeanReference(type = com.chola.service.conference.service.roomLocalService.class)
	protected com.chola.service.conference.service.roomLocalService roomLocalService;
	@BeanReference(type = roomPersistence.class)
	protected roomPersistence roomPersistence;
	@BeanReference(type = com.chola.service.conference.service.stateLocalService.class)
	protected com.chola.service.conference.service.stateLocalService stateLocalService;
	@BeanReference(type = statePersistence.class)
	protected statePersistence statePersistence;
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
	private floorwingLocalServiceClpInvoker _clpInvoker = new floorwingLocalServiceClpInvoker();
}