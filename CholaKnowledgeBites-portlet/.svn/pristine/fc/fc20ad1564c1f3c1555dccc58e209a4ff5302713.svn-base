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

package com.chola.knowledgebites.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.knowledgebites.exception.NoSuchkbdetailsException;
import com.chola.knowledgebites.model.kbdetails;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the kbdetails service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see com.chola.knowledgebites.service.persistence.impl.kbdetailsPersistenceImpl
 * @see kbdetailsUtil
 * @generated
 */
@ProviderType
public interface kbdetailsPersistence extends BasePersistence<kbdetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link kbdetailsUtil} to access the kbdetails persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the kbdetailses where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching kbdetailses
	*/
	public java.util.List<kbdetails> findByCONTENT_ID(long content_id);

	/**
	* Returns a range of all the kbdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of kbdetailses
	* @param end the upper bound of the range of kbdetailses (not inclusive)
	* @return the range of matching kbdetailses
	*/
	public java.util.List<kbdetails> findByCONTENT_ID(long content_id,
		int start, int end);

	/**
	* Returns an ordered range of all the kbdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of kbdetailses
	* @param end the upper bound of the range of kbdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kbdetailses
	*/
	public java.util.List<kbdetails> findByCONTENT_ID(long content_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<kbdetails> orderByComparator);

	/**
	* Returns an ordered range of all the kbdetailses where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of kbdetailses
	* @param end the upper bound of the range of kbdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching kbdetailses
	*/
	public java.util.List<kbdetails> findByCONTENT_ID(long content_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<kbdetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first kbdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kbdetails
	* @throws NoSuchkbdetailsException if a matching kbdetails could not be found
	*/
	public kbdetails findByCONTENT_ID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<kbdetails> orderByComparator)
		throws NoSuchkbdetailsException;

	/**
	* Returns the first kbdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kbdetails, or <code>null</code> if a matching kbdetails could not be found
	*/
	public kbdetails fetchByCONTENT_ID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<kbdetails> orderByComparator);

	/**
	* Returns the last kbdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kbdetails
	* @throws NoSuchkbdetailsException if a matching kbdetails could not be found
	*/
	public kbdetails findByCONTENT_ID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<kbdetails> orderByComparator)
		throws NoSuchkbdetailsException;

	/**
	* Returns the last kbdetails in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kbdetails, or <code>null</code> if a matching kbdetails could not be found
	*/
	public kbdetails fetchByCONTENT_ID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<kbdetails> orderByComparator);

	/**
	* Returns the kbdetailses before and after the current kbdetails in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current kbdetails
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kbdetails
	* @throws NoSuchkbdetailsException if a kbdetails with the primary key could not be found
	*/
	public kbdetails[] findByCONTENT_ID_PrevAndNext(long id, long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<kbdetails> orderByComparator)
		throws NoSuchkbdetailsException;

	/**
	* Removes all the kbdetailses where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public void removeByCONTENT_ID(long content_id);

	/**
	* Returns the number of kbdetailses where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching kbdetailses
	*/
	public int countByCONTENT_ID(long content_id);

	/**
	* Caches the kbdetails in the entity cache if it is enabled.
	*
	* @param kbdetails the kbdetails
	*/
	public void cacheResult(kbdetails kbdetails);

	/**
	* Caches the kbdetailses in the entity cache if it is enabled.
	*
	* @param kbdetailses the kbdetailses
	*/
	public void cacheResult(java.util.List<kbdetails> kbdetailses);

	/**
	* Creates a new kbdetails with the primary key. Does not add the kbdetails to the database.
	*
	* @param id the primary key for the new kbdetails
	* @return the new kbdetails
	*/
	public kbdetails create(long id);

	/**
	* Removes the kbdetails with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the kbdetails
	* @return the kbdetails that was removed
	* @throws NoSuchkbdetailsException if a kbdetails with the primary key could not be found
	*/
	public kbdetails remove(long id) throws NoSuchkbdetailsException;

	public kbdetails updateImpl(kbdetails kbdetails);

	/**
	* Returns the kbdetails with the primary key or throws a {@link NoSuchkbdetailsException} if it could not be found.
	*
	* @param id the primary key of the kbdetails
	* @return the kbdetails
	* @throws NoSuchkbdetailsException if a kbdetails with the primary key could not be found
	*/
	public kbdetails findByPrimaryKey(long id) throws NoSuchkbdetailsException;

	/**
	* Returns the kbdetails with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the kbdetails
	* @return the kbdetails, or <code>null</code> if a kbdetails with the primary key could not be found
	*/
	public kbdetails fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, kbdetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the kbdetailses.
	*
	* @return the kbdetailses
	*/
	public java.util.List<kbdetails> findAll();

	/**
	* Returns a range of all the kbdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kbdetailses
	* @param end the upper bound of the range of kbdetailses (not inclusive)
	* @return the range of kbdetailses
	*/
	public java.util.List<kbdetails> findAll(int start, int end);

	/**
	* Returns an ordered range of all the kbdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kbdetailses
	* @param end the upper bound of the range of kbdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of kbdetailses
	*/
	public java.util.List<kbdetails> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<kbdetails> orderByComparator);

	/**
	* Returns an ordered range of all the kbdetailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbdetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kbdetailses
	* @param end the upper bound of the range of kbdetailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of kbdetailses
	*/
	public java.util.List<kbdetails> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<kbdetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the kbdetailses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of kbdetailses.
	*
	* @return the number of kbdetailses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}