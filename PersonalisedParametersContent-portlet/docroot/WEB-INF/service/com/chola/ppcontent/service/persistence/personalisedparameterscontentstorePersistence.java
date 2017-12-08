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

package com.chola.ppcontent.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.ppcontent.exception.NoSuchpersonalisedparameterscontentstoreException;
import com.chola.ppcontent.model.personalisedparameterscontentstore;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the personalisedparameterscontentstore service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see com.chola.ppcontent.service.persistence.impl.personalisedparameterscontentstorePersistenceImpl
 * @see personalisedparameterscontentstoreUtil
 * @generated
 */
@ProviderType
public interface personalisedparameterscontentstorePersistence
	extends BasePersistence<personalisedparameterscontentstore> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link personalisedparameterscontentstoreUtil} to access the personalisedparameterscontentstore persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the personalisedparameterscontentstores where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching personalisedparameterscontentstores
	*/
	public java.util.List<personalisedparameterscontentstore> findByCONTENTID(
		long content_id);

	/**
	* Returns a range of all the personalisedparameterscontentstores where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link personalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of personalisedparameterscontentstores
	* @param end the upper bound of the range of personalisedparameterscontentstores (not inclusive)
	* @return the range of matching personalisedparameterscontentstores
	*/
	public java.util.List<personalisedparameterscontentstore> findByCONTENTID(
		long content_id, int start, int end);

	/**
	* Returns an ordered range of all the personalisedparameterscontentstores where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link personalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of personalisedparameterscontentstores
	* @param end the upper bound of the range of personalisedparameterscontentstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching personalisedparameterscontentstores
	*/
	public java.util.List<personalisedparameterscontentstore> findByCONTENTID(
		long content_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<personalisedparameterscontentstore> orderByComparator);

	/**
	* Returns an ordered range of all the personalisedparameterscontentstores where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link personalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of personalisedparameterscontentstores
	* @param end the upper bound of the range of personalisedparameterscontentstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching personalisedparameterscontentstores
	*/
	public java.util.List<personalisedparameterscontentstore> findByCONTENTID(
		long content_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<personalisedparameterscontentstore> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first personalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching personalisedparameterscontentstore
	* @throws NoSuchpersonalisedparameterscontentstoreException if a matching personalisedparameterscontentstore could not be found
	*/
	public personalisedparameterscontentstore findByCONTENTID_First(
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<personalisedparameterscontentstore> orderByComparator)
		throws NoSuchpersonalisedparameterscontentstoreException;

	/**
	* Returns the first personalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching personalisedparameterscontentstore, or <code>null</code> if a matching personalisedparameterscontentstore could not be found
	*/
	public personalisedparameterscontentstore fetchByCONTENTID_First(
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<personalisedparameterscontentstore> orderByComparator);

	/**
	* Returns the last personalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching personalisedparameterscontentstore
	* @throws NoSuchpersonalisedparameterscontentstoreException if a matching personalisedparameterscontentstore could not be found
	*/
	public personalisedparameterscontentstore findByCONTENTID_Last(
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<personalisedparameterscontentstore> orderByComparator)
		throws NoSuchpersonalisedparameterscontentstoreException;

	/**
	* Returns the last personalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching personalisedparameterscontentstore, or <code>null</code> if a matching personalisedparameterscontentstore could not be found
	*/
	public personalisedparameterscontentstore fetchByCONTENTID_Last(
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<personalisedparameterscontentstore> orderByComparator);

	/**
	* Returns the personalisedparameterscontentstores before and after the current personalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current personalisedparameterscontentstore
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next personalisedparameterscontentstore
	* @throws NoSuchpersonalisedparameterscontentstoreException if a personalisedparameterscontentstore with the primary key could not be found
	*/
	public personalisedparameterscontentstore[] findByCONTENTID_PrevAndNext(
		long id, long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<personalisedparameterscontentstore> orderByComparator)
		throws NoSuchpersonalisedparameterscontentstoreException;

	/**
	* Removes all the personalisedparameterscontentstores where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public void removeByCONTENTID(long content_id);

	/**
	* Returns the number of personalisedparameterscontentstores where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching personalisedparameterscontentstores
	*/
	public int countByCONTENTID(long content_id);

	/**
	* Caches the personalisedparameterscontentstore in the entity cache if it is enabled.
	*
	* @param personalisedparameterscontentstore the personalisedparameterscontentstore
	*/
	public void cacheResult(
		personalisedparameterscontentstore personalisedparameterscontentstore);

	/**
	* Caches the personalisedparameterscontentstores in the entity cache if it is enabled.
	*
	* @param personalisedparameterscontentstores the personalisedparameterscontentstores
	*/
	public void cacheResult(
		java.util.List<personalisedparameterscontentstore> personalisedparameterscontentstores);

	/**
	* Creates a new personalisedparameterscontentstore with the primary key. Does not add the personalisedparameterscontentstore to the database.
	*
	* @param id the primary key for the new personalisedparameterscontentstore
	* @return the new personalisedparameterscontentstore
	*/
	public personalisedparameterscontentstore create(long id);

	/**
	* Removes the personalisedparameterscontentstore with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the personalisedparameterscontentstore
	* @return the personalisedparameterscontentstore that was removed
	* @throws NoSuchpersonalisedparameterscontentstoreException if a personalisedparameterscontentstore with the primary key could not be found
	*/
	public personalisedparameterscontentstore remove(long id)
		throws NoSuchpersonalisedparameterscontentstoreException;

	public personalisedparameterscontentstore updateImpl(
		personalisedparameterscontentstore personalisedparameterscontentstore);

	/**
	* Returns the personalisedparameterscontentstore with the primary key or throws a {@link NoSuchpersonalisedparameterscontentstoreException} if it could not be found.
	*
	* @param id the primary key of the personalisedparameterscontentstore
	* @return the personalisedparameterscontentstore
	* @throws NoSuchpersonalisedparameterscontentstoreException if a personalisedparameterscontentstore with the primary key could not be found
	*/
	public personalisedparameterscontentstore findByPrimaryKey(long id)
		throws NoSuchpersonalisedparameterscontentstoreException;

	/**
	* Returns the personalisedparameterscontentstore with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the personalisedparameterscontentstore
	* @return the personalisedparameterscontentstore, or <code>null</code> if a personalisedparameterscontentstore with the primary key could not be found
	*/
	public personalisedparameterscontentstore fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, personalisedparameterscontentstore> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the personalisedparameterscontentstores.
	*
	* @return the personalisedparameterscontentstores
	*/
	public java.util.List<personalisedparameterscontentstore> findAll();

	/**
	* Returns a range of all the personalisedparameterscontentstores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link personalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of personalisedparameterscontentstores
	* @param end the upper bound of the range of personalisedparameterscontentstores (not inclusive)
	* @return the range of personalisedparameterscontentstores
	*/
	public java.util.List<personalisedparameterscontentstore> findAll(
		int start, int end);

	/**
	* Returns an ordered range of all the personalisedparameterscontentstores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link personalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of personalisedparameterscontentstores
	* @param end the upper bound of the range of personalisedparameterscontentstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of personalisedparameterscontentstores
	*/
	public java.util.List<personalisedparameterscontentstore> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<personalisedparameterscontentstore> orderByComparator);

	/**
	* Returns an ordered range of all the personalisedparameterscontentstores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link personalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of personalisedparameterscontentstores
	* @param end the upper bound of the range of personalisedparameterscontentstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of personalisedparameterscontentstores
	*/
	public java.util.List<personalisedparameterscontentstore> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<personalisedparameterscontentstore> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the personalisedparameterscontentstores from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of personalisedparameterscontentstores.
	*
	* @return the number of personalisedparameterscontentstores
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}