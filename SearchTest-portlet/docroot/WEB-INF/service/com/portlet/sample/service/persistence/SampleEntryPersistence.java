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

package com.portlet.sample.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.portlet.sample.exception.NoSuchEntryException;
import com.portlet.sample.model.SampleEntry;

/**
 * The persistence interface for the sample entry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CloverLiferay01
 * @see com.portlet.sample.service.persistence.impl.SampleEntryPersistenceImpl
 * @see SampleEntryUtil
 * @generated
 */
@ProviderType
public interface SampleEntryPersistence extends BasePersistence<SampleEntry> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link SampleEntryUtil} to access the sample entry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the sample entries where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching sample entries
	*/
	public java.util.List<SampleEntry> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the sample entries where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SampleEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of sample entries
	* @param end the upper bound of the range of sample entries (not inclusive)
	* @return the range of matching sample entries
	*/
	public java.util.List<SampleEntry> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the sample entries where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SampleEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of sample entries
	* @param end the upper bound of the range of sample entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching sample entries
	*/
	public java.util.List<SampleEntry> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SampleEntry> orderByComparator);

	/**
	* Returns an ordered range of all the sample entries where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SampleEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of sample entries
	* @param end the upper bound of the range of sample entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching sample entries
	*/
	public java.util.List<SampleEntry> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SampleEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first sample entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sample entry
	* @throws NoSuchEntryException if a matching sample entry could not be found
	*/
	public SampleEntry findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SampleEntry> orderByComparator)
		throws NoSuchEntryException;

	/**
	* Returns the first sample entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sample entry, or <code>null</code> if a matching sample entry could not be found
	*/
	public SampleEntry fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SampleEntry> orderByComparator);

	/**
	* Returns the last sample entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sample entry
	* @throws NoSuchEntryException if a matching sample entry could not be found
	*/
	public SampleEntry findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SampleEntry> orderByComparator)
		throws NoSuchEntryException;

	/**
	* Returns the last sample entry in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sample entry, or <code>null</code> if a matching sample entry could not be found
	*/
	public SampleEntry fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SampleEntry> orderByComparator);

	/**
	* Returns the sample entries before and after the current sample entry in the ordered set where uuid = &#63;.
	*
	* @param entryId the primary key of the current sample entry
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next sample entry
	* @throws NoSuchEntryException if a sample entry with the primary key could not be found
	*/
	public SampleEntry[] findByUuid_PrevAndNext(long entryId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<SampleEntry> orderByComparator)
		throws NoSuchEntryException;

	/**
	* Removes all the sample entries where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of sample entries where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching sample entries
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the sample entry where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchEntryException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching sample entry
	* @throws NoSuchEntryException if a matching sample entry could not be found
	*/
	public SampleEntry findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchEntryException;

	/**
	* Returns the sample entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching sample entry, or <code>null</code> if a matching sample entry could not be found
	*/
	public SampleEntry fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the sample entry where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching sample entry, or <code>null</code> if a matching sample entry could not be found
	*/
	public SampleEntry fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the sample entry where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the sample entry that was removed
	*/
	public SampleEntry removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchEntryException;

	/**
	* Returns the number of sample entries where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching sample entries
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the sample entries where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching sample entries
	*/
	public java.util.List<SampleEntry> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the sample entries where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SampleEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of sample entries
	* @param end the upper bound of the range of sample entries (not inclusive)
	* @return the range of matching sample entries
	*/
	public java.util.List<SampleEntry> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the sample entries where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SampleEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of sample entries
	* @param end the upper bound of the range of sample entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching sample entries
	*/
	public java.util.List<SampleEntry> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SampleEntry> orderByComparator);

	/**
	* Returns an ordered range of all the sample entries where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SampleEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of sample entries
	* @param end the upper bound of the range of sample entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching sample entries
	*/
	public java.util.List<SampleEntry> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SampleEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first sample entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sample entry
	* @throws NoSuchEntryException if a matching sample entry could not be found
	*/
	public SampleEntry findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SampleEntry> orderByComparator)
		throws NoSuchEntryException;

	/**
	* Returns the first sample entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching sample entry, or <code>null</code> if a matching sample entry could not be found
	*/
	public SampleEntry fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SampleEntry> orderByComparator);

	/**
	* Returns the last sample entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sample entry
	* @throws NoSuchEntryException if a matching sample entry could not be found
	*/
	public SampleEntry findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SampleEntry> orderByComparator)
		throws NoSuchEntryException;

	/**
	* Returns the last sample entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching sample entry, or <code>null</code> if a matching sample entry could not be found
	*/
	public SampleEntry fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SampleEntry> orderByComparator);

	/**
	* Returns the sample entries before and after the current sample entry in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param entryId the primary key of the current sample entry
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next sample entry
	* @throws NoSuchEntryException if a sample entry with the primary key could not be found
	*/
	public SampleEntry[] findByUuid_C_PrevAndNext(long entryId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<SampleEntry> orderByComparator)
		throws NoSuchEntryException;

	/**
	* Removes all the sample entries where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of sample entries where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching sample entries
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Caches the sample entry in the entity cache if it is enabled.
	*
	* @param sampleEntry the sample entry
	*/
	public void cacheResult(SampleEntry sampleEntry);

	/**
	* Caches the sample entries in the entity cache if it is enabled.
	*
	* @param sampleEntries the sample entries
	*/
	public void cacheResult(java.util.List<SampleEntry> sampleEntries);

	/**
	* Creates a new sample entry with the primary key. Does not add the sample entry to the database.
	*
	* @param entryId the primary key for the new sample entry
	* @return the new sample entry
	*/
	public SampleEntry create(long entryId);

	/**
	* Removes the sample entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entryId the primary key of the sample entry
	* @return the sample entry that was removed
	* @throws NoSuchEntryException if a sample entry with the primary key could not be found
	*/
	public SampleEntry remove(long entryId) throws NoSuchEntryException;

	public SampleEntry updateImpl(SampleEntry sampleEntry);

	/**
	* Returns the sample entry with the primary key or throws a {@link NoSuchEntryException} if it could not be found.
	*
	* @param entryId the primary key of the sample entry
	* @return the sample entry
	* @throws NoSuchEntryException if a sample entry with the primary key could not be found
	*/
	public SampleEntry findByPrimaryKey(long entryId)
		throws NoSuchEntryException;

	/**
	* Returns the sample entry with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param entryId the primary key of the sample entry
	* @return the sample entry, or <code>null</code> if a sample entry with the primary key could not be found
	*/
	public SampleEntry fetchByPrimaryKey(long entryId);

	@Override
	public java.util.Map<java.io.Serializable, SampleEntry> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the sample entries.
	*
	* @return the sample entries
	*/
	public java.util.List<SampleEntry> findAll();

	/**
	* Returns a range of all the sample entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SampleEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sample entries
	* @param end the upper bound of the range of sample entries (not inclusive)
	* @return the range of sample entries
	*/
	public java.util.List<SampleEntry> findAll(int start, int end);

	/**
	* Returns an ordered range of all the sample entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SampleEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sample entries
	* @param end the upper bound of the range of sample entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of sample entries
	*/
	public java.util.List<SampleEntry> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SampleEntry> orderByComparator);

	/**
	* Returns an ordered range of all the sample entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link SampleEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sample entries
	* @param end the upper bound of the range of sample entries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of sample entries
	*/
	public java.util.List<SampleEntry> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<SampleEntry> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the sample entries from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of sample entries.
	*
	* @return the number of sample entries
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}