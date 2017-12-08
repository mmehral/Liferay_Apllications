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

package com.contest.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.contest.exception.NoSuchContestUserDetailsException;

import com.contest.model.ContestUserDetails;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the contest user details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see com.contest.service.persistence.impl.ContestUserDetailsPersistenceImpl
 * @see ContestUserDetailsUtil
 * @generated
 */
@ProviderType
public interface ContestUserDetailsPersistence extends BasePersistence<ContestUserDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ContestUserDetailsUtil} to access the contest user details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the contest user detailses where contestreference_id = &#63;.
	*
	* @param contestreference_id the contestreference_id
	* @return the matching contest user detailses
	*/
	public java.util.List<ContestUserDetails> findByCONTESTUSERREFERENCE_ID(
		long contestreference_id);

	/**
	* Returns a range of all the contest user detailses where contestreference_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContestUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contestreference_id the contestreference_id
	* @param start the lower bound of the range of contest user detailses
	* @param end the upper bound of the range of contest user detailses (not inclusive)
	* @return the range of matching contest user detailses
	*/
	public java.util.List<ContestUserDetails> findByCONTESTUSERREFERENCE_ID(
		long contestreference_id, int start, int end);

	/**
	* Returns an ordered range of all the contest user detailses where contestreference_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContestUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contestreference_id the contestreference_id
	* @param start the lower bound of the range of contest user detailses
	* @param end the upper bound of the range of contest user detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching contest user detailses
	*/
	public java.util.List<ContestUserDetails> findByCONTESTUSERREFERENCE_ID(
		long contestreference_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ContestUserDetails> orderByComparator);

	/**
	* Returns an ordered range of all the contest user detailses where contestreference_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContestUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param contestreference_id the contestreference_id
	* @param start the lower bound of the range of contest user detailses
	* @param end the upper bound of the range of contest user detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching contest user detailses
	*/
	public java.util.List<ContestUserDetails> findByCONTESTUSERREFERENCE_ID(
		long contestreference_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ContestUserDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first contest user details in the ordered set where contestreference_id = &#63;.
	*
	* @param contestreference_id the contestreference_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contest user details
	* @throws NoSuchContestUserDetailsException if a matching contest user details could not be found
	*/
	public ContestUserDetails findByCONTESTUSERREFERENCE_ID_First(
		long contestreference_id,
		com.liferay.portal.kernel.util.OrderByComparator<ContestUserDetails> orderByComparator)
		throws NoSuchContestUserDetailsException;

	/**
	* Returns the first contest user details in the ordered set where contestreference_id = &#63;.
	*
	* @param contestreference_id the contestreference_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contest user details, or <code>null</code> if a matching contest user details could not be found
	*/
	public ContestUserDetails fetchByCONTESTUSERREFERENCE_ID_First(
		long contestreference_id,
		com.liferay.portal.kernel.util.OrderByComparator<ContestUserDetails> orderByComparator);

	/**
	* Returns the last contest user details in the ordered set where contestreference_id = &#63;.
	*
	* @param contestreference_id the contestreference_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contest user details
	* @throws NoSuchContestUserDetailsException if a matching contest user details could not be found
	*/
	public ContestUserDetails findByCONTESTUSERREFERENCE_ID_Last(
		long contestreference_id,
		com.liferay.portal.kernel.util.OrderByComparator<ContestUserDetails> orderByComparator)
		throws NoSuchContestUserDetailsException;

	/**
	* Returns the last contest user details in the ordered set where contestreference_id = &#63;.
	*
	* @param contestreference_id the contestreference_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contest user details, or <code>null</code> if a matching contest user details could not be found
	*/
	public ContestUserDetails fetchByCONTESTUSERREFERENCE_ID_Last(
		long contestreference_id,
		com.liferay.portal.kernel.util.OrderByComparator<ContestUserDetails> orderByComparator);

	/**
	* Returns the contest user detailses before and after the current contest user details in the ordered set where contestreference_id = &#63;.
	*
	* @param id the primary key of the current contest user details
	* @param contestreference_id the contestreference_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next contest user details
	* @throws NoSuchContestUserDetailsException if a contest user details with the primary key could not be found
	*/
	public ContestUserDetails[] findByCONTESTUSERREFERENCE_ID_PrevAndNext(
		long id, long contestreference_id,
		com.liferay.portal.kernel.util.OrderByComparator<ContestUserDetails> orderByComparator)
		throws NoSuchContestUserDetailsException;

	/**
	* Removes all the contest user detailses where contestreference_id = &#63; from the database.
	*
	* @param contestreference_id the contestreference_id
	*/
	public void removeByCONTESTUSERREFERENCE_ID(long contestreference_id);

	/**
	* Returns the number of contest user detailses where contestreference_id = &#63;.
	*
	* @param contestreference_id the contestreference_id
	* @return the number of matching contest user detailses
	*/
	public int countByCONTESTUSERREFERENCE_ID(long contestreference_id);

	/**
	* Caches the contest user details in the entity cache if it is enabled.
	*
	* @param contestUserDetails the contest user details
	*/
	public void cacheResult(ContestUserDetails contestUserDetails);

	/**
	* Caches the contest user detailses in the entity cache if it is enabled.
	*
	* @param contestUserDetailses the contest user detailses
	*/
	public void cacheResult(
		java.util.List<ContestUserDetails> contestUserDetailses);

	/**
	* Creates a new contest user details with the primary key. Does not add the contest user details to the database.
	*
	* @param id the primary key for the new contest user details
	* @return the new contest user details
	*/
	public ContestUserDetails create(long id);

	/**
	* Removes the contest user details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the contest user details
	* @return the contest user details that was removed
	* @throws NoSuchContestUserDetailsException if a contest user details with the primary key could not be found
	*/
	public ContestUserDetails remove(long id)
		throws NoSuchContestUserDetailsException;

	public ContestUserDetails updateImpl(ContestUserDetails contestUserDetails);

	/**
	* Returns the contest user details with the primary key or throws a {@link NoSuchContestUserDetailsException} if it could not be found.
	*
	* @param id the primary key of the contest user details
	* @return the contest user details
	* @throws NoSuchContestUserDetailsException if a contest user details with the primary key could not be found
	*/
	public ContestUserDetails findByPrimaryKey(long id)
		throws NoSuchContestUserDetailsException;

	/**
	* Returns the contest user details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the contest user details
	* @return the contest user details, or <code>null</code> if a contest user details with the primary key could not be found
	*/
	public ContestUserDetails fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, ContestUserDetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the contest user detailses.
	*
	* @return the contest user detailses
	*/
	public java.util.List<ContestUserDetails> findAll();

	/**
	* Returns a range of all the contest user detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContestUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contest user detailses
	* @param end the upper bound of the range of contest user detailses (not inclusive)
	* @return the range of contest user detailses
	*/
	public java.util.List<ContestUserDetails> findAll(int start, int end);

	/**
	* Returns an ordered range of all the contest user detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContestUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contest user detailses
	* @param end the upper bound of the range of contest user detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of contest user detailses
	*/
	public java.util.List<ContestUserDetails> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ContestUserDetails> orderByComparator);

	/**
	* Returns an ordered range of all the contest user detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ContestUserDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contest user detailses
	* @param end the upper bound of the range of contest user detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of contest user detailses
	*/
	public java.util.List<ContestUserDetails> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ContestUserDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the contest user detailses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of contest user detailses.
	*
	* @return the number of contest user detailses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}