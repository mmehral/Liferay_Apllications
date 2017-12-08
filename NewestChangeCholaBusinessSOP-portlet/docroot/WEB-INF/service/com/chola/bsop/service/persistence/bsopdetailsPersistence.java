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

import com.chola.bsop.exception.NoSuchbsopdetailsException;
import com.chola.bsop.model.bsopdetails;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the bsopdetails service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see com.chola.bsop.service.persistence.impl.bsopdetailsPersistenceImpl
 * @see bsopdetailsUtil
 * @generated
 */
@ProviderType
public interface bsopdetailsPersistence extends BasePersistence<bsopdetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link bsopdetailsUtil} to access the bsopdetails persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the bsopdetailses where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching bsopdetailses
	*/
	public java.util.List<bsopdetails> findByCONTENT_ID(long content_id);

	/**
	* Returns a range of all the bsopdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsopdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of bsopdetailses
	* @param end the upper bound of the range of bsopdetailses (not inclusive)
	* @return the range of matching bsopdetailses
	*/
	public java.util.List<bsopdetails> findByCONTENT_ID(long content_id,
		int start, int end);

	/**
	* Returns an ordered range of all the bsopdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsopdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of bsopdetailses
	* @param end the upper bound of the range of bsopdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching bsopdetailses
	*/
	public java.util.List<bsopdetails> findByCONTENT_ID(long content_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bsopdetails> orderByComparator);

	/**
	* Returns an ordered range of all the bsopdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsopdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of bsopdetailses
	* @param end the upper bound of the range of bsopdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching bsopdetailses
	*/
	public java.util.List<bsopdetails> findByCONTENT_ID(long content_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bsopdetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first bsopdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bsopdetails
	* @throws NoSuchbsopdetailsException if a matching bsopdetails could not be found
	*/
	public bsopdetails findByCONTENT_ID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<bsopdetails> orderByComparator)
		throws NoSuchbsopdetailsException;

	/**
	* Returns the first bsopdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching bsopdetails, or <code>null</code> if a matching bsopdetails could not be found
	*/
	public bsopdetails fetchByCONTENT_ID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<bsopdetails> orderByComparator);

	/**
	* Returns the last bsopdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bsopdetails
	* @throws NoSuchbsopdetailsException if a matching bsopdetails could not be found
	*/
	public bsopdetails findByCONTENT_ID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<bsopdetails> orderByComparator)
		throws NoSuchbsopdetailsException;

	/**
	* Returns the last bsopdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching bsopdetails, or <code>null</code> if a matching bsopdetails could not be found
	*/
	public bsopdetails fetchByCONTENT_ID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<bsopdetails> orderByComparator);

	/**
	* Returns the bsopdetailses before and after the current bsopdetails in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current bsopdetails
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next bsopdetails
	* @throws NoSuchbsopdetailsException if a bsopdetails with the primary key could not be found
	*/
	public bsopdetails[] findByCONTENT_ID_PrevAndNext(long id, long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<bsopdetails> orderByComparator)
		throws NoSuchbsopdetailsException;

	/**
	* Removes all the bsopdetailses where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public void removeByCONTENT_ID(long content_id);

	/**
	* Returns the number of bsopdetailses where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching bsopdetailses
	*/
	public int countByCONTENT_ID(long content_id);

	/**
	* Caches the bsopdetails in the entity cache if it is enabled.
	*
	* @param bsopdetails the bsopdetails
	*/
	public void cacheResult(bsopdetails bsopdetails);

	/**
	* Caches the bsopdetailses in the entity cache if it is enabled.
	*
	* @param bsopdetailses the bsopdetailses
	*/
	public void cacheResult(java.util.List<bsopdetails> bsopdetailses);

	/**
	* Creates a new bsopdetails with the primary key. Does not add the bsopdetails to the database.
	*
	* @param id the primary key for the new bsopdetails
	* @return the new bsopdetails
	*/
	public bsopdetails create(long id);

	/**
	* Removes the bsopdetails with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the bsopdetails
	* @return the bsopdetails that was removed
	* @throws NoSuchbsopdetailsException if a bsopdetails with the primary key could not be found
	*/
	public bsopdetails remove(long id) throws NoSuchbsopdetailsException;

	public bsopdetails updateImpl(bsopdetails bsopdetails);

	/**
	* Returns the bsopdetails with the primary key or throws a {@link NoSuchbsopdetailsException} if it could not be found.
	*
	* @param id the primary key of the bsopdetails
	* @return the bsopdetails
	* @throws NoSuchbsopdetailsException if a bsopdetails with the primary key could not be found
	*/
	public bsopdetails findByPrimaryKey(long id)
		throws NoSuchbsopdetailsException;

	/**
	* Returns the bsopdetails with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the bsopdetails
	* @return the bsopdetails, or <code>null</code> if a bsopdetails with the primary key could not be found
	*/
	public bsopdetails fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, bsopdetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the bsopdetailses.
	*
	* @return the bsopdetailses
	*/
	public java.util.List<bsopdetails> findAll();

	/**
	* Returns a range of all the bsopdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsopdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bsopdetailses
	* @param end the upper bound of the range of bsopdetailses (not inclusive)
	* @return the range of bsopdetailses
	*/
	public java.util.List<bsopdetails> findAll(int start, int end);

	/**
	* Returns an ordered range of all the bsopdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsopdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bsopdetailses
	* @param end the upper bound of the range of bsopdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of bsopdetailses
	*/
	public java.util.List<bsopdetails> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bsopdetails> orderByComparator);

	/**
	* Returns an ordered range of all the bsopdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link bsopdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of bsopdetailses
	* @param end the upper bound of the range of bsopdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of bsopdetailses
	*/
	public java.util.List<bsopdetails> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<bsopdetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the bsopdetailses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of bsopdetailses.
	*
	* @return the number of bsopdetailses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}