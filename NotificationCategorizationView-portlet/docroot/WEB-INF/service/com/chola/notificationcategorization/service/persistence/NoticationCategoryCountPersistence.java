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

package com.chola.notificationcategorization.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.notificationcategorization.exception.NoSuchNoticationCategoryCountException;
import com.chola.notificationcategorization.model.NoticationCategoryCount;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the notication category count service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay03
 * @see com.chola.notificationcategorization.service.persistence.impl.NoticationCategoryCountPersistenceImpl
 * @see NoticationCategoryCountUtil
 * @generated
 */
@ProviderType
public interface NoticationCategoryCountPersistence extends BasePersistence<NoticationCategoryCount> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NoticationCategoryCountUtil} to access the notication category count persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the notication category count in the entity cache if it is enabled.
	*
	* @param noticationCategoryCount the notication category count
	*/
	public void cacheResult(NoticationCategoryCount noticationCategoryCount);

	/**
	* Caches the notication category counts in the entity cache if it is enabled.
	*
	* @param noticationCategoryCounts the notication category counts
	*/
	public void cacheResult(
		java.util.List<NoticationCategoryCount> noticationCategoryCounts);

	/**
	* Creates a new notication category count with the primary key. Does not add the notication category count to the database.
	*
	* @param eventId the primary key for the new notication category count
	* @return the new notication category count
	*/
	public NoticationCategoryCount create(long eventId);

	/**
	* Removes the notication category count with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param eventId the primary key of the notication category count
	* @return the notication category count that was removed
	* @throws NoSuchNoticationCategoryCountException if a notication category count with the primary key could not be found
	*/
	public NoticationCategoryCount remove(long eventId)
		throws NoSuchNoticationCategoryCountException;

	public NoticationCategoryCount updateImpl(
		NoticationCategoryCount noticationCategoryCount);

	/**
	* Returns the notication category count with the primary key or throws a {@link NoSuchNoticationCategoryCountException} if it could not be found.
	*
	* @param eventId the primary key of the notication category count
	* @return the notication category count
	* @throws NoSuchNoticationCategoryCountException if a notication category count with the primary key could not be found
	*/
	public NoticationCategoryCount findByPrimaryKey(long eventId)
		throws NoSuchNoticationCategoryCountException;

	/**
	* Returns the notication category count with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param eventId the primary key of the notication category count
	* @return the notication category count, or <code>null</code> if a notication category count with the primary key could not be found
	*/
	public NoticationCategoryCount fetchByPrimaryKey(long eventId);

	@Override
	public java.util.Map<java.io.Serializable, NoticationCategoryCount> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the notication category counts.
	*
	* @return the notication category counts
	*/
	public java.util.List<NoticationCategoryCount> findAll();

	/**
	* Returns a range of all the notication category counts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoticationCategoryCountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of notication category counts
	* @param end the upper bound of the range of notication category counts (not inclusive)
	* @return the range of notication category counts
	*/
	public java.util.List<NoticationCategoryCount> findAll(int start, int end);

	/**
	* Returns an ordered range of all the notication category counts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoticationCategoryCountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of notication category counts
	* @param end the upper bound of the range of notication category counts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of notication category counts
	*/
	public java.util.List<NoticationCategoryCount> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NoticationCategoryCount> orderByComparator);

	/**
	* Returns an ordered range of all the notication category counts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NoticationCategoryCountModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of notication category counts
	* @param end the upper bound of the range of notication category counts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of notication category counts
	*/
	public java.util.List<NoticationCategoryCount> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NoticationCategoryCount> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the notication category counts from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of notication category counts.
	*
	* @return the number of notication category counts
	*/
	public int countAll();
}