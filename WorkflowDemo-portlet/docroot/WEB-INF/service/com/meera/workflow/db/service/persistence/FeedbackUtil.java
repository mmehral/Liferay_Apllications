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

package com.meera.workflow.db.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import com.meera.workflow.db.model.Feedback;

import java.util.List;

/**
 * The persistence utility for the feedback service. This utility wraps {@link com.meera.workflow.db.service.persistence.impl.FeedbackPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see FeedbackPersistence
 * @see com.meera.workflow.db.service.persistence.impl.FeedbackPersistenceImpl
 * @generated
 */
@ProviderType
public class FeedbackUtil {
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
	public static void clearCache(Feedback feedback) {
		getPersistence().clearCache(feedback);
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
	public static List<Feedback> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Feedback> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Feedback> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Feedback> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Feedback update(Feedback feedback) {
		return getPersistence().update(feedback);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Feedback update(Feedback feedback,
		ServiceContext serviceContext) {
		return getPersistence().update(feedback, serviceContext);
	}

	/**
	* Returns all the feedbacks where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching feedbacks
	*/
	public static List<Feedback> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the feedbacks where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @return the range of matching feedbacks
	*/
	public static List<Feedback> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the feedbacks where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedbacks
	*/
	public static List<Feedback> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Feedback> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the feedbacks where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching feedbacks
	*/
	public static List<Feedback> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Feedback> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first feedback in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public static Feedback findByUuid_First(java.lang.String uuid,
		OrderByComparator<Feedback> orderByComparator)
		throws com.meera.workflow.db.exception.NoSuchFeedbackException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first feedback in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public static Feedback fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Feedback> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last feedback in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public static Feedback findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Feedback> orderByComparator)
		throws com.meera.workflow.db.exception.NoSuchFeedbackException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last feedback in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public static Feedback fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Feedback> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the feedbacks before and after the current feedback in the ordered set where uuid = &#63;.
	*
	* @param feedbackId the primary key of the current feedback
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedback
	* @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	*/
	public static Feedback[] findByUuid_PrevAndNext(long feedbackId,
		java.lang.String uuid, OrderByComparator<Feedback> orderByComparator)
		throws com.meera.workflow.db.exception.NoSuchFeedbackException {
		return getPersistence()
				   .findByUuid_PrevAndNext(feedbackId, uuid, orderByComparator);
	}

	/**
	* Removes all the feedbacks where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of feedbacks where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching feedbacks
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the feedback where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchFeedbackException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public static Feedback findByUUID_G(java.lang.String uuid, long groupId)
		throws com.meera.workflow.db.exception.NoSuchFeedbackException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the feedback where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public static Feedback fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the feedback where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public static Feedback fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the feedback where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the feedback that was removed
	*/
	public static Feedback removeByUUID_G(java.lang.String uuid, long groupId)
		throws com.meera.workflow.db.exception.NoSuchFeedbackException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of feedbacks where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching feedbacks
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the feedbacks where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching feedbacks
	*/
	public static List<Feedback> findByUuid_C(java.lang.String uuid,
		long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the feedbacks where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @return the range of matching feedbacks
	*/
	public static List<Feedback> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the feedbacks where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedbacks
	*/
	public static List<Feedback> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Feedback> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the feedbacks where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching feedbacks
	*/
	public static List<Feedback> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Feedback> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first feedback in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public static Feedback findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Feedback> orderByComparator)
		throws com.meera.workflow.db.exception.NoSuchFeedbackException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first feedback in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public static Feedback fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Feedback> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last feedback in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public static Feedback findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Feedback> orderByComparator)
		throws com.meera.workflow.db.exception.NoSuchFeedbackException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last feedback in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public static Feedback fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Feedback> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the feedbacks before and after the current feedback in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param feedbackId the primary key of the current feedback
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedback
	* @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	*/
	public static Feedback[] findByUuid_C_PrevAndNext(long feedbackId,
		java.lang.String uuid, long companyId,
		OrderByComparator<Feedback> orderByComparator)
		throws com.meera.workflow.db.exception.NoSuchFeedbackException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(feedbackId, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the feedbacks where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of feedbacks where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching feedbacks
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the feedbacks where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching feedbacks
	*/
	public static List<Feedback> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	* Returns a range of all the feedbacks where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @return the range of matching feedbacks
	*/
	public static List<Feedback> findByGroupId(long groupId, int start, int end) {
		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	* Returns an ordered range of all the feedbacks where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedbacks
	*/
	public static List<Feedback> findByGroupId(long groupId, int start,
		int end, OrderByComparator<Feedback> orderByComparator) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the feedbacks where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching feedbacks
	*/
	public static List<Feedback> findByGroupId(long groupId, int start,
		int end, OrderByComparator<Feedback> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByGroupId(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first feedback in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public static Feedback findByGroupId_First(long groupId,
		OrderByComparator<Feedback> orderByComparator)
		throws com.meera.workflow.db.exception.NoSuchFeedbackException {
		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the first feedback in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public static Feedback fetchByGroupId_First(long groupId,
		OrderByComparator<Feedback> orderByComparator) {
		return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
	}

	/**
	* Returns the last feedback in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public static Feedback findByGroupId_Last(long groupId,
		OrderByComparator<Feedback> orderByComparator)
		throws com.meera.workflow.db.exception.NoSuchFeedbackException {
		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last feedback in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public static Feedback fetchByGroupId_Last(long groupId,
		OrderByComparator<Feedback> orderByComparator) {
		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	* Returns the feedbacks before and after the current feedback in the ordered set where groupId = &#63;.
	*
	* @param feedbackId the primary key of the current feedback
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedback
	* @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	*/
	public static Feedback[] findByGroupId_PrevAndNext(long feedbackId,
		long groupId, OrderByComparator<Feedback> orderByComparator)
		throws com.meera.workflow.db.exception.NoSuchFeedbackException {
		return getPersistence()
				   .findByGroupId_PrevAndNext(feedbackId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the feedbacks where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	* Returns the number of feedbacks where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching feedbacks
	*/
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	* Returns all the feedbacks where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching feedbacks
	*/
	public static List<Feedback> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	* Returns a range of all the feedbacks where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @return the range of matching feedbacks
	*/
	public static List<Feedback> findByCompanyId(long companyId, int start,
		int end) {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	* Returns an ordered range of all the feedbacks where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedbacks
	*/
	public static List<Feedback> findByCompanyId(long companyId, int start,
		int end, OrderByComparator<Feedback> orderByComparator) {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the feedbacks where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param companyId the company ID
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching feedbacks
	*/
	public static List<Feedback> findByCompanyId(long companyId, int start,
		int end, OrderByComparator<Feedback> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first feedback in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public static Feedback findByCompanyId_First(long companyId,
		OrderByComparator<Feedback> orderByComparator)
		throws com.meera.workflow.db.exception.NoSuchFeedbackException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the first feedback in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public static Feedback fetchByCompanyId_First(long companyId,
		OrderByComparator<Feedback> orderByComparator) {
		return getPersistence()
				   .fetchByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Returns the last feedback in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public static Feedback findByCompanyId_Last(long companyId,
		OrderByComparator<Feedback> orderByComparator)
		throws com.meera.workflow.db.exception.NoSuchFeedbackException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the last feedback in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public static Feedback fetchByCompanyId_Last(long companyId,
		OrderByComparator<Feedback> orderByComparator) {
		return getPersistence()
				   .fetchByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Returns the feedbacks before and after the current feedback in the ordered set where companyId = &#63;.
	*
	* @param feedbackId the primary key of the current feedback
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedback
	* @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	*/
	public static Feedback[] findByCompanyId_PrevAndNext(long feedbackId,
		long companyId, OrderByComparator<Feedback> orderByComparator)
		throws com.meera.workflow.db.exception.NoSuchFeedbackException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(feedbackId, companyId,
			orderByComparator);
	}

	/**
	* Removes all the feedbacks where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	*/
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Returns the number of feedbacks where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching feedbacks
	*/
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Returns all the feedbacks where feedbackText = &#63;.
	*
	* @param feedbackText the feedback text
	* @return the matching feedbacks
	*/
	public static List<Feedback> findByfeedbackText(
		java.lang.String feedbackText) {
		return getPersistence().findByfeedbackText(feedbackText);
	}

	/**
	* Returns a range of all the feedbacks where feedbackText = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param feedbackText the feedback text
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @return the range of matching feedbacks
	*/
	public static List<Feedback> findByfeedbackText(
		java.lang.String feedbackText, int start, int end) {
		return getPersistence().findByfeedbackText(feedbackText, start, end);
	}

	/**
	* Returns an ordered range of all the feedbacks where feedbackText = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param feedbackText the feedback text
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedbacks
	*/
	public static List<Feedback> findByfeedbackText(
		java.lang.String feedbackText, int start, int end,
		OrderByComparator<Feedback> orderByComparator) {
		return getPersistence()
				   .findByfeedbackText(feedbackText, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the feedbacks where feedbackText = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param feedbackText the feedback text
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching feedbacks
	*/
	public static List<Feedback> findByfeedbackText(
		java.lang.String feedbackText, int start, int end,
		OrderByComparator<Feedback> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByfeedbackText(feedbackText, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first feedback in the ordered set where feedbackText = &#63;.
	*
	* @param feedbackText the feedback text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public static Feedback findByfeedbackText_First(
		java.lang.String feedbackText,
		OrderByComparator<Feedback> orderByComparator)
		throws com.meera.workflow.db.exception.NoSuchFeedbackException {
		return getPersistence()
				   .findByfeedbackText_First(feedbackText, orderByComparator);
	}

	/**
	* Returns the first feedback in the ordered set where feedbackText = &#63;.
	*
	* @param feedbackText the feedback text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public static Feedback fetchByfeedbackText_First(
		java.lang.String feedbackText,
		OrderByComparator<Feedback> orderByComparator) {
		return getPersistence()
				   .fetchByfeedbackText_First(feedbackText, orderByComparator);
	}

	/**
	* Returns the last feedback in the ordered set where feedbackText = &#63;.
	*
	* @param feedbackText the feedback text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public static Feedback findByfeedbackText_Last(
		java.lang.String feedbackText,
		OrderByComparator<Feedback> orderByComparator)
		throws com.meera.workflow.db.exception.NoSuchFeedbackException {
		return getPersistence()
				   .findByfeedbackText_Last(feedbackText, orderByComparator);
	}

	/**
	* Returns the last feedback in the ordered set where feedbackText = &#63;.
	*
	* @param feedbackText the feedback text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public static Feedback fetchByfeedbackText_Last(
		java.lang.String feedbackText,
		OrderByComparator<Feedback> orderByComparator) {
		return getPersistence()
				   .fetchByfeedbackText_Last(feedbackText, orderByComparator);
	}

	/**
	* Returns the feedbacks before and after the current feedback in the ordered set where feedbackText = &#63;.
	*
	* @param feedbackId the primary key of the current feedback
	* @param feedbackText the feedback text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedback
	* @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	*/
	public static Feedback[] findByfeedbackText_PrevAndNext(long feedbackId,
		java.lang.String feedbackText,
		OrderByComparator<Feedback> orderByComparator)
		throws com.meera.workflow.db.exception.NoSuchFeedbackException {
		return getPersistence()
				   .findByfeedbackText_PrevAndNext(feedbackId, feedbackText,
			orderByComparator);
	}

	/**
	* Removes all the feedbacks where feedbackText = &#63; from the database.
	*
	* @param feedbackText the feedback text
	*/
	public static void removeByfeedbackText(java.lang.String feedbackText) {
		getPersistence().removeByfeedbackText(feedbackText);
	}

	/**
	* Returns the number of feedbacks where feedbackText = &#63;.
	*
	* @param feedbackText the feedback text
	* @return the number of matching feedbacks
	*/
	public static int countByfeedbackText(java.lang.String feedbackText) {
		return getPersistence().countByfeedbackText(feedbackText);
	}

	/**
	* Returns all the feedbacks where groupId = &#63; and feedBackStatus = &#63;.
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @return the matching feedbacks
	*/
	public static List<Feedback> findByG_S(long groupId, int feedBackStatus) {
		return getPersistence().findByG_S(groupId, feedBackStatus);
	}

	/**
	* Returns a range of all the feedbacks where groupId = &#63; and feedBackStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @return the range of matching feedbacks
	*/
	public static List<Feedback> findByG_S(long groupId, int feedBackStatus,
		int start, int end) {
		return getPersistence().findByG_S(groupId, feedBackStatus, start, end);
	}

	/**
	* Returns an ordered range of all the feedbacks where groupId = &#63; and feedBackStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedbacks
	*/
	public static List<Feedback> findByG_S(long groupId, int feedBackStatus,
		int start, int end, OrderByComparator<Feedback> orderByComparator) {
		return getPersistence()
				   .findByG_S(groupId, feedBackStatus, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the feedbacks where groupId = &#63; and feedBackStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching feedbacks
	*/
	public static List<Feedback> findByG_S(long groupId, int feedBackStatus,
		int start, int end, OrderByComparator<Feedback> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByG_S(groupId, feedBackStatus, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first feedback in the ordered set where groupId = &#63; and feedBackStatus = &#63;.
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public static Feedback findByG_S_First(long groupId, int feedBackStatus,
		OrderByComparator<Feedback> orderByComparator)
		throws com.meera.workflow.db.exception.NoSuchFeedbackException {
		return getPersistence()
				   .findByG_S_First(groupId, feedBackStatus, orderByComparator);
	}

	/**
	* Returns the first feedback in the ordered set where groupId = &#63; and feedBackStatus = &#63;.
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public static Feedback fetchByG_S_First(long groupId, int feedBackStatus,
		OrderByComparator<Feedback> orderByComparator) {
		return getPersistence()
				   .fetchByG_S_First(groupId, feedBackStatus, orderByComparator);
	}

	/**
	* Returns the last feedback in the ordered set where groupId = &#63; and feedBackStatus = &#63;.
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public static Feedback findByG_S_Last(long groupId, int feedBackStatus,
		OrderByComparator<Feedback> orderByComparator)
		throws com.meera.workflow.db.exception.NoSuchFeedbackException {
		return getPersistence()
				   .findByG_S_Last(groupId, feedBackStatus, orderByComparator);
	}

	/**
	* Returns the last feedback in the ordered set where groupId = &#63; and feedBackStatus = &#63;.
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public static Feedback fetchByG_S_Last(long groupId, int feedBackStatus,
		OrderByComparator<Feedback> orderByComparator) {
		return getPersistence()
				   .fetchByG_S_Last(groupId, feedBackStatus, orderByComparator);
	}

	/**
	* Returns the feedbacks before and after the current feedback in the ordered set where groupId = &#63; and feedBackStatus = &#63;.
	*
	* @param feedbackId the primary key of the current feedback
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedback
	* @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	*/
	public static Feedback[] findByG_S_PrevAndNext(long feedbackId,
		long groupId, int feedBackStatus,
		OrderByComparator<Feedback> orderByComparator)
		throws com.meera.workflow.db.exception.NoSuchFeedbackException {
		return getPersistence()
				   .findByG_S_PrevAndNext(feedbackId, groupId, feedBackStatus,
			orderByComparator);
	}

	/**
	* Removes all the feedbacks where groupId = &#63; and feedBackStatus = &#63; from the database.
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	*/
	public static void removeByG_S(long groupId, int feedBackStatus) {
		getPersistence().removeByG_S(groupId, feedBackStatus);
	}

	/**
	* Returns the number of feedbacks where groupId = &#63; and feedBackStatus = &#63;.
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @return the number of matching feedbacks
	*/
	public static int countByG_S(long groupId, int feedBackStatus) {
		return getPersistence().countByG_S(groupId, feedBackStatus);
	}

	/**
	* Caches the feedback in the entity cache if it is enabled.
	*
	* @param feedback the feedback
	*/
	public static void cacheResult(Feedback feedback) {
		getPersistence().cacheResult(feedback);
	}

	/**
	* Caches the feedbacks in the entity cache if it is enabled.
	*
	* @param feedbacks the feedbacks
	*/
	public static void cacheResult(List<Feedback> feedbacks) {
		getPersistence().cacheResult(feedbacks);
	}

	/**
	* Creates a new feedback with the primary key. Does not add the feedback to the database.
	*
	* @param feedbackId the primary key for the new feedback
	* @return the new feedback
	*/
	public static Feedback create(long feedbackId) {
		return getPersistence().create(feedbackId);
	}

	/**
	* Removes the feedback with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param feedbackId the primary key of the feedback
	* @return the feedback that was removed
	* @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	*/
	public static Feedback remove(long feedbackId)
		throws com.meera.workflow.db.exception.NoSuchFeedbackException {
		return getPersistence().remove(feedbackId);
	}

	public static Feedback updateImpl(Feedback feedback) {
		return getPersistence().updateImpl(feedback);
	}

	/**
	* Returns the feedback with the primary key or throws a {@link NoSuchFeedbackException} if it could not be found.
	*
	* @param feedbackId the primary key of the feedback
	* @return the feedback
	* @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	*/
	public static Feedback findByPrimaryKey(long feedbackId)
		throws com.meera.workflow.db.exception.NoSuchFeedbackException {
		return getPersistence().findByPrimaryKey(feedbackId);
	}

	/**
	* Returns the feedback with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param feedbackId the primary key of the feedback
	* @return the feedback, or <code>null</code> if a feedback with the primary key could not be found
	*/
	public static Feedback fetchByPrimaryKey(long feedbackId) {
		return getPersistence().fetchByPrimaryKey(feedbackId);
	}

	public static java.util.Map<java.io.Serializable, Feedback> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the feedbacks.
	*
	* @return the feedbacks
	*/
	public static List<Feedback> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the feedbacks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @return the range of feedbacks
	*/
	public static List<Feedback> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the feedbacks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of feedbacks
	*/
	public static List<Feedback> findAll(int start, int end,
		OrderByComparator<Feedback> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the feedbacks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of feedbacks
	*/
	public static List<Feedback> findAll(int start, int end,
		OrderByComparator<Feedback> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the feedbacks from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of feedbacks.
	*
	* @return the number of feedbacks
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static FeedbackPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (FeedbackPersistence)PortletBeanLocatorUtil.locate(com.meera.workflow.db.service.ClpSerializer.getServletContextName(),
					FeedbackPersistence.class.getName());

			ReferenceRegistry.registerReference(FeedbackUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static FeedbackPersistence _persistence;
}