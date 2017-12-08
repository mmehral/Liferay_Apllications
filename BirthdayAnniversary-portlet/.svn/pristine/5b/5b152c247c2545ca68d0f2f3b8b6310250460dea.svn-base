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

package com.chola.birthday.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.birthday.exception.NoSuchbirthdaywishException;
import com.chola.birthday.model.birthdaywish;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the birthdaywish service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see com.chola.birthday.service.persistence.impl.birthdaywishPersistenceImpl
 * @see birthdaywishUtil
 * @generated
 */
@ProviderType
public interface birthdaywishPersistence extends BasePersistence<birthdaywish> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link birthdaywishUtil} to access the birthdaywish persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the birthdaywishs where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching birthdaywishs
	*/
	public java.util.List<birthdaywish> findByuserIds(java.lang.String userId);

	/**
	* Returns a range of all the birthdaywishs where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link birthdaywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of birthdaywishs
	* @param end the upper bound of the range of birthdaywishs (not inclusive)
	* @return the range of matching birthdaywishs
	*/
	public java.util.List<birthdaywish> findByuserIds(java.lang.String userId,
		int start, int end);

	/**
	* Returns an ordered range of all the birthdaywishs where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link birthdaywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of birthdaywishs
	* @param end the upper bound of the range of birthdaywishs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching birthdaywishs
	*/
	public java.util.List<birthdaywish> findByuserIds(java.lang.String userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<birthdaywish> orderByComparator);

	/**
	* Returns an ordered range of all the birthdaywishs where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link birthdaywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of birthdaywishs
	* @param end the upper bound of the range of birthdaywishs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching birthdaywishs
	*/
	public java.util.List<birthdaywish> findByuserIds(java.lang.String userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<birthdaywish> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first birthdaywish in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching birthdaywish
	* @throws NoSuchbirthdaywishException if a matching birthdaywish could not be found
	*/
	public birthdaywish findByuserIds_First(java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator<birthdaywish> orderByComparator)
		throws NoSuchbirthdaywishException;

	/**
	* Returns the first birthdaywish in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching birthdaywish, or <code>null</code> if a matching birthdaywish could not be found
	*/
	public birthdaywish fetchByuserIds_First(java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator<birthdaywish> orderByComparator);

	/**
	* Returns the last birthdaywish in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching birthdaywish
	* @throws NoSuchbirthdaywishException if a matching birthdaywish could not be found
	*/
	public birthdaywish findByuserIds_Last(java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator<birthdaywish> orderByComparator)
		throws NoSuchbirthdaywishException;

	/**
	* Returns the last birthdaywish in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching birthdaywish, or <code>null</code> if a matching birthdaywish could not be found
	*/
	public birthdaywish fetchByuserIds_Last(java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator<birthdaywish> orderByComparator);

	/**
	* Returns the birthdaywishs before and after the current birthdaywish in the ordered set where userId = &#63;.
	*
	* @param id the primary key of the current birthdaywish
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next birthdaywish
	* @throws NoSuchbirthdaywishException if a birthdaywish with the primary key could not be found
	*/
	public birthdaywish[] findByuserIds_PrevAndNext(long id,
		java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator<birthdaywish> orderByComparator)
		throws NoSuchbirthdaywishException;

	/**
	* Removes all the birthdaywishs where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByuserIds(java.lang.String userId);

	/**
	* Returns the number of birthdaywishs where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching birthdaywishs
	*/
	public int countByuserIds(java.lang.String userId);

	/**
	* Caches the birthdaywish in the entity cache if it is enabled.
	*
	* @param birthdaywish the birthdaywish
	*/
	public void cacheResult(birthdaywish birthdaywish);

	/**
	* Caches the birthdaywishs in the entity cache if it is enabled.
	*
	* @param birthdaywishs the birthdaywishs
	*/
	public void cacheResult(java.util.List<birthdaywish> birthdaywishs);

	/**
	* Creates a new birthdaywish with the primary key. Does not add the birthdaywish to the database.
	*
	* @param id the primary key for the new birthdaywish
	* @return the new birthdaywish
	*/
	public birthdaywish create(long id);

	/**
	* Removes the birthdaywish with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the birthdaywish
	* @return the birthdaywish that was removed
	* @throws NoSuchbirthdaywishException if a birthdaywish with the primary key could not be found
	*/
	public birthdaywish remove(long id) throws NoSuchbirthdaywishException;

	public birthdaywish updateImpl(birthdaywish birthdaywish);

	/**
	* Returns the birthdaywish with the primary key or throws a {@link NoSuchbirthdaywishException} if it could not be found.
	*
	* @param id the primary key of the birthdaywish
	* @return the birthdaywish
	* @throws NoSuchbirthdaywishException if a birthdaywish with the primary key could not be found
	*/
	public birthdaywish findByPrimaryKey(long id)
		throws NoSuchbirthdaywishException;

	/**
	* Returns the birthdaywish with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the birthdaywish
	* @return the birthdaywish, or <code>null</code> if a birthdaywish with the primary key could not be found
	*/
	public birthdaywish fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, birthdaywish> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the birthdaywishs.
	*
	* @return the birthdaywishs
	*/
	public java.util.List<birthdaywish> findAll();

	/**
	* Returns a range of all the birthdaywishs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link birthdaywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of birthdaywishs
	* @param end the upper bound of the range of birthdaywishs (not inclusive)
	* @return the range of birthdaywishs
	*/
	public java.util.List<birthdaywish> findAll(int start, int end);

	/**
	* Returns an ordered range of all the birthdaywishs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link birthdaywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of birthdaywishs
	* @param end the upper bound of the range of birthdaywishs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of birthdaywishs
	*/
	public java.util.List<birthdaywish> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<birthdaywish> orderByComparator);

	/**
	* Returns an ordered range of all the birthdaywishs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link birthdaywishModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of birthdaywishs
	* @param end the upper bound of the range of birthdaywishs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of birthdaywishs
	*/
	public java.util.List<birthdaywish> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<birthdaywish> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the birthdaywishs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of birthdaywishs.
	*
	* @return the number of birthdaywishs
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}