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

package com.chola.contest.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.contest.exception.NoSuchcontestException;
import com.chola.contest.model.cholacontest;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the cholacontest service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see com.chola.contest.service.persistence.impl.cholacontestPersistenceImpl
 * @see cholacontestUtil
 * @generated
 */
@ProviderType
public interface cholacontestPersistence extends BasePersistence<cholacontest> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link cholacontestUtil} to access the cholacontest persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the cholacontests where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching cholacontests
	*/
	public java.util.List<cholacontest> findByCONTENT_ID(long content_id);

	/**
	* Returns a range of all the cholacontests where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholacontestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of cholacontests
	* @param end the upper bound of the range of cholacontests (not inclusive)
	* @return the range of matching cholacontests
	*/
	public java.util.List<cholacontest> findByCONTENT_ID(long content_id,
		int start, int end);

	/**
	* Returns an ordered range of all the cholacontests where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholacontestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of cholacontests
	* @param end the upper bound of the range of cholacontests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching cholacontests
	*/
	public java.util.List<cholacontest> findByCONTENT_ID(long content_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<cholacontest> orderByComparator);

	/**
	* Returns an ordered range of all the cholacontests where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholacontestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of cholacontests
	* @param end the upper bound of the range of cholacontests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching cholacontests
	*/
	public java.util.List<cholacontest> findByCONTENT_ID(long content_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<cholacontest> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first cholacontest in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cholacontest
	* @throws NoSuchcontestException if a matching cholacontest could not be found
	*/
	public cholacontest findByCONTENT_ID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<cholacontest> orderByComparator)
		throws NoSuchcontestException;

	/**
	* Returns the first cholacontest in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching cholacontest, or <code>null</code> if a matching cholacontest could not be found
	*/
	public cholacontest fetchByCONTENT_ID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<cholacontest> orderByComparator);

	/**
	* Returns the last cholacontest in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cholacontest
	* @throws NoSuchcontestException if a matching cholacontest could not be found
	*/
	public cholacontest findByCONTENT_ID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<cholacontest> orderByComparator)
		throws NoSuchcontestException;

	/**
	* Returns the last cholacontest in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching cholacontest, or <code>null</code> if a matching cholacontest could not be found
	*/
	public cholacontest fetchByCONTENT_ID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<cholacontest> orderByComparator);

	/**
	* Returns the cholacontests before and after the current cholacontest in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current cholacontest
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next cholacontest
	* @throws NoSuchcontestException if a cholacontest with the primary key could not be found
	*/
	public cholacontest[] findByCONTENT_ID_PrevAndNext(long id,
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<cholacontest> orderByComparator)
		throws NoSuchcontestException;

	/**
	* Removes all the cholacontests where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public void removeByCONTENT_ID(long content_id);

	/**
	* Returns the number of cholacontests where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching cholacontests
	*/
	public int countByCONTENT_ID(long content_id);

	/**
	* Caches the cholacontest in the entity cache if it is enabled.
	*
	* @param cholacontest the cholacontest
	*/
	public void cacheResult(cholacontest cholacontest);

	/**
	* Caches the cholacontests in the entity cache if it is enabled.
	*
	* @param cholacontests the cholacontests
	*/
	public void cacheResult(java.util.List<cholacontest> cholacontests);

	/**
	* Creates a new cholacontest with the primary key. Does not add the cholacontest to the database.
	*
	* @param id the primary key for the new cholacontest
	* @return the new cholacontest
	*/
	public cholacontest create(long id);

	/**
	* Removes the cholacontest with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the cholacontest
	* @return the cholacontest that was removed
	* @throws NoSuchcontestException if a cholacontest with the primary key could not be found
	*/
	public cholacontest remove(long id) throws NoSuchcontestException;

	public cholacontest updateImpl(cholacontest cholacontest);

	/**
	* Returns the cholacontest with the primary key or throws a {@link NoSuchcontestException} if it could not be found.
	*
	* @param id the primary key of the cholacontest
	* @return the cholacontest
	* @throws NoSuchcontestException if a cholacontest with the primary key could not be found
	*/
	public cholacontest findByPrimaryKey(long id) throws NoSuchcontestException;

	/**
	* Returns the cholacontest with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the cholacontest
	* @return the cholacontest, or <code>null</code> if a cholacontest with the primary key could not be found
	*/
	public cholacontest fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, cholacontest> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the cholacontests.
	*
	* @return the cholacontests
	*/
	public java.util.List<cholacontest> findAll();

	/**
	* Returns a range of all the cholacontests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholacontestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cholacontests
	* @param end the upper bound of the range of cholacontests (not inclusive)
	* @return the range of cholacontests
	*/
	public java.util.List<cholacontest> findAll(int start, int end);

	/**
	* Returns an ordered range of all the cholacontests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholacontestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cholacontests
	* @param end the upper bound of the range of cholacontests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of cholacontests
	*/
	public java.util.List<cholacontest> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<cholacontest> orderByComparator);

	/**
	* Returns an ordered range of all the cholacontests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link cholacontestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of cholacontests
	* @param end the upper bound of the range of cholacontests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of cholacontests
	*/
	public java.util.List<cholacontest> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<cholacontest> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the cholacontests from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of cholacontests.
	*
	* @return the number of cholacontests
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}