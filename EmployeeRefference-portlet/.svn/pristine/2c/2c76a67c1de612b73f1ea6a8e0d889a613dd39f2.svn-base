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

package com.chola.EmployeeRef.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.service.InvokableService;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the remote service utility for EmployeeRefrence. This utility wraps
 * {@link com.chola.EmployeeRef.service.impl.EmployeeRefrenceServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author CloverLiferay03
 * @see EmployeeRefrenceService
 * @see com.chola.EmployeeRef.service.base.EmployeeRefrenceServiceBaseImpl
 * @see com.chola.EmployeeRef.service.impl.EmployeeRefrenceServiceImpl
 * @generated
 */
@ProviderType
public class EmployeeRefrenceServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.chola.EmployeeRef.service.impl.EmployeeRefrenceServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static void clearService() {
		_service = null;
	}

	public static EmployeeRefrenceService getService() {
		if (_service == null) {
			InvokableService invokableService = (InvokableService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					EmployeeRefrenceService.class.getName());

			if (invokableService instanceof EmployeeRefrenceService) {
				_service = (EmployeeRefrenceService)invokableService;
			}
			else {
				_service = new EmployeeRefrenceServiceClp(invokableService);
			}

			ReferenceRegistry.registerReference(EmployeeRefrenceServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static EmployeeRefrenceService _service;
}