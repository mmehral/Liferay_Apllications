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

import com.chola.feedforward.exception.NoSuchfeedforwardgalleryException;
import com.chola.feedforward.model.feedforwardgallery;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the feedforwardgallery service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see com.chola.feedforward.service.persistence.impl.feedforwardgalleryPersistenceImpl
 * @see feedforwardgalleryUtil
 * @generated
 */
@ProviderType
public interface feedforwardgalleryPersistence extends BasePersistence<feedforwardgallery> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link feedforwardgalleryUtil} to access the feedforwardgallery persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the feedforwardgalleries where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching feedforwardgalleries
	*/
	public java.util.List<feedforwardgallery> findByCONTENT_ID(long content_id);

	/**
	* Returns a range of all the feedforwardgalleries where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of feedforwardgalleries
	* @param end the upper bound of the range of feedforwardgalleries (not inclusive)
	* @return the range of matching feedforwardgalleries
	*/
	public java.util.List<feedforwardgallery> findByCONTENT_ID(
		long content_id, int start, int end);

	/**
	* Returns an ordered range of all the feedforwardgalleries where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of feedforwardgalleries
	* @param end the upper bound of the range of feedforwardgalleries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedforwardgalleries
	*/
	public java.util.List<feedforwardgallery> findByCONTENT_ID(
		long content_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgallery> orderByComparator);

	/**
	* Returns an ordered range of all the feedforwardgalleries where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of feedforwardgalleries
	* @param end the upper bound of the range of feedforwardgalleries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching feedforwardgalleries
	*/
	public java.util.List<feedforwardgallery> findByCONTENT_ID(
		long content_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgallery> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first feedforwardgallery in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedforwardgallery
	* @throws NoSuchfeedforwardgalleryException if a matching feedforwardgallery could not be found
	*/
	public feedforwardgallery findByCONTENT_ID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgallery> orderByComparator)
		throws NoSuchfeedforwardgalleryException;

	/**
	* Returns the first feedforwardgallery in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedforwardgallery, or <code>null</code> if a matching feedforwardgallery could not be found
	*/
	public feedforwardgallery fetchByCONTENT_ID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgallery> orderByComparator);

	/**
	* Returns the last feedforwardgallery in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedforwardgallery
	* @throws NoSuchfeedforwardgalleryException if a matching feedforwardgallery could not be found
	*/
	public feedforwardgallery findByCONTENT_ID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgallery> orderByComparator)
		throws NoSuchfeedforwardgalleryException;

	/**
	* Returns the last feedforwardgallery in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedforwardgallery, or <code>null</code> if a matching feedforwardgallery could not be found
	*/
	public feedforwardgallery fetchByCONTENT_ID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgallery> orderByComparator);

	/**
	* Returns the feedforwardgalleries before and after the current feedforwardgallery in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current feedforwardgallery
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedforwardgallery
	* @throws NoSuchfeedforwardgalleryException if a feedforwardgallery with the primary key could not be found
	*/
	public feedforwardgallery[] findByCONTENT_ID_PrevAndNext(long id,
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgallery> orderByComparator)
		throws NoSuchfeedforwardgalleryException;

	/**
	* Removes all the feedforwardgalleries where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public void removeByCONTENT_ID(long content_id);

	/**
	* Returns the number of feedforwardgalleries where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching feedforwardgalleries
	*/
	public int countByCONTENT_ID(long content_id);

	/**
	* Caches the feedforwardgallery in the entity cache if it is enabled.
	*
	* @param feedforwardgallery the feedforwardgallery
	*/
	public void cacheResult(feedforwardgallery feedforwardgallery);

	/**
	* Caches the feedforwardgalleries in the entity cache if it is enabled.
	*
	* @param feedforwardgalleries the feedforwardgalleries
	*/
	public void cacheResult(
		java.util.List<feedforwardgallery> feedforwardgalleries);

	/**
	* Creates a new feedforwardgallery with the primary key. Does not add the feedforwardgallery to the database.
	*
	* @param id the primary key for the new feedforwardgallery
	* @return the new feedforwardgallery
	*/
	public feedforwardgallery create(long id);

	/**
	* Removes the feedforwardgallery with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the feedforwardgallery
	* @return the feedforwardgallery that was removed
	* @throws NoSuchfeedforwardgalleryException if a feedforwardgallery with the primary key could not be found
	*/
	public feedforwardgallery remove(long id)
		throws NoSuchfeedforwardgalleryException;

	public feedforwardgallery updateImpl(feedforwardgallery feedforwardgallery);

	/**
	* Returns the feedforwardgallery with the primary key or throws a {@link NoSuchfeedforwardgalleryException} if it could not be found.
	*
	* @param id the primary key of the feedforwardgallery
	* @return the feedforwardgallery
	* @throws NoSuchfeedforwardgalleryException if a feedforwardgallery with the primary key could not be found
	*/
	public feedforwardgallery findByPrimaryKey(long id)
		throws NoSuchfeedforwardgalleryException;

	/**
	* Returns the feedforwardgallery with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the feedforwardgallery
	* @return the feedforwardgallery, or <code>null</code> if a feedforwardgallery with the primary key could not be found
	*/
	public feedforwardgallery fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, feedforwardgallery> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the feedforwardgalleries.
	*
	* @return the feedforwardgalleries
	*/
	public java.util.List<feedforwardgallery> findAll();

	/**
	* Returns a range of all the feedforwardgalleries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedforwardgalleries
	* @param end the upper bound of the range of feedforwardgalleries (not inclusive)
	* @return the range of feedforwardgalleries
	*/
	public java.util.List<feedforwardgallery> findAll(int start, int end);

	/**
	* Returns an ordered range of all the feedforwardgalleries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedforwardgalleries
	* @param end the upper bound of the range of feedforwardgalleries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of feedforwardgalleries
	*/
	public java.util.List<feedforwardgallery> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgallery> orderByComparator);

	/**
	* Returns an ordered range of all the feedforwardgalleries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedforwardgalleries
	* @param end the upper bound of the range of feedforwardgalleries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of feedforwardgalleries
	*/
	public java.util.List<feedforwardgallery> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgallery> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the feedforwardgalleries from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of feedforwardgalleries.
	*
	* @return the number of feedforwardgalleries
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}