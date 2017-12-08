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

package com.chola.knowledgebites.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.chola.knowledgebites.exception.NoSuchkbusersException;
import com.chola.knowledgebites.model.kbusers;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the kbusers service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author cloverliferay01
 * @see com.chola.knowledgebites.service.persistence.impl.kbusersPersistenceImpl
 * @see kbusersUtil
 * @generated
 */
@ProviderType
public interface kbusersPersistence extends BasePersistence<kbusers> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link kbusersUtil} to access the kbusers persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the kbuserses where kbdetails_id = &#63;.
	*
	* @param kbdetails_id the kbdetails_id
	* @return the matching kbuserses
	*/
	public java.util.List<kbusers> findByKB_ID(long kbdetails_id);

	/**
	* Returns a range of all the kbuserses where kbdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param kbdetails_id the kbdetails_id
	* @param start the lower bound of the range of kbuserses
	* @param end the upper bound of the range of kbuserses (not inclusive)
	* @return the range of matching kbuserses
	*/
	public java.util.List<kbusers> findByKB_ID(long kbdetails_id, int start,
		int end);

	/**
	* Returns an ordered range of all the kbuserses where kbdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param kbdetails_id the kbdetails_id
	* @param start the lower bound of the range of kbuserses
	* @param end the upper bound of the range of kbuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kbuserses
	*/
	public java.util.List<kbusers> findByKB_ID(long kbdetails_id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<kbusers> orderByComparator);

	/**
	* Returns an ordered range of all the kbuserses where kbdetails_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param kbdetails_id the kbdetails_id
	* @param start the lower bound of the range of kbuserses
	* @param end the upper bound of the range of kbuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching kbuserses
	*/
	public java.util.List<kbusers> findByKB_ID(long kbdetails_id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<kbusers> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first kbusers in the ordered set where kbdetails_id = &#63;.
	*
	* @param kbdetails_id the kbdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kbusers
	* @throws NoSuchkbusersException if a matching kbusers could not be found
	*/
	public kbusers findByKB_ID_First(long kbdetails_id,
		com.liferay.portal.kernel.util.OrderByComparator<kbusers> orderByComparator)
		throws NoSuchkbusersException;

	/**
	* Returns the first kbusers in the ordered set where kbdetails_id = &#63;.
	*
	* @param kbdetails_id the kbdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kbusers, or <code>null</code> if a matching kbusers could not be found
	*/
	public kbusers fetchByKB_ID_First(long kbdetails_id,
		com.liferay.portal.kernel.util.OrderByComparator<kbusers> orderByComparator);

	/**
	* Returns the last kbusers in the ordered set where kbdetails_id = &#63;.
	*
	* @param kbdetails_id the kbdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kbusers
	* @throws NoSuchkbusersException if a matching kbusers could not be found
	*/
	public kbusers findByKB_ID_Last(long kbdetails_id,
		com.liferay.portal.kernel.util.OrderByComparator<kbusers> orderByComparator)
		throws NoSuchkbusersException;

	/**
	* Returns the last kbusers in the ordered set where kbdetails_id = &#63;.
	*
	* @param kbdetails_id the kbdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kbusers, or <code>null</code> if a matching kbusers could not be found
	*/
	public kbusers fetchByKB_ID_Last(long kbdetails_id,
		com.liferay.portal.kernel.util.OrderByComparator<kbusers> orderByComparator);

	/**
	* Returns the kbuserses before and after the current kbusers in the ordered set where kbdetails_id = &#63;.
	*
	* @param id the primary key of the current kbusers
	* @param kbdetails_id the kbdetails_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kbusers
	* @throws NoSuchkbusersException if a kbusers with the primary key could not be found
	*/
	public kbusers[] findByKB_ID_PrevAndNext(long id, long kbdetails_id,
		com.liferay.portal.kernel.util.OrderByComparator<kbusers> orderByComparator)
		throws NoSuchkbusersException;

	/**
	* Removes all the kbuserses where kbdetails_id = &#63; from the database.
	*
	* @param kbdetails_id the kbdetails_id
	*/
	public void removeByKB_ID(long kbdetails_id);

	/**
	* Returns the number of kbuserses where kbdetails_id = &#63;.
	*
	* @param kbdetails_id the kbdetails_id
	* @return the number of matching kbuserses
	*/
	public int countByKB_ID(long kbdetails_id);

	/**
	* Returns all the kbuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the matching kbuserses
	*/
	public java.util.List<kbusers> findByUSER_ID(long user_id);

	/**
	* Returns a range of all the kbuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of kbuserses
	* @param end the upper bound of the range of kbuserses (not inclusive)
	* @return the range of matching kbuserses
	*/
	public java.util.List<kbusers> findByUSER_ID(long user_id, int start,
		int end);

	/**
	* Returns an ordered range of all the kbuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of kbuserses
	* @param end the upper bound of the range of kbuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching kbuserses
	*/
	public java.util.List<kbusers> findByUSER_ID(long user_id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<kbusers> orderByComparator);

	/**
	* Returns an ordered range of all the kbuserses where user_id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param user_id the user_id
	* @param start the lower bound of the range of kbuserses
	* @param end the upper bound of the range of kbuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching kbuserses
	*/
	public java.util.List<kbusers> findByUSER_ID(long user_id, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<kbusers> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first kbusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kbusers
	* @throws NoSuchkbusersException if a matching kbusers could not be found
	*/
	public kbusers findByUSER_ID_First(long user_id,
		com.liferay.portal.kernel.util.OrderByComparator<kbusers> orderByComparator)
		throws NoSuchkbusersException;

	/**
	* Returns the first kbusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching kbusers, or <code>null</code> if a matching kbusers could not be found
	*/
	public kbusers fetchByUSER_ID_First(long user_id,
		com.liferay.portal.kernel.util.OrderByComparator<kbusers> orderByComparator);

	/**
	* Returns the last kbusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kbusers
	* @throws NoSuchkbusersException if a matching kbusers could not be found
	*/
	public kbusers findByUSER_ID_Last(long user_id,
		com.liferay.portal.kernel.util.OrderByComparator<kbusers> orderByComparator)
		throws NoSuchkbusersException;

	/**
	* Returns the last kbusers in the ordered set where user_id = &#63;.
	*
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching kbusers, or <code>null</code> if a matching kbusers could not be found
	*/
	public kbusers fetchByUSER_ID_Last(long user_id,
		com.liferay.portal.kernel.util.OrderByComparator<kbusers> orderByComparator);

	/**
	* Returns the kbuserses before and after the current kbusers in the ordered set where user_id = &#63;.
	*
	* @param id the primary key of the current kbusers
	* @param user_id the user_id
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next kbusers
	* @throws NoSuchkbusersException if a kbusers with the primary key could not be found
	*/
	public kbusers[] findByUSER_ID_PrevAndNext(long id, long user_id,
		com.liferay.portal.kernel.util.OrderByComparator<kbusers> orderByComparator)
		throws NoSuchkbusersException;

	/**
	* Removes all the kbuserses where user_id = &#63; from the database.
	*
	* @param user_id the user_id
	*/
	public void removeByUSER_ID(long user_id);

	/**
	* Returns the number of kbuserses where user_id = &#63;.
	*
	* @param user_id the user_id
	* @return the number of matching kbuserses
	*/
	public int countByUSER_ID(long user_id);

	/**
	* Caches the kbusers in the entity cache if it is enabled.
	*
	* @param kbusers the kbusers
	*/
	public void cacheResult(kbusers kbusers);

	/**
	* Caches the kbuserses in the entity cache if it is enabled.
	*
	* @param kbuserses the kbuserses
	*/
	public void cacheResult(java.util.List<kbusers> kbuserses);

	/**
	* Creates a new kbusers with the primary key. Does not add the kbusers to the database.
	*
	* @param id the primary key for the new kbusers
	* @return the new kbusers
	*/
	public kbusers create(long id);

	/**
	* Removes the kbusers with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the kbusers
	* @return the kbusers that was removed
	* @throws NoSuchkbusersException if a kbusers with the primary key could not be found
	*/
	public kbusers remove(long id) throws NoSuchkbusersException;

	public kbusers updateImpl(kbusers kbusers);

	/**
	* Returns the kbusers with the primary key or throws a {@link NoSuchkbusersException} if it could not be found.
	*
	* @param id the primary key of the kbusers
	* @return the kbusers
	* @throws NoSuchkbusersException if a kbusers with the primary key could not be found
	*/
	public kbusers findByPrimaryKey(long id) throws NoSuchkbusersException;

	/**
	* Returns the kbusers with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the kbusers
	* @return the kbusers, or <code>null</code> if a kbusers with the primary key could not be found
	*/
	public kbusers fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, kbusers> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the kbuserses.
	*
	* @return the kbuserses
	*/
	public java.util.List<kbusers> findAll();

	/**
	* Returns a range of all the kbuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kbuserses
	* @param end the upper bound of the range of kbuserses (not inclusive)
	* @return the range of kbuserses
	*/
	public java.util.List<kbusers> findAll(int start, int end);

	/**
	* Returns an ordered range of all the kbuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kbuserses
	* @param end the upper bound of the range of kbuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of kbuserses
	*/
	public java.util.List<kbusers> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<kbusers> orderByComparator);

	/**
	* Returns an ordered range of all the kbuserses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link kbusersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of kbuserses
	* @param end the upper bound of the range of kbuserses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of kbuserses
	*/
	public java.util.List<kbusers> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<kbusers> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the kbuserses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of kbuserses.
	*
	* @return the number of kbuserses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}