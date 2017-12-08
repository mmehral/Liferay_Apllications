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

package com.chola.rating.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.rating.model.Rating;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the rating service. This utility wraps {@link com.chola.rating.service.persistence.impl.RatingPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay03
 * @see RatingPersistence
 * @see com.chola.rating.service.persistence.impl.RatingPersistenceImpl
 * @generated
 */
@ProviderType
public class RatingUtil {
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
	public static void clearCache(Rating rating) {
		getPersistence().clearCache(rating);
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
	public static List<Rating> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Rating> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Rating> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Rating> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Rating update(Rating rating) {
		return getPersistence().update(rating);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Rating update(Rating rating, ServiceContext serviceContext) {
		return getPersistence().update(rating, serviceContext);
	}

	/**
	* Caches the rating in the entity cache if it is enabled.
	*
	* @param rating the rating
	*/
	public static void cacheResult(Rating rating) {
		getPersistence().cacheResult(rating);
	}

	/**
	* Caches the ratings in the entity cache if it is enabled.
	*
	* @param ratings the ratings
	*/
	public static void cacheResult(List<Rating> ratings) {
		getPersistence().cacheResult(ratings);
	}

	/**
	* Creates a new rating with the primary key. Does not add the rating to the database.
	*
	* @param ratingId the primary key for the new rating
	* @return the new rating
	*/
	public static Rating create(long ratingId) {
		return getPersistence().create(ratingId);
	}

	/**
	* Removes the rating with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ratingId the primary key of the rating
	* @return the rating that was removed
	* @throws NoSuchRatingException if a rating with the primary key could not be found
	*/
	public static Rating remove(long ratingId)
		throws com.chola.rating.exception.NoSuchRatingException {
		return getPersistence().remove(ratingId);
	}

	public static Rating updateImpl(Rating rating) {
		return getPersistence().updateImpl(rating);
	}

	/**
	* Returns the rating with the primary key or throws a {@link NoSuchRatingException} if it could not be found.
	*
	* @param ratingId the primary key of the rating
	* @return the rating
	* @throws NoSuchRatingException if a rating with the primary key could not be found
	*/
	public static Rating findByPrimaryKey(long ratingId)
		throws com.chola.rating.exception.NoSuchRatingException {
		return getPersistence().findByPrimaryKey(ratingId);
	}

	/**
	* Returns the rating with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ratingId the primary key of the rating
	* @return the rating, or <code>null</code> if a rating with the primary key could not be found
	*/
	public static Rating fetchByPrimaryKey(long ratingId) {
		return getPersistence().fetchByPrimaryKey(ratingId);
	}

	public static java.util.Map<java.io.Serializable, Rating> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ratings.
	*
	* @return the ratings
	*/
	public static List<Rating> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the ratings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ratings
	* @param end the upper bound of the range of ratings (not inclusive)
	* @return the range of ratings
	*/
	public static List<Rating> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the ratings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ratings
	* @param end the upper bound of the range of ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ratings
	*/
	public static List<Rating> findAll(int start, int end,
		OrderByComparator<Rating> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the ratings.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RatingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ratings
	* @param end the upper bound of the range of ratings (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ratings
	*/
	public static List<Rating> findAll(int start, int end,
		OrderByComparator<Rating> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ratings from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ratings.
	*
	* @return the number of ratings
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RatingPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (RatingPersistence)PortletBeanLocatorUtil.locate(com.chola.rating.service.ClpSerializer.getServletContextName(),
					RatingPersistence.class.getName());

			ReferenceRegistry.registerReference(RatingUtil.class, "_persistence");
		}

		return _persistence;
	}

	private static RatingPersistence _persistence;
}