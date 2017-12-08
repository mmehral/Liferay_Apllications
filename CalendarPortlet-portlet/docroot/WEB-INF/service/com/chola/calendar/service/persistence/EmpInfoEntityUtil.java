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

import com.chola.calendar.model.EmpInfoEntity;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the emp info entity service. This utility wraps {@link com.chola.calendar.service.persistence.impl.EmpInfoEntityPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see EmpInfoEntityPersistence
 * @see com.chola.calendar.service.persistence.impl.EmpInfoEntityPersistenceImpl
 * @generated
 */
@ProviderType
public class EmpInfoEntityUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(EmpInfoEntity empInfoEntity) {
		getPersistence().clearCache(empInfoEntity);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<EmpInfoEntity> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EmpInfoEntity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EmpInfoEntity> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<EmpInfoEntity> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static EmpInfoEntity update(EmpInfoEntity empInfoEntity) {
		return getPersistence().update(empInfoEntity);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static EmpInfoEntity update(EmpInfoEntity empInfoEntity,
		ServiceContext serviceContext) {
		return getPersistence().update(empInfoEntity, serviceContext);
	}

	/**
	* Returns all the emp info entities where name = &#63;.
	*
	* @param name the name
	* @return the matching emp info entities
	*/
	public static List<EmpInfoEntity> findByEMP_NAME(java.lang.String name) {
		return getPersistence().findByEMP_NAME(name);
	}

	/**
	* Returns a range of all the emp info entities where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpInfoEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of emp info entities
	* @param end the upper bound of the range of emp info entities (not inclusive)
	* @return the range of matching emp info entities
	*/
	public static List<EmpInfoEntity> findByEMP_NAME(java.lang.String name,
		int start, int end) {
		return getPersistence().findByEMP_NAME(name, start, end);
	}

	/**
	* Returns an ordered range of all the emp info entities where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpInfoEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of emp info entities
	* @param end the upper bound of the range of emp info entities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching emp info entities
	*/
	public static List<EmpInfoEntity> findByEMP_NAME(java.lang.String name,
		int start, int end, OrderByComparator<EmpInfoEntity> orderByComparator) {
		return getPersistence()
				   .findByEMP_NAME(name, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the emp info entities where name = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpInfoEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param name the name
	* @param start the lower bound of the range of emp info entities
	* @param end the upper bound of the range of emp info entities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching emp info entities
	*/
	public static List<EmpInfoEntity> findByEMP_NAME(java.lang.String name,
		int start, int end, OrderByComparator<EmpInfoEntity> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByEMP_NAME(name, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first emp info entity in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching emp info entity
	* @throws NoSuchEmpInfoEntityException if a matching emp info entity could not be found
	*/
	public static EmpInfoEntity findByEMP_NAME_First(java.lang.String name,
		OrderByComparator<EmpInfoEntity> orderByComparator)
		throws com.chola.calendar.exception.NoSuchEmpInfoEntityException {
		return getPersistence().findByEMP_NAME_First(name, orderByComparator);
	}

	/**
	* Returns the first emp info entity in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching emp info entity, or <code>null</code> if a matching emp info entity could not be found
	*/
	public static EmpInfoEntity fetchByEMP_NAME_First(java.lang.String name,
		OrderByComparator<EmpInfoEntity> orderByComparator) {
		return getPersistence().fetchByEMP_NAME_First(name, orderByComparator);
	}

	/**
	* Returns the last emp info entity in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching emp info entity
	* @throws NoSuchEmpInfoEntityException if a matching emp info entity could not be found
	*/
	public static EmpInfoEntity findByEMP_NAME_Last(java.lang.String name,
		OrderByComparator<EmpInfoEntity> orderByComparator)
		throws com.chola.calendar.exception.NoSuchEmpInfoEntityException {
		return getPersistence().findByEMP_NAME_Last(name, orderByComparator);
	}

	/**
	* Returns the last emp info entity in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching emp info entity, or <code>null</code> if a matching emp info entity could not be found
	*/
	public static EmpInfoEntity fetchByEMP_NAME_Last(java.lang.String name,
		OrderByComparator<EmpInfoEntity> orderByComparator) {
		return getPersistence().fetchByEMP_NAME_Last(name, orderByComparator);
	}

	/**
	* Returns the emp info entities before and after the current emp info entity in the ordered set where name = &#63;.
	*
	* @param id the primary key of the current emp info entity
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next emp info entity
	* @throws NoSuchEmpInfoEntityException if a emp info entity with the primary key could not be found
	*/
	public static EmpInfoEntity[] findByEMP_NAME_PrevAndNext(long id,
		java.lang.String name,
		OrderByComparator<EmpInfoEntity> orderByComparator)
		throws com.chola.calendar.exception.NoSuchEmpInfoEntityException {
		return getPersistence()
				   .findByEMP_NAME_PrevAndNext(id, name, orderByComparator);
	}

	/**
	* Removes all the emp info entities where name = &#63; from the database.
	*
	* @param name the name
	*/
	public static void removeByEMP_NAME(java.lang.String name) {
		getPersistence().removeByEMP_NAME(name);
	}

	/**
	* Returns the number of emp info entities where name = &#63;.
	*
	* @param name the name
	* @return the number of matching emp info entities
	*/
	public static int countByEMP_NAME(java.lang.String name) {
		return getPersistence().countByEMP_NAME(name);
	}

	/**
	* Caches the emp info entity in the entity cache if it is enabled.
	*
	* @param empInfoEntity the emp info entity
	*/
	public static void cacheResult(EmpInfoEntity empInfoEntity) {
		getPersistence().cacheResult(empInfoEntity);
	}

	/**
	* Caches the emp info entities in the entity cache if it is enabled.
	*
	* @param empInfoEntities the emp info entities
	*/
	public static void cacheResult(List<EmpInfoEntity> empInfoEntities) {
		getPersistence().cacheResult(empInfoEntities);
	}

	/**
	* Creates a new emp info entity with the primary key. Does not add the emp info entity to the database.
	*
	* @param id the primary key for the new emp info entity
	* @return the new emp info entity
	*/
	public static EmpInfoEntity create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the emp info entity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the emp info entity
	* @return the emp info entity that was removed
	* @throws NoSuchEmpInfoEntityException if a emp info entity with the primary key could not be found
	*/
	public static EmpInfoEntity remove(long id)
		throws com.chola.calendar.exception.NoSuchEmpInfoEntityException {
		return getPersistence().remove(id);
	}

	public static EmpInfoEntity updateImpl(EmpInfoEntity empInfoEntity) {
		return getPersistence().updateImpl(empInfoEntity);
	}

	/**
	* Returns the emp info entity with the primary key or throws a {@link NoSuchEmpInfoEntityException} if it could not be found.
	*
	* @param id the primary key of the emp info entity
	* @return the emp info entity
	* @throws NoSuchEmpInfoEntityException if a emp info entity with the primary key could not be found
	*/
	public static EmpInfoEntity findByPrimaryKey(long id)
		throws com.chola.calendar.exception.NoSuchEmpInfoEntityException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the emp info entity with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the emp info entity
	* @return the emp info entity, or <code>null</code> if a emp info entity with the primary key could not be found
	*/
	public static EmpInfoEntity fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, EmpInfoEntity> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the emp info entities.
	*
	* @return the emp info entities
	*/
	public static List<EmpInfoEntity> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the emp info entities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpInfoEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emp info entities
	* @param end the upper bound of the range of emp info entities (not inclusive)
	* @return the range of emp info entities
	*/
	public static List<EmpInfoEntity> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the emp info entities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpInfoEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emp info entities
	* @param end the upper bound of the range of emp info entities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of emp info entities
	*/
	public static List<EmpInfoEntity> findAll(int start, int end,
		OrderByComparator<EmpInfoEntity> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the emp info entities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpInfoEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emp info entities
	* @param end the upper bound of the range of emp info entities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of emp info entities
	*/
	public static List<EmpInfoEntity> findAll(int start, int end,
		OrderByComparator<EmpInfoEntity> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the emp info entities from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of emp info entities.
	*
	* @return the number of emp info entities
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static EmpInfoEntityPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (EmpInfoEntityPersistence)PortletBeanLocatorUtil.locate(com.chola.calendar.service.ClpSerializer.getServletContextName(),
					EmpInfoEntityPersistence.class.getName());

			ReferenceRegistry.registerReference(EmpInfoEntityUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static EmpInfoEntityPersistence _persistence;
}