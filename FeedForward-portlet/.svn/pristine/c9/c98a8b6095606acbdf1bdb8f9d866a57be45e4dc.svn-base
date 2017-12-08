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

package com.chola.feedforward.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.feedforward.exception.NoSuchfeedforwardgallerypathException;
import com.chola.feedforward.model.feedforwardgallerypath;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the feedforwardgallerypath service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see com.chola.feedforward.service.persistence.impl.feedforwardgallerypathPersistenceImpl
 * @see feedforwardgallerypathUtil
 * @generated
 */
@ProviderType
public interface feedforwardgallerypathPersistence extends BasePersistence<feedforwardgallerypath> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link feedforwardgallerypathUtil} to access the feedforwardgallerypath persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the feedforwardgallerypaths where albumId = &#63;.
	*
	* @param albumId the album ID
	* @return the matching feedforwardgallerypaths
	*/
	public java.util.List<feedforwardgallerypath> findByALBUM_ID(
		java.lang.String albumId);

	/**
	* Returns a range of all the feedforwardgallerypaths where albumId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param albumId the album ID
	* @param start the lower bound of the range of feedforwardgallerypaths
	* @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	* @return the range of matching feedforwardgallerypaths
	*/
	public java.util.List<feedforwardgallerypath> findByALBUM_ID(
		java.lang.String albumId, int start, int end);

	/**
	* Returns an ordered range of all the feedforwardgallerypaths where albumId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param albumId the album ID
	* @param start the lower bound of the range of feedforwardgallerypaths
	* @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedforwardgallerypaths
	*/
	public java.util.List<feedforwardgallerypath> findByALBUM_ID(
		java.lang.String albumId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgallerypath> orderByComparator);

	/**
	* Returns an ordered range of all the feedforwardgallerypaths where albumId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param albumId the album ID
	* @param start the lower bound of the range of feedforwardgallerypaths
	* @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching feedforwardgallerypaths
	*/
	public java.util.List<feedforwardgallerypath> findByALBUM_ID(
		java.lang.String albumId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgallerypath> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first feedforwardgallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedforwardgallerypath
	* @throws NoSuchfeedforwardgallerypathException if a matching feedforwardgallerypath could not be found
	*/
	public feedforwardgallerypath findByALBUM_ID_First(
		java.lang.String albumId,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgallerypath> orderByComparator)
		throws NoSuchfeedforwardgallerypathException;

	/**
	* Returns the first feedforwardgallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedforwardgallerypath, or <code>null</code> if a matching feedforwardgallerypath could not be found
	*/
	public feedforwardgallerypath fetchByALBUM_ID_First(
		java.lang.String albumId,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgallerypath> orderByComparator);

	/**
	* Returns the last feedforwardgallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedforwardgallerypath
	* @throws NoSuchfeedforwardgallerypathException if a matching feedforwardgallerypath could not be found
	*/
	public feedforwardgallerypath findByALBUM_ID_Last(
		java.lang.String albumId,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgallerypath> orderByComparator)
		throws NoSuchfeedforwardgallerypathException;

	/**
	* Returns the last feedforwardgallerypath in the ordered set where albumId = &#63;.
	*
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedforwardgallerypath, or <code>null</code> if a matching feedforwardgallerypath could not be found
	*/
	public feedforwardgallerypath fetchByALBUM_ID_Last(
		java.lang.String albumId,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgallerypath> orderByComparator);

	/**
	* Returns the feedforwardgallerypaths before and after the current feedforwardgallerypath in the ordered set where albumId = &#63;.
	*
	* @param id the primary key of the current feedforwardgallerypath
	* @param albumId the album ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedforwardgallerypath
	* @throws NoSuchfeedforwardgallerypathException if a feedforwardgallerypath with the primary key could not be found
	*/
	public feedforwardgallerypath[] findByALBUM_ID_PrevAndNext(long id,
		java.lang.String albumId,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgallerypath> orderByComparator)
		throws NoSuchfeedforwardgallerypathException;

	/**
	* Removes all the feedforwardgallerypaths where albumId = &#63; from the database.
	*
	* @param albumId the album ID
	*/
	public void removeByALBUM_ID(java.lang.String albumId);

	/**
	* Returns the number of feedforwardgallerypaths where albumId = &#63;.
	*
	* @param albumId the album ID
	* @return the number of matching feedforwardgallerypaths
	*/
	public int countByALBUM_ID(java.lang.String albumId);

	/**
	* Returns all the feedforwardgallerypaths where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching feedforwardgallerypaths
	*/
	public java.util.List<feedforwardgallerypath> findByCONTENT_ID(
		long content_id);

	/**
	* Returns a range of all the feedforwardgallerypaths where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of feedforwardgallerypaths
	* @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	* @return the range of matching feedforwardgallerypaths
	*/
	public java.util.List<feedforwardgallerypath> findByCONTENT_ID(
		long content_id, int start, int end);

	/**
	* Returns an ordered range of all the feedforwardgallerypaths where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of feedforwardgallerypaths
	* @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedforwardgallerypaths
	*/
	public java.util.List<feedforwardgallerypath> findByCONTENT_ID(
		long content_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgallerypath> orderByComparator);

	/**
	* Returns an ordered range of all the feedforwardgallerypaths where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of feedforwardgallerypaths
	* @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching feedforwardgallerypaths
	*/
	public java.util.List<feedforwardgallerypath> findByCONTENT_ID(
		long content_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgallerypath> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first feedforwardgallerypath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedforwardgallerypath
	* @throws NoSuchfeedforwardgallerypathException if a matching feedforwardgallerypath could not be found
	*/
	public feedforwardgallerypath findByCONTENT_ID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgallerypath> orderByComparator)
		throws NoSuchfeedforwardgallerypathException;

	/**
	* Returns the first feedforwardgallerypath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedforwardgallerypath, or <code>null</code> if a matching feedforwardgallerypath could not be found
	*/
	public feedforwardgallerypath fetchByCONTENT_ID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgallerypath> orderByComparator);

	/**
	* Returns the last feedforwardgallerypath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedforwardgallerypath
	* @throws NoSuchfeedforwardgallerypathException if a matching feedforwardgallerypath could not be found
	*/
	public feedforwardgallerypath findByCONTENT_ID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgallerypath> orderByComparator)
		throws NoSuchfeedforwardgallerypathException;

	/**
	* Returns the last feedforwardgallerypath in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedforwardgallerypath, or <code>null</code> if a matching feedforwardgallerypath could not be found
	*/
	public feedforwardgallerypath fetchByCONTENT_ID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgallerypath> orderByComparator);

	/**
	* Returns the feedforwardgallerypaths before and after the current feedforwardgallerypath in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current feedforwardgallerypath
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedforwardgallerypath
	* @throws NoSuchfeedforwardgallerypathException if a feedforwardgallerypath with the primary key could not be found
	*/
	public feedforwardgallerypath[] findByCONTENT_ID_PrevAndNext(long id,
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgallerypath> orderByComparator)
		throws NoSuchfeedforwardgallerypathException;

	/**
	* Removes all the feedforwardgallerypaths where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public void removeByCONTENT_ID(long content_id);

	/**
	* Returns the number of feedforwardgallerypaths where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching feedforwardgallerypaths
	*/
	public int countByCONTENT_ID(long content_id);

	/**
	* Caches the feedforwardgallerypath in the entity cache if it is enabled.
	*
	* @param feedforwardgallerypath the feedforwardgallerypath
	*/
	public void cacheResult(feedforwardgallerypath feedforwardgallerypath);

	/**
	* Caches the feedforwardgallerypaths in the entity cache if it is enabled.
	*
	* @param feedforwardgallerypaths the feedforwardgallerypaths
	*/
	public void cacheResult(
		java.util.List<feedforwardgallerypath> feedforwardgallerypaths);

	/**
	* Creates a new feedforwardgallerypath with the primary key. Does not add the feedforwardgallerypath to the database.
	*
	* @param id the primary key for the new feedforwardgallerypath
	* @return the new feedforwardgallerypath
	*/
	public feedforwardgallerypath create(long id);

	/**
	* Removes the feedforwardgallerypath with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the feedforwardgallerypath
	* @return the feedforwardgallerypath that was removed
	* @throws NoSuchfeedforwardgallerypathException if a feedforwardgallerypath with the primary key could not be found
	*/
	public feedforwardgallerypath remove(long id)
		throws NoSuchfeedforwardgallerypathException;

	public feedforwardgallerypath updateImpl(
		feedforwardgallerypath feedforwardgallerypath);

	/**
	* Returns the feedforwardgallerypath with the primary key or throws a {@link NoSuchfeedforwardgallerypathException} if it could not be found.
	*
	* @param id the primary key of the feedforwardgallerypath
	* @return the feedforwardgallerypath
	* @throws NoSuchfeedforwardgallerypathException if a feedforwardgallerypath with the primary key could not be found
	*/
	public feedforwardgallerypath findByPrimaryKey(long id)
		throws NoSuchfeedforwardgallerypathException;

	/**
	* Returns the feedforwardgallerypath with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the feedforwardgallerypath
	* @return the feedforwardgallerypath, or <code>null</code> if a feedforwardgallerypath with the primary key could not be found
	*/
	public feedforwardgallerypath fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, feedforwardgallerypath> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the feedforwardgallerypaths.
	*
	* @return the feedforwardgallerypaths
	*/
	public java.util.List<feedforwardgallerypath> findAll();

	/**
	* Returns a range of all the feedforwardgallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedforwardgallerypaths
	* @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	* @return the range of feedforwardgallerypaths
	*/
	public java.util.List<feedforwardgallerypath> findAll(int start, int end);

	/**
	* Returns an ordered range of all the feedforwardgallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedforwardgallerypaths
	* @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of feedforwardgallerypaths
	*/
	public java.util.List<feedforwardgallerypath> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgallerypath> orderByComparator);

	/**
	* Returns an ordered range of all the feedforwardgallerypaths.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgallerypathModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedforwardgallerypaths
	* @param end the upper bound of the range of feedforwardgallerypaths (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of feedforwardgallerypaths
	*/
	public java.util.List<feedforwardgallerypath> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgallerypath> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the feedforwardgallerypaths from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of feedforwardgallerypaths.
	*
	* @return the number of feedforwardgallerypaths
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}