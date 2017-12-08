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

package com.chola.milestone.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.milestone.exception.NoSuchmilestoneException;
import com.chola.milestone.model.milestone;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the milestone service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see com.chola.milestone.service.persistence.impl.milestonePersistenceImpl
 * @see milestoneUtil
 * @generated
 */
@ProviderType
public interface milestonePersistence extends BasePersistence<milestone> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link milestoneUtil} to access the milestone persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the milestones where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching milestones
	*/
	public java.util.List<milestone> findByuserIds(java.lang.String userId);

	/**
	* Returns a range of all the milestones where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link milestoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of milestones
	* @param end the upper bound of the range of milestones (not inclusive)
	* @return the range of matching milestones
	*/
	public java.util.List<milestone> findByuserIds(java.lang.String userId,
		int start, int end);

	/**
	* Returns an ordered range of all the milestones where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link milestoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of milestones
	* @param end the upper bound of the range of milestones (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching milestones
	*/
	public java.util.List<milestone> findByuserIds(java.lang.String userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<milestone> orderByComparator);

	/**
	* Returns an ordered range of all the milestones where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link milestoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of milestones
	* @param end the upper bound of the range of milestones (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching milestones
	*/
	public java.util.List<milestone> findByuserIds(java.lang.String userId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<milestone> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first milestone in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching milestone
	* @throws NoSuchmilestoneException if a matching milestone could not be found
	*/
	public milestone findByuserIds_First(java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator<milestone> orderByComparator)
		throws NoSuchmilestoneException;

	/**
	* Returns the first milestone in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching milestone, or <code>null</code> if a matching milestone could not be found
	*/
	public milestone fetchByuserIds_First(java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator<milestone> orderByComparator);

	/**
	* Returns the last milestone in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching milestone
	* @throws NoSuchmilestoneException if a matching milestone could not be found
	*/
	public milestone findByuserIds_Last(java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator<milestone> orderByComparator)
		throws NoSuchmilestoneException;

	/**
	* Returns the last milestone in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching milestone, or <code>null</code> if a matching milestone could not be found
	*/
	public milestone fetchByuserIds_Last(java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator<milestone> orderByComparator);

	/**
	* Returns the milestones before and after the current milestone in the ordered set where userId = &#63;.
	*
	* @param id the primary key of the current milestone
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next milestone
	* @throws NoSuchmilestoneException if a milestone with the primary key could not be found
	*/
	public milestone[] findByuserIds_PrevAndNext(long id,
		java.lang.String userId,
		com.liferay.portal.kernel.util.OrderByComparator<milestone> orderByComparator)
		throws NoSuchmilestoneException;

	/**
	* Removes all the milestones where userId = &#63; from the database.
	*
	* @param userId the user ID
	*/
	public void removeByuserIds(java.lang.String userId);

	/**
	* Returns the number of milestones where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching milestones
	*/
	public int countByuserIds(java.lang.String userId);

	/**
	* Caches the milestone in the entity cache if it is enabled.
	*
	* @param milestone the milestone
	*/
	public void cacheResult(milestone milestone);

	/**
	* Caches the milestones in the entity cache if it is enabled.
	*
	* @param milestones the milestones
	*/
	public void cacheResult(java.util.List<milestone> milestones);

	/**
	* Creates a new milestone with the primary key. Does not add the milestone to the database.
	*
	* @param id the primary key for the new milestone
	* @return the new milestone
	*/
	public milestone create(long id);

	/**
	* Removes the milestone with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the milestone
	* @return the milestone that was removed
	* @throws NoSuchmilestoneException if a milestone with the primary key could not be found
	*/
	public milestone remove(long id) throws NoSuchmilestoneException;

	public milestone updateImpl(milestone milestone);

	/**
	* Returns the milestone with the primary key or throws a {@link NoSuchmilestoneException} if it could not be found.
	*
	* @param id the primary key of the milestone
	* @return the milestone
	* @throws NoSuchmilestoneException if a milestone with the primary key could not be found
	*/
	public milestone findByPrimaryKey(long id) throws NoSuchmilestoneException;

	/**
	* Returns the milestone with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the milestone
	* @return the milestone, or <code>null</code> if a milestone with the primary key could not be found
	*/
	public milestone fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, milestone> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the milestones.
	*
	* @return the milestones
	*/
	public java.util.List<milestone> findAll();

	/**
	* Returns a range of all the milestones.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link milestoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of milestones
	* @param end the upper bound of the range of milestones (not inclusive)
	* @return the range of milestones
	*/
	public java.util.List<milestone> findAll(int start, int end);

	/**
	* Returns an ordered range of all the milestones.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link milestoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of milestones
	* @param end the upper bound of the range of milestones (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of milestones
	*/
	public java.util.List<milestone> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<milestone> orderByComparator);

	/**
	* Returns an ordered range of all the milestones.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link milestoneModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of milestones
	* @param end the upper bound of the range of milestones (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of milestones
	*/
	public java.util.List<milestone> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<milestone> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the milestones from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of milestones.
	*
	* @return the number of milestones
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}