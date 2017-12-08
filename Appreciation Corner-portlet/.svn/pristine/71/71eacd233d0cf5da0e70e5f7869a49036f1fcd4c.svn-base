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

package com.chola.app.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.app.exception.NoSuchrepliedException;
import com.chola.app.model.replied;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the replied service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see com.chola.app.service.persistence.impl.repliedPersistenceImpl
 * @see repliedUtil
 * @generated
 */
@ProviderType
public interface repliedPersistence extends BasePersistence<replied> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link repliedUtil} to access the replied persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the replied in the entity cache if it is enabled.
	*
	* @param replied the replied
	*/
	public void cacheResult(replied replied);

	/**
	* Caches the replieds in the entity cache if it is enabled.
	*
	* @param replieds the replieds
	*/
	public void cacheResult(java.util.List<replied> replieds);

	/**
	* Creates a new replied with the primary key. Does not add the replied to the database.
	*
	* @param id the primary key for the new replied
	* @return the new replied
	*/
	public replied create(long id);

	/**
	* Removes the replied with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the replied
	* @return the replied that was removed
	* @throws NoSuchrepliedException if a replied with the primary key could not be found
	*/
	public replied remove(long id) throws NoSuchrepliedException;

	public replied updateImpl(replied replied);

	/**
	* Returns the replied with the primary key or throws a {@link NoSuchrepliedException} if it could not be found.
	*
	* @param id the primary key of the replied
	* @return the replied
	* @throws NoSuchrepliedException if a replied with the primary key could not be found
	*/
	public replied findByPrimaryKey(long id) throws NoSuchrepliedException;

	/**
	* Returns the replied with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the replied
	* @return the replied, or <code>null</code> if a replied with the primary key could not be found
	*/
	public replied fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, replied> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the replieds.
	*
	* @return the replieds
	*/
	public java.util.List<replied> findAll();

	/**
	* Returns a range of all the replieds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link repliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of replieds
	* @param end the upper bound of the range of replieds (not inclusive)
	* @return the range of replieds
	*/
	public java.util.List<replied> findAll(int start, int end);

	/**
	* Returns an ordered range of all the replieds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link repliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of replieds
	* @param end the upper bound of the range of replieds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of replieds
	*/
	public java.util.List<replied> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<replied> orderByComparator);

	/**
	* Returns an ordered range of all the replieds.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link repliedModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of replieds
	* @param end the upper bound of the range of replieds (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of replieds
	*/
	public java.util.List<replied> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<replied> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the replieds from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of replieds.
	*
	* @return the number of replieds
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}