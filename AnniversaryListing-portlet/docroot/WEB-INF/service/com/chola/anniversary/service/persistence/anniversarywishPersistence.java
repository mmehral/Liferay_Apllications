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

package com.chola.anniversary.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.anniversary.exception.NoSuchanniversarywishException;
import com.chola.anniversary.model.anniversarywish;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the anniversarywish service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see com.chola.anniversary.service.persistence.impl.anniversarywishPersistenceImpl
 * @see anniversarywishUtil
 * @generated
 */
@ProviderType
public interface anniversarywishPersistence extends BasePersistence<anniversarywish> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link anniversarywishUtil} to access the anniversarywish persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the anniversarywishs where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching anniversarywishs
	*/
	public java.util.List<anniversarywish> findByuserIds(
		java.lang.String userId);

	/**
	* Returns a range of all the anniversarywishs where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link anniversarywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of anniversarywishs
	* @param end the upper bound of the range of anniversarywishs (not inclusive)
	* @return the range of matching anniversarywishs
	*/
	public java.util.List<anniversarywish> findByuserIds(
		java.lang.String userId, int start, int end);

	/**
	* Returns an ordered range of all the anniversarywishs where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link anniversarywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of anniversarywishs
	* @param end the upper bound of the range of anniversarywishs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching anniversarywishs
	*/
	public java.util.List<anniversarywish> findByuserIds(
		java.lang.String userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<anniversarywish> orderByComparator);

	/**
	* Returns an ordered range of all the anniversarywishs where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link anniversarywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of anniversarywishs
	* @param end the upper bound of the range of anniversarywishs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching anniversarywishs
	*/
	public java.util.List<anniversarywish> findByuserIds(
		java.lang.String userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<anniversarywish> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first anniversarywish in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching anniversarywish
	* @throws NoSuchanniversarywishException if a matching anniversarywish could not be found
	*/
	public anniversarywish findByuserIds_First(java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator<anniversarywish> orderByComparator)
		throws NoSuchanniversarywishException;

	/**
	* Returns the first anniversarywish in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching anniversarywish, or <code>null</code> if a matching anniversarywish could not be found
	*/
	public anniversarywish fetchByuserIds_First(java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator<anniversarywish> orderByComparator);

	/**
	* Returns the last anniversarywish in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching anniversarywish
	* @throws NoSuchanniversarywishException if a matching anniversarywish could not be found
	*/
	public anniversarywish findByuserIds_Last(java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator<anniversarywish> orderByComparator)
		throws NoSuchanniversarywishException;

	/**
	* Returns the last anniversarywish in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching anniversarywish, or <code>null</code> if a matching anniversarywish could not be found
	*/
	public anniversarywish fetchByuserIds_Last(java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator<anniversarywish> orderByComparator);

	/**
	* Returns the anniversarywishs before and after the current anniversarywish in the ordered set where userId = &#63;.
	*
	* @param id the primary key of the current anniversarywish
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next anniversarywish
	* @throws NoSuchanniversarywishException if a anniversarywish with the primary key could not be found
	*/
	public anniversarywish[] findByuserIds_PrevAndNext(long id,
		java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator<anniversarywish> orderByComparator)
		throws NoSuchanniversarywishException;

	/**
	* Removes all the anniversarywishs where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByuserIds(java.lang.String userId);

	/**
	* Returns the number of anniversarywishs where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching anniversarywishs
	*/
	public int countByuserIds(java.lang.String userId);

	/**
	* Caches the anniversarywish in the entity cache if it is enabled.
	*
	* @param anniversarywish the anniversarywish
	*/
	public void cacheResult(anniversarywish anniversarywish);

	/**
	* Caches the anniversarywishs in the entity cache if it is enabled.
	*
	* @param anniversarywishs the anniversarywishs
	*/
	public void cacheResult(java.util.List<anniversarywish> anniversarywishs);

	/**
	* Creates a new anniversarywish with the primary key. Does not add the anniversarywish to the database.
	*
	* @param id the primary key for the new anniversarywish
	* @return the new anniversarywish
	*/
	public anniversarywish create(long id);

	/**
	* Removes the anniversarywish with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the anniversarywish
	* @return the anniversarywish that was removed
	* @throws NoSuchanniversarywishException if a anniversarywish with the primary key could not be found
	*/
	public anniversarywish remove(long id)
		throws NoSuchanniversarywishException;

	public anniversarywish updateImpl(anniversarywish anniversarywish);

	/**
	* Returns the anniversarywish with the primary key or throws a {@link NoSuchanniversarywishException} if it could not be found.
	*
	* @param id the primary key of the anniversarywish
	* @return the anniversarywish
	* @throws NoSuchanniversarywishException if a anniversarywish with the primary key could not be found
	*/
	public anniversarywish findByPrimaryKey(long id)
		throws NoSuchanniversarywishException;

	/**
	* Returns the anniversarywish with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the anniversarywish
	* @return the anniversarywish, or <code>null</code> if a anniversarywish with the primary key could not be found
	*/
	public anniversarywish fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, anniversarywish> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the anniversarywishs.
	*
	* @return the anniversarywishs
	*/
	public java.util.List<anniversarywish> findAll();

	/**
	* Returns a range of all the anniversarywishs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link anniversarywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of anniversarywishs
	* @param end the upper bound of the range of anniversarywishs (not inclusive)
	* @return the range of anniversarywishs
	*/
	public java.util.List<anniversarywish> findAll(int start, int end);

	/**
	* Returns an ordered range of all the anniversarywishs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link anniversarywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of anniversarywishs
	* @param end the upper bound of the range of anniversarywishs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of anniversarywishs
	*/
	public java.util.List<anniversarywish> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<anniversarywish> orderByComparator);

	/**
	* Returns an ordered range of all the anniversarywishs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link anniversarywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of anniversarywishs
	* @param end the upper bound of the range of anniversarywishs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of anniversarywishs
	*/
	public java.util.List<anniversarywish> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<anniversarywish> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the anniversarywishs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of anniversarywishs.
	*
	* @return the number of anniversarywishs
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}