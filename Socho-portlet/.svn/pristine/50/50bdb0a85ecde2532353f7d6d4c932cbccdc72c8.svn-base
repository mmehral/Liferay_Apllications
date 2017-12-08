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

package com.chola.socho.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.socho.exception.NoSuchtopicsException;
import com.chola.socho.model.topics;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the topics service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see com.chola.socho.service.persistence.impl.topicsPersistenceImpl
 * @see topicsUtil
 * @generated
 */
@ProviderType
public interface topicsPersistence extends BasePersistence<topics> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link topicsUtil} to access the topics persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the topicses where topicName = &#63;.
	*
	* @param topicName the topic name
	* @return the matching topicses
	*/
	public java.util.List<topics> findByTOPICS_DATA(java.lang.String topicName);

	/**
	* Returns a range of all the topicses where topicName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link topicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param topicName the topic name
	* @param start the lower bound of the range of topicses
	* @param end the upper bound of the range of topicses (not inclusive)
	* @return the range of matching topicses
	*/
	public java.util.List<topics> findByTOPICS_DATA(
		java.lang.String topicName, int start, int end);

	/**
	* Returns an ordered range of all the topicses where topicName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link topicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param topicName the topic name
	* @param start the lower bound of the range of topicses
	* @param end the upper bound of the range of topicses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching topicses
	*/
	public java.util.List<topics> findByTOPICS_DATA(
		java.lang.String topicName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<topics> orderByComparator);

	/**
	* Returns an ordered range of all the topicses where topicName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link topicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param topicName the topic name
	* @param start the lower bound of the range of topicses
	* @param end the upper bound of the range of topicses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching topicses
	*/
	public java.util.List<topics> findByTOPICS_DATA(
		java.lang.String topicName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<topics> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first topics in the ordered set where topicName = &#63;.
	*
	* @param topicName the topic name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching topics
	* @throws NoSuchtopicsException if a matching topics could not be found
	*/
	public topics findByTOPICS_DATA_First(java.lang.String topicName,
		com.liferay.portal.kernel.util.OrderByComparator<topics> orderByComparator)
		throws NoSuchtopicsException;

	/**
	* Returns the first topics in the ordered set where topicName = &#63;.
	*
	* @param topicName the topic name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching topics, or <code>null</code> if a matching topics could not be found
	*/
	public topics fetchByTOPICS_DATA_First(java.lang.String topicName,
		com.liferay.portal.kernel.util.OrderByComparator<topics> orderByComparator);

	/**
	* Returns the last topics in the ordered set where topicName = &#63;.
	*
	* @param topicName the topic name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching topics
	* @throws NoSuchtopicsException if a matching topics could not be found
	*/
	public topics findByTOPICS_DATA_Last(java.lang.String topicName,
		com.liferay.portal.kernel.util.OrderByComparator<topics> orderByComparator)
		throws NoSuchtopicsException;

	/**
	* Returns the last topics in the ordered set where topicName = &#63;.
	*
	* @param topicName the topic name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching topics, or <code>null</code> if a matching topics could not be found
	*/
	public topics fetchByTOPICS_DATA_Last(java.lang.String topicName,
		com.liferay.portal.kernel.util.OrderByComparator<topics> orderByComparator);

	/**
	* Returns the topicses before and after the current topics in the ordered set where topicName = &#63;.
	*
	* @param id the primary key of the current topics
	* @param topicName the topic name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next topics
	* @throws NoSuchtopicsException if a topics with the primary key could not be found
	*/
	public topics[] findByTOPICS_DATA_PrevAndNext(long id,
		java.lang.String topicName,
		com.liferay.portal.kernel.util.OrderByComparator<topics> orderByComparator)
		throws NoSuchtopicsException;

	/**
	* Removes all the topicses where topicName = &#63; from the database.
	*
	* @param topicName the topic name
	*/
	public void removeByTOPICS_DATA(java.lang.String topicName);

	/**
	* Returns the number of topicses where topicName = &#63;.
	*
	* @param topicName the topic name
	* @return the number of matching topicses
	*/
	public int countByTOPICS_DATA(java.lang.String topicName);

	/**
	* Caches the topics in the entity cache if it is enabled.
	*
	* @param topics the topics
	*/
	public void cacheResult(topics topics);

	/**
	* Caches the topicses in the entity cache if it is enabled.
	*
	* @param topicses the topicses
	*/
	public void cacheResult(java.util.List<topics> topicses);

	/**
	* Creates a new topics with the primary key. Does not add the topics to the database.
	*
	* @param id the primary key for the new topics
	* @return the new topics
	*/
	public topics create(long id);

	/**
	* Removes the topics with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the topics
	* @return the topics that was removed
	* @throws NoSuchtopicsException if a topics with the primary key could not be found
	*/
	public topics remove(long id) throws NoSuchtopicsException;

	public topics updateImpl(topics topics);

	/**
	* Returns the topics with the primary key or throws a {@link NoSuchtopicsException} if it could not be found.
	*
	* @param id the primary key of the topics
	* @return the topics
	* @throws NoSuchtopicsException if a topics with the primary key could not be found
	*/
	public topics findByPrimaryKey(long id) throws NoSuchtopicsException;

	/**
	* Returns the topics with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the topics
	* @return the topics, or <code>null</code> if a topics with the primary key could not be found
	*/
	public topics fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, topics> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the topicses.
	*
	* @return the topicses
	*/
	public java.util.List<topics> findAll();

	/**
	* Returns a range of all the topicses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link topicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of topicses
	* @param end the upper bound of the range of topicses (not inclusive)
	* @return the range of topicses
	*/
	public java.util.List<topics> findAll(int start, int end);

	/**
	* Returns an ordered range of all the topicses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link topicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of topicses
	* @param end the upper bound of the range of topicses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of topicses
	*/
	public java.util.List<topics> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<topics> orderByComparator);

	/**
	* Returns an ordered range of all the topicses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link topicsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of topicses
	* @param end the upper bound of the range of topicses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of topicses
	*/
	public java.util.List<topics> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<topics> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the topicses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of topicses.
	*
	* @return the number of topicses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}