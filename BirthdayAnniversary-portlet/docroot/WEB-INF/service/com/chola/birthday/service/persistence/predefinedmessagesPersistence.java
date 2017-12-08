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

package com.chola.birthday.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.birthday.exception.NoSuchpredefinedmessagesException;
import com.chola.birthday.model.predefinedmessages;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the predefinedmessages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see com.chola.birthday.service.persistence.impl.predefinedmessagesPersistenceImpl
 * @see predefinedmessagesUtil
 * @generated
 */
@ProviderType
public interface predefinedmessagesPersistence extends BasePersistence<predefinedmessages> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link predefinedmessagesUtil} to access the predefinedmessages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the predefinedmessages in the entity cache if it is enabled.
	*
	* @param predefinedmessages the predefinedmessages
	*/
	public void cacheResult(predefinedmessages predefinedmessages);

	/**
	* Caches the predefinedmessageses in the entity cache if it is enabled.
	*
	* @param predefinedmessageses the predefinedmessageses
	*/
	public void cacheResult(
		java.util.List<predefinedmessages> predefinedmessageses);

	/**
	* Creates a new predefinedmessages with the primary key. Does not add the predefinedmessages to the database.
	*
	* @param id the primary key for the new predefinedmessages
	* @return the new predefinedmessages
	*/
	public predefinedmessages create(long id);

	/**
	* Removes the predefinedmessages with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the predefinedmessages
	* @return the predefinedmessages that was removed
	* @throws NoSuchpredefinedmessagesException if a predefinedmessages with the primary key could not be found
	*/
	public predefinedmessages remove(long id)
		throws NoSuchpredefinedmessagesException;

	public predefinedmessages updateImpl(predefinedmessages predefinedmessages);

	/**
	* Returns the predefinedmessages with the primary key or throws a {@link NoSuchpredefinedmessagesException} if it could not be found.
	*
	* @param id the primary key of the predefinedmessages
	* @return the predefinedmessages
	* @throws NoSuchpredefinedmessagesException if a predefinedmessages with the primary key could not be found
	*/
	public predefinedmessages findByPrimaryKey(long id)
		throws NoSuchpredefinedmessagesException;

	/**
	* Returns the predefinedmessages with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the predefinedmessages
	* @return the predefinedmessages, or <code>null</code> if a predefinedmessages with the primary key could not be found
	*/
	public predefinedmessages fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, predefinedmessages> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the predefinedmessageses.
	*
	* @return the predefinedmessageses
	*/
	public java.util.List<predefinedmessages> findAll();

	/**
	* Returns a range of all the predefinedmessageses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link predefinedmessagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of predefinedmessageses
	* @param end the upper bound of the range of predefinedmessageses (not inclusive)
	* @return the range of predefinedmessageses
	*/
	public java.util.List<predefinedmessages> findAll(int start, int end);

	/**
	* Returns an ordered range of all the predefinedmessageses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link predefinedmessagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of predefinedmessageses
	* @param end the upper bound of the range of predefinedmessageses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of predefinedmessageses
	*/
	public java.util.List<predefinedmessages> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<predefinedmessages> orderByComparator);

	/**
	* Returns an ordered range of all the predefinedmessageses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link predefinedmessagesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of predefinedmessageses
	* @param end the upper bound of the range of predefinedmessageses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of predefinedmessageses
	*/
	public java.util.List<predefinedmessages> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<predefinedmessages> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the predefinedmessageses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of predefinedmessageses.
	*
	* @return the number of predefinedmessageses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}