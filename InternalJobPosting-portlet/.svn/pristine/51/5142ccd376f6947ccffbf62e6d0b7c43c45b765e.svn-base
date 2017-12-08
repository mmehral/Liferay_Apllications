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

package com.chola.InternalJobRef.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.InternalJobRef.exception.NoSuchInternalReferenceException;
import com.chola.InternalJobRef.model.InternalReference;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the internal reference service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay03
 * @see com.chola.InternalJobRef.service.persistence.impl.InternalReferencePersistenceImpl
 * @see InternalReferenceUtil
 * @generated
 */
@ProviderType
public interface InternalReferencePersistence extends BasePersistence<InternalReference> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link InternalReferenceUtil} to access the internal reference persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the internal reference in the entity cache if it is enabled.
	*
	* @param internalReference the internal reference
	*/
	public void cacheResult(InternalReference internalReference);

	/**
	* Caches the internal references in the entity cache if it is enabled.
	*
	* @param internalReferences the internal references
	*/
	public void cacheResult(
		java.util.List<InternalReference> internalReferences);

	/**
	* Creates a new internal reference with the primary key. Does not add the internal reference to the database.
	*
	* @param refId the primary key for the new internal reference
	* @return the new internal reference
	*/
	public InternalReference create(long refId);

	/**
	* Removes the internal reference with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param refId the primary key of the internal reference
	* @return the internal reference that was removed
	* @throws NoSuchInternalReferenceException if a internal reference with the primary key could not be found
	*/
	public InternalReference remove(long refId)
		throws NoSuchInternalReferenceException;

	public InternalReference updateImpl(InternalReference internalReference);

	/**
	* Returns the internal reference with the primary key or throws a {@link NoSuchInternalReferenceException} if it could not be found.
	*
	* @param refId the primary key of the internal reference
	* @return the internal reference
	* @throws NoSuchInternalReferenceException if a internal reference with the primary key could not be found
	*/
	public InternalReference findByPrimaryKey(long refId)
		throws NoSuchInternalReferenceException;

	/**
	* Returns the internal reference with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param refId the primary key of the internal reference
	* @return the internal reference, or <code>null</code> if a internal reference with the primary key could not be found
	*/
	public InternalReference fetchByPrimaryKey(long refId);

	@Override
	public java.util.Map<java.io.Serializable, InternalReference> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the internal references.
	*
	* @return the internal references
	*/
	public java.util.List<InternalReference> findAll();

	/**
	* Returns a range of all the internal references.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link InternalReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of internal references
	* @param end the upper bound of the range of internal references (not inclusive)
	* @return the range of internal references
	*/
	public java.util.List<InternalReference> findAll(int start, int end);

	/**
	* Returns an ordered range of all the internal references.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link InternalReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of internal references
	* @param end the upper bound of the range of internal references (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of internal references
	*/
	public java.util.List<InternalReference> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InternalReference> orderByComparator);

	/**
	* Returns an ordered range of all the internal references.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link InternalReferenceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of internal references
	* @param end the upper bound of the range of internal references (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of internal references
	*/
	public java.util.List<InternalReference> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<InternalReference> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the internal references from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of internal references.
	*
	* @return the number of internal references
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}