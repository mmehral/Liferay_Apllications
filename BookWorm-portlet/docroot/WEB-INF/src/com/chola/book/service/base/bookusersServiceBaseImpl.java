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

package com.chola.book.service.base;

import com.chola.book.model.bookusers;
import com.chola.book.service.bookusersService;
import com.chola.book.service.persistence.bookdetailsFinder;
import com.chola.book.service.persistence.bookdetailsPersistence;
import com.chola.book.service.persistence.bookusersPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.PortalUtil;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the bookusers remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.chola.book.service.impl.bookusersServiceImpl}.
 * </p>
 *
 * @author CloverLiferay02
 * @see com.chola.book.service.impl.bookusersServiceImpl
 * @see com.chola.book.service.bookusersServiceUtil
 * @generated
 */
public abstract class bookusersServiceBaseImpl extends BaseServiceImpl
	implements bookusersService, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.chola.book.service.bookusersServiceUtil} to access the bookusers remote service.
	 */

	/**
	 * Returns the bookdetails local service.
	 *
	 * @return the bookdetails local service
	 */
	public com.chola.book.service.bookdetailsLocalService getbookdetailsLocalService() {
		return bookdetailsLocalService;
	}

	/**
	 * Sets the bookdetails local service.
	 *
	 * @param bookdetailsLocalService the bookdetails local service
	 */
	public void setbookdetailsLocalService(
		com.chola.book.service.bookdetailsLocalService bookdetailsLocalService) {
		this.bookdetailsLocalService = bookdetailsLocalService;
	}

	/**
	 * Returns the bookdetails remote service.
	 *
	 * @return the bookdetails remote service
	 */
	public com.chola.book.service.bookdetailsService getbookdetailsService() {
		return bookdetailsService;
	}

	/**
	 * Sets the bookdetails remote service.
	 *
	 * @param bookdetailsService the bookdetails remote service
	 */
	public void setbookdetailsService(
		com.chola.book.service.bookdetailsService bookdetailsService) {
		this.bookdetailsService = bookdetailsService;
	}

	/**
	 * Returns the bookdetails persistence.
	 *
	 * @return the bookdetails persistence
	 */
	public bookdetailsPersistence getbookdetailsPersistence() {
		return bookdetailsPersistence;
	}

	/**
	 * Sets the bookdetails persistence.
	 *
	 * @param bookdetailsPersistence the bookdetails persistence
	 */
	public void setbookdetailsPersistence(
		bookdetailsPersistence bookdetailsPersistence) {
		this.bookdetailsPersistence = bookdetailsPersistence;
	}

	/**
	 * Returns the bookdetails finder.
	 *
	 * @return the bookdetails finder
	 */
	public bookdetailsFinder getbookdetailsFinder() {
		return bookdetailsFinder;
	}

	/**
	 * Sets the bookdetails finder.
	 *
	 * @param bookdetailsFinder the bookdetails finder
	 */
	public void setbookdetailsFinder(bookdetailsFinder bookdetailsFinder) {
		this.bookdetailsFinder = bookdetailsFinder;
	}

	/**
	 * Returns the bookusers local service.
	 *
	 * @return the bookusers local service
	 */
	public com.chola.book.service.bookusersLocalService getbookusersLocalService() {
		return bookusersLocalService;
	}

	/**
	 * Sets the bookusers local service.
	 *
	 * @param bookusersLocalService the bookusers local service
	 */
	public void setbookusersLocalService(
		com.chola.book.service.bookusersLocalService bookusersLocalService) {
		this.bookusersLocalService = bookusersLocalService;
	}

	/**
	 * Returns the bookusers remote service.
	 *
	 * @return the bookusers remote service
	 */
	public bookusersService getbookusersService() {
		return bookusersService;
	}

	/**
	 * Sets the bookusers remote service.
	 *
	 * @param bookusersService the bookusers remote service
	 */
	public void setbookusersService(bookusersService bookusersService) {
		this.bookusersService = bookusersService;
	}

	/**
	 * Returns the bookusers persistence.
	 *
	 * @return the bookusers persistence
	 */
	public bookusersPersistence getbookusersPersistence() {
		return bookusersPersistence;
	}

	/**
	 * Sets the bookusers persistence.
	 *
	 * @param bookusersPersistence the bookusers persistence
	 */
	public void setbookusersPersistence(
		bookusersPersistence bookusersPersistence) {
		this.bookusersPersistence = bookusersPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name remote service.
	 *
	 * @return the class name remote service
	 */
	public com.liferay.portal.kernel.service.ClassNameService getClassNameService() {
		return classNameService;
	}

	/**
	 * Sets the class name remote service.
	 *
	 * @param classNameService the class name remote service
	 */
	public void setClassNameService(
		com.liferay.portal.kernel.service.ClassNameService classNameService) {
		this.classNameService = classNameService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.kernel.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.kernel.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return bookusersService.class.getName();
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return bookusers.class;
	}

	protected String getModelClassName() {
		return bookusers.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = bookusersPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.chola.book.service.bookdetailsLocalService.class)
	protected com.chola.book.service.bookdetailsLocalService bookdetailsLocalService;
	@BeanReference(type = com.chola.book.service.bookdetailsService.class)
	protected com.chola.book.service.bookdetailsService bookdetailsService;
	@BeanReference(type = bookdetailsPersistence.class)
	protected bookdetailsPersistence bookdetailsPersistence;
	@BeanReference(type = bookdetailsFinder.class)
	protected bookdetailsFinder bookdetailsFinder;
	@BeanReference(type = com.chola.book.service.bookusersLocalService.class)
	protected com.chola.book.service.bookusersLocalService bookusersLocalService;
	@BeanReference(type = bookusersService.class)
	protected bookusersService bookusersService;
	@BeanReference(type = bookusersPersistence.class)
	protected bookusersPersistence bookusersPersistence;
	@BeanReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@BeanReference(type = com.liferay.portal.kernel.service.ClassNameService.class)
	protected com.liferay.portal.kernel.service.ClassNameService classNameService;
	@BeanReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@BeanReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.kernel.service.UserService.class)
	protected com.liferay.portal.kernel.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private ClassLoader _classLoader;
	private bookusersServiceClpInvoker _clpInvoker = new bookusersServiceClpInvoker();
}