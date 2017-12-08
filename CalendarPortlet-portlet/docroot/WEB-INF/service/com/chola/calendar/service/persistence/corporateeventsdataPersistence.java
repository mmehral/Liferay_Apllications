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

package com.chola.calendar.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.calendar.exception.NoSuchcorporateeventsdataException;
import com.chola.calendar.model.corporateeventsdata;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the corporateeventsdata service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see com.chola.calendar.service.persistence.impl.corporateeventsdataPersistenceImpl
 * @see corporateeventsdataUtil
 * @generated
 */
@ProviderType
public interface corporateeventsdataPersistence extends BasePersistence<corporateeventsdata> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link corporateeventsdataUtil} to access the corporateeventsdata persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the corporateeventsdata in the entity cache if it is enabled.
	*
	* @param corporateeventsdata the corporateeventsdata
	*/
	public void cacheResult(corporateeventsdata corporateeventsdata);

	/**
	* Caches the corporateeventsdatas in the entity cache if it is enabled.
	*
	* @param corporateeventsdatas the corporateeventsdatas
	*/
	public void cacheResult(
		java.util.List<corporateeventsdata> corporateeventsdatas);

	/**
	* Creates a new corporateeventsdata with the primary key. Does not add the corporateeventsdata to the database.
	*
	* @param id the primary key for the new corporateeventsdata
	* @return the new corporateeventsdata
	*/
	public corporateeventsdata create(long id);

	/**
	* Removes the corporateeventsdata with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the corporateeventsdata
	* @return the corporateeventsdata that was removed
	* @throws NoSuchcorporateeventsdataException if a corporateeventsdata with the primary key could not be found
	*/
	public corporateeventsdata remove(long id)
		throws NoSuchcorporateeventsdataException;

	public corporateeventsdata updateImpl(
		corporateeventsdata corporateeventsdata);

	/**
	* Returns the corporateeventsdata with the primary key or throws a {@link NoSuchcorporateeventsdataException} if it could not be found.
	*
	* @param id the primary key of the corporateeventsdata
	* @return the corporateeventsdata
	* @throws NoSuchcorporateeventsdataException if a corporateeventsdata with the primary key could not be found
	*/
	public corporateeventsdata findByPrimaryKey(long id)
		throws NoSuchcorporateeventsdataException;

	/**
	* Returns the corporateeventsdata with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the corporateeventsdata
	* @return the corporateeventsdata, or <code>null</code> if a corporateeventsdata with the primary key could not be found
	*/
	public corporateeventsdata fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, corporateeventsdata> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the corporateeventsdatas.
	*
	* @return the corporateeventsdatas
	*/
	public java.util.List<corporateeventsdata> findAll();

	/**
	* Returns a range of all the corporateeventsdatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporateeventsdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporateeventsdatas
	* @param end the upper bound of the range of corporateeventsdatas (not inclusive)
	* @return the range of corporateeventsdatas
	*/
	public java.util.List<corporateeventsdata> findAll(int start, int end);

	/**
	* Returns an ordered range of all the corporateeventsdatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporateeventsdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporateeventsdatas
	* @param end the upper bound of the range of corporateeventsdatas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of corporateeventsdatas
	*/
	public java.util.List<corporateeventsdata> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<corporateeventsdata> orderByComparator);

	/**
	* Returns an ordered range of all the corporateeventsdatas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporateeventsdataModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporateeventsdatas
	* @param end the upper bound of the range of corporateeventsdatas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of corporateeventsdatas
	*/
	public java.util.List<corporateeventsdata> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<corporateeventsdata> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the corporateeventsdatas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of corporateeventsdatas.
	*
	* @return the number of corporateeventsdatas
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}