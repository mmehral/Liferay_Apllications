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

import com.chola.imagegallery.exception.NoSuchimagegallerypathException;
import com.chola.imagegallery.model.imagegallerypath;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the imagegallerypath service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see com.chola.imagegallery.service.persistence.impl.imagegallerypathPersistenceImpl
 * @see imagegallerypathUtil
 * @generated
 */
@ProviderType
public interface imagegallerypathPersistence extends BasePersistence<imagegallerypath> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link imagegallerypathUtil} to access the imagegallerypath persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the imagegallerypaths where albumId = &#63;.
	*
	* @param albumId the album ID
	* @return the matching imagegallerypaths
	*/
	public java.util.List<imagegallerypath> findByALBUM_ID(
		java.lang.String albumId);

	/**
	* Returns a range of all the imagegallerypaths where albumId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link imagegallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param albumId the album ID
	* @param start the lower bound of the range of imagegallerypaths
	* @param end the upper bound of the range of imagegallerypaths (not inclusive)
	* @return the range of matching imagegallerypaths
	*/
	public java.util.List<imagegallerypath> findByALBUM_ID(
		java.lang.String albumId, int start, int end);

	/**
	* Returns an ordered range of all the imagegallerypaths where albumId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link imagegallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param albumId the album ID
	* @param start the lower bound of the range of imagegallerypaths
	* @param end the upper bound of the range of imagegallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching imagegallerypaths
	*/
	public java.util.List<imagegallerypath> findByALBUM_ID(
		java.lang.String albumId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<imagegallerypath> orderByComparator);

	/**
	* Returns an ordered range of all the imagegallerypaths where albumId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link imagegallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param albumId the album ID
	* @param start the lower bound of the range of imagegallerypaths
	* @param end the upper bound of the range of imagegallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching imagegallerypaths
	*/
	public java.util.List<imagegallerypath> findByALBUM_ID(
		java.lang.String albumId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<imagegallerypath> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first imagegallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imagegallerypath
	* @throws NoSuchimagegallerypathException if a matching imagegallerypath could not be found
	*/
	public imagegallerypath findByALBUM_ID_First(java.lang.String albumId,
		com.liferay.portal.kernel.util.OrderByComparator<imagegallerypath> orderByComparator)
		throws NoSuchimagegallerypathException;

	/**
	* Returns the first imagegallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching imagegallerypath, or <code>null</code> if a matching imagegallerypath could not be found
	*/
	public imagegallerypath fetchByALBUM_ID_First(java.lang.String albumId,
		com.liferay.portal.kernel.util.OrderByComparator<imagegallerypath> orderByComparator);

	/**
	* Returns the last imagegallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imagegallerypath
	* @throws NoSuchimagegallerypathException if a matching imagegallerypath could not be found
	*/
	public imagegallerypath findByALBUM_ID_Last(java.lang.String albumId,
		com.liferay.portal.kernel.util.OrderByComparator<imagegallerypath> orderByComparator)
		throws NoSuchimagegallerypathException;

	/**
	* Returns the last imagegallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching imagegallerypath, or <code>null</code> if a matching imagegallerypath could not be found
	*/
	public imagegallerypath fetchByALBUM_ID_Last(java.lang.String albumId,
		com.liferay.portal.kernel.util.OrderByComparator<imagegallerypath> orderByComparator);

	/**
	* Returns the imagegallerypaths before and after the current imagegallerypath in the ordered set where albumId = &#63;.
	*
	* @param id the primary key of the current imagegallerypath
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next imagegallerypath
	* @throws NoSuchimagegallerypathException if a imagegallerypath with the primary key could not be found
	*/
	public imagegallerypath[] findByALBUM_ID_PrevAndNext(long id,
		java.lang.String albumId,
		com.liferay.portal.kernel.util.OrderByComparator<imagegallerypath> orderByComparator)
		throws NoSuchimagegallerypathException;

	/**
	* Removes all the imagegallerypaths where albumId = &#63; from the database.
	*
	* @param albumId the album ID
	*/
	public void removeByALBUM_ID(java.lang.String albumId);

	/**
	* Returns the number of imagegallerypaths where albumId = &#63;.
	*
	* @param albumId the album ID
	* @return the number of matching imagegallerypaths
	*/
	public int countByALBUM_ID(java.lang.String albumId);

	/**
	* Caches the imagegallerypath in the entity cache if it is enabled.
	*
	* @param imagegallerypath the imagegallerypath
	*/
	public void cacheResult(imagegallerypath imagegallerypath);

	/**
	* Caches the imagegallerypaths in the entity cache if it is enabled.
	*
	* @param imagegallerypaths the imagegallerypaths
	*/
	public void cacheResult(java.util.List<imagegallerypath> imagegallerypaths);

	/**
	* Creates a new imagegallerypath with the primary key. Does not add the imagegallerypath to the database.
	*
	* @param id the primary key for the new imagegallerypath
	* @return the new imagegallerypath
	*/
	public imagegallerypath create(long id);

	/**
	* Removes the imagegallerypath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the imagegallerypath
	* @return the imagegallerypath that was removed
	* @throws NoSuchimagegallerypathException if a imagegallerypath with the primary key could not be found
	*/
	public imagegallerypath remove(long id)
		throws NoSuchimagegallerypathException;

	public imagegallerypath updateImpl(imagegallerypath imagegallerypath);

	/**
	* Returns the imagegallerypath with the primary key or throws a {@link NoSuchimagegallerypathException} if it could not be found.
	*
	* @param id the primary key of the imagegallerypath
	* @return the imagegallerypath
	* @throws NoSuchimagegallerypathException if a imagegallerypath with the primary key could not be found
	*/
	public imagegallerypath findByPrimaryKey(long id)
		throws NoSuchimagegallerypathException;

	/**
	* Returns the imagegallerypath with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the imagegallerypath
	* @return the imagegallerypath, or <code>null</code> if a imagegallerypath with the primary key could not be found
	*/
	public imagegallerypath fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, imagegallerypath> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the imagegallerypaths.
	*
	* @return the imagegallerypaths
	*/
	public java.util.List<imagegallerypath> findAll();

	/**
	* Returns a range of all the imagegallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link imagegallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of imagegallerypaths
	* @param end the upper bound of the range of imagegallerypaths (not inclusive)
	* @return the range of imagegallerypaths
	*/
	public java.util.List<imagegallerypath> findAll(int start, int end);

	/**
	* Returns an ordered range of all the imagegallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link imagegallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of imagegallerypaths
	* @param end the upper bound of the range of imagegallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of imagegallerypaths
	*/
	public java.util.List<imagegallerypath> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<imagegallerypath> orderByComparator);

	/**
	* Returns an ordered range of all the imagegallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link imagegallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of imagegallerypaths
	* @param end the upper bound of the range of imagegallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of imagegallerypaths
	*/
	public java.util.List<imagegallerypath> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<imagegallerypath> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the imagegallerypaths from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of imagegallerypaths.
	*
	* @return the number of imagegallerypaths
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}