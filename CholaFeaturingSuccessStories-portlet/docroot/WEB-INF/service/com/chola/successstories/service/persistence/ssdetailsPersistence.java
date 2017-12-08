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

package com.chola.successstories.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.successstories.exception.NoSuchssdetailsException;
import com.chola.successstories.model.ssdetails;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the ssdetails service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see com.chola.successstories.service.persistence.impl.ssdetailsPersistenceImpl
 * @see ssdetailsUtil
 * @generated
 */
@ProviderType
public interface ssdetailsPersistence extends BasePersistence<ssdetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ssdetailsUtil} to access the ssdetails persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the ssdetailses where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching ssdetailses
	*/
	public java.util.List<ssdetails> findByCONTENT_ID(long content_id);

	/**
	* Returns a range of all the ssdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of ssdetailses
	* @param end the upper bound of the range of ssdetailses (not inclusive)
	* @return the range of matching ssdetailses
	*/
	public java.util.List<ssdetails> findByCONTENT_ID(long content_id,
		int start, int end);

	/**
	* Returns an ordered range of all the ssdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of ssdetailses
	* @param end the upper bound of the range of ssdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ssdetailses
	*/
	public java.util.List<ssdetails> findByCONTENT_ID(long content_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ssdetails> orderByComparator);

	/**
	* Returns an ordered range of all the ssdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of ssdetailses
	* @param end the upper bound of the range of ssdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ssdetailses
	*/
	public java.util.List<ssdetails> findByCONTENT_ID(long content_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ssdetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first ssdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ssdetails
	* @throws NoSuchssdetailsException if a matching ssdetails could not be found
	*/
	public ssdetails findByCONTENT_ID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<ssdetails> orderByComparator)
		throws NoSuchssdetailsException;

	/**
	* Returns the first ssdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching ssdetails, or <code>null</code> if a matching ssdetails could not be found
	*/
	public ssdetails fetchByCONTENT_ID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<ssdetails> orderByComparator);

	/**
	* Returns the last ssdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ssdetails
	* @throws NoSuchssdetailsException if a matching ssdetails could not be found
	*/
	public ssdetails findByCONTENT_ID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<ssdetails> orderByComparator)
		throws NoSuchssdetailsException;

	/**
	* Returns the last ssdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching ssdetails, or <code>null</code> if a matching ssdetails could not be found
	*/
	public ssdetails fetchByCONTENT_ID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<ssdetails> orderByComparator);

	/**
	* Returns the ssdetailses before and after the current ssdetails in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current ssdetails
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next ssdetails
	* @throws NoSuchssdetailsException if a ssdetails with the primary key could not be found
	*/
	public ssdetails[] findByCONTENT_ID_PrevAndNext(long id, long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<ssdetails> orderByComparator)
		throws NoSuchssdetailsException;

	/**
	* Removes all the ssdetailses where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public void removeByCONTENT_ID(long content_id);

	/**
	* Returns the number of ssdetailses where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching ssdetailses
	*/
	public int countByCONTENT_ID(long content_id);

	/**
	* Caches the ssdetails in the entity cache if it is enabled.
	*
	* @param ssdetails the ssdetails
	*/
	public void cacheResult(ssdetails ssdetails);

	/**
	* Caches the ssdetailses in the entity cache if it is enabled.
	*
	* @param ssdetailses the ssdetailses
	*/
	public void cacheResult(java.util.List<ssdetails> ssdetailses);

	/**
	* Creates a new ssdetails with the primary key. Does not add the ssdetails to the database.
	*
	* @param id the primary key for the new ssdetails
	* @return the new ssdetails
	*/
	public ssdetails create(long id);

	/**
	* Removes the ssdetails with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ssdetails
	* @return the ssdetails that was removed
	* @throws NoSuchssdetailsException if a ssdetails with the primary key could not be found
	*/
	public ssdetails remove(long id) throws NoSuchssdetailsException;

	public ssdetails updateImpl(ssdetails ssdetails);

	/**
	* Returns the ssdetails with the primary key or throws a {@link NoSuchssdetailsException} if it could not be found.
	*
	* @param id the primary key of the ssdetails
	* @return the ssdetails
	* @throws NoSuchssdetailsException if a ssdetails with the primary key could not be found
	*/
	public ssdetails findByPrimaryKey(long id) throws NoSuchssdetailsException;

	/**
	* Returns the ssdetails with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the ssdetails
	* @return the ssdetails, or <code>null</code> if a ssdetails with the primary key could not be found
	*/
	public ssdetails fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, ssdetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the ssdetailses.
	*
	* @return the ssdetailses
	*/
	public java.util.List<ssdetails> findAll();

	/**
	* Returns a range of all the ssdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ssdetailses
	* @param end the upper bound of the range of ssdetailses (not inclusive)
	* @return the range of ssdetailses
	*/
	public java.util.List<ssdetails> findAll(int start, int end);

	/**
	* Returns an ordered range of all the ssdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ssdetailses
	* @param end the upper bound of the range of ssdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ssdetailses
	*/
	public java.util.List<ssdetails> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ssdetails> orderByComparator);

	/**
	* Returns an ordered range of all the ssdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ssdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ssdetailses
	* @param end the upper bound of the range of ssdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ssdetailses
	*/
	public java.util.List<ssdetails> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ssdetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the ssdetailses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of ssdetailses.
	*
	* @return the number of ssdetailses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}