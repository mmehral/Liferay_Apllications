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

import com.chola.InternalJobRef.model.InternalReference;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the internal reference service. This utility wraps {@link com.chola.InternalJobRef.service.persistence.impl.InternalReferencePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay03
 * @see InternalReferencePersistence
 * @see com.chola.InternalJobRef.service.persistence.impl.InternalReferencePersistenceImpl
 * @generated
 */
@ProviderType
public class InternalReferenceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(InternalReference internalReference) {
		getPersistence().clearCache(internalReference);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<InternalReference> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<InternalReference> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<InternalReference> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<InternalReference> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static InternalReference update(InternalReference internalReference) {
		return getPersistence().update(internalReference);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static InternalReference update(
		InternalReference internalReference, ServiceContext serviceContext) {
		return getPersistence().update(internalReference, serviceContext);
	}

	/**
	* Caches the internal reference in the entity cache if it is enabled.
	*
	* @param internalReference the internal reference
	*/
	public static void cacheResult(InternalReference internalReference) {
		getPersistence().cacheResult(internalReference);
	}

	/**
	* Caches the internal references in the entity cache if it is enabled.
	*
	* @param internalReferences the internal references
	*/
	public static void cacheResult(List<InternalReference> internalReferences) {
		getPersistence().cacheResult(internalReferences);
	}

	/**
	* Creates a new internal reference with the primary key. Does not add the internal reference to the database.
	*
	* @param refId the primary key for the new internal reference
	* @return the new internal reference
	*/
	public static InternalReference create(long refId) {
		return getPersistence().create(refId);
	}

	/**
	* Removes the internal reference with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param refId the primary key of the internal reference
	* @return the internal reference that was removed
	* @throws NoSuchInternalReferenceException if a internal reference with the primary key could not be found
	*/
	public static InternalReference remove(long refId)
		throws com.chola.InternalJobRef.exception.NoSuchInternalReferenceException {
		return getPersistence().remove(refId);
	}

	public static InternalReference updateImpl(
		InternalReference internalReference) {
		return getPersistence().updateImpl(internalReference);
	}

	/**
	* Returns the internal reference with the primary key or throws a {@link NoSuchInternalReferenceException} if it could not be found.
	*
	* @param refId the primary key of the internal reference
	* @return the internal reference
	* @throws NoSuchInternalReferenceException if a internal reference with the primary key could not be found
	*/
	public static InternalReference findByPrimaryKey(long refId)
		throws com.chola.InternalJobRef.exception.NoSuchInternalReferenceException {
		return getPersistence().findByPrimaryKey(refId);
	}

	/**
	* Returns the internal reference with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param refId the primary key of the internal reference
	* @return the internal reference, or <code>null</code> if a internal reference with the primary key could not be found
	*/
	public static InternalReference fetchByPrimaryKey(long refId) {
		return getPersistence().fetchByPrimaryKey(refId);
	}

	public static java.util.Map<java.io.Serializable, InternalReference> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the internal references.
	*
	* @return the internal references
	*/
	public static List<InternalReference> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<InternalReference> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<InternalReference> findAll(int start, int end,
		OrderByComparator<InternalReference> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<InternalReference> findAll(int start, int end,
		OrderByComparator<InternalReference> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the internal references from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of internal references.
	*
	* @return the number of internal references
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static InternalReferencePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (InternalReferencePersistence)PortletBeanLocatorUtil.locate(com.chola.InternalJobRef.service.ClpSerializer.getServletContextName(),
					InternalReferencePersistence.class.getName());

			ReferenceRegistry.registerReference(InternalReferenceUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static InternalReferencePersistence _persistence;
}