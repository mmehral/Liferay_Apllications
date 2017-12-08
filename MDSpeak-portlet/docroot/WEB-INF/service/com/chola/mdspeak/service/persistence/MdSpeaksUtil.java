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

package com.chola.mdspeak.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.mdspeak.model.MdSpeaks;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the md speaks service. This utility wraps {@link com.chola.mdspeak.service.persistence.impl.MdSpeaksPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see MdSpeaksPersistence
 * @see com.chola.mdspeak.service.persistence.impl.MdSpeaksPersistenceImpl
 * @generated
 */
@ProviderType
public class MdSpeaksUtil {
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
	public static void clearCache(MdSpeaks mdSpeaks) {
		getPersistence().clearCache(mdSpeaks);
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
	public static List<MdSpeaks> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MdSpeaks> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MdSpeaks> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MdSpeaks> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MdSpeaks update(MdSpeaks mdSpeaks) {
		return getPersistence().update(mdSpeaks);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MdSpeaks update(MdSpeaks mdSpeaks,
		ServiceContext serviceContext) {
		return getPersistence().update(mdSpeaks, serviceContext);
	}

	/**
	* Caches the md speaks in the entity cache if it is enabled.
	*
	* @param mdSpeaks the md speaks
	*/
	public static void cacheResult(MdSpeaks mdSpeaks) {
		getPersistence().cacheResult(mdSpeaks);
	}

	/**
	* Caches the md speakses in the entity cache if it is enabled.
	*
	* @param mdSpeakses the md speakses
	*/
	public static void cacheResult(List<MdSpeaks> mdSpeakses) {
		getPersistence().cacheResult(mdSpeakses);
	}

	/**
	* Creates a new md speaks with the primary key. Does not add the md speaks to the database.
	*
	* @param Id the primary key for the new md speaks
	* @return the new md speaks
	*/
	public static MdSpeaks create(long Id) {
		return getPersistence().create(Id);
	}

	/**
	* Removes the md speaks with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param Id the primary key of the md speaks
	* @return the md speaks that was removed
	* @throws NoSuchMdSpeaksException if a md speaks with the primary key could not be found
	*/
	public static MdSpeaks remove(long Id)
		throws com.chola.mdspeak.exception.NoSuchMdSpeaksException {
		return getPersistence().remove(Id);
	}

	public static MdSpeaks updateImpl(MdSpeaks mdSpeaks) {
		return getPersistence().updateImpl(mdSpeaks);
	}

	/**
	* Returns the md speaks with the primary key or throws a {@link NoSuchMdSpeaksException} if it could not be found.
	*
	* @param Id the primary key of the md speaks
	* @return the md speaks
	* @throws NoSuchMdSpeaksException if a md speaks with the primary key could not be found
	*/
	public static MdSpeaks findByPrimaryKey(long Id)
		throws com.chola.mdspeak.exception.NoSuchMdSpeaksException {
		return getPersistence().findByPrimaryKey(Id);
	}

	/**
	* Returns the md speaks with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param Id the primary key of the md speaks
	* @return the md speaks, or <code>null</code> if a md speaks with the primary key could not be found
	*/
	public static MdSpeaks fetchByPrimaryKey(long Id) {
		return getPersistence().fetchByPrimaryKey(Id);
	}

	public static java.util.Map<java.io.Serializable, MdSpeaks> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the md speakses.
	*
	* @return the md speakses
	*/
	public static List<MdSpeaks> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the md speakses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MdSpeaksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of md speakses
	* @param end the upper bound of the range of md speakses (not inclusive)
	* @return the range of md speakses
	*/
	public static List<MdSpeaks> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the md speakses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MdSpeaksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of md speakses
	* @param end the upper bound of the range of md speakses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of md speakses
	*/
	public static List<MdSpeaks> findAll(int start, int end,
		OrderByComparator<MdSpeaks> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the md speakses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MdSpeaksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of md speakses
	* @param end the upper bound of the range of md speakses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of md speakses
	*/
	public static List<MdSpeaks> findAll(int start, int end,
		OrderByComparator<MdSpeaks> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the md speakses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of md speakses.
	*
	* @return the number of md speakses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MdSpeaksPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MdSpeaksPersistence)PortletBeanLocatorUtil.locate(com.chola.mdspeak.service.ClpSerializer.getServletContextName(),
					MdSpeaksPersistence.class.getName());

			ReferenceRegistry.registerReference(MdSpeaksUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static MdSpeaksPersistence _persistence;
}