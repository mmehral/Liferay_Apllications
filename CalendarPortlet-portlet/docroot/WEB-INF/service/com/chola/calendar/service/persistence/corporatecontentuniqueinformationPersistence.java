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

import com.chola.calendar.exception.NoSuchcorporatecontentuniqueinformationException;
import com.chola.calendar.model.corporatecontentuniqueinformation;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the corporatecontentuniqueinformation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see com.chola.calendar.service.persistence.impl.corporatecontentuniqueinformationPersistenceImpl
 * @see corporatecontentuniqueinformationUtil
 * @generated
 */
@ProviderType
public interface corporatecontentuniqueinformationPersistence
	extends BasePersistence<corporatecontentuniqueinformation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link corporatecontentuniqueinformationUtil} to access the corporatecontentuniqueinformation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the corporatecontentuniqueinformations where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching corporatecontentuniqueinformations
	*/
	public java.util.List<corporatecontentuniqueinformation> findByCONTENTID(
		long content_id);

	/**
	* Returns a range of all the corporatecontentuniqueinformations where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of corporatecontentuniqueinformations
	* @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	* @return the range of matching corporatecontentuniqueinformations
	*/
	public java.util.List<corporatecontentuniqueinformation> findByCONTENTID(
		long content_id, int start, int end);

	/**
	* Returns an ordered range of all the corporatecontentuniqueinformations where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of corporatecontentuniqueinformations
	* @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching corporatecontentuniqueinformations
	*/
	public java.util.List<corporatecontentuniqueinformation> findByCONTENTID(
		long content_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<corporatecontentuniqueinformation> orderByComparator);

	/**
	* Returns an ordered range of all the corporatecontentuniqueinformations where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of corporatecontentuniqueinformations
	* @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching corporatecontentuniqueinformations
	*/
	public java.util.List<corporatecontentuniqueinformation> findByCONTENTID(
		long content_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<corporatecontentuniqueinformation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first corporatecontentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporatecontentuniqueinformation
	* @throws NoSuchcorporatecontentuniqueinformationException if a matching corporatecontentuniqueinformation could not be found
	*/
	public corporatecontentuniqueinformation findByCONTENTID_First(
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<corporatecontentuniqueinformation> orderByComparator)
		throws NoSuchcorporatecontentuniqueinformationException;

	/**
	* Returns the first corporatecontentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporatecontentuniqueinformation, or <code>null</code> if a matching corporatecontentuniqueinformation could not be found
	*/
	public corporatecontentuniqueinformation fetchByCONTENTID_First(
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<corporatecontentuniqueinformation> orderByComparator);

	/**
	* Returns the last corporatecontentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporatecontentuniqueinformation
	* @throws NoSuchcorporatecontentuniqueinformationException if a matching corporatecontentuniqueinformation could not be found
	*/
	public corporatecontentuniqueinformation findByCONTENTID_Last(
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<corporatecontentuniqueinformation> orderByComparator)
		throws NoSuchcorporatecontentuniqueinformationException;

	/**
	* Returns the last corporatecontentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporatecontentuniqueinformation, or <code>null</code> if a matching corporatecontentuniqueinformation could not be found
	*/
	public corporatecontentuniqueinformation fetchByCONTENTID_Last(
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<corporatecontentuniqueinformation> orderByComparator);

	/**
	* Returns the corporatecontentuniqueinformations before and after the current corporatecontentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current corporatecontentuniqueinformation
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next corporatecontentuniqueinformation
	* @throws NoSuchcorporatecontentuniqueinformationException if a corporatecontentuniqueinformation with the primary key could not be found
	*/
	public corporatecontentuniqueinformation[] findByCONTENTID_PrevAndNext(
		long id, long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<corporatecontentuniqueinformation> orderByComparator)
		throws NoSuchcorporatecontentuniqueinformationException;

	/**
	* Removes all the corporatecontentuniqueinformations where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public void removeByCONTENTID(long content_id);

	/**
	* Returns the number of corporatecontentuniqueinformations where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching corporatecontentuniqueinformations
	*/
	public int countByCONTENTID(long content_id);

	/**
	* Returns all the corporatecontentuniqueinformations where corporatevent_id = &#63;.
	*
	* @param corporatevent_id the corporatevent_id
	* @return the matching corporatecontentuniqueinformations
	*/
	public java.util.List<corporatecontentuniqueinformation> findByCORPORATEEVENTID(
		long corporatevent_id);

	/**
	* Returns a range of all the corporatecontentuniqueinformations where corporatevent_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporatevent_id the corporatevent_id
	* @param start the lower bound of the range of corporatecontentuniqueinformations
	* @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	* @return the range of matching corporatecontentuniqueinformations
	*/
	public java.util.List<corporatecontentuniqueinformation> findByCORPORATEEVENTID(
		long corporatevent_id, int start, int end);

	/**
	* Returns an ordered range of all the corporatecontentuniqueinformations where corporatevent_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporatevent_id the corporatevent_id
	* @param start the lower bound of the range of corporatecontentuniqueinformations
	* @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching corporatecontentuniqueinformations
	*/
	public java.util.List<corporatecontentuniqueinformation> findByCORPORATEEVENTID(
		long corporatevent_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<corporatecontentuniqueinformation> orderByComparator);

	/**
	* Returns an ordered range of all the corporatecontentuniqueinformations where corporatevent_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param corporatevent_id the corporatevent_id
	* @param start the lower bound of the range of corporatecontentuniqueinformations
	* @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching corporatecontentuniqueinformations
	*/
	public java.util.List<corporatecontentuniqueinformation> findByCORPORATEEVENTID(
		long corporatevent_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<corporatecontentuniqueinformation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first corporatecontentuniqueinformation in the ordered set where corporatevent_id = &#63;.
	*
	* @param corporatevent_id the corporatevent_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporatecontentuniqueinformation
	* @throws NoSuchcorporatecontentuniqueinformationException if a matching corporatecontentuniqueinformation could not be found
	*/
	public corporatecontentuniqueinformation findByCORPORATEEVENTID_First(
		long corporatevent_id,
		com.liferay.portal.kernel.util.OrderByComparator<corporatecontentuniqueinformation> orderByComparator)
		throws NoSuchcorporatecontentuniqueinformationException;

	/**
	* Returns the first corporatecontentuniqueinformation in the ordered set where corporatevent_id = &#63;.
	*
	* @param corporatevent_id the corporatevent_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching corporatecontentuniqueinformation, or <code>null</code> if a matching corporatecontentuniqueinformation could not be found
	*/
	public corporatecontentuniqueinformation fetchByCORPORATEEVENTID_First(
		long corporatevent_id,
		com.liferay.portal.kernel.util.OrderByComparator<corporatecontentuniqueinformation> orderByComparator);

	/**
	* Returns the last corporatecontentuniqueinformation in the ordered set where corporatevent_id = &#63;.
	*
	* @param corporatevent_id the corporatevent_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporatecontentuniqueinformation
	* @throws NoSuchcorporatecontentuniqueinformationException if a matching corporatecontentuniqueinformation could not be found
	*/
	public corporatecontentuniqueinformation findByCORPORATEEVENTID_Last(
		long corporatevent_id,
		com.liferay.portal.kernel.util.OrderByComparator<corporatecontentuniqueinformation> orderByComparator)
		throws NoSuchcorporatecontentuniqueinformationException;

	/**
	* Returns the last corporatecontentuniqueinformation in the ordered set where corporatevent_id = &#63;.
	*
	* @param corporatevent_id the corporatevent_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching corporatecontentuniqueinformation, or <code>null</code> if a matching corporatecontentuniqueinformation could not be found
	*/
	public corporatecontentuniqueinformation fetchByCORPORATEEVENTID_Last(
		long corporatevent_id,
		com.liferay.portal.kernel.util.OrderByComparator<corporatecontentuniqueinformation> orderByComparator);

	/**
	* Returns the corporatecontentuniqueinformations before and after the current corporatecontentuniqueinformation in the ordered set where corporatevent_id = &#63;.
	*
	* @param id the primary key of the current corporatecontentuniqueinformation
	* @param corporatevent_id the corporatevent_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next corporatecontentuniqueinformation
	* @throws NoSuchcorporatecontentuniqueinformationException if a corporatecontentuniqueinformation with the primary key could not be found
	*/
	public corporatecontentuniqueinformation[] findByCORPORATEEVENTID_PrevAndNext(
		long id, long corporatevent_id,
		com.liferay.portal.kernel.util.OrderByComparator<corporatecontentuniqueinformation> orderByComparator)
		throws NoSuchcorporatecontentuniqueinformationException;

	/**
	* Removes all the corporatecontentuniqueinformations where corporatevent_id = &#63; from the database.
	*
	* @param corporatevent_id the corporatevent_id
	*/
	public void removeByCORPORATEEVENTID(long corporatevent_id);

	/**
	* Returns the number of corporatecontentuniqueinformations where corporatevent_id = &#63;.
	*
	* @param corporatevent_id the corporatevent_id
	* @return the number of matching corporatecontentuniqueinformations
	*/
	public int countByCORPORATEEVENTID(long corporatevent_id);

	/**
	* Caches the corporatecontentuniqueinformation in the entity cache if it is enabled.
	*
	* @param corporatecontentuniqueinformation the corporatecontentuniqueinformation
	*/
	public void cacheResult(
		corporatecontentuniqueinformation corporatecontentuniqueinformation);

	/**
	* Caches the corporatecontentuniqueinformations in the entity cache if it is enabled.
	*
	* @param corporatecontentuniqueinformations the corporatecontentuniqueinformations
	*/
	public void cacheResult(
		java.util.List<corporatecontentuniqueinformation> corporatecontentuniqueinformations);

	/**
	* Creates a new corporatecontentuniqueinformation with the primary key. Does not add the corporatecontentuniqueinformation to the database.
	*
	* @param id the primary key for the new corporatecontentuniqueinformation
	* @return the new corporatecontentuniqueinformation
	*/
	public corporatecontentuniqueinformation create(long id);

	/**
	* Removes the corporatecontentuniqueinformation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the corporatecontentuniqueinformation
	* @return the corporatecontentuniqueinformation that was removed
	* @throws NoSuchcorporatecontentuniqueinformationException if a corporatecontentuniqueinformation with the primary key could not be found
	*/
	public corporatecontentuniqueinformation remove(long id)
		throws NoSuchcorporatecontentuniqueinformationException;

	public corporatecontentuniqueinformation updateImpl(
		corporatecontentuniqueinformation corporatecontentuniqueinformation);

	/**
	* Returns the corporatecontentuniqueinformation with the primary key or throws a {@link NoSuchcorporatecontentuniqueinformationException} if it could not be found.
	*
	* @param id the primary key of the corporatecontentuniqueinformation
	* @return the corporatecontentuniqueinformation
	* @throws NoSuchcorporatecontentuniqueinformationException if a corporatecontentuniqueinformation with the primary key could not be found
	*/
	public corporatecontentuniqueinformation findByPrimaryKey(long id)
		throws NoSuchcorporatecontentuniqueinformationException;

	/**
	* Returns the corporatecontentuniqueinformation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the corporatecontentuniqueinformation
	* @return the corporatecontentuniqueinformation, or <code>null</code> if a corporatecontentuniqueinformation with the primary key could not be found
	*/
	public corporatecontentuniqueinformation fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, corporatecontentuniqueinformation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the corporatecontentuniqueinformations.
	*
	* @return the corporatecontentuniqueinformations
	*/
	public java.util.List<corporatecontentuniqueinformation> findAll();

	/**
	* Returns a range of all the corporatecontentuniqueinformations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporatecontentuniqueinformations
	* @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	* @return the range of corporatecontentuniqueinformations
	*/
	public java.util.List<corporatecontentuniqueinformation> findAll(
		int start, int end);

	/**
	* Returns an ordered range of all the corporatecontentuniqueinformations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporatecontentuniqueinformations
	* @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of corporatecontentuniqueinformations
	*/
	public java.util.List<corporatecontentuniqueinformation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<corporatecontentuniqueinformation> orderByComparator);

	/**
	* Returns an ordered range of all the corporatecontentuniqueinformations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link corporatecontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of corporatecontentuniqueinformations
	* @param end the upper bound of the range of corporatecontentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of corporatecontentuniqueinformations
	*/
	public java.util.List<corporatecontentuniqueinformation> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<corporatecontentuniqueinformation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the corporatecontentuniqueinformations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of corporatecontentuniqueinformations.
	*
	* @return the number of corporatecontentuniqueinformations
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}