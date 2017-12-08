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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.meera.workflow.db.exception.NoSuchFeedbackException;
import com.meera.workflow.db.model.Feedback;

/**
 * The persistence interface for the feedback service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see com.meera.workflow.db.service.persistence.impl.FeedbackPersistenceImpl
 * @see FeedbackUtil
 * @generated
 */
@ProviderType
public interface FeedbackPersistence extends BasePersistence<Feedback> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FeedbackUtil} to access the feedback persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the feedbacks where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching feedbacks
	*/
	public java.util.List<Feedback> findByUuid(java.lang.String uuid);

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
	public java.util.List<Feedback> findByUuid(java.lang.String uuid,
		int start, int end);

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
	public java.util.List<Feedback> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

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
	public java.util.List<Feedback> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first feedback in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the first feedback in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns the last feedback in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the last feedback in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns the feedbacks before and after the current feedback in the ordered set where uuid = &#63;.
	*
	* @param feedbackId the primary key of the current feedback
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedback
	* @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	*/
	public Feedback[] findByUuid_PrevAndNext(long feedbackId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Removes all the feedbacks where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of feedbacks where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching feedbacks
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the feedback where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchFeedbackException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchFeedbackException;

	/**
	* Returns the feedback where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the feedback where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the feedback where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the feedback that was removed
	*/
	public Feedback removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchFeedbackException;

	/**
	* Returns the number of feedbacks where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching feedbacks
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the feedbacks where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching feedbacks
	*/
	public java.util.List<Feedback> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<Feedback> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<Feedback> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

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
	public java.util.List<Feedback> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first feedback in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the first feedback in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns the last feedback in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the last feedback in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

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
	public Feedback[] findByUuid_C_PrevAndNext(long feedbackId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Removes all the feedbacks where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of feedbacks where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching feedbacks
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the feedbacks where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching feedbacks
	*/
	public java.util.List<Feedback> findByGroupId(long groupId);

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
	public java.util.List<Feedback> findByGroupId(long groupId, int start,
		int end);

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
	public java.util.List<Feedback> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

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
	public java.util.List<Feedback> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first feedback in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the first feedback in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns the last feedback in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the last feedback in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns the feedbacks before and after the current feedback in the ordered set where groupId = &#63;.
	*
	* @param feedbackId the primary key of the current feedback
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedback
	* @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	*/
	public Feedback[] findByGroupId_PrevAndNext(long feedbackId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Removes all the feedbacks where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of feedbacks where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching feedbacks
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns all the feedbacks where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the matching feedbacks
	*/
	public java.util.List<Feedback> findByCompanyId(long companyId);

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
	public java.util.List<Feedback> findByCompanyId(long companyId, int start,
		int end);

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
	public java.util.List<Feedback> findByCompanyId(long companyId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

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
	public java.util.List<Feedback> findByCompanyId(long companyId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first feedback in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the first feedback in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchByCompanyId_First(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns the last feedback in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the last feedback in the ordered set where companyId = &#63;.
	*
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchByCompanyId_Last(long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns the feedbacks before and after the current feedback in the ordered set where companyId = &#63;.
	*
	* @param feedbackId the primary key of the current feedback
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedback
	* @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	*/
	public Feedback[] findByCompanyId_PrevAndNext(long feedbackId,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Removes all the feedbacks where companyId = &#63; from the database.
	*
	* @param companyId the company ID
	*/
	public void removeByCompanyId(long companyId);

	/**
	* Returns the number of feedbacks where companyId = &#63;.
	*
	* @param companyId the company ID
	* @return the number of matching feedbacks
	*/
	public int countByCompanyId(long companyId);

	/**
	* Returns all the feedbacks where feedbackText = &#63;.
	*
	* @param feedbackText the feedback text
	* @return the matching feedbacks
	*/
	public java.util.List<Feedback> findByfeedbackText(
		java.lang.String feedbackText);

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
	public java.util.List<Feedback> findByfeedbackText(
		java.lang.String feedbackText, int start, int end);

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
	public java.util.List<Feedback> findByfeedbackText(
		java.lang.String feedbackText, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

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
	public java.util.List<Feedback> findByfeedbackText(
		java.lang.String feedbackText, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first feedback in the ordered set where feedbackText = &#63;.
	*
	* @param feedbackText the feedback text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findByfeedbackText_First(java.lang.String feedbackText,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the first feedback in the ordered set where feedbackText = &#63;.
	*
	* @param feedbackText the feedback text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchByfeedbackText_First(java.lang.String feedbackText,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns the last feedback in the ordered set where feedbackText = &#63;.
	*
	* @param feedbackText the feedback text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findByfeedbackText_Last(java.lang.String feedbackText,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the last feedback in the ordered set where feedbackText = &#63;.
	*
	* @param feedbackText the feedback text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchByfeedbackText_Last(java.lang.String feedbackText,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns the feedbacks before and after the current feedback in the ordered set where feedbackText = &#63;.
	*
	* @param feedbackId the primary key of the current feedback
	* @param feedbackText the feedback text
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedback
	* @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	*/
	public Feedback[] findByfeedbackText_PrevAndNext(long feedbackId,
		java.lang.String feedbackText,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Removes all the feedbacks where feedbackText = &#63; from the database.
	*
	* @param feedbackText the feedback text
	*/
	public void removeByfeedbackText(java.lang.String feedbackText);

	/**
	* Returns the number of feedbacks where feedbackText = &#63;.
	*
	* @param feedbackText the feedback text
	* @return the number of matching feedbacks
	*/
	public int countByfeedbackText(java.lang.String feedbackText);

	/**
	* Returns all the feedbacks where groupId = &#63; and feedBackStatus = &#63;.
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @return the matching feedbacks
	*/
	public java.util.List<Feedback> findByG_S(long groupId, int feedBackStatus);

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
	public java.util.List<Feedback> findByG_S(long groupId, int feedBackStatus,
		int start, int end);

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
	public java.util.List<Feedback> findByG_S(long groupId, int feedBackStatus,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

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
	public java.util.List<Feedback> findByG_S(long groupId, int feedBackStatus,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first feedback in the ordered set where groupId = &#63; and feedBackStatus = &#63;.
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findByG_S_First(long groupId, int feedBackStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the first feedback in the ordered set where groupId = &#63; and feedBackStatus = &#63;.
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchByG_S_First(long groupId, int feedBackStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns the last feedback in the ordered set where groupId = &#63; and feedBackStatus = &#63;.
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findByG_S_Last(long groupId, int feedBackStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the last feedback in the ordered set where groupId = &#63; and feedBackStatus = &#63;.
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchByG_S_Last(long groupId, int feedBackStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

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
	public Feedback[] findByG_S_PrevAndNext(long feedbackId, long groupId,
		int feedBackStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Removes all the feedbacks where groupId = &#63; and feedBackStatus = &#63; from the database.
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	*/
	public void removeByG_S(long groupId, int feedBackStatus);

	/**
	* Returns the number of feedbacks where groupId = &#63; and feedBackStatus = &#63;.
	*
	* @param groupId the group ID
	* @param feedBackStatus the feed back status
	* @return the number of matching feedbacks
	*/
	public int countByG_S(long groupId, int feedBackStatus);

	/**
	* Caches the feedback in the entity cache if it is enabled.
	*
	* @param feedback the feedback
	*/
	public void cacheResult(Feedback feedback);

	/**
	* Caches the feedbacks in the entity cache if it is enabled.
	*
	* @param feedbacks the feedbacks
	*/
	public void cacheResult(java.util.List<Feedback> feedbacks);

	/**
	* Creates a new feedback with the primary key. Does not add the feedback to the database.
	*
	* @param feedbackId the primary key for the new feedback
	* @return the new feedback
	*/
	public Feedback create(long feedbackId);

	/**
	* Removes the feedback with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param feedbackId the primary key of the feedback
	* @return the feedback that was removed
	* @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	*/
	public Feedback remove(long feedbackId) throws NoSuchFeedbackException;

	public Feedback updateImpl(Feedback feedback);

	/**
	* Returns the feedback with the primary key or throws a {@link NoSuchFeedbackException} if it could not be found.
	*
	* @param feedbackId the primary key of the feedback
	* @return the feedback
	* @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	*/
	public Feedback findByPrimaryKey(long feedbackId)
		throws NoSuchFeedbackException;

	/**
	* Returns the feedback with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param feedbackId the primary key of the feedback
	* @return the feedback, or <code>null</code> if a feedback with the primary key could not be found
	*/
	public Feedback fetchByPrimaryKey(long feedbackId);

	@Override
	public java.util.Map<java.io.Serializable, Feedback> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the feedbacks.
	*
	* @return the feedbacks
	*/
	public java.util.List<Feedback> findAll();

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
	public java.util.List<Feedback> findAll(int start, int end);

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
	public java.util.List<Feedback> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

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
	public java.util.List<Feedback> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the feedbacks from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of feedbacks.
	*
	* @return the number of feedbacks
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}