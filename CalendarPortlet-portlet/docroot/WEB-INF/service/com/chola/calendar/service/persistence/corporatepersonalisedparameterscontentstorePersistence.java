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

import com.chola.calendar.exception.NoSuchcorporatepersonalisedparameterscontentstoreException;
import com.chola.calendar.model.corporatepersonalisedparameterscontentstore;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the corporatepersonalisedparameterscontentstore service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see com.chola.calendar.service.persistence.impl.corporatepersonalisedparameterscontentstorePersistenceImpl
 * @see corporatepersonalisedparameterscontentstoreUtil
 * @generated
 */
@ProviderType
public interface corporatepersonalisedparameterscontentstorePersistence
	extends BasePersistence<corporatepersonalisedparameterscontentstore> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link corporatepersonalisedparameterscontentstoreUtil} to access the corporatepersonalisedparameterscontentstore persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the corporatepersonalisedparameterscontentstores where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching corporatepersonalisedparameterscontentstores
	*/
	public java.util.List<corporatepersonalisedparameterscontentstore> findByCONTENTID(
		long content_id);

	/**
	* Returns a range of all the corporatepersonalisedparameterscontentstores where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatepersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of corporatepersonalisedparameterscontentstores
	* @param end the upper bound of the range of corporatepersonalisedparameterscontentstores (not inclusive)
	* @return the range of matching corporatepersonalisedparameterscontentstores
	*/
	public java.util.List<corporatepersonalisedparameterscontentstore> findByCONTENTID(
		long content_id, int start, int end);

	/**
	* Returns an ordered range of all the corporatepersonalisedparameterscontentstores where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatepersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of corporatepersonalisedparameterscontentstores
	* @param end the upper bound of the range of corporatepersonalisedparameterscontentstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching corporatepersonalisedparameterscontentstores
	*/
	public java.util.List<corporatepersonalisedparameterscontentstore> findByCONTENTID(
		long content_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator);

	/**
	* Returns an ordered range of all the corporatepersonalisedparameterscontentstores where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatepersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of corporatepersonalisedparameterscontentstores
	* @param end the upper bound of the range of corporatepersonalisedparameterscontentstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching corporatepersonalisedparameterscontentstores
	*/
	public java.util.List<corporatepersonalisedparameterscontentstore> findByCONTENTID(
		long content_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first corporatepersonalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporatepersonalisedparameterscontentstore
	* @throws NoSuchcorporatepersonalisedparameterscontentstoreException if a matching corporatepersonalisedparameterscontentstore could not be found
	*/
	public corporatepersonalisedparameterscontentstore findByCONTENTID_First(
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator)
		throws NoSuchcorporatepersonalisedparameterscontentstoreException;

	/**
	* Returns the first corporatepersonalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporatepersonalisedparameterscontentstore, or <code>null</code> if a matching corporatepersonalisedparameterscontentstore could not be found
	*/
	public corporatepersonalisedparameterscontentstore fetchByCONTENTID_First(
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator);

	/**
	* Returns the last corporatepersonalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporatepersonalisedparameterscontentstore
	* @throws NoSuchcorporatepersonalisedparameterscontentstoreException if a matching corporatepersonalisedparameterscontentstore could not be found
	*/
	public corporatepersonalisedparameterscontentstore findByCONTENTID_Last(
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator)
		throws NoSuchcorporatepersonalisedparameterscontentstoreException;

	/**
	* Returns the last corporatepersonalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporatepersonalisedparameterscontentstore, or <code>null</code> if a matching corporatepersonalisedparameterscontentstore could not be found
	*/
	public corporatepersonalisedparameterscontentstore fetchByCONTENTID_Last(
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator);

	/**
	* Returns the corporatepersonalisedparameterscontentstores before and after the current corporatepersonalisedparameterscontentstore in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current corporatepersonalisedparameterscontentstore
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next corporatepersonalisedparameterscontentstore
	* @throws NoSuchcorporatepersonalisedparameterscontentstoreException if a corporatepersonalisedparameterscontentstore with the primary key could not be found
	*/
	public corporatepersonalisedparameterscontentstore[] findByCONTENTID_PrevAndNext(
		long id, long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator)
		throws NoSuchcorporatepersonalisedparameterscontentstoreException;

	/**
	* Removes all the corporatepersonalisedparameterscontentstores where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public void removeByCONTENTID(long content_id);

	/**
	* Returns the number of corporatepersonalisedparameterscontentstores where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching corporatepersonalisedparameterscontentstores
	*/
	public int countByCONTENTID(long content_id);

	/**
	* Caches the corporatepersonalisedparameterscontentstore in the entity cache if it is enabled.
	*
	* @param corporatepersonalisedparameterscontentstore the corporatepersonalisedparameterscontentstore
	*/
	public void cacheResult(
		corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore);

	/**
	* Caches the corporatepersonalisedparameterscontentstores in the entity cache if it is enabled.
	*
	* @param corporatepersonalisedparameterscontentstores the corporatepersonalisedparameterscontentstores
	*/
	public void cacheResult(
		java.util.List<corporatepersonalisedparameterscontentstore> corporatepersonalisedparameterscontentstores);

	/**
	* Creates a new corporatepersonalisedparameterscontentstore with the primary key. Does not add the corporatepersonalisedparameterscontentstore to the database.
	*
	* @param id the primary key for the new corporatepersonalisedparameterscontentstore
	* @return the new corporatepersonalisedparameterscontentstore
	*/
	public corporatepersonalisedparameterscontentstore create(long id);

	/**
	* Removes the corporatepersonalisedparameterscontentstore with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the corporatepersonalisedparameterscontentstore
	* @return the corporatepersonalisedparameterscontentstore that was removed
	* @throws NoSuchcorporatepersonalisedparameterscontentstoreException if a corporatepersonalisedparameterscontentstore with the primary key could not be found
	*/
	public corporatepersonalisedparameterscontentstore remove(long id)
		throws NoSuchcorporatepersonalisedparameterscontentstoreException;

	public corporatepersonalisedparameterscontentstore updateImpl(
		corporatepersonalisedparameterscontentstore corporatepersonalisedparameterscontentstore);

	/**
	* Returns the corporatepersonalisedparameterscontentstore with the primary key or throws a {@link NoSuchcorporatepersonalisedparameterscontentstoreException} if it could not be found.
	*
	* @param id the primary key of the corporatepersonalisedparameterscontentstore
	* @return the corporatepersonalisedparameterscontentstore
	* @throws NoSuchcorporatepersonalisedparameterscontentstoreException if a corporatepersonalisedparameterscontentstore with the primary key could not be found
	*/
	public corporatepersonalisedparameterscontentstore findByPrimaryKey(long id)
		throws NoSuchcorporatepersonalisedparameterscontentstoreException;

	/**
	* Returns the corporatepersonalisedparameterscontentstore with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the corporatepersonalisedparameterscontentstore
	* @return the corporatepersonalisedparameterscontentstore, or <code>null</code> if a corporatepersonalisedparameterscontentstore with the primary key could not be found
	*/
	public corporatepersonalisedparameterscontentstore fetchByPrimaryKey(
		long id);

	@Override
	public java.util.Map<java.io.Serializable, corporatepersonalisedparameterscontentstore> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the corporatepersonalisedparameterscontentstores.
	*
	* @return the corporatepersonalisedparameterscontentstores
	*/
	public java.util.List<corporatepersonalisedparameterscontentstore> findAll();

	/**
	* Returns a range of all the corporatepersonalisedparameterscontentstores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatepersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporatepersonalisedparameterscontentstores
	* @param end the upper bound of the range of corporatepersonalisedparameterscontentstores (not inclusive)
	* @return the range of corporatepersonalisedparameterscontentstores
	*/
	public java.util.List<corporatepersonalisedparameterscontentstore> findAll(
		int start, int end);

	/**
	* Returns an ordered range of all the corporatepersonalisedparameterscontentstores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatepersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporatepersonalisedparameterscontentstores
	* @param end the upper bound of the range of corporatepersonalisedparameterscontentstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of corporatepersonalisedparameterscontentstores
	*/
	public java.util.List<corporatepersonalisedparameterscontentstore> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator);

	/**
	* Returns an ordered range of all the corporatepersonalisedparameterscontentstores.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatepersonalisedparameterscontentstoreModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporatepersonalisedparameterscontentstores
	* @param end the upper bound of the range of corporatepersonalisedparameterscontentstores (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of corporatepersonalisedparameterscontentstores
	*/
	public java.util.List<corporatepersonalisedparameterscontentstore> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<corporatepersonalisedparameterscontentstore> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the corporatepersonalisedparameterscontentstores from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of corporatepersonalisedparameterscontentstores.
	*
	* @return the number of corporatepersonalisedparameterscontentstores
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}