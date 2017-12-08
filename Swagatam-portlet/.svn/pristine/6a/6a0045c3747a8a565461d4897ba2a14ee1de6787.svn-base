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

package com.chola.swagatam.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.swagatam.exception.NoSuchswagatampathException;
import com.chola.swagatam.model.swagatampath;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the swagatampath service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see com.chola.swagatam.service.persistence.impl.swagatampathPersistenceImpl
 * @see swagatampathUtil
 * @generated
 */
@ProviderType
public interface swagatampathPersistence extends BasePersistence<swagatampath> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link swagatampathUtil} to access the swagatampath persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the swagatampaths where inductionid = &#63;.
	*
	* @param inductionid the inductionid
	* @return the matching swagatampaths
	*/
	public java.util.List<swagatampath> findByINDUCTIONID(
		java.lang.String inductionid);

	/**
	* Returns a range of all the swagatampaths where inductionid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatampathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inductionid the inductionid
	* @param start the lower bound of the range of swagatampaths
	* @param end the upper bound of the range of swagatampaths (not inclusive)
	* @return the range of matching swagatampaths
	*/
	public java.util.List<swagatampath> findByINDUCTIONID(
		java.lang.String inductionid, int start, int end);

	/**
	* Returns an ordered range of all the swagatampaths where inductionid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatampathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inductionid the inductionid
	* @param start the lower bound of the range of swagatampaths
	* @param end the upper bound of the range of swagatampaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching swagatampaths
	*/
	public java.util.List<swagatampath> findByINDUCTIONID(
		java.lang.String inductionid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<swagatampath> orderByComparator);

	/**
	* Returns an ordered range of all the swagatampaths where inductionid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatampathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param inductionid the inductionid
	* @param start the lower bound of the range of swagatampaths
	* @param end the upper bound of the range of swagatampaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching swagatampaths
	*/
	public java.util.List<swagatampath> findByINDUCTIONID(
		java.lang.String inductionid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<swagatampath> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first swagatampath in the ordered set where inductionid = &#63;.
	*
	* @param inductionid the inductionid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching swagatampath
	* @throws NoSuchswagatampathException if a matching swagatampath could not be found
	*/
	public swagatampath findByINDUCTIONID_First(java.lang.String inductionid,
		com.liferay.portal.kernel.util.OrderByComparator<swagatampath> orderByComparator)
		throws NoSuchswagatampathException;

	/**
	* Returns the first swagatampath in the ordered set where inductionid = &#63;.
	*
	* @param inductionid the inductionid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching swagatampath, or <code>null</code> if a matching swagatampath could not be found
	*/
	public swagatampath fetchByINDUCTIONID_First(java.lang.String inductionid,
		com.liferay.portal.kernel.util.OrderByComparator<swagatampath> orderByComparator);

	/**
	* Returns the last swagatampath in the ordered set where inductionid = &#63;.
	*
	* @param inductionid the inductionid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching swagatampath
	* @throws NoSuchswagatampathException if a matching swagatampath could not be found
	*/
	public swagatampath findByINDUCTIONID_Last(java.lang.String inductionid,
		com.liferay.portal.kernel.util.OrderByComparator<swagatampath> orderByComparator)
		throws NoSuchswagatampathException;

	/**
	* Returns the last swagatampath in the ordered set where inductionid = &#63;.
	*
	* @param inductionid the inductionid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching swagatampath, or <code>null</code> if a matching swagatampath could not be found
	*/
	public swagatampath fetchByINDUCTIONID_Last(java.lang.String inductionid,
		com.liferay.portal.kernel.util.OrderByComparator<swagatampath> orderByComparator);

	/**
	* Returns the swagatampaths before and after the current swagatampath in the ordered set where inductionid = &#63;.
	*
	* @param id the primary key of the current swagatampath
	* @param inductionid the inductionid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next swagatampath
	* @throws NoSuchswagatampathException if a swagatampath with the primary key could not be found
	*/
	public swagatampath[] findByINDUCTIONID_PrevAndNext(long id,
		java.lang.String inductionid,
		com.liferay.portal.kernel.util.OrderByComparator<swagatampath> orderByComparator)
		throws NoSuchswagatampathException;

	/**
	* Removes all the swagatampaths where inductionid = &#63; from the database.
	*
	* @param inductionid the inductionid
	*/
	public void removeByINDUCTIONID(java.lang.String inductionid);

	/**
	* Returns the number of swagatampaths where inductionid = &#63;.
	*
	* @param inductionid the inductionid
	* @return the number of matching swagatampaths
	*/
	public int countByINDUCTIONID(java.lang.String inductionid);

	/**
	* Caches the swagatampath in the entity cache if it is enabled.
	*
	* @param swagatampath the swagatampath
	*/
	public void cacheResult(swagatampath swagatampath);

	/**
	* Caches the swagatampaths in the entity cache if it is enabled.
	*
	* @param swagatampaths the swagatampaths
	*/
	public void cacheResult(java.util.List<swagatampath> swagatampaths);

	/**
	* Creates a new swagatampath with the primary key. Does not add the swagatampath to the database.
	*
	* @param id the primary key for the new swagatampath
	* @return the new swagatampath
	*/
	public swagatampath create(long id);

	/**
	* Removes the swagatampath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the swagatampath
	* @return the swagatampath that was removed
	* @throws NoSuchswagatampathException if a swagatampath with the primary key could not be found
	*/
	public swagatampath remove(long id) throws NoSuchswagatampathException;

	public swagatampath updateImpl(swagatampath swagatampath);

	/**
	* Returns the swagatampath with the primary key or throws a {@link NoSuchswagatampathException} if it could not be found.
	*
	* @param id the primary key of the swagatampath
	* @return the swagatampath
	* @throws NoSuchswagatampathException if a swagatampath with the primary key could not be found
	*/
	public swagatampath findByPrimaryKey(long id)
		throws NoSuchswagatampathException;

	/**
	* Returns the swagatampath with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the swagatampath
	* @return the swagatampath, or <code>null</code> if a swagatampath with the primary key could not be found
	*/
	public swagatampath fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, swagatampath> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the swagatampaths.
	*
	* @return the swagatampaths
	*/
	public java.util.List<swagatampath> findAll();

	/**
	* Returns a range of all the swagatampaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatampathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of swagatampaths
	* @param end the upper bound of the range of swagatampaths (not inclusive)
	* @return the range of swagatampaths
	*/
	public java.util.List<swagatampath> findAll(int start, int end);

	/**
	* Returns an ordered range of all the swagatampaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatampathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of swagatampaths
	* @param end the upper bound of the range of swagatampaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of swagatampaths
	*/
	public java.util.List<swagatampath> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<swagatampath> orderByComparator);

	/**
	* Returns an ordered range of all the swagatampaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link swagatampathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of swagatampaths
	* @param end the upper bound of the range of swagatampaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of swagatampaths
	*/
	public java.util.List<swagatampath> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<swagatampath> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the swagatampaths from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of swagatampaths.
	*
	* @return the number of swagatampaths
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}