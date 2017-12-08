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

package com.chola.videogallery.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.videogallery.exception.NoSuchvideogalleryException;
import com.chola.videogallery.model.videogallery;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the videogallery service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see com.chola.videogallery.service.persistence.impl.videogalleryPersistenceImpl
 * @see videogalleryUtil
 * @generated
 */
@ProviderType
public interface videogalleryPersistence extends BasePersistence<videogallery> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link videogalleryUtil} to access the videogallery persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the videogallery in the entity cache if it is enabled.
	*
	* @param videogallery the videogallery
	*/
	public void cacheResult(videogallery videogallery);

	/**
	* Caches the videogalleries in the entity cache if it is enabled.
	*
	* @param videogalleries the videogalleries
	*/
	public void cacheResult(java.util.List<videogallery> videogalleries);

	/**
	* Creates a new videogallery with the primary key. Does not add the videogallery to the database.
	*
	* @param id the primary key for the new videogallery
	* @return the new videogallery
	*/
	public videogallery create(long id);

	/**
	* Removes the videogallery with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the videogallery
	* @return the videogallery that was removed
	* @throws NoSuchvideogalleryException if a videogallery with the primary key could not be found
	*/
	public videogallery remove(long id) throws NoSuchvideogalleryException;

	public videogallery updateImpl(videogallery videogallery);

	/**
	* Returns the videogallery with the primary key or throws a {@link NoSuchvideogalleryException} if it could not be found.
	*
	* @param id the primary key of the videogallery
	* @return the videogallery
	* @throws NoSuchvideogalleryException if a videogallery with the primary key could not be found
	*/
	public videogallery findByPrimaryKey(long id)
		throws NoSuchvideogalleryException;

	/**
	* Returns the videogallery with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the videogallery
	* @return the videogallery, or <code>null</code> if a videogallery with the primary key could not be found
	*/
	public videogallery fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, videogallery> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the videogalleries.
	*
	* @return the videogalleries
	*/
	public java.util.List<videogallery> findAll();

	/**
	* Returns a range of all the videogalleries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link videogalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of videogalleries
	* @param end the upper bound of the range of videogalleries (not inclusive)
	* @return the range of videogalleries
	*/
	public java.util.List<videogallery> findAll(int start, int end);

	/**
	* Returns an ordered range of all the videogalleries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link videogalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of videogalleries
	* @param end the upper bound of the range of videogalleries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of videogalleries
	*/
	public java.util.List<videogallery> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<videogallery> orderByComparator);

	/**
	* Returns an ordered range of all the videogalleries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link videogalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of videogalleries
	* @param end the upper bound of the range of videogalleries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of videogalleries
	*/
	public java.util.List<videogallery> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<videogallery> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the videogalleries from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of videogalleries.
	*
	* @return the number of videogalleries
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}