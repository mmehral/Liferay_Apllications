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

package com.chola.businessmis.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.businessmis.exception.NoSuchbusinessmisdetailsException;
import com.chola.businessmis.model.businessmisdetails;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the businessmisdetails service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see com.chola.businessmis.service.persistence.impl.businessmisdetailsPersistenceImpl
 * @see businessmisdetailsUtil
 * @generated
 */
@ProviderType
public interface businessmisdetailsPersistence extends BasePersistence<businessmisdetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link businessmisdetailsUtil} to access the businessmisdetails persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the businessmisdetailses where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching businessmisdetailses
	*/
	public java.util.List<businessmisdetails> findByCONTENT_ID(long content_id);

	/**
	* Returns a range of all the businessmisdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of businessmisdetailses
	* @param end the upper bound of the range of businessmisdetailses (not inclusive)
	* @return the range of matching businessmisdetailses
	*/
	public java.util.List<businessmisdetails> findByCONTENT_ID(
		long content_id, int start, int end);

	/**
	* Returns an ordered range of all the businessmisdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of businessmisdetailses
	* @param end the upper bound of the range of businessmisdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching businessmisdetailses
	*/
	public java.util.List<businessmisdetails> findByCONTENT_ID(
		long content_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<businessmisdetails> orderByComparator);

	/**
	* Returns an ordered range of all the businessmisdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of businessmisdetailses
	* @param end the upper bound of the range of businessmisdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching businessmisdetailses
	*/
	public java.util.List<businessmisdetails> findByCONTENT_ID(
		long content_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<businessmisdetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first businessmisdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching businessmisdetails
	* @throws NoSuchbusinessmisdetailsException if a matching businessmisdetails could not be found
	*/
	public businessmisdetails findByCONTENT_ID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<businessmisdetails> orderByComparator)
		throws NoSuchbusinessmisdetailsException;

	/**
	* Returns the first businessmisdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching businessmisdetails, or <code>null</code> if a matching businessmisdetails could not be found
	*/
	public businessmisdetails fetchByCONTENT_ID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<businessmisdetails> orderByComparator);

	/**
	* Returns the last businessmisdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching businessmisdetails
	* @throws NoSuchbusinessmisdetailsException if a matching businessmisdetails could not be found
	*/
	public businessmisdetails findByCONTENT_ID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<businessmisdetails> orderByComparator)
		throws NoSuchbusinessmisdetailsException;

	/**
	* Returns the last businessmisdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching businessmisdetails, or <code>null</code> if a matching businessmisdetails could not be found
	*/
	public businessmisdetails fetchByCONTENT_ID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<businessmisdetails> orderByComparator);

	/**
	* Returns the businessmisdetailses before and after the current businessmisdetails in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current businessmisdetails
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next businessmisdetails
	* @throws NoSuchbusinessmisdetailsException if a businessmisdetails with the primary key could not be found
	*/
	public businessmisdetails[] findByCONTENT_ID_PrevAndNext(long id,
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<businessmisdetails> orderByComparator)
		throws NoSuchbusinessmisdetailsException;

	/**
	* Removes all the businessmisdetailses where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public void removeByCONTENT_ID(long content_id);

	/**
	* Returns the number of businessmisdetailses where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching businessmisdetailses
	*/
	public int countByCONTENT_ID(long content_id);

	/**
	* Caches the businessmisdetails in the entity cache if it is enabled.
	*
	* @param businessmisdetails the businessmisdetails
	*/
	public void cacheResult(businessmisdetails businessmisdetails);

	/**
	* Caches the businessmisdetailses in the entity cache if it is enabled.
	*
	* @param businessmisdetailses the businessmisdetailses
	*/
	public void cacheResult(
		java.util.List<businessmisdetails> businessmisdetailses);

	/**
	* Creates a new businessmisdetails with the primary key. Does not add the businessmisdetails to the database.
	*
	* @param id the primary key for the new businessmisdetails
	* @return the new businessmisdetails
	*/
	public businessmisdetails create(long id);

	/**
	* Removes the businessmisdetails with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the businessmisdetails
	* @return the businessmisdetails that was removed
	* @throws NoSuchbusinessmisdetailsException if a businessmisdetails with the primary key could not be found
	*/
	public businessmisdetails remove(long id)
		throws NoSuchbusinessmisdetailsException;

	public businessmisdetails updateImpl(businessmisdetails businessmisdetails);

	/**
	* Returns the businessmisdetails with the primary key or throws a {@link NoSuchbusinessmisdetailsException} if it could not be found.
	*
	* @param id the primary key of the businessmisdetails
	* @return the businessmisdetails
	* @throws NoSuchbusinessmisdetailsException if a businessmisdetails with the primary key could not be found
	*/
	public businessmisdetails findByPrimaryKey(long id)
		throws NoSuchbusinessmisdetailsException;

	/**
	* Returns the businessmisdetails with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the businessmisdetails
	* @return the businessmisdetails, or <code>null</code> if a businessmisdetails with the primary key could not be found
	*/
	public businessmisdetails fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, businessmisdetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the businessmisdetailses.
	*
	* @return the businessmisdetailses
	*/
	public java.util.List<businessmisdetails> findAll();

	/**
	* Returns a range of all the businessmisdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businessmisdetailses
	* @param end the upper bound of the range of businessmisdetailses (not inclusive)
	* @return the range of businessmisdetailses
	*/
	public java.util.List<businessmisdetails> findAll(int start, int end);

	/**
	* Returns an ordered range of all the businessmisdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businessmisdetailses
	* @param end the upper bound of the range of businessmisdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of businessmisdetailses
	*/
	public java.util.List<businessmisdetails> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<businessmisdetails> orderByComparator);

	/**
	* Returns an ordered range of all the businessmisdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businessmisdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businessmisdetailses
	* @param end the upper bound of the range of businessmisdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of businessmisdetailses
	*/
	public java.util.List<businessmisdetails> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<businessmisdetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the businessmisdetailses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of businessmisdetailses.
	*
	* @return the number of businessmisdetailses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}