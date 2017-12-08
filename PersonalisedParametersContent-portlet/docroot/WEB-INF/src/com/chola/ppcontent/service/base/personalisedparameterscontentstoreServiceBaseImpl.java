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

package com.chola.ppcontent.service.base;

import com.chola.ppcontent.model.personalisedparameterscontentstore;
import com.chola.ppcontent.service.persistence.contentuniqueinformationPersistence;
import com.chola.ppcontent.service.persistence.contentupdateFinder;
import com.chola.ppcontent.service.persistence.contentupdatePersistence;
import com.chola.ppcontent.service.persistence.personalisedparameterscontentstorePersistence;
import com.chola.ppcontent.service.personalisedparameterscontentstoreService;

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
 * Provides the base implementation for the personalisedparameterscontentstore remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.chola.ppcontent.service.impl.personalisedparameterscontentstoreServiceImpl}.
 * </p>
 *
 * @author cloverliferay01
 * @see com.chola.ppcontent.service.impl.personalisedparameterscontentstoreServiceImpl
 * @see com.chola.ppcontent.service.personalisedparameterscontentstoreServiceUtil
 * @generated
 */
public abstract class personalisedparameterscontentstoreServiceBaseImpl
	extends BaseServiceImpl implements personalisedparameterscontentstoreService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.chola.ppcontent.service.personalisedparameterscontentstoreServiceUtil} to access the personalisedparameterscontentstore remote service.
	 */

	/**
	 * Returns the contentuniqueinformation local service.
	 *
	 * @return the contentuniqueinformation local service
	 */
	public com.chola.ppcontent.service.contentuniqueinformationLocalService getcontentuniqueinformationLocalService() {
		return contentuniqueinformationLocalService;
	}

	/**
	 * Sets the contentuniqueinformation local service.
	 *
	 * @param contentuniqueinformationLocalService the contentuniqueinformation local service
	 */
	public void setcontentuniqueinformationLocalService(
		com.chola.ppcontent.service.contentuniqueinformationLocalService contentuniqueinformationLocalService) {
		this.contentuniqueinformationLocalService = contentuniqueinformationLocalService;
	}

	/**
	 * Returns the contentuniqueinformation remote service.
	 *
	 * @return the contentuniqueinformation remote service
	 */
	public com.chola.ppcontent.service.contentuniqueinformationService getcontentuniqueinformationService() {
		return contentuniqueinformationService;
	}

	/**
	 * Sets the contentuniqueinformation remote service.
	 *
	 * @param contentuniqueinformationService the contentuniqueinformation remote service
	 */
	public void setcontentuniqueinformationService(
		com.chola.ppcontent.service.contentuniqueinformationService contentuniqueinformationService) {
		this.contentuniqueinformationService = contentuniqueinformationService;
	}

	/**
	 * Returns the contentuniqueinformation persistence.
	 *
	 * @return the contentuniqueinformation persistence
	 */
	public contentuniqueinformationPersistence getcontentuniqueinformationPersistence() {
		return contentuniqueinformationPersistence;
	}

	/**
	 * Sets the contentuniqueinformation persistence.
	 *
	 * @param contentuniqueinformationPersistence the contentuniqueinformation persistence
	 */
	public void setcontentuniqueinformationPersistence(
		contentuniqueinformationPersistence contentuniqueinformationPersistence) {
		this.contentuniqueinformationPersistence = contentuniqueinformationPersistence;
	}

	/**
	 * Returns the contentupdate local service.
	 *
	 * @return the contentupdate local service
	 */
	public com.chola.ppcontent.service.contentupdateLocalService getcontentupdateLocalService() {
		return contentupdateLocalService;
	}

	/**
	 * Sets the contentupdate local service.
	 *
	 * @param contentupdateLocalService the contentupdate local service
	 */
	public void setcontentupdateLocalService(
		com.chola.ppcontent.service.contentupdateLocalService contentupdateLocalService) {
		this.contentupdateLocalService = contentupdateLocalService;
	}

	/**
	 * Returns the contentupdate remote service.
	 *
	 * @return the contentupdate remote service
	 */
	public com.chola.ppcontent.service.contentupdateService getcontentupdateService() {
		return contentupdateService;
	}

	/**
	 * Sets the contentupdate remote service.
	 *
	 * @param contentupdateService the contentupdate remote service
	 */
	public void setcontentupdateService(
		com.chola.ppcontent.service.contentupdateService contentupdateService) {
		this.contentupdateService = contentupdateService;
	}

	/**
	 * Returns the contentupdate persistence.
	 *
	 * @return the contentupdate persistence
	 */
	public contentupdatePersistence getcontentupdatePersistence() {
		return contentupdatePersistence;
	}

	/**
	 * Sets the contentupdate persistence.
	 *
	 * @param contentupdatePersistence the contentupdate persistence
	 */
	public void setcontentupdatePersistence(
		contentupdatePersistence contentupdatePersistence) {
		this.contentupdatePersistence = contentupdatePersistence;
	}

	/**
	 * Returns the contentupdate finder.
	 *
	 * @return the contentupdate finder
	 */
	public contentupdateFinder getcontentupdateFinder() {
		return contentupdateFinder;
	}

	/**
	 * Sets the contentupdate finder.
	 *
	 * @param contentupdateFinder the contentupdate finder
	 */
	public void setcontentupdateFinder(contentupdateFinder contentupdateFinder) {
		this.contentupdateFinder = contentupdateFinder;
	}

	/**
	 * Returns the personalisedparameterscontentstore local service.
	 *
	 * @return the personalisedparameterscontentstore local service
	 */
	public com.chola.ppcontent.service.personalisedparameterscontentstoreLocalService getpersonalisedparameterscontentstoreLocalService() {
		return personalisedparameterscontentstoreLocalService;
	}

	/**
	 * Sets the personalisedparameterscontentstore local service.
	 *
	 * @param personalisedparameterscontentstoreLocalService the personalisedparameterscontentstore local service
	 */
	public void setpersonalisedparameterscontentstoreLocalService(
		com.chola.ppcontent.service.personalisedparameterscontentstoreLocalService personalisedparameterscontentstoreLocalService) {
		this.personalisedparameterscontentstoreLocalService = personalisedparameterscontentstoreLocalService;
	}

	/**
	 * Returns the personalisedparameterscontentstore remote service.
	 *
	 * @return the personalisedparameterscontentstore remote service
	 */
	public personalisedparameterscontentstoreService getpersonalisedparameterscontentstoreService() {
		return personalisedparameterscontentstoreService;
	}

	/**
	 * Sets the personalisedparameterscontentstore remote service.
	 *
	 * @param personalisedparameterscontentstoreService the personalisedparameterscontentstore remote service
	 */
	public void setpersonalisedparameterscontentstoreService(
		personalisedparameterscontentstoreService personalisedparameterscontentstoreService) {
		this.personalisedparameterscontentstoreService = personalisedparameterscontentstoreService;
	}

	/**
	 * Returns the personalisedparameterscontentstore persistence.
	 *
	 * @return the personalisedparameterscontentstore persistence
	 */
	public personalisedparameterscontentstorePersistence getpersonalisedparameterscontentstorePersistence() {
		return personalisedparameterscontentstorePersistence;
	}

	/**
	 * Sets the personalisedparameterscontentstore persistence.
	 *
	 * @param personalisedparameterscontentstorePersistence the personalisedparameterscontentstore persistence
	 */
	public void setpersonalisedparameterscontentstorePersistence(
		personalisedparameterscontentstorePersistence personalisedparameterscontentstorePersistence) {
		this.personalisedparameterscontentstorePersistence = personalisedparameterscontentstorePersistence;
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
		return personalisedparameterscontentstoreService.class.getName();
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
		return personalisedparameterscontentstore.class;
	}

	protected String getModelClassName() {
		return personalisedparameterscontentstore.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = personalisedparameterscontentstorePersistence.getDataSource();

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

	@BeanReference(type = com.chola.ppcontent.service.contentuniqueinformationLocalService.class)
	protected com.chola.ppcontent.service.contentuniqueinformationLocalService contentuniqueinformationLocalService;
	@BeanReference(type = com.chola.ppcontent.service.contentuniqueinformationService.class)
	protected com.chola.ppcontent.service.contentuniqueinformationService contentuniqueinformationService;
	@BeanReference(type = contentuniqueinformationPersistence.class)
	protected contentuniqueinformationPersistence contentuniqueinformationPersistence;
	@BeanReference(type = com.chola.ppcontent.service.contentupdateLocalService.class)
	protected com.chola.ppcontent.service.contentupdateLocalService contentupdateLocalService;
	@BeanReference(type = com.chola.ppcontent.service.contentupdateService.class)
	protected com.chola.ppcontent.service.contentupdateService contentupdateService;
	@BeanReference(type = contentupdatePersistence.class)
	protected contentupdatePersistence contentupdatePersistence;
	@BeanReference(type = contentupdateFinder.class)
	protected contentupdateFinder contentupdateFinder;
	@BeanReference(type = com.chola.ppcontent.service.personalisedparameterscontentstoreLocalService.class)
	protected com.chola.ppcontent.service.personalisedparameterscontentstoreLocalService personalisedparameterscontentstoreLocalService;
	@BeanReference(type = personalisedparameterscontentstoreService.class)
	protected personalisedparameterscontentstoreService personalisedparameterscontentstoreService;
	@BeanReference(type = personalisedparameterscontentstorePersistence.class)
	protected personalisedparameterscontentstorePersistence personalisedparameterscontentstorePersistence;
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
	private personalisedparameterscontentstoreServiceClpInvoker _clpInvoker = new personalisedparameterscontentstoreServiceClpInvoker();
}