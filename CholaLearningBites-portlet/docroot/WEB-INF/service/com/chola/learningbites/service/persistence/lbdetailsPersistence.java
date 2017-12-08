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

package com.chola.learningbites.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.learningbites.exception.NoSuchlbdetailsException;
import com.chola.learningbites.model.lbdetails;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the lbdetails service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see com.chola.learningbites.service.persistence.impl.lbdetailsPersistenceImpl
 * @see lbdetailsUtil
 * @generated
 */
@ProviderType
public interface lbdetailsPersistence extends BasePersistence<lbdetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link lbdetailsUtil} to access the lbdetails persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the lbdetailses where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching lbdetailses
	*/
	public java.util.List<lbdetails> findByCONTENT_ID(long content_id);

	/**
	* Returns a range of all the lbdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of lbdetailses
	* @param end the upper bound of the range of lbdetailses (not inclusive)
	* @return the range of matching lbdetailses
	*/
	public java.util.List<lbdetails> findByCONTENT_ID(long content_id,
		int start, int end);

	/**
	* Returns an ordered range of all the lbdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of lbdetailses
	* @param end the upper bound of the range of lbdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching lbdetailses
	*/
	public java.util.List<lbdetails> findByCONTENT_ID(long content_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lbdetails> orderByComparator);

	/**
	* Returns an ordered range of all the lbdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of lbdetailses
	* @param end the upper bound of the range of lbdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching lbdetailses
	*/
	public java.util.List<lbdetails> findByCONTENT_ID(long content_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lbdetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first lbdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lbdetails
	* @throws NoSuchlbdetailsException if a matching lbdetails could not be found
	*/
	public lbdetails findByCONTENT_ID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<lbdetails> orderByComparator)
		throws NoSuchlbdetailsException;

	/**
	* Returns the first lbdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching lbdetails, or <code>null</code> if a matching lbdetails could not be found
	*/
	public lbdetails fetchByCONTENT_ID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<lbdetails> orderByComparator);

	/**
	* Returns the last lbdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lbdetails
	* @throws NoSuchlbdetailsException if a matching lbdetails could not be found
	*/
	public lbdetails findByCONTENT_ID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<lbdetails> orderByComparator)
		throws NoSuchlbdetailsException;

	/**
	* Returns the last lbdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching lbdetails, or <code>null</code> if a matching lbdetails could not be found
	*/
	public lbdetails fetchByCONTENT_ID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<lbdetails> orderByComparator);

	/**
	* Returns the lbdetailses before and after the current lbdetails in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current lbdetails
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next lbdetails
	* @throws NoSuchlbdetailsException if a lbdetails with the primary key could not be found
	*/
	public lbdetails[] findByCONTENT_ID_PrevAndNext(long id, long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<lbdetails> orderByComparator)
		throws NoSuchlbdetailsException;

	/**
	* Removes all the lbdetailses where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public void removeByCONTENT_ID(long content_id);

	/**
	* Returns the number of lbdetailses where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching lbdetailses
	*/
	public int countByCONTENT_ID(long content_id);

	/**
	* Caches the lbdetails in the entity cache if it is enabled.
	*
	* @param lbdetails the lbdetails
	*/
	public void cacheResult(lbdetails lbdetails);

	/**
	* Caches the lbdetailses in the entity cache if it is enabled.
	*
	* @param lbdetailses the lbdetailses
	*/
	public void cacheResult(java.util.List<lbdetails> lbdetailses);

	/**
	* Creates a new lbdetails with the primary key. Does not add the lbdetails to the database.
	*
	* @param id the primary key for the new lbdetails
	* @return the new lbdetails
	*/
	public lbdetails create(long id);

	/**
	* Removes the lbdetails with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the lbdetails
	* @return the lbdetails that was removed
	* @throws NoSuchlbdetailsException if a lbdetails with the primary key could not be found
	*/
	public lbdetails remove(long id) throws NoSuchlbdetailsException;

	public lbdetails updateImpl(lbdetails lbdetails);

	/**
	* Returns the lbdetails with the primary key or throws a {@link NoSuchlbdetailsException} if it could not be found.
	*
	* @param id the primary key of the lbdetails
	* @return the lbdetails
	* @throws NoSuchlbdetailsException if a lbdetails with the primary key could not be found
	*/
	public lbdetails findByPrimaryKey(long id) throws NoSuchlbdetailsException;

	/**
	* Returns the lbdetails with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the lbdetails
	* @return the lbdetails, or <code>null</code> if a lbdetails with the primary key could not be found
	*/
	public lbdetails fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, lbdetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the lbdetailses.
	*
	* @return the lbdetailses
	*/
	public java.util.List<lbdetails> findAll();

	/**
	* Returns a range of all the lbdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lbdetailses
	* @param end the upper bound of the range of lbdetailses (not inclusive)
	* @return the range of lbdetailses
	*/
	public java.util.List<lbdetails> findAll(int start, int end);

	/**
	* Returns an ordered range of all the lbdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lbdetailses
	* @param end the upper bound of the range of lbdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of lbdetailses
	*/
	public java.util.List<lbdetails> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lbdetails> orderByComparator);

	/**
	* Returns an ordered range of all the lbdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link lbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of lbdetailses
	* @param end the upper bound of the range of lbdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of lbdetailses
	*/
	public java.util.List<lbdetails> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<lbdetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the lbdetailses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of lbdetailses.
	*
	* @return the number of lbdetailses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}