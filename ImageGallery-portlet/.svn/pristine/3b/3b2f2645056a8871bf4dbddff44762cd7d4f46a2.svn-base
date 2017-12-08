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

package com.chola.imagegallery.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.imagegallery.exception.NoSuchimagegalleryException;
import com.chola.imagegallery.model.imagegallery;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the imagegallery service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see com.chola.imagegallery.service.persistence.impl.imagegalleryPersistenceImpl
 * @see imagegalleryUtil
 * @generated
 */
@ProviderType
public interface imagegalleryPersistence extends BasePersistence<imagegallery> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link imagegalleryUtil} to access the imagegallery persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the imagegallery in the entity cache if it is enabled.
	*
	* @param imagegallery the imagegallery
	*/
	public void cacheResult(imagegallery imagegallery);

	/**
	* Caches the imagegalleries in the entity cache if it is enabled.
	*
	* @param imagegalleries the imagegalleries
	*/
	public void cacheResult(java.util.List<imagegallery> imagegalleries);

	/**
	* Creates a new imagegallery with the primary key. Does not add the imagegallery to the database.
	*
	* @param id the primary key for the new imagegallery
	* @return the new imagegallery
	*/
	public imagegallery create(long id);

	/**
	* Removes the imagegallery with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the imagegallery
	* @return the imagegallery that was removed
	* @throws NoSuchimagegalleryException if a imagegallery with the primary key could not be found
	*/
	public imagegallery remove(long id) throws NoSuchimagegalleryException;

	public imagegallery updateImpl(imagegallery imagegallery);

	/**
	* Returns the imagegallery with the primary key or throws a {@link NoSuchimagegalleryException} if it could not be found.
	*
	* @param id the primary key of the imagegallery
	* @return the imagegallery
	* @throws NoSuchimagegalleryException if a imagegallery with the primary key could not be found
	*/
	public imagegallery findByPrimaryKey(long id)
		throws NoSuchimagegalleryException;

	/**
	* Returns the imagegallery with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the imagegallery
	* @return the imagegallery, or <code>null</code> if a imagegallery with the primary key could not be found
	*/
	public imagegallery fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, imagegallery> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the imagegalleries.
	*
	* @return the imagegalleries
	*/
	public java.util.List<imagegallery> findAll();

	/**
	* Returns a range of all the imagegalleries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link imagegalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of imagegalleries
	* @param end the upper bound of the range of imagegalleries (not inclusive)
	* @return the range of imagegalleries
	*/
	public java.util.List<imagegallery> findAll(int start, int end);

	/**
	* Returns an ordered range of all the imagegalleries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link imagegalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of imagegalleries
	* @param end the upper bound of the range of imagegalleries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of imagegalleries
	*/
	public java.util.List<imagegallery> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<imagegallery> orderByComparator);

	/**
	* Returns an ordered range of all the imagegalleries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link imagegalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of imagegalleries
	* @param end the upper bound of the range of imagegalleries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of imagegalleries
	*/
	public java.util.List<imagegallery> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<imagegallery> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the imagegalleries from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of imagegalleries.
	*
	* @return the number of imagegalleries
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}