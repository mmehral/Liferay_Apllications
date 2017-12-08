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

import com.chola.ppcontent.model.contentupdate;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the contentupdate service. This utility wraps {@link com.chola.ppcontent.service.persistence.impl.contentupdatePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see contentupdatePersistence
 * @see com.chola.ppcontent.service.persistence.impl.contentupdatePersistenceImpl
 * @generated
 */
@ProviderType
public class contentupdateUtil {
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
	public static void clearCache(contentupdate contentupdate) {
		getPersistence().clearCache(contentupdate);
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
	public static List<contentupdate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<contentupdate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<contentupdate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<contentupdate> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static contentupdate update(contentupdate contentupdate) {
		return getPersistence().update(contentupdate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static contentupdate update(contentupdate contentupdate,
		ServiceContext serviceContext) {
		return getPersistence().update(contentupdate, serviceContext);
	}

	/**
	* Caches the contentupdate in the entity cache if it is enabled.
	*
	* @param contentupdate the contentupdate
	*/
	public static void cacheResult(contentupdate contentupdate) {
		getPersistence().cacheResult(contentupdate);
	}

	/**
	* Caches the contentupdates in the entity cache if it is enabled.
	*
	* @param contentupdates the contentupdates
	*/
	public static void cacheResult(List<contentupdate> contentupdates) {
		getPersistence().cacheResult(contentupdates);
	}

	/**
	* Creates a new contentupdate with the primary key. Does not add the contentupdate to the database.
	*
	* @param id the primary key for the new contentupdate
	* @return the new contentupdate
	*/
	public static contentupdate create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the contentupdate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the contentupdate
	* @return the contentupdate that was removed
	* @throws NoSuchcontentupdateException if a contentupdate with the primary key could not be found
	*/
	public static contentupdate remove(long id)
		throws com.chola.ppcontent.exception.NoSuchcontentupdateException {
		return getPersistence().remove(id);
	}

	public static contentupdate updateImpl(contentupdate contentupdate) {
		return getPersistence().updateImpl(contentupdate);
	}

	/**
	* Returns the contentupdate with the primary key or throws a {@link NoSuchcontentupdateException} if it could not be found.
	*
	* @param id the primary key of the contentupdate
	* @return the contentupdate
	* @throws NoSuchcontentupdateException if a contentupdate with the primary key could not be found
	*/
	public static contentupdate findByPrimaryKey(long id)
		throws com.chola.ppcontent.exception.NoSuchcontentupdateException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the contentupdate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the contentupdate
	* @return the contentupdate, or <code>null</code> if a contentupdate with the primary key could not be found
	*/
	public static contentupdate fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, contentupdate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the contentupdates.
	*
	* @return the contentupdates
	*/
	public static List<contentupdate> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the contentupdates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contentupdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contentupdates
	* @param end the upper bound of the range of contentupdates (not inclusive)
	* @return the range of contentupdates
	*/
	public static List<contentupdate> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the contentupdates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contentupdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contentupdates
	* @param end the upper bound of the range of contentupdates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of contentupdates
	*/
	public static List<contentupdate> findAll(int start, int end,
		OrderByComparator<contentupdate> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the contentupdates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link contentupdateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of contentupdates
	* @param end the upper bound of the range of contentupdates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of contentupdates
	*/
	public static List<contentupdate> findAll(int start, int end,
		OrderByComparator<contentupdate> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the contentupdates from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of contentupdates.
	*
	* @return the number of contentupdates
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static contentupdatePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (contentupdatePersistence)PortletBeanLocatorUtil.locate(com.chola.ppcontent.service.ClpSerializer.getServletContextName(),
					contentupdatePersistence.class.getName());

			ReferenceRegistry.registerReference(contentupdateUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static contentupdatePersistence _persistence;
}