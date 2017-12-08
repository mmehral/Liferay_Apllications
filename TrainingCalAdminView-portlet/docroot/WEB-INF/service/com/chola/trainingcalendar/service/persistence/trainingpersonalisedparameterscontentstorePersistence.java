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

package com.chola.trainingcalendar.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.trainingcalendar.exception.NoSuchtrainingpersonalisedparameterscontentstoreException;
import com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstore;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the trainingpersonalisedparameterscontentstore service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see com.chola.trainingcalendar.service.persistence.impl.trainingpersonalisedparameterscontentstorePersistenceImpl
 * @see trainingpersonalisedparameterscontentstoreUtil
 * @generated
 */
@ProviderType
public interface trainingpersonalisedparameterscontentstorePersistence
	extends BasePersistence<trainingpersonalisedparameterscontentstore> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link trainingpersonalisedparameterscontentstoreUtil} to access the trainingpersonalisedparameterscontentstore persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the trainingpersonalisedparameterscontentstores where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching trainingpersonalisedparameterscontentstores
	*/
	public java.util.List<trainingpersonalisedparameterscontentstore> findByCONTENTID(
		long content_id);

	/**
	* Returns a range of all the trainingpersonalisedparameterscontentstores where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingpersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of trainingpersonalisedparameterscontentstores
	* @param end the upper bound of the range of trainingpersonalisedparameterscontentstores (not inclusive)
	* @return the range of matching trainingpersonalisedparameterscontentstores
	*/
	public java.util.List<trainingpersonalisedparameterscontentstore> findByCONTENTID(
		long content_id, int start, int end);

	/**
	* Returns an ordered range of all the trainingpersonalisedparameterscontentstores where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingpersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of trainingpersonalisedparameterscontentstores
	* @param end the upper bound of the range of trainingpersonalisedparameterscontentstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching trainingpersonalisedparameterscontentstores
	*/
	public java.util.List<trainingpersonalisedparameterscontentstore> findByCONTENTID(
		long content_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<trainingpersonalisedparameterscontentstore> orderByComparator);

	/**
	* Returns an ordered range of all the trainingpersonalisedparameterscontentstores where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingpersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of trainingpersonalisedparameterscontentstores
	* @param end the upper bound of the range of trainingpersonalisedparameterscontentstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching trainingpersonalisedparameterscontentstores
	*/
	public java.util.List<trainingpersonalisedparameterscontentstore> findByCONTENTID(
		long content_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<trainingpersonalisedparameterscontentstore> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first trainingpersonalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching trainingpersonalisedparameterscontentstore
	* @throws NoSuchtrainingpersonalisedparameterscontentstoreException if a matching trainingpersonalisedparameterscontentstore could not be found
	*/
	public trainingpersonalisedparameterscontentstore findByCONTENTID_First(
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<trainingpersonalisedparameterscontentstore> orderByComparator)
		throws NoSuchtrainingpersonalisedparameterscontentstoreException;

	/**
	* Returns the first trainingpersonalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching trainingpersonalisedparameterscontentstore, or <code>null</code> if a matching trainingpersonalisedparameterscontentstore could not be found
	*/
	public trainingpersonalisedparameterscontentstore fetchByCONTENTID_First(
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<trainingpersonalisedparameterscontentstore> orderByComparator);

	/**
	* Returns the last trainingpersonalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching trainingpersonalisedparameterscontentstore
	* @throws NoSuchtrainingpersonalisedparameterscontentstoreException if a matching trainingpersonalisedparameterscontentstore could not be found
	*/
	public trainingpersonalisedparameterscontentstore findByCONTENTID_Last(
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<trainingpersonalisedparameterscontentstore> orderByComparator)
		throws NoSuchtrainingpersonalisedparameterscontentstoreException;

	/**
	* Returns the last trainingpersonalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching trainingpersonalisedparameterscontentstore, or <code>null</code> if a matching trainingpersonalisedparameterscontentstore could not be found
	*/
	public trainingpersonalisedparameterscontentstore fetchByCONTENTID_Last(
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<trainingpersonalisedparameterscontentstore> orderByComparator);

	/**
	* Returns the trainingpersonalisedparameterscontentstores before and after the current trainingpersonalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current trainingpersonalisedparameterscontentstore
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next trainingpersonalisedparameterscontentstore
	* @throws NoSuchtrainingpersonalisedparameterscontentstoreException if a trainingpersonalisedparameterscontentstore with the primary key could not be found
	*/
	public trainingpersonalisedparameterscontentstore[] findByCONTENTID_PrevAndNext(
		long id, long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<trainingpersonalisedparameterscontentstore> orderByComparator)
		throws NoSuchtrainingpersonalisedparameterscontentstoreException;

	/**
	* Removes all the trainingpersonalisedparameterscontentstores where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public void removeByCONTENTID(long content_id);

	/**
	* Returns the number of trainingpersonalisedparameterscontentstores where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching trainingpersonalisedparameterscontentstores
	*/
	public int countByCONTENTID(long content_id);

	/**
	* Caches the trainingpersonalisedparameterscontentstore in the entity cache if it is enabled.
	*
	* @param trainingpersonalisedparameterscontentstore the trainingpersonalisedparameterscontentstore
	*/
	public void cacheResult(
		trainingpersonalisedparameterscontentstore trainingpersonalisedparameterscontentstore);

	/**
	* Caches the trainingpersonalisedparameterscontentstores in the entity cache if it is enabled.
	*
	* @param trainingpersonalisedparameterscontentstores the trainingpersonalisedparameterscontentstores
	*/
	public void cacheResult(
		java.util.List<trainingpersonalisedparameterscontentstore> trainingpersonalisedparameterscontentstores);

	/**
	* Creates a new trainingpersonalisedparameterscontentstore with the primary key. Does not add the trainingpersonalisedparameterscontentstore to the database.
	*
	* @param id the primary key for the new trainingpersonalisedparameterscontentstore
	* @return the new trainingpersonalisedparameterscontentstore
	*/
	public trainingpersonalisedparameterscontentstore create(long id);

	/**
	* Removes the trainingpersonalisedparameterscontentstore with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the trainingpersonalisedparameterscontentstore
	* @return the trainingpersonalisedparameterscontentstore that was removed
	* @throws NoSuchtrainingpersonalisedparameterscontentstoreException if a trainingpersonalisedparameterscontentstore with the primary key could not be found
	*/
	public trainingpersonalisedparameterscontentstore remove(long id)
		throws NoSuchtrainingpersonalisedparameterscontentstoreException;

	public trainingpersonalisedparameterscontentstore updateImpl(
		trainingpersonalisedparameterscontentstore trainingpersonalisedparameterscontentstore);

	/**
	* Returns the trainingpersonalisedparameterscontentstore with the primary key or throws a {@link NoSuchtrainingpersonalisedparameterscontentstoreException} if it could not be found.
	*
	* @param id the primary key of the trainingpersonalisedparameterscontentstore
	* @return the trainingpersonalisedparameterscontentstore
	* @throws NoSuchtrainingpersonalisedparameterscontentstoreException if a trainingpersonalisedparameterscontentstore with the primary key could not be found
	*/
	public trainingpersonalisedparameterscontentstore findByPrimaryKey(long id)
		throws NoSuchtrainingpersonalisedparameterscontentstoreException;

	/**
	* Returns the trainingpersonalisedparameterscontentstore with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the trainingpersonalisedparameterscontentstore
	* @return the trainingpersonalisedparameterscontentstore, or <code>null</code> if a trainingpersonalisedparameterscontentstore with the primary key could not be found
	*/
	public trainingpersonalisedparameterscontentstore fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, trainingpersonalisedparameterscontentstore> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the trainingpersonalisedparameterscontentstores.
	*
	* @return the trainingpersonalisedparameterscontentstores
	*/
	public java.util.List<trainingpersonalisedparameterscontentstore> findAll();

	/**
	* Returns a range of all the trainingpersonalisedparameterscontentstores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingpersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingpersonalisedparameterscontentstores
	* @param end the upper bound of the range of trainingpersonalisedparameterscontentstores (not inclusive)
	* @return the range of trainingpersonalisedparameterscontentstores
	*/
	public java.util.List<trainingpersonalisedparameterscontentstore> findAll(
		int start, int end);

	/**
	* Returns an ordered range of all the trainingpersonalisedparameterscontentstores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingpersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingpersonalisedparameterscontentstores
	* @param end the upper bound of the range of trainingpersonalisedparameterscontentstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of trainingpersonalisedparameterscontentstores
	*/
	public java.util.List<trainingpersonalisedparameterscontentstore> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<trainingpersonalisedparameterscontentstore> orderByComparator);

	/**
	* Returns an ordered range of all the trainingpersonalisedparameterscontentstores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingpersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingpersonalisedparameterscontentstores
	* @param end the upper bound of the range of trainingpersonalisedparameterscontentstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of trainingpersonalisedparameterscontentstores
	*/
	public java.util.List<trainingpersonalisedparameterscontentstore> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<trainingpersonalisedparameterscontentstore> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the trainingpersonalisedparameterscontentstores from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of trainingpersonalisedparameterscontentstores.
	*
	* @return the number of trainingpersonalisedparameterscontentstores
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}