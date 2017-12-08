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

import com.chola.calendar.exception.NoSuchEmpInfoEntityException;
import com.chola.calendar.model.EmpInfoEntity;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the emp info entity service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see com.chola.calendar.service.persistence.impl.EmpInfoEntityPersistenceImpl
 * @see EmpInfoEntityUtil
 * @generated
 */
@ProviderType
public interface EmpInfoEntityPersistence extends BasePersistence<EmpInfoEntity> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmpInfoEntityUtil} to access the emp info entity persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the emp info entities where name = &#63;.
	*
	* @param name the name
	* @return the matching emp info entities
	*/
	public java.util.List<EmpInfoEntity> findByEMP_NAME(java.lang.String name);

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
	public java.util.List<EmpInfoEntity> findByEMP_NAME(java.lang.String name,
		int start, int end);

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
	public java.util.List<EmpInfoEntity> findByEMP_NAME(java.lang.String name,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmpInfoEntity> orderByComparator);

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
	public java.util.List<EmpInfoEntity> findByEMP_NAME(java.lang.String name,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmpInfoEntity> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first emp info entity in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching emp info entity
	* @throws NoSuchEmpInfoEntityException if a matching emp info entity could not be found
	*/
	public EmpInfoEntity findByEMP_NAME_First(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<EmpInfoEntity> orderByComparator)
		throws NoSuchEmpInfoEntityException;

	/**
	* Returns the first emp info entity in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching emp info entity, or <code>null</code> if a matching emp info entity could not be found
	*/
	public EmpInfoEntity fetchByEMP_NAME_First(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<EmpInfoEntity> orderByComparator);

	/**
	* Returns the last emp info entity in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching emp info entity
	* @throws NoSuchEmpInfoEntityException if a matching emp info entity could not be found
	*/
	public EmpInfoEntity findByEMP_NAME_Last(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<EmpInfoEntity> orderByComparator)
		throws NoSuchEmpInfoEntityException;

	/**
	* Returns the last emp info entity in the ordered set where name = &#63;.
	*
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching emp info entity, or <code>null</code> if a matching emp info entity could not be found
	*/
	public EmpInfoEntity fetchByEMP_NAME_Last(java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<EmpInfoEntity> orderByComparator);

	/**
	* Returns the emp info entities before and after the current emp info entity in the ordered set where name = &#63;.
	*
	* @param id the primary key of the current emp info entity
	* @param name the name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next emp info entity
	* @throws NoSuchEmpInfoEntityException if a emp info entity with the primary key could not be found
	*/
	public EmpInfoEntity[] findByEMP_NAME_PrevAndNext(long id,
		java.lang.String name,
		com.liferay.portal.kernel.util.OrderByComparator<EmpInfoEntity> orderByComparator)
		throws NoSuchEmpInfoEntityException;

	/**
	* Removes all the emp info entities where name = &#63; from the database.
	*
	* @param name the name
	*/
	public void removeByEMP_NAME(java.lang.String name);

	/**
	* Returns the number of emp info entities where name = &#63;.
	*
	* @param name the name
	* @return the number of matching emp info entities
	*/
	public int countByEMP_NAME(java.lang.String name);

	/**
	* Caches the emp info entity in the entity cache if it is enabled.
	*
	* @param empInfoEntity the emp info entity
	*/
	public void cacheResult(EmpInfoEntity empInfoEntity);

	/**
	* Caches the emp info entities in the entity cache if it is enabled.
	*
	* @param empInfoEntities the emp info entities
	*/
	public void cacheResult(java.util.List<EmpInfoEntity> empInfoEntities);

	/**
	* Creates a new emp info entity with the primary key. Does not add the emp info entity to the database.
	*
	* @param id the primary key for the new emp info entity
	* @return the new emp info entity
	*/
	public EmpInfoEntity create(long id);

	/**
	* Removes the emp info entity with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the emp info entity
	* @return the emp info entity that was removed
	* @throws NoSuchEmpInfoEntityException if a emp info entity with the primary key could not be found
	*/
	public EmpInfoEntity remove(long id) throws NoSuchEmpInfoEntityException;

	public EmpInfoEntity updateImpl(EmpInfoEntity empInfoEntity);

	/**
	* Returns the emp info entity with the primary key or throws a {@link NoSuchEmpInfoEntityException} if it could not be found.
	*
	* @param id the primary key of the emp info entity
	* @return the emp info entity
	* @throws NoSuchEmpInfoEntityException if a emp info entity with the primary key could not be found
	*/
	public EmpInfoEntity findByPrimaryKey(long id)
		throws NoSuchEmpInfoEntityException;

	/**
	* Returns the emp info entity with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the emp info entity
	* @return the emp info entity, or <code>null</code> if a emp info entity with the primary key could not be found
	*/
	public EmpInfoEntity fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, EmpInfoEntity> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the emp info entities.
	*
	* @return the emp info entities
	*/
	public java.util.List<EmpInfoEntity> findAll();

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
	public java.util.List<EmpInfoEntity> findAll(int start, int end);

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
	public java.util.List<EmpInfoEntity> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmpInfoEntity> orderByComparator);

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
	public java.util.List<EmpInfoEntity> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmpInfoEntity> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the emp info entities from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of emp info entities.
	*
	* @return the number of emp info entities
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}