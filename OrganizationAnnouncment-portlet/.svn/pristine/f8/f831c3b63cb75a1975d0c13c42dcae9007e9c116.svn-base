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

package com.organizationAnnouncement.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.organizationAnnouncement.exception.NoSuchorganizationException;

import com.organizationAnnouncement.model.organization;

/**
 * The persistence interface for the organization service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see com.organizationAnnouncement.service.persistence.impl.organizationPersistenceImpl
 * @see organizationUtil
 * @generated
 */
@ProviderType
public interface organizationPersistence extends BasePersistence<organization> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link organizationUtil} to access the organization persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the organization in the entity cache if it is enabled.
	*
	* @param organization the organization
	*/
	public void cacheResult(organization organization);

	/**
	* Caches the organizations in the entity cache if it is enabled.
	*
	* @param organizations the organizations
	*/
	public void cacheResult(java.util.List<organization> organizations);

	/**
	* Creates a new organization with the primary key. Does not add the organization to the database.
	*
	* @param organization_id the primary key for the new organization
	* @return the new organization
	*/
	public organization create(long organization_id);

	/**
	* Removes the organization with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param organization_id the primary key of the organization
	* @return the organization that was removed
	* @throws NoSuchorganizationException if a organization with the primary key could not be found
	*/
	public organization remove(long organization_id)
		throws NoSuchorganizationException;

	public organization updateImpl(organization organization);

	/**
	* Returns the organization with the primary key or throws a {@link NoSuchorganizationException} if it could not be found.
	*
	* @param organization_id the primary key of the organization
	* @return the organization
	* @throws NoSuchorganizationException if a organization with the primary key could not be found
	*/
	public organization findByPrimaryKey(long organization_id)
		throws NoSuchorganizationException;

	/**
	* Returns the organization with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param organization_id the primary key of the organization
	* @return the organization, or <code>null</code> if a organization with the primary key could not be found
	*/
	public organization fetchByPrimaryKey(long organization_id);

	@Override
	public java.util.Map<java.io.Serializable, organization> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the organizations.
	*
	* @return the organizations
	*/
	public java.util.List<organization> findAll();

	/**
	* Returns a range of all the organizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link organizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of organizations
	* @param end the upper bound of the range of organizations (not inclusive)
	* @return the range of organizations
	*/
	public java.util.List<organization> findAll(int start, int end);

	/**
	* Returns an ordered range of all the organizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link organizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of organizations
	* @param end the upper bound of the range of organizations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of organizations
	*/
	public java.util.List<organization> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<organization> orderByComparator);

	/**
	* Returns an ordered range of all the organizations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link organizationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of organizations
	* @param end the upper bound of the range of organizations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of organizations
	*/
	public java.util.List<organization> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<organization> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the organizations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of organizations.
	*
	* @return the number of organizations
	*/
	public int countAll();
}