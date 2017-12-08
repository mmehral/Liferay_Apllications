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

package com.chola.business.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.business.exception.NoSuchbusinesssopDetailsException;
import com.chola.business.model.businesssopDetails;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the businesssop details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see com.chola.business.service.persistence.impl.businesssopDetailsPersistenceImpl
 * @see businesssopDetailsUtil
 * @generated
 */
@ProviderType
public interface businesssopDetailsPersistence extends BasePersistence<businesssopDetails> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link businesssopDetailsUtil} to access the businesssop details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the businesssop details in the entity cache if it is enabled.
	*
	* @param businesssopDetails the businesssop details
	*/
	public void cacheResult(businesssopDetails businesssopDetails);

	/**
	* Caches the businesssop detailses in the entity cache if it is enabled.
	*
	* @param businesssopDetailses the businesssop detailses
	*/
	public void cacheResult(
		java.util.List<businesssopDetails> businesssopDetailses);

	/**
	* Creates a new businesssop details with the primary key. Does not add the businesssop details to the database.
	*
	* @param id the primary key for the new businesssop details
	* @return the new businesssop details
	*/
	public businesssopDetails create(long id);

	/**
	* Removes the businesssop details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the businesssop details
	* @return the businesssop details that was removed
	* @throws NoSuchbusinesssopDetailsException if a businesssop details with the primary key could not be found
	*/
	public businesssopDetails remove(long id)
		throws NoSuchbusinesssopDetailsException;

	public businesssopDetails updateImpl(businesssopDetails businesssopDetails);

	/**
	* Returns the businesssop details with the primary key or throws a {@link NoSuchbusinesssopDetailsException} if it could not be found.
	*
	* @param id the primary key of the businesssop details
	* @return the businesssop details
	* @throws NoSuchbusinesssopDetailsException if a businesssop details with the primary key could not be found
	*/
	public businesssopDetails findByPrimaryKey(long id)
		throws NoSuchbusinesssopDetailsException;

	/**
	* Returns the businesssop details with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the businesssop details
	* @return the businesssop details, or <code>null</code> if a businesssop details with the primary key could not be found
	*/
	public businesssopDetails fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, businesssopDetails> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the businesssop detailses.
	*
	* @return the businesssop detailses
	*/
	public java.util.List<businesssopDetails> findAll();

	/**
	* Returns a range of all the businesssop detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesssop detailses
	* @param end the upper bound of the range of businesssop detailses (not inclusive)
	* @return the range of businesssop detailses
	*/
	public java.util.List<businesssopDetails> findAll(int start, int end);

	/**
	* Returns an ordered range of all the businesssop detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesssop detailses
	* @param end the upper bound of the range of businesssop detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of businesssop detailses
	*/
	public java.util.List<businesssopDetails> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<businesssopDetails> orderByComparator);

	/**
	* Returns an ordered range of all the businesssop detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link businesssopDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of businesssop detailses
	* @param end the upper bound of the range of businesssop detailses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of businesssop detailses
	*/
	public java.util.List<businesssopDetails> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<businesssopDetails> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the businesssop detailses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of businesssop detailses.
	*
	* @return the number of businesssop detailses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}