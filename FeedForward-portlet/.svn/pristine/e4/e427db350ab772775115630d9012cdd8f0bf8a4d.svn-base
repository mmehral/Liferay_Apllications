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

import com.chola.feedforward.exception.NoSuchfeedforwardgalleryusersException;
import com.chola.feedforward.model.feedforwardgalleryusers;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the feedforwardgalleryusers service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see com.chola.feedforward.service.persistence.impl.feedforwardgalleryusersPersistenceImpl
 * @see feedforwardgalleryusersUtil
 * @generated
 */
@ProviderType
public interface feedforwardgalleryusersPersistence extends BasePersistence<feedforwardgalleryusers> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link feedforwardgalleryusersUtil} to access the feedforwardgalleryusers persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the feedforwardgalleryuserses where album_id = &#63;.
	*
	* @param album_id the album_id
	* @return the matching feedforwardgalleryuserses
	*/
	public java.util.List<feedforwardgalleryusers> findByALBUM_ID(long album_id);

	/**
	* Returns a range of all the feedforwardgalleryuserses where album_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param album_id the album_id
	* @param start the lower bound of the range of feedforwardgalleryuserses
	* @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	* @return the range of matching feedforwardgalleryuserses
	*/
	public java.util.List<feedforwardgalleryusers> findByALBUM_ID(
		long album_id, int start, int end);

	/**
	* Returns an ordered range of all the feedforwardgalleryuserses where album_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param album_id the album_id
	* @param start the lower bound of the range of feedforwardgalleryuserses
	* @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedforwardgalleryuserses
	*/
	public java.util.List<feedforwardgalleryusers> findByALBUM_ID(
		long album_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgalleryusers> orderByComparator);

	/**
	* Returns an ordered range of all the feedforwardgalleryuserses where album_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param album_id the album_id
	* @param start the lower bound of the range of feedforwardgalleryuserses
	* @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching feedforwardgalleryuserses
	*/
	public java.util.List<feedforwardgalleryusers> findByALBUM_ID(
		long album_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgalleryusers> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first feedforwardgalleryusers in the ordered set where album_id = &#63;.
	*
	* @param album_id the album_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedforwardgalleryusers
	* @throws NoSuchfeedforwardgalleryusersException if a matching feedforwardgalleryusers could not be found
	*/
	public feedforwardgalleryusers findByALBUM_ID_First(long album_id,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgalleryusers> orderByComparator)
		throws NoSuchfeedforwardgalleryusersException;

	/**
	* Returns the first feedforwardgalleryusers in the ordered set where album_id = &#63;.
	*
	* @param album_id the album_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedforwardgalleryusers, or <code>null</code> if a matching feedforwardgalleryusers could not be found
	*/
	public feedforwardgalleryusers fetchByALBUM_ID_First(long album_id,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgalleryusers> orderByComparator);

	/**
	* Returns the last feedforwardgalleryusers in the ordered set where album_id = &#63;.
	*
	* @param album_id the album_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedforwardgalleryusers
	* @throws NoSuchfeedforwardgalleryusersException if a matching feedforwardgalleryusers could not be found
	*/
	public feedforwardgalleryusers findByALBUM_ID_Last(long album_id,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgalleryusers> orderByComparator)
		throws NoSuchfeedforwardgalleryusersException;

	/**
	* Returns the last feedforwardgalleryusers in the ordered set where album_id = &#63;.
	*
	* @param album_id the album_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedforwardgalleryusers, or <code>null</code> if a matching feedforwardgalleryusers could not be found
	*/
	public feedforwardgalleryusers fetchByALBUM_ID_Last(long album_id,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgalleryusers> orderByComparator);

	/**
	* Returns the feedforwardgalleryuserses before and after the current feedforwardgalleryusers in the ordered set where album_id = &#63;.
	*
	* @param id the primary key of the current feedforwardgalleryusers
	* @param album_id the album_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedforwardgalleryusers
	* @throws NoSuchfeedforwardgalleryusersException if a feedforwardgalleryusers with the primary key could not be found
	*/
	public feedforwardgalleryusers[] findByALBUM_ID_PrevAndNext(long id,
		long album_id,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgalleryusers> orderByComparator)
		throws NoSuchfeedforwardgalleryusersException;

	/**
	* Removes all the feedforwardgalleryuserses where album_id = &#63; from the database.
	*
	* @param album_id the album_id
	*/
	public void removeByALBUM_ID(long album_id);

	/**
	* Returns the number of feedforwardgalleryuserses where album_id = &#63;.
	*
	* @param album_id the album_id
	* @return the number of matching feedforwardgalleryuserses
	*/
	public int countByALBUM_ID(long album_id);

	/**
	* Returns all the feedforwardgalleryuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the matching feedforwardgalleryuserses
	*/
	public java.util.List<feedforwardgalleryusers> findByUSER_ID(long user_id);

	/**
	* Returns a range of all the feedforwardgalleryuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of feedforwardgalleryuserses
	* @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	* @return the range of matching feedforwardgalleryuserses
	*/
	public java.util.List<feedforwardgalleryusers> findByUSER_ID(long user_id,
		int start, int end);

	/**
	* Returns an ordered range of all the feedforwardgalleryuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of feedforwardgalleryuserses
	* @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedforwardgalleryuserses
	*/
	public java.util.List<feedforwardgalleryusers> findByUSER_ID(long user_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgalleryusers> orderByComparator);

	/**
	* Returns an ordered range of all the feedforwardgalleryuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of feedforwardgalleryuserses
	* @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching feedforwardgalleryuserses
	*/
	public java.util.List<feedforwardgalleryusers> findByUSER_ID(long user_id,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgalleryusers> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first feedforwardgalleryusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedforwardgalleryusers
	* @throws NoSuchfeedforwardgalleryusersException if a matching feedforwardgalleryusers could not be found
	*/
	public feedforwardgalleryusers findByUSER_ID_First(long user_id,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgalleryusers> orderByComparator)
		throws NoSuchfeedforwardgalleryusersException;

	/**
	* Returns the first feedforwardgalleryusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedforwardgalleryusers, or <code>null</code> if a matching feedforwardgalleryusers could not be found
	*/
	public feedforwardgalleryusers fetchByUSER_ID_First(long user_id,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgalleryusers> orderByComparator);

	/**
	* Returns the last feedforwardgalleryusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedforwardgalleryusers
	* @throws NoSuchfeedforwardgalleryusersException if a matching feedforwardgalleryusers could not be found
	*/
	public feedforwardgalleryusers findByUSER_ID_Last(long user_id,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgalleryusers> orderByComparator)
		throws NoSuchfeedforwardgalleryusersException;

	/**
	* Returns the last feedforwardgalleryusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedforwardgalleryusers, or <code>null</code> if a matching feedforwardgalleryusers could not be found
	*/
	public feedforwardgalleryusers fetchByUSER_ID_Last(long user_id,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgalleryusers> orderByComparator);

	/**
	* Returns the feedforwardgalleryuserses before and after the current feedforwardgalleryusers in the ordered set where user_id = &#63;.
	*
	* @param id the primary key of the current feedforwardgalleryusers
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedforwardgalleryusers
	* @throws NoSuchfeedforwardgalleryusersException if a feedforwardgalleryusers with the primary key could not be found
	*/
	public feedforwardgalleryusers[] findByUSER_ID_PrevAndNext(long id,
		long user_id,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgalleryusers> orderByComparator)
		throws NoSuchfeedforwardgalleryusersException;

	/**
	* Removes all the feedforwardgalleryuserses where user_id = &#63; from the database.
	*
	* @param user_id the user_id
	*/
	public void removeByUSER_ID(long user_id);

	/**
	* Returns the number of feedforwardgalleryuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the number of matching feedforwardgalleryuserses
	*/
	public int countByUSER_ID(long user_id);

	/**
	* Caches the feedforwardgalleryusers in the entity cache if it is enabled.
	*
	* @param feedforwardgalleryusers the feedforwardgalleryusers
	*/
	public void cacheResult(feedforwardgalleryusers feedforwardgalleryusers);

	/**
	* Caches the feedforwardgalleryuserses in the entity cache if it is enabled.
	*
	* @param feedforwardgalleryuserses the feedforwardgalleryuserses
	*/
	public void cacheResult(
		java.util.List<feedforwardgalleryusers> feedforwardgalleryuserses);

	/**
	* Creates a new feedforwardgalleryusers with the primary key. Does not add the feedforwardgalleryusers to the database.
	*
	* @param id the primary key for the new feedforwardgalleryusers
	* @return the new feedforwardgalleryusers
	*/
	public feedforwardgalleryusers create(long id);

	/**
	* Removes the feedforwardgalleryusers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the feedforwardgalleryusers
	* @return the feedforwardgalleryusers that was removed
	* @throws NoSuchfeedforwardgalleryusersException if a feedforwardgalleryusers with the primary key could not be found
	*/
	public feedforwardgalleryusers remove(long id)
		throws NoSuchfeedforwardgalleryusersException;

	public feedforwardgalleryusers updateImpl(
		feedforwardgalleryusers feedforwardgalleryusers);

	/**
	* Returns the feedforwardgalleryusers with the primary key or throws a {@link NoSuchfeedforwardgalleryusersException} if it could not be found.
	*
	* @param id the primary key of the feedforwardgalleryusers
	* @return the feedforwardgalleryusers
	* @throws NoSuchfeedforwardgalleryusersException if a feedforwardgalleryusers with the primary key could not be found
	*/
	public feedforwardgalleryusers findByPrimaryKey(long id)
		throws NoSuchfeedforwardgalleryusersException;

	/**
	* Returns the feedforwardgalleryusers with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the feedforwardgalleryusers
	* @return the feedforwardgalleryusers, or <code>null</code> if a feedforwardgalleryusers with the primary key could not be found
	*/
	public feedforwardgalleryusers fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, feedforwardgalleryusers> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the feedforwardgalleryuserses.
	*
	* @return the feedforwardgalleryuserses
	*/
	public java.util.List<feedforwardgalleryusers> findAll();

	/**
	* Returns a range of all the feedforwardgalleryuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedforwardgalleryuserses
	* @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	* @return the range of feedforwardgalleryuserses
	*/
	public java.util.List<feedforwardgalleryusers> findAll(int start, int end);

	/**
	* Returns an ordered range of all the feedforwardgalleryuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedforwardgalleryuserses
	* @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of feedforwardgalleryuserses
	*/
	public java.util.List<feedforwardgalleryusers> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgalleryusers> orderByComparator);

	/**
	* Returns an ordered range of all the feedforwardgalleryuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link feedforwardgalleryusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedforwardgalleryuserses
	* @param end the upper bound of the range of feedforwardgalleryuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of feedforwardgalleryuserses
	*/
	public java.util.List<feedforwardgalleryusers> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<feedforwardgalleryusers> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the feedforwardgalleryuserses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of feedforwardgalleryuserses.
	*
	* @return the number of feedforwardgalleryuserses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}