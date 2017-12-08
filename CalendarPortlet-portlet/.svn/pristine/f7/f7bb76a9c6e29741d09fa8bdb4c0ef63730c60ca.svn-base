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

package com.chola.calendar.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.calendar.exception.NoSuchEmpInfoEntityException;
import com.chola.calendar.model.EmpInfoEntity;
import com.chola.calendar.model.impl.EmpInfoEntityImpl;
import com.chola.calendar.model.impl.EmpInfoEntityModelImpl;
import com.chola.calendar.service.persistence.EmpInfoEntityPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the emp info entity service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author adms.java1
 * @see EmpInfoEntityPersistence
 * @see com.chola.calendar.service.persistence.EmpInfoEntityUtil
 * @generated
 */
@ProviderType
public class EmpInfoEntityPersistenceImpl extends BasePersistenceImpl<EmpInfoEntity>
	implements EmpInfoEntityPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmpInfoEntityUtil} to access the emp info entity persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmpInfoEntityImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmpInfoEntityModelImpl.ENTITY_CACHE_ENABLED,
			EmpInfoEntityModelImpl.FINDER_CACHE_ENABLED,
			EmpInfoEntityImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmpInfoEntityModelImpl.ENTITY_CACHE_ENABLED,
			EmpInfoEntityModelImpl.FINDER_CACHE_ENABLED,
			EmpInfoEntityImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmpInfoEntityModelImpl.ENTITY_CACHE_ENABLED,
			EmpInfoEntityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EMP_NAME = new FinderPath(EmpInfoEntityModelImpl.ENTITY_CACHE_ENABLED,
			EmpInfoEntityModelImpl.FINDER_CACHE_ENABLED,
			EmpInfoEntityImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByEMP_NAME",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMP_NAME =
		new FinderPath(EmpInfoEntityModelImpl.ENTITY_CACHE_ENABLED,
			EmpInfoEntityModelImpl.FINDER_CACHE_ENABLED,
			EmpInfoEntityImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByEMP_NAME", new String[] { String.class.getName() },
			EmpInfoEntityModelImpl.NAME_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EMP_NAME = new FinderPath(EmpInfoEntityModelImpl.ENTITY_CACHE_ENABLED,
			EmpInfoEntityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEMP_NAME",
			new String[] { String.class.getName() });

	/**
	 * Returns all the emp info entities where name = &#63;.
	 *
	 * @param name the name
	 * @return the matching emp info entities
	 */
	@Override
	public List<EmpInfoEntity> findByEMP_NAME(String name) {
		return findByEMP_NAME(name, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the emp info entities where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpInfoEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of emp info entities
	 * @param end the upper bound of the range of emp info entities (not inclusive)
	 * @return the range of matching emp info entities
	 */
	@Override
	public List<EmpInfoEntity> findByEMP_NAME(String name, int start, int end) {
		return findByEMP_NAME(name, start, end, null);
	}

	/**
	 * Returns an ordered range of all the emp info entities where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpInfoEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of emp info entities
	 * @param end the upper bound of the range of emp info entities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching emp info entities
	 */
	@Override
	public List<EmpInfoEntity> findByEMP_NAME(String name, int start, int end,
		OrderByComparator<EmpInfoEntity> orderByComparator) {
		return findByEMP_NAME(name, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the emp info entities where name = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpInfoEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of emp info entities
	 * @param end the upper bound of the range of emp info entities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching emp info entities
	 */
	@Override
	public List<EmpInfoEntity> findByEMP_NAME(String name, int start, int end,
		OrderByComparator<EmpInfoEntity> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMP_NAME;
			finderArgs = new Object[] { name };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EMP_NAME;
			finderArgs = new Object[] { name, start, end, orderByComparator };
		}

		List<EmpInfoEntity> list = null;

		if (retrieveFromCache) {
			list = (List<EmpInfoEntity>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (EmpInfoEntity empInfoEntity : list) {
					if (!Objects.equals(name, empInfoEntity.getName())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_EMPINFOENTITY_WHERE);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_EMP_NAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EMP_NAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_EMP_NAME_NAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(EmpInfoEntityModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
				}

				if (!pagination) {
					list = (List<EmpInfoEntity>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<EmpInfoEntity>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first emp info entity in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching emp info entity
	 * @throws NoSuchEmpInfoEntityException if a matching emp info entity could not be found
	 */
	@Override
	public EmpInfoEntity findByEMP_NAME_First(String name,
		OrderByComparator<EmpInfoEntity> orderByComparator)
		throws NoSuchEmpInfoEntityException {
		EmpInfoEntity empInfoEntity = fetchByEMP_NAME_First(name,
				orderByComparator);

		if (empInfoEntity != null) {
			return empInfoEntity;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmpInfoEntityException(msg.toString());
	}

	/**
	 * Returns the first emp info entity in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching emp info entity, or <code>null</code> if a matching emp info entity could not be found
	 */
	@Override
	public EmpInfoEntity fetchByEMP_NAME_First(String name,
		OrderByComparator<EmpInfoEntity> orderByComparator) {
		List<EmpInfoEntity> list = findByEMP_NAME(name, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last emp info entity in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching emp info entity
	 * @throws NoSuchEmpInfoEntityException if a matching emp info entity could not be found
	 */
	@Override
	public EmpInfoEntity findByEMP_NAME_Last(String name,
		OrderByComparator<EmpInfoEntity> orderByComparator)
		throws NoSuchEmpInfoEntityException {
		EmpInfoEntity empInfoEntity = fetchByEMP_NAME_Last(name,
				orderByComparator);

		if (empInfoEntity != null) {
			return empInfoEntity;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("name=");
		msg.append(name);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchEmpInfoEntityException(msg.toString());
	}

	/**
	 * Returns the last emp info entity in the ordered set where name = &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching emp info entity, or <code>null</code> if a matching emp info entity could not be found
	 */
	@Override
	public EmpInfoEntity fetchByEMP_NAME_Last(String name,
		OrderByComparator<EmpInfoEntity> orderByComparator) {
		int count = countByEMP_NAME(name);

		if (count == 0) {
			return null;
		}

		List<EmpInfoEntity> list = findByEMP_NAME(name, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the emp info entities before and after the current emp info entity in the ordered set where name = &#63;.
	 *
	 * @param id the primary key of the current emp info entity
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next emp info entity
	 * @throws NoSuchEmpInfoEntityException if a emp info entity with the primary key could not be found
	 */
	@Override
	public EmpInfoEntity[] findByEMP_NAME_PrevAndNext(long id, String name,
		OrderByComparator<EmpInfoEntity> orderByComparator)
		throws NoSuchEmpInfoEntityException {
		EmpInfoEntity empInfoEntity = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			EmpInfoEntity[] array = new EmpInfoEntityImpl[3];

			array[0] = getByEMP_NAME_PrevAndNext(session, empInfoEntity, name,
					orderByComparator, true);

			array[1] = empInfoEntity;

			array[2] = getByEMP_NAME_PrevAndNext(session, empInfoEntity, name,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected EmpInfoEntity getByEMP_NAME_PrevAndNext(Session session,
		EmpInfoEntity empInfoEntity, String name,
		OrderByComparator<EmpInfoEntity> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_EMPINFOENTITY_WHERE);

		boolean bindName = false;

		if (name == null) {
			query.append(_FINDER_COLUMN_EMP_NAME_NAME_1);
		}
		else if (name.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_EMP_NAME_NAME_3);
		}
		else {
			bindName = true;

			query.append(_FINDER_COLUMN_EMP_NAME_NAME_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(EmpInfoEntityModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindName) {
			qPos.add(name);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(empInfoEntity);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<EmpInfoEntity> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the emp info entities where name = &#63; from the database.
	 *
	 * @param name the name
	 */
	@Override
	public void removeByEMP_NAME(String name) {
		for (EmpInfoEntity empInfoEntity : findByEMP_NAME(name,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(empInfoEntity);
		}
	}

	/**
	 * Returns the number of emp info entities where name = &#63;.
	 *
	 * @param name the name
	 * @return the number of matching emp info entities
	 */
	@Override
	public int countByEMP_NAME(String name) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EMP_NAME;

		Object[] finderArgs = new Object[] { name };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_EMPINFOENTITY_WHERE);

			boolean bindName = false;

			if (name == null) {
				query.append(_FINDER_COLUMN_EMP_NAME_NAME_1);
			}
			else if (name.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EMP_NAME_NAME_3);
			}
			else {
				bindName = true;

				query.append(_FINDER_COLUMN_EMP_NAME_NAME_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindName) {
					qPos.add(name);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_EMP_NAME_NAME_1 = "empInfoEntity.name IS NULL";
	private static final String _FINDER_COLUMN_EMP_NAME_NAME_2 = "empInfoEntity.name = ?";
	private static final String _FINDER_COLUMN_EMP_NAME_NAME_3 = "(empInfoEntity.name IS NULL OR empInfoEntity.name = '')";

	public EmpInfoEntityPersistenceImpl() {
		setModelClass(EmpInfoEntity.class);
	}

	/**
	 * Caches the emp info entity in the entity cache if it is enabled.
	 *
	 * @param empInfoEntity the emp info entity
	 */
	@Override
	public void cacheResult(EmpInfoEntity empInfoEntity) {
		entityCache.putResult(EmpInfoEntityModelImpl.ENTITY_CACHE_ENABLED,
			EmpInfoEntityImpl.class, empInfoEntity.getPrimaryKey(),
			empInfoEntity);

		empInfoEntity.resetOriginalValues();
	}

	/**
	 * Caches the emp info entities in the entity cache if it is enabled.
	 *
	 * @param empInfoEntities the emp info entities
	 */
	@Override
	public void cacheResult(List<EmpInfoEntity> empInfoEntities) {
		for (EmpInfoEntity empInfoEntity : empInfoEntities) {
			if (entityCache.getResult(
						EmpInfoEntityModelImpl.ENTITY_CACHE_ENABLED,
						EmpInfoEntityImpl.class, empInfoEntity.getPrimaryKey()) == null) {
				cacheResult(empInfoEntity);
			}
			else {
				empInfoEntity.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all emp info entities.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EmpInfoEntityImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the emp info entity.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EmpInfoEntity empInfoEntity) {
		entityCache.removeResult(EmpInfoEntityModelImpl.ENTITY_CACHE_ENABLED,
			EmpInfoEntityImpl.class, empInfoEntity.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<EmpInfoEntity> empInfoEntities) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EmpInfoEntity empInfoEntity : empInfoEntities) {
			entityCache.removeResult(EmpInfoEntityModelImpl.ENTITY_CACHE_ENABLED,
				EmpInfoEntityImpl.class, empInfoEntity.getPrimaryKey());
		}
	}

	/**
	 * Creates a new emp info entity with the primary key. Does not add the emp info entity to the database.
	 *
	 * @param id the primary key for the new emp info entity
	 * @return the new emp info entity
	 */
	@Override
	public EmpInfoEntity create(long id) {
		EmpInfoEntity empInfoEntity = new EmpInfoEntityImpl();

		empInfoEntity.setNew(true);
		empInfoEntity.setPrimaryKey(id);

		return empInfoEntity;
	}

	/**
	 * Removes the emp info entity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the emp info entity
	 * @return the emp info entity that was removed
	 * @throws NoSuchEmpInfoEntityException if a emp info entity with the primary key could not be found
	 */
	@Override
	public EmpInfoEntity remove(long id) throws NoSuchEmpInfoEntityException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the emp info entity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the emp info entity
	 * @return the emp info entity that was removed
	 * @throws NoSuchEmpInfoEntityException if a emp info entity with the primary key could not be found
	 */
	@Override
	public EmpInfoEntity remove(Serializable primaryKey)
		throws NoSuchEmpInfoEntityException {
		Session session = null;

		try {
			session = openSession();

			EmpInfoEntity empInfoEntity = (EmpInfoEntity)session.get(EmpInfoEntityImpl.class,
					primaryKey);

			if (empInfoEntity == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmpInfoEntityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(empInfoEntity);
		}
		catch (NoSuchEmpInfoEntityException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected EmpInfoEntity removeImpl(EmpInfoEntity empInfoEntity) {
		empInfoEntity = toUnwrappedModel(empInfoEntity);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(empInfoEntity)) {
				empInfoEntity = (EmpInfoEntity)session.get(EmpInfoEntityImpl.class,
						empInfoEntity.getPrimaryKeyObj());
			}

			if (empInfoEntity != null) {
				session.delete(empInfoEntity);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (empInfoEntity != null) {
			clearCache(empInfoEntity);
		}

		return empInfoEntity;
	}

	@Override
	public EmpInfoEntity updateImpl(EmpInfoEntity empInfoEntity) {
		empInfoEntity = toUnwrappedModel(empInfoEntity);

		boolean isNew = empInfoEntity.isNew();

		EmpInfoEntityModelImpl empInfoEntityModelImpl = (EmpInfoEntityModelImpl)empInfoEntity;

		Session session = null;

		try {
			session = openSession();

			if (empInfoEntity.isNew()) {
				session.save(empInfoEntity);

				empInfoEntity.setNew(false);
			}
			else {
				empInfoEntity = (EmpInfoEntity)session.merge(empInfoEntity);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !EmpInfoEntityModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((empInfoEntityModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMP_NAME.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						empInfoEntityModelImpl.getOriginalName()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EMP_NAME, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMP_NAME,
					args);

				args = new Object[] { empInfoEntityModelImpl.getName() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EMP_NAME, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMP_NAME,
					args);
			}
		}

		entityCache.putResult(EmpInfoEntityModelImpl.ENTITY_CACHE_ENABLED,
			EmpInfoEntityImpl.class, empInfoEntity.getPrimaryKey(),
			empInfoEntity, false);

		empInfoEntity.resetOriginalValues();

		return empInfoEntity;
	}

	protected EmpInfoEntity toUnwrappedModel(EmpInfoEntity empInfoEntity) {
		if (empInfoEntity instanceof EmpInfoEntityImpl) {
			return empInfoEntity;
		}

		EmpInfoEntityImpl empInfoEntityImpl = new EmpInfoEntityImpl();

		empInfoEntityImpl.setNew(empInfoEntity.isNew());
		empInfoEntityImpl.setPrimaryKey(empInfoEntity.getPrimaryKey());

		empInfoEntityImpl.setId(empInfoEntity.getId());
		empInfoEntityImpl.setEmpId(empInfoEntity.getEmpId());
		empInfoEntityImpl.setName(empInfoEntity.getName());
		empInfoEntityImpl.setEmailid(empInfoEntity.getEmailid());
		empInfoEntityImpl.setBirthday(empInfoEntity.getBirthday());
		empInfoEntityImpl.setGrade(empInfoEntity.getGrade());
		empInfoEntityImpl.setFunctionName(empInfoEntity.getFunctionName());
		empInfoEntityImpl.setDepartment(empInfoEntity.getDepartment());
		empInfoEntityImpl.setSubdepartment(empInfoEntity.getSubdepartment());
		empInfoEntityImpl.setLocation(empInfoEntity.getLocation());
		empInfoEntityImpl.setGender(empInfoEntity.getGender());
		empInfoEntityImpl.setUnit(empInfoEntity.getUnit());
		empInfoEntityImpl.setUserid(empInfoEntity.getUserid());

		return empInfoEntityImpl;
	}

	/**
	 * Returns the emp info entity with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the emp info entity
	 * @return the emp info entity
	 * @throws NoSuchEmpInfoEntityException if a emp info entity with the primary key could not be found
	 */
	@Override
	public EmpInfoEntity findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmpInfoEntityException {
		EmpInfoEntity empInfoEntity = fetchByPrimaryKey(primaryKey);

		if (empInfoEntity == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmpInfoEntityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return empInfoEntity;
	}

	/**
	 * Returns the emp info entity with the primary key or throws a {@link NoSuchEmpInfoEntityException} if it could not be found.
	 *
	 * @param id the primary key of the emp info entity
	 * @return the emp info entity
	 * @throws NoSuchEmpInfoEntityException if a emp info entity with the primary key could not be found
	 */
	@Override
	public EmpInfoEntity findByPrimaryKey(long id)
		throws NoSuchEmpInfoEntityException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the emp info entity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the emp info entity
	 * @return the emp info entity, or <code>null</code> if a emp info entity with the primary key could not be found
	 */
	@Override
	public EmpInfoEntity fetchByPrimaryKey(Serializable primaryKey) {
		EmpInfoEntity empInfoEntity = (EmpInfoEntity)entityCache.getResult(EmpInfoEntityModelImpl.ENTITY_CACHE_ENABLED,
				EmpInfoEntityImpl.class, primaryKey);

		if (empInfoEntity == _nullEmpInfoEntity) {
			return null;
		}

		if (empInfoEntity == null) {
			Session session = null;

			try {
				session = openSession();

				empInfoEntity = (EmpInfoEntity)session.get(EmpInfoEntityImpl.class,
						primaryKey);

				if (empInfoEntity != null) {
					cacheResult(empInfoEntity);
				}
				else {
					entityCache.putResult(EmpInfoEntityModelImpl.ENTITY_CACHE_ENABLED,
						EmpInfoEntityImpl.class, primaryKey, _nullEmpInfoEntity);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(EmpInfoEntityModelImpl.ENTITY_CACHE_ENABLED,
					EmpInfoEntityImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return empInfoEntity;
	}

	/**
	 * Returns the emp info entity with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the emp info entity
	 * @return the emp info entity, or <code>null</code> if a emp info entity with the primary key could not be found
	 */
	@Override
	public EmpInfoEntity fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, EmpInfoEntity> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, EmpInfoEntity> map = new HashMap<Serializable, EmpInfoEntity>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			EmpInfoEntity empInfoEntity = fetchByPrimaryKey(primaryKey);

			if (empInfoEntity != null) {
				map.put(primaryKey, empInfoEntity);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			EmpInfoEntity empInfoEntity = (EmpInfoEntity)entityCache.getResult(EmpInfoEntityModelImpl.ENTITY_CACHE_ENABLED,
					EmpInfoEntityImpl.class, primaryKey);

			if (empInfoEntity == null) {
				if (uncachedPrimaryKeys == null) {
					uncachedPrimaryKeys = new HashSet<Serializable>();
				}

				uncachedPrimaryKeys.add(primaryKey);
			}
			else {
				map.put(primaryKey, empInfoEntity);
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_EMPINFOENTITY_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (EmpInfoEntity empInfoEntity : (List<EmpInfoEntity>)q.list()) {
				map.put(empInfoEntity.getPrimaryKeyObj(), empInfoEntity);

				cacheResult(empInfoEntity);

				uncachedPrimaryKeys.remove(empInfoEntity.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(EmpInfoEntityModelImpl.ENTITY_CACHE_ENABLED,
					EmpInfoEntityImpl.class, primaryKey, _nullEmpInfoEntity);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the emp info entities.
	 *
	 * @return the emp info entities
	 */
	@Override
	public List<EmpInfoEntity> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the emp info entities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpInfoEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of emp info entities
	 * @param end the upper bound of the range of emp info entities (not inclusive)
	 * @return the range of emp info entities
	 */
	@Override
	public List<EmpInfoEntity> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the emp info entities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpInfoEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of emp info entities
	 * @param end the upper bound of the range of emp info entities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of emp info entities
	 */
	@Override
	public List<EmpInfoEntity> findAll(int start, int end,
		OrderByComparator<EmpInfoEntity> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the emp info entities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpInfoEntityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of emp info entities
	 * @param end the upper bound of the range of emp info entities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of emp info entities
	 */
	@Override
	public List<EmpInfoEntity> findAll(int start, int end,
		OrderByComparator<EmpInfoEntity> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<EmpInfoEntity> list = null;

		if (retrieveFromCache) {
			list = (List<EmpInfoEntity>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_EMPINFOENTITY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPINFOENTITY;

				if (pagination) {
					sql = sql.concat(EmpInfoEntityModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EmpInfoEntity>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<EmpInfoEntity>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the emp info entities from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (EmpInfoEntity empInfoEntity : findAll()) {
			remove(empInfoEntity);
		}
	}

	/**
	 * Returns the number of emp info entities.
	 *
	 * @return the number of emp info entities
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EMPINFOENTITY);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return EmpInfoEntityModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the emp info entity persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(EmpInfoEntityImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	protected EntityCache entityCache = EntityCacheUtil.getEntityCache();
	protected FinderCache finderCache = FinderCacheUtil.getFinderCache();
	private static final String _SQL_SELECT_EMPINFOENTITY = "SELECT empInfoEntity FROM EmpInfoEntity empInfoEntity";
	private static final String _SQL_SELECT_EMPINFOENTITY_WHERE_PKS_IN = "SELECT empInfoEntity FROM EmpInfoEntity empInfoEntity WHERE id_ IN (";
	private static final String _SQL_SELECT_EMPINFOENTITY_WHERE = "SELECT empInfoEntity FROM EmpInfoEntity empInfoEntity WHERE ";
	private static final String _SQL_COUNT_EMPINFOENTITY = "SELECT COUNT(empInfoEntity) FROM EmpInfoEntity empInfoEntity";
	private static final String _SQL_COUNT_EMPINFOENTITY_WHERE = "SELECT COUNT(empInfoEntity) FROM EmpInfoEntity empInfoEntity WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "empInfoEntity.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EmpInfoEntity exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No EmpInfoEntity exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(EmpInfoEntityPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id"
			});
	private static final EmpInfoEntity _nullEmpInfoEntity = new EmpInfoEntityImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<EmpInfoEntity> toCacheModel() {
				return _nullEmpInfoEntityCacheModel;
			}
		};

	private static final CacheModel<EmpInfoEntity> _nullEmpInfoEntityCacheModel = new CacheModel<EmpInfoEntity>() {
			@Override
			public EmpInfoEntity toEntityModel() {
				return _nullEmpInfoEntity;
			}
		};
}