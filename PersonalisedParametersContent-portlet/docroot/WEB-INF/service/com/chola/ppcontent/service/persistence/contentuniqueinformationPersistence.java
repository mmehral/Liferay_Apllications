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

package com.chola.ppcontent.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.ppcontent.exception.NoSuchcontentuniqueinformationException;
import com.chola.ppcontent.model.contentuniqueinformation;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the contentuniqueinformation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see com.chola.ppcontent.service.persistence.impl.contentuniqueinformationPersistenceImpl
 * @see contentuniqueinformationUtil
 * @generated
 */
@ProviderType
public interface contentuniqueinformationPersistence extends BasePersistence<contentuniqueinformation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link contentuniqueinformationUtil} to access the contentuniqueinformation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the contentuniqueinformations where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching contentuniqueinformations
	*/
	public java.util.List<contentuniqueinformation> findByCONTENTID(
		long content_id);

	/**
	* Returns a range of all the contentuniqueinformations where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of contentuniqueinformations
	* @param end the upper bound of the range of contentuniqueinformations (not inclusive)
	* @return the range of matching contentuniqueinformations
	*/
	public java.util.List<contentuniqueinformation> findByCONTENTID(
		long content_id, int start, int end);

	/**
	* Returns an ordered range of all the contentuniqueinformations where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of contentuniqueinformations
	* @param end the upper bound of the range of contentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching contentuniqueinformations
	*/
	public java.util.List<contentuniqueinformation> findByCONTENTID(
		long content_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contentuniqueinformation> orderByComparator);

	/**
	* Returns an ordered range of all the contentuniqueinformations where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of contentuniqueinformations
	* @param end the upper bound of the range of contentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching contentuniqueinformations
	*/
	public java.util.List<contentuniqueinformation> findByCONTENTID(
		long content_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contentuniqueinformation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first contentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contentuniqueinformation
	* @throws NoSuchcontentuniqueinformationException if a matching contentuniqueinformation could not be found
	*/
	public contentuniqueinformation findByCONTENTID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<contentuniqueinformation> orderByComparator)
		throws NoSuchcontentuniqueinformationException;

	/**
	* Returns the first contentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching contentuniqueinformation, or <code>null</code> if a matching contentuniqueinformation could not be found
	*/
	public contentuniqueinformation fetchByCONTENTID_First(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<contentuniqueinformation> orderByComparator);

	/**
	* Returns the last contentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contentuniqueinformation
	* @throws NoSuchcontentuniqueinformationException if a matching contentuniqueinformation could not be found
	*/
	public contentuniqueinformation findByCONTENTID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<contentuniqueinformation> orderByComparator)
		throws NoSuchcontentuniqueinformationException;

	/**
	* Returns the last contentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching contentuniqueinformation, or <code>null</code> if a matching contentuniqueinformation could not be found
	*/
	public contentuniqueinformation fetchByCONTENTID_Last(long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<contentuniqueinformation> orderByComparator);

	/**
	* Returns the contentuniqueinformations before and after the current contentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current contentuniqueinformation
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next contentuniqueinformation
	* @throws NoSuchcontentuniqueinformationException if a contentuniqueinformation with the primary key could not be found
	*/
	public contentuniqueinformation[] findByCONTENTID_PrevAndNext(long id,
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<contentuniqueinformation> orderByComparator)
		throws NoSuchcontentuniqueinformationException;

	/**
	* Removes all the contentuniqueinformations where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public void removeByCONTENTID(long content_id);

	/**
	* Returns the number of contentuniqueinformations where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching contentuniqueinformations
	*/
	public int countByCONTENTID(long content_id);

	/**
	* Caches the contentuniqueinformation in the entity cache if it is enabled.
	*
	* @param contentuniqueinformation the contentuniqueinformation
	*/
	public void cacheResult(contentuniqueinformation contentuniqueinformation);

	/**
	* Caches the contentuniqueinformations in the entity cache if it is enabled.
	*
	* @param contentuniqueinformations the contentuniqueinformations
	*/
	public void cacheResult(
		java.util.List<contentuniqueinformation> contentuniqueinformations);

	/**
	* Creates a new contentuniqueinformation with the primary key. Does not add the contentuniqueinformation to the database.
	*
	* @param id the primary key for the new contentuniqueinformation
	* @return the new contentuniqueinformation
	*/
	public contentuniqueinformation create(long id);

	/**
	* Removes the contentuniqueinformation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the contentuniqueinformation
	* @return the contentuniqueinformation that was removed
	* @throws NoSuchcontentuniqueinformationException if a contentuniqueinformation with the primary key could not be found
	*/
	public contentuniqueinformation remove(long id)
		throws NoSuchcontentuniqueinformationException;

	public contentuniqueinformation updateImpl(
		contentuniqueinformation contentuniqueinformation);

	/**
	* Returns the contentuniqueinformation with the primary key or throws a {@link NoSuchcontentuniqueinformationException} if it could not be found.
	*
	* @param id the primary key of the contentuniqueinformation
	* @return the contentuniqueinformation
	* @throws NoSuchcontentuniqueinformationException if a contentuniqueinformation with the primary key could not be found
	*/
	public contentuniqueinformation findByPrimaryKey(long id)
		throws NoSuchcontentuniqueinformationException;

	/**
	* Returns the contentuniqueinformation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the contentuniqueinformation
	* @return the contentuniqueinformation, or <code>null</code> if a contentuniqueinformation with the primary key could not be found
	*/
	public contentuniqueinformation fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, contentuniqueinformation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the contentuniqueinformations.
	*
	* @return the contentuniqueinformations
	*/
	public java.util.List<contentuniqueinformation> findAll();

	/**
	* Returns a range of all the contentuniqueinformations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contentuniqueinformations
	* @param end the upper bound of the range of contentuniqueinformations (not inclusive)
	* @return the range of contentuniqueinformations
	*/
	public java.util.List<contentuniqueinformation> findAll(int start, int end);

	/**
	* Returns an ordered range of all the contentuniqueinformations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contentuniqueinformations
	* @param end the upper bound of the range of contentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of contentuniqueinformations
	*/
	public java.util.List<contentuniqueinformation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contentuniqueinformation> orderByComparator);

	/**
	* Returns an ordered range of all the contentuniqueinformations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contentuniqueinformations
	* @param end the upper bound of the range of contentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of contentuniqueinformations
	*/
	public java.util.List<contentuniqueinformation> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<contentuniqueinformation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the contentuniqueinformations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of contentuniqueinformations.
	*
	* @return the number of contentuniqueinformations
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}