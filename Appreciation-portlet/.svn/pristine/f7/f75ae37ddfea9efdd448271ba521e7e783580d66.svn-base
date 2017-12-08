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

package com.chola.appcorner.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.appcorner.exception.NoSuchpostException;
import com.chola.appcorner.model.post;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the post service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see com.chola.appcorner.service.persistence.impl.postPersistenceImpl
 * @see postUtil
 * @generated
 */
@ProviderType
public interface postPersistence extends BasePersistence<post> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link postUtil} to access the post persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the posts where appTo = &#63;.
	*
	* @param appTo the app to
	* @return the matching posts
	*/
	public java.util.List<post> findByAPP_TO(long appTo);

	/**
	* Returns a range of all the posts where appTo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link postModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param appTo the app to
	* @param start the lower bound of the range of posts
	* @param end the upper bound of the range of posts (not inclusive)
	* @return the range of matching posts
	*/
	public java.util.List<post> findByAPP_TO(long appTo, int start, int end);

	/**
	* Returns an ordered range of all the posts where appTo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link postModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param appTo the app to
	* @param start the lower bound of the range of posts
	* @param end the upper bound of the range of posts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching posts
	*/
	public java.util.List<post> findByAPP_TO(long appTo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<post> orderByComparator);

	/**
	* Returns an ordered range of all the posts where appTo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link postModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param appTo the app to
	* @param start the lower bound of the range of posts
	* @param end the upper bound of the range of posts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching posts
	*/
	public java.util.List<post> findByAPP_TO(long appTo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<post> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first post in the ordered set where appTo = &#63;.
	*
	* @param appTo the app to
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching post
	* @throws NoSuchpostException if a matching post could not be found
	*/
	public post findByAPP_TO_First(long appTo,
		com.liferay.portal.kernel.util.OrderByComparator<post> orderByComparator)
		throws NoSuchpostException;

	/**
	* Returns the first post in the ordered set where appTo = &#63;.
	*
	* @param appTo the app to
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching post, or <code>null</code> if a matching post could not be found
	*/
	public post fetchByAPP_TO_First(long appTo,
		com.liferay.portal.kernel.util.OrderByComparator<post> orderByComparator);

	/**
	* Returns the last post in the ordered set where appTo = &#63;.
	*
	* @param appTo the app to
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching post
	* @throws NoSuchpostException if a matching post could not be found
	*/
	public post findByAPP_TO_Last(long appTo,
		com.liferay.portal.kernel.util.OrderByComparator<post> orderByComparator)
		throws NoSuchpostException;

	/**
	* Returns the last post in the ordered set where appTo = &#63;.
	*
	* @param appTo the app to
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching post, or <code>null</code> if a matching post could not be found
	*/
	public post fetchByAPP_TO_Last(long appTo,
		com.liferay.portal.kernel.util.OrderByComparator<post> orderByComparator);

	/**
	* Returns the posts before and after the current post in the ordered set where appTo = &#63;.
	*
	* @param id the primary key of the current post
	* @param appTo the app to
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next post
	* @throws NoSuchpostException if a post with the primary key could not be found
	*/
	public post[] findByAPP_TO_PrevAndNext(long id, long appTo,
		com.liferay.portal.kernel.util.OrderByComparator<post> orderByComparator)
		throws NoSuchpostException;

	/**
	* Removes all the posts where appTo = &#63; from the database.
	*
	* @param appTo the app to
	*/
	public void removeByAPP_TO(long appTo);

	/**
	* Returns the number of posts where appTo = &#63;.
	*
	* @param appTo the app to
	* @return the number of matching posts
	*/
	public int countByAPP_TO(long appTo);

	/**
	* Caches the post in the entity cache if it is enabled.
	*
	* @param post the post
	*/
	public void cacheResult(post post);

	/**
	* Caches the posts in the entity cache if it is enabled.
	*
	* @param posts the posts
	*/
	public void cacheResult(java.util.List<post> posts);

	/**
	* Creates a new post with the primary key. Does not add the post to the database.
	*
	* @param id the primary key for the new post
	* @return the new post
	*/
	public post create(long id);

	/**
	* Removes the post with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the post
	* @return the post that was removed
	* @throws NoSuchpostException if a post with the primary key could not be found
	*/
	public post remove(long id) throws NoSuchpostException;

	public post updateImpl(post post);

	/**
	* Returns the post with the primary key or throws a {@link NoSuchpostException} if it could not be found.
	*
	* @param id the primary key of the post
	* @return the post
	* @throws NoSuchpostException if a post with the primary key could not be found
	*/
	public post findByPrimaryKey(long id) throws NoSuchpostException;

	/**
	* Returns the post with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the post
	* @return the post, or <code>null</code> if a post with the primary key could not be found
	*/
	public post fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, post> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the posts.
	*
	* @return the posts
	*/
	public java.util.List<post> findAll();

	/**
	* Returns a range of all the posts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link postModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of posts
	* @param end the upper bound of the range of posts (not inclusive)
	* @return the range of posts
	*/
	public java.util.List<post> findAll(int start, int end);

	/**
	* Returns an ordered range of all the posts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link postModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of posts
	* @param end the upper bound of the range of posts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of posts
	*/
	public java.util.List<post> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<post> orderByComparator);

	/**
	* Returns an ordered range of all the posts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link postModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of posts
	* @param end the upper bound of the range of posts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of posts
	*/
	public java.util.List<post> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<post> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the posts from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of posts.
	*
	* @return the number of posts
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}