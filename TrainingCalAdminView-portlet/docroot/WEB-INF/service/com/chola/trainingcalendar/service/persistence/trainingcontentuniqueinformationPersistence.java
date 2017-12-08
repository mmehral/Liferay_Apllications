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

package com.chola.trainingcalendar.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.trainingcalendar.exception.NoSuchtrainingcontentuniqueinformationException;
import com.chola.trainingcalendar.model.trainingcontentuniqueinformation;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the trainingcontentuniqueinformation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see com.chola.trainingcalendar.service.persistence.impl.trainingcontentuniqueinformationPersistenceImpl
 * @see trainingcontentuniqueinformationUtil
 * @generated
 */
@ProviderType
public interface trainingcontentuniqueinformationPersistence
	extends BasePersistence<trainingcontentuniqueinformation> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link trainingcontentuniqueinformationUtil} to access the trainingcontentuniqueinformation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the trainingcontentuniqueinformations where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the matching trainingcontentuniqueinformations
	*/
	public java.util.List<trainingcontentuniqueinformation> findByCONTENTID(
		long content_id);

	/**
	* Returns a range of all the trainingcontentuniqueinformations where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of trainingcontentuniqueinformations
	* @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	* @return the range of matching trainingcontentuniqueinformations
	*/
	public java.util.List<trainingcontentuniqueinformation> findByCONTENTID(
		long content_id, int start, int end);

	/**
	* Returns an ordered range of all the trainingcontentuniqueinformations where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of trainingcontentuniqueinformations
	* @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching trainingcontentuniqueinformations
	*/
	public java.util.List<trainingcontentuniqueinformation> findByCONTENTID(
		long content_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<trainingcontentuniqueinformation> orderByComparator);

	/**
	* Returns an ordered range of all the trainingcontentuniqueinformations where content_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param content_id the content_id
	* @param start the lower bound of the range of trainingcontentuniqueinformations
	* @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching trainingcontentuniqueinformations
	*/
	public java.util.List<trainingcontentuniqueinformation> findByCONTENTID(
		long content_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<trainingcontentuniqueinformation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first trainingcontentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching trainingcontentuniqueinformation
	* @throws NoSuchtrainingcontentuniqueinformationException if a matching trainingcontentuniqueinformation could not be found
	*/
	public trainingcontentuniqueinformation findByCONTENTID_First(
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<trainingcontentuniqueinformation> orderByComparator)
		throws NoSuchtrainingcontentuniqueinformationException;

	/**
	* Returns the first trainingcontentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching trainingcontentuniqueinformation, or <code>null</code> if a matching trainingcontentuniqueinformation could not be found
	*/
	public trainingcontentuniqueinformation fetchByCONTENTID_First(
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<trainingcontentuniqueinformation> orderByComparator);

	/**
	* Returns the last trainingcontentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching trainingcontentuniqueinformation
	* @throws NoSuchtrainingcontentuniqueinformationException if a matching trainingcontentuniqueinformation could not be found
	*/
	public trainingcontentuniqueinformation findByCONTENTID_Last(
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<trainingcontentuniqueinformation> orderByComparator)
		throws NoSuchtrainingcontentuniqueinformationException;

	/**
	* Returns the last trainingcontentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching trainingcontentuniqueinformation, or <code>null</code> if a matching trainingcontentuniqueinformation could not be found
	*/
	public trainingcontentuniqueinformation fetchByCONTENTID_Last(
		long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<trainingcontentuniqueinformation> orderByComparator);

	/**
	* Returns the trainingcontentuniqueinformations before and after the current trainingcontentuniqueinformation in the ordered set where content_id = &#63;.
	*
	* @param id the primary key of the current trainingcontentuniqueinformation
	* @param content_id the content_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next trainingcontentuniqueinformation
	* @throws NoSuchtrainingcontentuniqueinformationException if a trainingcontentuniqueinformation with the primary key could not be found
	*/
	public trainingcontentuniqueinformation[] findByCONTENTID_PrevAndNext(
		long id, long content_id,
		com.liferay.portal.kernel.util.OrderByComparator<trainingcontentuniqueinformation> orderByComparator)
		throws NoSuchtrainingcontentuniqueinformationException;

	/**
	* Removes all the trainingcontentuniqueinformations where content_id = &#63; from the database.
	*
	* @param content_id the content_id
	*/
	public void removeByCONTENTID(long content_id);

	/**
	* Returns the number of trainingcontentuniqueinformations where content_id = &#63;.
	*
	* @param content_id the content_id
	* @return the number of matching trainingcontentuniqueinformations
	*/
	public int countByCONTENTID(long content_id);

	/**
	* Returns all the trainingcontentuniqueinformations where training_id = &#63;.
	*
	* @param training_id the training_id
	* @return the matching trainingcontentuniqueinformations
	*/
	public java.util.List<trainingcontentuniqueinformation> findByTRAININGID(
		long training_id);

	/**
	* Returns a range of all the trainingcontentuniqueinformations where training_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param training_id the training_id
	* @param start the lower bound of the range of trainingcontentuniqueinformations
	* @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	* @return the range of matching trainingcontentuniqueinformations
	*/
	public java.util.List<trainingcontentuniqueinformation> findByTRAININGID(
		long training_id, int start, int end);

	/**
	* Returns an ordered range of all the trainingcontentuniqueinformations where training_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param training_id the training_id
	* @param start the lower bound of the range of trainingcontentuniqueinformations
	* @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching trainingcontentuniqueinformations
	*/
	public java.util.List<trainingcontentuniqueinformation> findByTRAININGID(
		long training_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<trainingcontentuniqueinformation> orderByComparator);

	/**
	* Returns an ordered range of all the trainingcontentuniqueinformations where training_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param training_id the training_id
	* @param start the lower bound of the range of trainingcontentuniqueinformations
	* @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching trainingcontentuniqueinformations
	*/
	public java.util.List<trainingcontentuniqueinformation> findByTRAININGID(
		long training_id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<trainingcontentuniqueinformation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first trainingcontentuniqueinformation in the ordered set where training_id = &#63;.
	*
	* @param training_id the training_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching trainingcontentuniqueinformation
	* @throws NoSuchtrainingcontentuniqueinformationException if a matching trainingcontentuniqueinformation could not be found
	*/
	public trainingcontentuniqueinformation findByTRAININGID_First(
		long training_id,
		com.liferay.portal.kernel.util.OrderByComparator<trainingcontentuniqueinformation> orderByComparator)
		throws NoSuchtrainingcontentuniqueinformationException;

	/**
	* Returns the first trainingcontentuniqueinformation in the ordered set where training_id = &#63;.
	*
	* @param training_id the training_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching trainingcontentuniqueinformation, or <code>null</code> if a matching trainingcontentuniqueinformation could not be found
	*/
	public trainingcontentuniqueinformation fetchByTRAININGID_First(
		long training_id,
		com.liferay.portal.kernel.util.OrderByComparator<trainingcontentuniqueinformation> orderByComparator);

	/**
	* Returns the last trainingcontentuniqueinformation in the ordered set where training_id = &#63;.
	*
	* @param training_id the training_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching trainingcontentuniqueinformation
	* @throws NoSuchtrainingcontentuniqueinformationException if a matching trainingcontentuniqueinformation could not be found
	*/
	public trainingcontentuniqueinformation findByTRAININGID_Last(
		long training_id,
		com.liferay.portal.kernel.util.OrderByComparator<trainingcontentuniqueinformation> orderByComparator)
		throws NoSuchtrainingcontentuniqueinformationException;

	/**
	* Returns the last trainingcontentuniqueinformation in the ordered set where training_id = &#63;.
	*
	* @param training_id the training_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching trainingcontentuniqueinformation, or <code>null</code> if a matching trainingcontentuniqueinformation could not be found
	*/
	public trainingcontentuniqueinformation fetchByTRAININGID_Last(
		long training_id,
		com.liferay.portal.kernel.util.OrderByComparator<trainingcontentuniqueinformation> orderByComparator);

	/**
	* Returns the trainingcontentuniqueinformations before and after the current trainingcontentuniqueinformation in the ordered set where training_id = &#63;.
	*
	* @param id the primary key of the current trainingcontentuniqueinformation
	* @param training_id the training_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next trainingcontentuniqueinformation
	* @throws NoSuchtrainingcontentuniqueinformationException if a trainingcontentuniqueinformation with the primary key could not be found
	*/
	public trainingcontentuniqueinformation[] findByTRAININGID_PrevAndNext(
		long id, long training_id,
		com.liferay.portal.kernel.util.OrderByComparator<trainingcontentuniqueinformation> orderByComparator)
		throws NoSuchtrainingcontentuniqueinformationException;

	/**
	* Removes all the trainingcontentuniqueinformations where training_id = &#63; from the database.
	*
	* @param training_id the training_id
	*/
	public void removeByTRAININGID(long training_id);

	/**
	* Returns the number of trainingcontentuniqueinformations where training_id = &#63;.
	*
	* @param training_id the training_id
	* @return the number of matching trainingcontentuniqueinformations
	*/
	public int countByTRAININGID(long training_id);

	/**
	* Caches the trainingcontentuniqueinformation in the entity cache if it is enabled.
	*
	* @param trainingcontentuniqueinformation the trainingcontentuniqueinformation
	*/
	public void cacheResult(
		trainingcontentuniqueinformation trainingcontentuniqueinformation);

	/**
	* Caches the trainingcontentuniqueinformations in the entity cache if it is enabled.
	*
	* @param trainingcontentuniqueinformations the trainingcontentuniqueinformations
	*/
	public void cacheResult(
		java.util.List<trainingcontentuniqueinformation> trainingcontentuniqueinformations);

	/**
	* Creates a new trainingcontentuniqueinformation with the primary key. Does not add the trainingcontentuniqueinformation to the database.
	*
	* @param id the primary key for the new trainingcontentuniqueinformation
	* @return the new trainingcontentuniqueinformation
	*/
	public trainingcontentuniqueinformation create(long id);

	/**
	* Removes the trainingcontentuniqueinformation with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the trainingcontentuniqueinformation
	* @return the trainingcontentuniqueinformation that was removed
	* @throws NoSuchtrainingcontentuniqueinformationException if a trainingcontentuniqueinformation with the primary key could not be found
	*/
	public trainingcontentuniqueinformation remove(long id)
		throws NoSuchtrainingcontentuniqueinformationException;

	public trainingcontentuniqueinformation updateImpl(
		trainingcontentuniqueinformation trainingcontentuniqueinformation);

	/**
	* Returns the trainingcontentuniqueinformation with the primary key or throws a {@link NoSuchtrainingcontentuniqueinformationException} if it could not be found.
	*
	* @param id the primary key of the trainingcontentuniqueinformation
	* @return the trainingcontentuniqueinformation
	* @throws NoSuchtrainingcontentuniqueinformationException if a trainingcontentuniqueinformation with the primary key could not be found
	*/
	public trainingcontentuniqueinformation findByPrimaryKey(long id)
		throws NoSuchtrainingcontentuniqueinformationException;

	/**
	* Returns the trainingcontentuniqueinformation with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the trainingcontentuniqueinformation
	* @return the trainingcontentuniqueinformation, or <code>null</code> if a trainingcontentuniqueinformation with the primary key could not be found
	*/
	public trainingcontentuniqueinformation fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, trainingcontentuniqueinformation> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the trainingcontentuniqueinformations.
	*
	* @return the trainingcontentuniqueinformations
	*/
	public java.util.List<trainingcontentuniqueinformation> findAll();

	/**
	* Returns a range of all the trainingcontentuniqueinformations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingcontentuniqueinformations
	* @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	* @return the range of trainingcontentuniqueinformations
	*/
	public java.util.List<trainingcontentuniqueinformation> findAll(int start,
		int end);

	/**
	* Returns an ordered range of all the trainingcontentuniqueinformations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingcontentuniqueinformations
	* @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of trainingcontentuniqueinformations
	*/
	public java.util.List<trainingcontentuniqueinformation> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<trainingcontentuniqueinformation> orderByComparator);

	/**
	* Returns an ordered range of all the trainingcontentuniqueinformations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link trainingcontentuniqueinformationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of trainingcontentuniqueinformations
	* @param end the upper bound of the range of trainingcontentuniqueinformations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of trainingcontentuniqueinformations
	*/
	public java.util.List<trainingcontentuniqueinformation> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<trainingcontentuniqueinformation> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the trainingcontentuniqueinformations from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of trainingcontentuniqueinformations.
	*
	* @return the number of trainingcontentuniqueinformations
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}