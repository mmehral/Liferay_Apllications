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

import com.chola.socho.exception.NoSuchideaException;
import com.chola.socho.model.idea;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the idea service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay02
 * @see com.chola.socho.service.persistence.impl.ideaPersistenceImpl
 * @see ideaUtil
 * @generated
 */
@ProviderType
public interface ideaPersistence extends BasePersistence<idea> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ideaUtil} to access the idea persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the ideas where topic = &#63;.
	*
	* @param topic the topic
	* @return the matching ideas
	*/
	public java.util.List<idea> findByTOPICS_ID(java.lang.String topic);

	/**
	* Returns a range of all the ideas where topic = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ideaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param topic the topic
	* @param start the lower bound of the range of ideas
	* @param end the upper bound of the range of ideas (not inclusive)
	* @return the range of matching ideas
	*/
	public java.util.List<idea> findByTOPICS_ID(java.lang.String topic,
		int start, int end);

	/**
	* Returns an ordered range of all the ideas where topic = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ideaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param topic the topic
	* @param start the lower bound of the range of ideas
	* @param end the upper bound of the range of ideas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching ideas
	*/
	public java.util.List<idea> findByTOPICS_ID(java.lang.String topic,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<idea> orderByComparator);

	/**
	* Returns an ordered range of all the ideas where topic = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ideaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param topic the topic
	* @param start the lower bound of the range of ideas
	* @param end the upper bound of the range of ideas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching ideas
	*/
	public java.util.List<idea> findByTOPICS_ID(java.lang.String topic,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<idea> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first idea in the ordered set where topic = &#63;.
	*
	* @param topic the topic
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching idea
	* @throws NoSuchideaException if a matching idea could not be found
	*/
	public idea findByTOPICS_ID_First(java.lang.String topic,
		com.liferay.portal.kernel.util.OrderByComparator<idea> orderByComparator)
		throws NoSuchideaException;

	/**
	* Returns the first idea in the ordered set where topic = &#63;.
	*
	* @param topic the topic
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching idea, or <code>null</code> if a matching idea could not be found
	*/
	public idea fetchByTOPICS_ID_First(java.lang.String topic,
		com.liferay.portal.kernel.util.OrderByComparator<idea> orderByComparator);

	/**
	* Returns the last idea in the ordered set where topic = &#63;.
	*
	* @param topic the topic
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching idea
	* @throws NoSuchideaException if a matching idea could not be found
	*/
	public idea findByTOPICS_ID_Last(java.lang.String topic,
		com.liferay.portal.kernel.util.OrderByComparator<idea> orderByComparator)
		throws NoSuchideaException;

	/**
	* Returns the last idea in the ordered set where topic = &#63;.
	*
	* @param topic the topic
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching idea, or <code>null</code> if a matching idea could not be found
	*/
	public idea fetchByTOPICS_ID_Last(java.lang.String topic,
		com.liferay.portal.kernel.util.OrderByComparator<idea> orderByComparator);

	/**
	* Returns the ideas before and after the current idea in the ordered set where topic = &#63;.
	*
	* @param id the primary key of the current idea
	* @param topic the topic
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next idea
	* @throws NoSuchideaException if a idea with the primary key could not be found
	*/
	public idea[] findByTOPICS_ID_PrevAndNext(long id, java.lang.String topic,
		com.liferay.portal.kernel.util.OrderByComparator<idea> orderByComparator)
		throws NoSuchideaException;

	/**
	* Removes all the ideas where topic = &#63; from the database.
	*
	* @param topic the topic
	*/
	public void removeByTOPICS_ID(java.lang.String topic);

	/**
	* Returns the number of ideas where topic = &#63;.
	*
	* @param topic the topic
	* @return the number of matching ideas
	*/
	public int countByTOPICS_ID(java.lang.String topic);

	/**
	* Caches the idea in the entity cache if it is enabled.
	*
	* @param idea the idea
	*/
	public void cacheResult(idea idea);

	/**
	* Caches the ideas in the entity cache if it is enabled.
	*
	* @param ideas the ideas
	*/
	public void cacheResult(java.util.List<idea> ideas);

	/**
	* Creates a new idea with the primary key. Does not add the idea to the database.
	*
	* @param id the primary key for the new idea
	* @return the new idea
	*/
	public idea create(long id);

	/**
	* Removes the idea with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the idea
	* @return the idea that was removed
	* @throws NoSuchideaException if a idea with the primary key could not be found
	*/
	public idea remove(long id) throws NoSuchideaException;

	public idea updateImpl(idea idea);

	/**
	* Returns the idea with the primary key or throws a {@link NoSuchideaException} if it could not be found.
	*
	* @param id the primary key of the idea
	* @return the idea
	* @throws NoSuchideaException if a idea with the primary key could not be found
	*/
	public idea findByPrimaryKey(long id) throws NoSuchideaException;

	/**
	* Returns the idea with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the idea
	* @return the idea, or <code>null</code> if a idea with the primary key could not be found
	*/
	public idea fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, idea> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the ideas.
	*
	* @return the ideas
	*/
	public java.util.List<idea> findAll();

	/**
	* Returns a range of all the ideas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ideaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ideas
	* @param end the upper bound of the range of ideas (not inclusive)
	* @return the range of ideas
	*/
	public java.util.List<idea> findAll(int start, int end);

	/**
	* Returns an ordered range of all the ideas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ideaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ideas
	* @param end the upper bound of the range of ideas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ideas
	*/
	public java.util.List<idea> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<idea> orderByComparator);

	/**
	* Returns an ordered range of all the ideas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ideaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ideas
	* @param end the upper bound of the range of ideas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ideas
	*/
	public java.util.List<idea> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<idea> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the ideas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of ideas.
	*
	* @return the number of ideas
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}