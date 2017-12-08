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

import com.chola.videogallery.exception.NoSuchvideogallerypathException;
import com.chola.videogallery.model.videogallerypath;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the videogallerypath service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see com.chola.videogallery.service.persistence.impl.videogallerypathPersistenceImpl
 * @see videogallerypathUtil
 * @generated
 */
@ProviderType
public interface videogallerypathPersistence extends BasePersistence<videogallerypath> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link videogallerypathUtil} to access the videogallerypath persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the videogallerypaths where albumId = &#63;.
	*
	* @param albumId the album ID
	* @return the matching videogallerypaths
	*/
	public java.util.List<videogallerypath> findByALBUMID(
		java.lang.String albumId);

	/**
	* Returns a range of all the videogallerypaths where albumId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link videogallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param albumId the album ID
	* @param start the lower bound of the range of videogallerypaths
	* @param end the upper bound of the range of videogallerypaths (not inclusive)
	* @return the range of matching videogallerypaths
	*/
	public java.util.List<videogallerypath> findByALBUMID(
		java.lang.String albumId, int start, int end);

	/**
	* Returns an ordered range of all the videogallerypaths where albumId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link videogallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param albumId the album ID
	* @param start the lower bound of the range of videogallerypaths
	* @param end the upper bound of the range of videogallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching videogallerypaths
	*/
	public java.util.List<videogallerypath> findByALBUMID(
		java.lang.String albumId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<videogallerypath> orderByComparator);

	/**
	* Returns an ordered range of all the videogallerypaths where albumId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link videogallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param albumId the album ID
	* @param start the lower bound of the range of videogallerypaths
	* @param end the upper bound of the range of videogallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching videogallerypaths
	*/
	public java.util.List<videogallerypath> findByALBUMID(
		java.lang.String albumId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<videogallerypath> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first videogallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching videogallerypath
	* @throws NoSuchvideogallerypathException if a matching videogallerypath could not be found
	*/
	public videogallerypath findByALBUMID_First(java.lang.String albumId,
		com.liferay.portal.kernel.util.OrderByComparator<videogallerypath> orderByComparator)
		throws NoSuchvideogallerypathException;

	/**
	* Returns the first videogallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching videogallerypath, or <code>null</code> if a matching videogallerypath could not be found
	*/
	public videogallerypath fetchByALBUMID_First(java.lang.String albumId,
		com.liferay.portal.kernel.util.OrderByComparator<videogallerypath> orderByComparator);

	/**
	* Returns the last videogallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching videogallerypath
	* @throws NoSuchvideogallerypathException if a matching videogallerypath could not be found
	*/
	public videogallerypath findByALBUMID_Last(java.lang.String albumId,
		com.liferay.portal.kernel.util.OrderByComparator<videogallerypath> orderByComparator)
		throws NoSuchvideogallerypathException;

	/**
	* Returns the last videogallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching videogallerypath, or <code>null</code> if a matching videogallerypath could not be found
	*/
	public videogallerypath fetchByALBUMID_Last(java.lang.String albumId,
		com.liferay.portal.kernel.util.OrderByComparator<videogallerypath> orderByComparator);

	/**
	* Returns the videogallerypaths before and after the current videogallerypath in the ordered set where albumId = &#63;.
	*
	* @param id the primary key of the current videogallerypath
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next videogallerypath
	* @throws NoSuchvideogallerypathException if a videogallerypath with the primary key could not be found
	*/
	public videogallerypath[] findByALBUMID_PrevAndNext(long id,
		java.lang.String albumId,
		com.liferay.portal.kernel.util.OrderByComparator<videogallerypath> orderByComparator)
		throws NoSuchvideogallerypathException;

	/**
	* Removes all the videogallerypaths where albumId = &#63; from the database.
	*
	* @param albumId the album ID
	*/
	public void removeByALBUMID(java.lang.String albumId);

	/**
	* Returns the number of videogallerypaths where albumId = &#63;.
	*
	* @param albumId the album ID
	* @return the number of matching videogallerypaths
	*/
	public int countByALBUMID(java.lang.String albumId);

	/**
	* Caches the videogallerypath in the entity cache if it is enabled.
	*
	* @param videogallerypath the videogallerypath
	*/
	public void cacheResult(videogallerypath videogallerypath);

	/**
	* Caches the videogallerypaths in the entity cache if it is enabled.
	*
	* @param videogallerypaths the videogallerypaths
	*/
	public void cacheResult(java.util.List<videogallerypath> videogallerypaths);

	/**
	* Creates a new videogallerypath with the primary key. Does not add the videogallerypath to the database.
	*
	* @param id the primary key for the new videogallerypath
	* @return the new videogallerypath
	*/
	public videogallerypath create(long id);

	/**
	* Removes the videogallerypath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the videogallerypath
	* @return the videogallerypath that was removed
	* @throws NoSuchvideogallerypathException if a videogallerypath with the primary key could not be found
	*/
	public videogallerypath remove(long id)
		throws NoSuchvideogallerypathException;

	public videogallerypath updateImpl(videogallerypath videogallerypath);

	/**
	* Returns the videogallerypath with the primary key or throws a {@link NoSuchvideogallerypathException} if it could not be found.
	*
	* @param id the primary key of the videogallerypath
	* @return the videogallerypath
	* @throws NoSuchvideogallerypathException if a videogallerypath with the primary key could not be found
	*/
	public videogallerypath findByPrimaryKey(long id)
		throws NoSuchvideogallerypathException;

	/**
	* Returns the videogallerypath with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the videogallerypath
	* @return the videogallerypath, or <code>null</code> if a videogallerypath with the primary key could not be found
	*/
	public videogallerypath fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, videogallerypath> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the videogallerypaths.
	*
	* @return the videogallerypaths
	*/
	public java.util.List<videogallerypath> findAll();

	/**
	* Returns a range of all the videogallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link videogallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of videogallerypaths
	* @param end the upper bound of the range of videogallerypaths (not inclusive)
	* @return the range of videogallerypaths
	*/
	public java.util.List<videogallerypath> findAll(int start, int end);

	/**
	* Returns an ordered range of all the videogallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link videogallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of videogallerypaths
	* @param end the upper bound of the range of videogallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of videogallerypaths
	*/
	public java.util.List<videogallerypath> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<videogallerypath> orderByComparator);

	/**
	* Returns an ordered range of all the videogallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link videogallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of videogallerypaths
	* @param end the upper bound of the range of videogallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of videogallerypaths
	*/
	public java.util.List<videogallerypath> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<videogallerypath> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the videogallerypaths from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of videogallerypaths.
	*
	* @return the number of videogallerypaths
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}