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

package com.service.compliance.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import com.service.compliance.model.compliance;

import java.util.List;

/**
 * The persistence utility for the compliance service. This utility wraps {@link com.service.compliance.service.persistence.impl.compliancePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see compliancePersistence
 * @see com.service.compliance.service.persistence.impl.compliancePersistenceImpl
 * @generated
 */
@ProviderType
public class complianceUtil {
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
	public static void clearCache(compliance compliance) {
		getPersistence().clearCache(compliance);
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
	public static List<compliance> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<compliance> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<compliance> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<compliance> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static compliance update(compliance compliance) {
		return getPersistence().update(compliance);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static compliance update(compliance compliance,
		ServiceContext serviceContext) {
		return getPersistence().update(compliance, serviceContext);
	}

	/**
	* Caches the compliance in the entity cache if it is enabled.
	*
	* @param compliance the compliance
	*/
	public static void cacheResult(compliance compliance) {
		getPersistence().cacheResult(compliance);
	}

	/**
	* Caches the compliances in the entity cache if it is enabled.
	*
	* @param compliances the compliances
	*/
	public static void cacheResult(List<compliance> compliances) {
		getPersistence().cacheResult(compliances);
	}

	/**
	* Creates a new compliance with the primary key. Does not add the compliance to the database.
	*
	* @param compliance_id the primary key for the new compliance
	* @return the new compliance
	*/
	public static compliance create(long compliance_id) {
		return getPersistence().create(compliance_id);
	}

	/**
	* Removes the compliance with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param compliance_id the primary key of the compliance
	* @return the compliance that was removed
	* @throws NoSuchcomplianceException if a compliance with the primary key could not be found
	*/
	public static compliance remove(long compliance_id)
		throws com.service.compliance.exception.NoSuchcomplianceException {
		return getPersistence().remove(compliance_id);
	}

	public static compliance updateImpl(compliance compliance) {
		return getPersistence().updateImpl(compliance);
	}

	/**
	* Returns the compliance with the primary key or throws a {@link NoSuchcomplianceException} if it could not be found.
	*
	* @param compliance_id the primary key of the compliance
	* @return the compliance
	* @throws NoSuchcomplianceException if a compliance with the primary key could not be found
	*/
	public static compliance findByPrimaryKey(long compliance_id)
		throws com.service.compliance.exception.NoSuchcomplianceException {
		return getPersistence().findByPrimaryKey(compliance_id);
	}

	/**
	* Returns the compliance with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param compliance_id the primary key of the compliance
	* @return the compliance, or <code>null</code> if a compliance with the primary key could not be found
	*/
	public static compliance fetchByPrimaryKey(long compliance_id) {
		return getPersistence().fetchByPrimaryKey(compliance_id);
	}

	public static java.util.Map<java.io.Serializable, compliance> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the compliances.
	*
	* @return the compliances
	*/
	public static List<compliance> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the compliances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link complianceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of compliances
	* @param end the upper bound of the range of compliances (not inclusive)
	* @return the range of compliances
	*/
	public static List<compliance> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the compliances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link complianceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of compliances
	* @param end the upper bound of the range of compliances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of compliances
	*/
	public static List<compliance> findAll(int start, int end,
		OrderByComparator<compliance> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the compliances.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link complianceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of compliances
	* @param end the upper bound of the range of compliances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of compliances
	*/
	public static List<compliance> findAll(int start, int end,
		OrderByComparator<compliance> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the compliances from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of compliances.
	*
	* @return the number of compliances
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static compliancePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (compliancePersistence)PortletBeanLocatorUtil.locate(com.service.compliance.service.ClpSerializer.getServletContextName(),
					compliancePersistence.class.getName());

			ReferenceRegistry.registerReference(complianceUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static compliancePersistence _persistence;
}