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

package com.chola.shutterspeed.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.shutterspeed.exception.NoSuchshutterspeedgallerypathException;
import com.chola.shutterspeed.model.shutterspeedgallerypath;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the shutterspeedgallerypath service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see com.chola.shutterspeed.service.persistence.impl.shutterspeedgallerypathPersistenceImpl
 * @see shutterspeedgallerypathUtil
 * @generated
 */
@ProviderType
public interface shutterspeedgallerypathPersistence extends BasePersistence<shutterspeedgallerypath> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link shutterspeedgallerypathUtil} to access the shutterspeedgallerypath persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the shutterspeedgallerypaths where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching shutterspeedgallerypaths
	*/
	public java.util.List<shutterspeedgallerypath> findByCONTENT_ID(
		long content_id);

	/**
	* Returns a range of all the shutterspeedgallerypaths where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of shutterspeedgallerypaths
	* @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	* @return the range of matching shutterspeedgallerypaths
	*/
	public java.util.List<shutterspeedgallerypath> findByCONTENT_ID(
		long content_id, int start, int end);

	/**
	* Returns an ordered range of all the shutterspeedgallerypaths where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of shutterspeedgallerypaths
	* @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching shutterspeedgallerypaths
	*/
	public java.util.List<shutterspeedgallerypath> findByCONTENT_ID(
		long content_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<shutterspeedgallerypath> orderByComparator);

	/**
	* Returns an ordered range of all the shutterspeedgallerypaths where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of shutterspeedgallerypaths
	* @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching shutterspeedgallerypaths
	*/
	public java.util.List<shutterspeedgallerypath> findByCONTENT_ID(
		long content_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<shutterspeedgallerypath> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first shutterspeedgallerypath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching shutterspeedgallerypath
	* @throws NoSuchshutterspeedgallerypathException if a matching shutterspeedgallerypath could not be found
	*/
	public shutterspeedgallerypath findByCONTENT_ID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<shutterspeedgallerypath> orderByComparator)
		throws NoSuchshutterspeedgallerypathException;

	/**
	* Returns the first shutterspeedgallerypath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching shutterspeedgallerypath, or <code>null</code> if a matching shutterspeedgallerypath could not be found
	*/
	public shutterspeedgallerypath fetchByCONTENT_ID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<shutterspeedgallerypath> orderByComparator);

	/**
	* Returns the last shutterspeedgallerypath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching shutterspeedgallerypath
	* @throws NoSuchshutterspeedgallerypathException if a matching shutterspeedgallerypath could not be found
	*/
	public shutterspeedgallerypath findByCONTENT_ID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<shutterspeedgallerypath> orderByComparator)
		throws NoSuchshutterspeedgallerypathException;

	/**
	* Returns the last shutterspeedgallerypath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching shutterspeedgallerypath, or <code>null</code> if a matching shutterspeedgallerypath could not be found
	*/
	public shutterspeedgallerypath fetchByCONTENT_ID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<shutterspeedgallerypath> orderByComparator);

	/**
	* Returns the shutterspeedgallerypaths before and after the current shutterspeedgallerypath in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current shutterspeedgallerypath
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next shutterspeedgallerypath
	* @throws NoSuchshutterspeedgallerypathException if a shutterspeedgallerypath with the primary key could not be found
	*/
	public shutterspeedgallerypath[] findByCONTENT_ID_PrevAndNext(long id,
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<shutterspeedgallerypath> orderByComparator)
		throws NoSuchshutterspeedgallerypathException;

	/**
	* Removes all the shutterspeedgallerypaths where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public void removeByCONTENT_ID(long content_id);

	/**
	* Returns the number of shutterspeedgallerypaths where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching shutterspeedgallerypaths
	*/
	public int countByCONTENT_ID(long content_id);

	/**
	* Returns all the shutterspeedgallerypaths where albumId = &#63;.
	*
	* @param albumId the album ID
	* @return the matching shutterspeedgallerypaths
	*/
	public java.util.List<shutterspeedgallerypath> findByALBUM_ID(
		java.lang.String albumId);

	/**
	* Returns a range of all the shutterspeedgallerypaths where albumId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param albumId the album ID
	* @param start the lower bound of the range of shutterspeedgallerypaths
	* @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	* @return the range of matching shutterspeedgallerypaths
	*/
	public java.util.List<shutterspeedgallerypath> findByALBUM_ID(
		java.lang.String albumId, int start, int end);

	/**
	* Returns an ordered range of all the shutterspeedgallerypaths where albumId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param albumId the album ID
	* @param start the lower bound of the range of shutterspeedgallerypaths
	* @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching shutterspeedgallerypaths
	*/
	public java.util.List<shutterspeedgallerypath> findByALBUM_ID(
		java.lang.String albumId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<shutterspeedgallerypath> orderByComparator);

	/**
	* Returns an ordered range of all the shutterspeedgallerypaths where albumId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param albumId the album ID
	* @param start the lower bound of the range of shutterspeedgallerypaths
	* @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching shutterspeedgallerypaths
	*/
	public java.util.List<shutterspeedgallerypath> findByALBUM_ID(
		java.lang.String albumId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<shutterspeedgallerypath> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first shutterspeedgallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching shutterspeedgallerypath
	* @throws NoSuchshutterspeedgallerypathException if a matching shutterspeedgallerypath could not be found
	*/
	public shutterspeedgallerypath findByALBUM_ID_First(
		java.lang.String albumId,
		com.liferay.portal.kernel.util.OrderByComparator<shutterspeedgallerypath> orderByComparator)
		throws NoSuchshutterspeedgallerypathException;

	/**
	* Returns the first shutterspeedgallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching shutterspeedgallerypath, or <code>null</code> if a matching shutterspeedgallerypath could not be found
	*/
	public shutterspeedgallerypath fetchByALBUM_ID_First(
		java.lang.String albumId,
		com.liferay.portal.kernel.util.OrderByComparator<shutterspeedgallerypath> orderByComparator);

	/**
	* Returns the last shutterspeedgallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching shutterspeedgallerypath
	* @throws NoSuchshutterspeedgallerypathException if a matching shutterspeedgallerypath could not be found
	*/
	public shutterspeedgallerypath findByALBUM_ID_Last(
		java.lang.String albumId,
		com.liferay.portal.kernel.util.OrderByComparator<shutterspeedgallerypath> orderByComparator)
		throws NoSuchshutterspeedgallerypathException;

	/**
	* Returns the last shutterspeedgallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching shutterspeedgallerypath, or <code>null</code> if a matching shutterspeedgallerypath could not be found
	*/
	public shutterspeedgallerypath fetchByALBUM_ID_Last(
		java.lang.String albumId,
		com.liferay.portal.kernel.util.OrderByComparator<shutterspeedgallerypath> orderByComparator);

	/**
	* Returns the shutterspeedgallerypaths before and after the current shutterspeedgallerypath in the ordered set where albumId = &#63;.
	*
	* @param id the primary key of the current shutterspeedgallerypath
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next shutterspeedgallerypath
	* @throws NoSuchshutterspeedgallerypathException if a shutterspeedgallerypath with the primary key could not be found
	*/
	public shutterspeedgallerypath[] findByALBUM_ID_PrevAndNext(long id,
		java.lang.String albumId,
		com.liferay.portal.kernel.util.OrderByComparator<shutterspeedgallerypath> orderByComparator)
		throws NoSuchshutterspeedgallerypathException;

	/**
	* Removes all the shutterspeedgallerypaths where albumId = &#63; from the database.
	*
	* @param albumId the album ID
	*/
	public void removeByALBUM_ID(java.lang.String albumId);

	/**
	* Returns the number of shutterspeedgallerypaths where albumId = &#63;.
	*
	* @param albumId the album ID
	* @return the number of matching shutterspeedgallerypaths
	*/
	public int countByALBUM_ID(java.lang.String albumId);

	/**
	* Caches the shutterspeedgallerypath in the entity cache if it is enabled.
	*
	* @param shutterspeedgallerypath the shutterspeedgallerypath
	*/
	public void cacheResult(shutterspeedgallerypath shutterspeedgallerypath);

	/**
	* Caches the shutterspeedgallerypaths in the entity cache if it is enabled.
	*
	* @param shutterspeedgallerypaths the shutterspeedgallerypaths
	*/
	public void cacheResult(
		java.util.List<shutterspeedgallerypath> shutterspeedgallerypaths);

	/**
	* Creates a new shutterspeedgallerypath with the primary key. Does not add the shutterspeedgallerypath to the database.
	*
	* @param id the primary key for the new shutterspeedgallerypath
	* @return the new shutterspeedgallerypath
	*/
	public shutterspeedgallerypath create(long id);

	/**
	* Removes the shutterspeedgallerypath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the shutterspeedgallerypath
	* @return the shutterspeedgallerypath that was removed
	* @throws NoSuchshutterspeedgallerypathException if a shutterspeedgallerypath with the primary key could not be found
	*/
	public shutterspeedgallerypath remove(long id)
		throws NoSuchshutterspeedgallerypathException;

	public shutterspeedgallerypath updateImpl(
		shutterspeedgallerypath shutterspeedgallerypath);

	/**
	* Returns the shutterspeedgallerypath with the primary key or throws a {@link NoSuchshutterspeedgallerypathException} if it could not be found.
	*
	* @param id the primary key of the shutterspeedgallerypath
	* @return the shutterspeedgallerypath
	* @throws NoSuchshutterspeedgallerypathException if a shutterspeedgallerypath with the primary key could not be found
	*/
	public shutterspeedgallerypath findByPrimaryKey(long id)
		throws NoSuchshutterspeedgallerypathException;

	/**
	* Returns the shutterspeedgallerypath with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the shutterspeedgallerypath
	* @return the shutterspeedgallerypath, or <code>null</code> if a shutterspeedgallerypath with the primary key could not be found
	*/
	public shutterspeedgallerypath fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, shutterspeedgallerypath> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the shutterspeedgallerypaths.
	*
	* @return the shutterspeedgallerypaths
	*/
	public java.util.List<shutterspeedgallerypath> findAll();

	/**
	* Returns a range of all the shutterspeedgallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shutterspeedgallerypaths
	* @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	* @return the range of shutterspeedgallerypaths
	*/
	public java.util.List<shutterspeedgallerypath> findAll(int start, int end);

	/**
	* Returns an ordered range of all the shutterspeedgallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shutterspeedgallerypaths
	* @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of shutterspeedgallerypaths
	*/
	public java.util.List<shutterspeedgallerypath> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<shutterspeedgallerypath> orderByComparator);

	/**
	* Returns an ordered range of all the shutterspeedgallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link shutterspeedgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shutterspeedgallerypaths
	* @param end the upper bound of the range of shutterspeedgallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of shutterspeedgallerypaths
	*/
	public java.util.List<shutterspeedgallerypath> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<shutterspeedgallerypath> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the shutterspeedgallerypaths from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of shutterspeedgallerypaths.
	*
	* @return the number of shutterspeedgallerypaths
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}