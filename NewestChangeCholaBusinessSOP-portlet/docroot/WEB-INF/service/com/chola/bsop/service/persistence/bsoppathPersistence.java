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

package com.chola.bsop.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.bsop.exception.NoSuchbsoppathException;
import com.chola.bsop.model.bsoppath;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the bsoppath service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see com.chola.bsop.service.persistence.impl.bsoppathPersistenceImpl
 * @see bsoppathUtil
 * @generated
 */
@ProviderType
public interface bsoppathPersistence extends BasePersistence<bsoppath> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link bsoppathUtil} to access the bsoppath persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the bsoppaths where bdetails_id = &#63;.
	*
	* @param bdetails_id the bdetails_id
	* @return the matching bsoppaths
	*/
	public java.util.List<bsoppath> findBySOP_ID(long bdetails_id);

	/**
	* Returns a range of all the bsoppaths where bdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bdetails_id the bdetails_id
	* @param start the lower bound of the range of bsoppaths
	* @param end the upper bound of the range of bsoppaths (not inclusive)
	* @return the range of matching bsoppaths
	*/
	public java.util.List<bsoppath> findBySOP_ID(long bdetails_id, int start,
		int end);

	/**
	* Returns an ordered range of all the bsoppaths where bdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bdetails_id the bdetails_id
	* @param start the lower bound of the range of bsoppaths
	* @param end the upper bound of the range of bsoppaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bsoppaths
	*/
	public java.util.List<bsoppath> findBySOP_ID(long bdetails_id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<bsoppath> orderByComparator);

	/**
	* Returns an ordered range of all the bsoppaths where bdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bdetails_id the bdetails_id
	* @param start the lower bound of the range of bsoppaths
	* @param end the upper bound of the range of bsoppaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bsoppaths
	*/
	public java.util.List<bsoppath> findBySOP_ID(long bdetails_id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<bsoppath> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first bsoppath in the ordered set where bdetails_id = &#63;.
	*
	* @param bdetails_id the bdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bsoppath
	* @throws NoSuchbsoppathException if a matching bsoppath could not be found
	*/
	public bsoppath findBySOP_ID_First(long bdetails_id,
		com.liferay.portal.kernel.util.OrderByComparator<bsoppath> orderByComparator)
		throws NoSuchbsoppathException;

	/**
	* Returns the first bsoppath in the ordered set where bdetails_id = &#63;.
	*
	* @param bdetails_id the bdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bsoppath, or <code>null</code> if a matching bsoppath could not be found
	*/
	public bsoppath fetchBySOP_ID_First(long bdetails_id,
		com.liferay.portal.kernel.util.OrderByComparator<bsoppath> orderByComparator);

	/**
	* Returns the last bsoppath in the ordered set where bdetails_id = &#63;.
	*
	* @param bdetails_id the bdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bsoppath
	* @throws NoSuchbsoppathException if a matching bsoppath could not be found
	*/
	public bsoppath findBySOP_ID_Last(long bdetails_id,
		com.liferay.portal.kernel.util.OrderByComparator<bsoppath> orderByComparator)
		throws NoSuchbsoppathException;

	/**
	* Returns the last bsoppath in the ordered set where bdetails_id = &#63;.
	*
	* @param bdetails_id the bdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bsoppath, or <code>null</code> if a matching bsoppath could not be found
	*/
	public bsoppath fetchBySOP_ID_Last(long bdetails_id,
		com.liferay.portal.kernel.util.OrderByComparator<bsoppath> orderByComparator);

	/**
	* Returns the bsoppaths before and after the current bsoppath in the ordered set where bdetails_id = &#63;.
	*
	* @param id the primary key of the current bsoppath
	* @param bdetails_id the bdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bsoppath
	* @throws NoSuchbsoppathException if a bsoppath with the primary key could not be found
	*/
	public bsoppath[] findBySOP_ID_PrevAndNext(long id, long bdetails_id,
		com.liferay.portal.kernel.util.OrderByComparator<bsoppath> orderByComparator)
		throws NoSuchbsoppathException;

	/**
	* Removes all the bsoppaths where bdetails_id = &#63; from the database.
	*
	* @param bdetails_id the bdetails_id
	*/
	public void removeBySOP_ID(long bdetails_id);

	/**
	* Returns the number of bsoppaths where bdetails_id = &#63;.
	*
	* @param bdetails_id the bdetails_id
	* @return the number of matching bsoppaths
	*/
	public int countBySOP_ID(long bdetails_id);

	/**
	* Returns all the bsoppaths where bdetailscontent_id = &#63;.
	*
	* @param bdetailscontent_id the bdetailscontent_id
	* @return the matching bsoppaths
	*/
	public java.util.List<bsoppath> findByCONTENT_ID(long bdetailscontent_id);

	/**
	* Returns a range of all the bsoppaths where bdetailscontent_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bdetailscontent_id the bdetailscontent_id
	* @param start the lower bound of the range of bsoppaths
	* @param end the upper bound of the range of bsoppaths (not inclusive)
	* @return the range of matching bsoppaths
	*/
	public java.util.List<bsoppath> findByCONTENT_ID(long bdetailscontent_id,
		int start, int end);

	/**
	* Returns an ordered range of all the bsoppaths where bdetailscontent_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bdetailscontent_id the bdetailscontent_id
	* @param start the lower bound of the range of bsoppaths
	* @param end the upper bound of the range of bsoppaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bsoppaths
	*/
	public java.util.List<bsoppath> findByCONTENT_ID(long bdetailscontent_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bsoppath> orderByComparator);

	/**
	* Returns an ordered range of all the bsoppaths where bdetailscontent_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param bdetailscontent_id the bdetailscontent_id
	* @param start the lower bound of the range of bsoppaths
	* @param end the upper bound of the range of bsoppaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bsoppaths
	*/
	public java.util.List<bsoppath> findByCONTENT_ID(long bdetailscontent_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bsoppath> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first bsoppath in the ordered set where bdetailscontent_id = &#63;.
	*
	* @param bdetailscontent_id the bdetailscontent_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bsoppath
	* @throws NoSuchbsoppathException if a matching bsoppath could not be found
	*/
	public bsoppath findByCONTENT_ID_First(long bdetailscontent_id,
		com.liferay.portal.kernel.util.OrderByComparator<bsoppath> orderByComparator)
		throws NoSuchbsoppathException;

	/**
	* Returns the first bsoppath in the ordered set where bdetailscontent_id = &#63;.
	*
	* @param bdetailscontent_id the bdetailscontent_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bsoppath, or <code>null</code> if a matching bsoppath could not be found
	*/
	public bsoppath fetchByCONTENT_ID_First(long bdetailscontent_id,
		com.liferay.portal.kernel.util.OrderByComparator<bsoppath> orderByComparator);

	/**
	* Returns the last bsoppath in the ordered set where bdetailscontent_id = &#63;.
	*
	* @param bdetailscontent_id the bdetailscontent_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bsoppath
	* @throws NoSuchbsoppathException if a matching bsoppath could not be found
	*/
	public bsoppath findByCONTENT_ID_Last(long bdetailscontent_id,
		com.liferay.portal.kernel.util.OrderByComparator<bsoppath> orderByComparator)
		throws NoSuchbsoppathException;

	/**
	* Returns the last bsoppath in the ordered set where bdetailscontent_id = &#63;.
	*
	* @param bdetailscontent_id the bdetailscontent_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bsoppath, or <code>null</code> if a matching bsoppath could not be found
	*/
	public bsoppath fetchByCONTENT_ID_Last(long bdetailscontent_id,
		com.liferay.portal.kernel.util.OrderByComparator<bsoppath> orderByComparator);

	/**
	* Returns the bsoppaths before and after the current bsoppath in the ordered set where bdetailscontent_id = &#63;.
	*
	* @param id the primary key of the current bsoppath
	* @param bdetailscontent_id the bdetailscontent_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bsoppath
	* @throws NoSuchbsoppathException if a bsoppath with the primary key could not be found
	*/
	public bsoppath[] findByCONTENT_ID_PrevAndNext(long id,
		long bdetailscontent_id,
		com.liferay.portal.kernel.util.OrderByComparator<bsoppath> orderByComparator)
		throws NoSuchbsoppathException;

	/**
	* Removes all the bsoppaths where bdetailscontent_id = &#63; from the database.
	*
	* @param bdetailscontent_id the bdetailscontent_id
	*/
	public void removeByCONTENT_ID(long bdetailscontent_id);

	/**
	* Returns the number of bsoppaths where bdetailscontent_id = &#63;.
	*
	* @param bdetailscontent_id the bdetailscontent_id
	* @return the number of matching bsoppaths
	*/
	public int countByCONTENT_ID(long bdetailscontent_id);

	/**
	* Caches the bsoppath in the entity cache if it is enabled.
	*
	* @param bsoppath the bsoppath
	*/
	public void cacheResult(bsoppath bsoppath);

	/**
	* Caches the bsoppaths in the entity cache if it is enabled.
	*
	* @param bsoppaths the bsoppaths
	*/
	public void cacheResult(java.util.List<bsoppath> bsoppaths);

	/**
	* Creates a new bsoppath with the primary key. Does not add the bsoppath to the database.
	*
	* @param id the primary key for the new bsoppath
	* @return the new bsoppath
	*/
	public bsoppath create(long id);

	/**
	* Removes the bsoppath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the bsoppath
	* @return the bsoppath that was removed
	* @throws NoSuchbsoppathException if a bsoppath with the primary key could not be found
	*/
	public bsoppath remove(long id) throws NoSuchbsoppathException;

	public bsoppath updateImpl(bsoppath bsoppath);

	/**
	* Returns the bsoppath with the primary key or throws a {@link NoSuchbsoppathException} if it could not be found.
	*
	* @param id the primary key of the bsoppath
	* @return the bsoppath
	* @throws NoSuchbsoppathException if a bsoppath with the primary key could not be found
	*/
	public bsoppath findByPrimaryKey(long id) throws NoSuchbsoppathException;

	/**
	* Returns the bsoppath with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the bsoppath
	* @return the bsoppath, or <code>null</code> if a bsoppath with the primary key could not be found
	*/
	public bsoppath fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, bsoppath> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the bsoppaths.
	*
	* @return the bsoppaths
	*/
	public java.util.List<bsoppath> findAll();

	/**
	* Returns a range of all the bsoppaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bsoppaths
	* @param end the upper bound of the range of bsoppaths (not inclusive)
	* @return the range of bsoppaths
	*/
	public java.util.List<bsoppath> findAll(int start, int end);

	/**
	* Returns an ordered range of all the bsoppaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bsoppaths
	* @param end the upper bound of the range of bsoppaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of bsoppaths
	*/
	public java.util.List<bsoppath> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bsoppath> orderByComparator);

	/**
	* Returns an ordered range of all the bsoppaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsoppathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bsoppaths
	* @param end the upper bound of the range of bsoppaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of bsoppaths
	*/
	public java.util.List<bsoppath> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bsoppath> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the bsoppaths from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of bsoppaths.
	*
	* @return the number of bsoppaths
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}