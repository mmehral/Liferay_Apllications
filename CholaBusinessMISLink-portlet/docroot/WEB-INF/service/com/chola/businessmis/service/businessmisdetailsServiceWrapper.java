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

package com.chola.businessmis.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link businessmisdetailsService}.
 *
 * @author CloverLiferay01
 * @see businessmisdetailsService
 * @generated
 */
@ProviderType
public class businessmisdetailsServiceWrapper
	implements businessmisdetailsService,
		ServiceWrapper<businessmisdetailsService> {
	public businessmisdetailsServiceWrapper(
		businessmisdetailsService businessmisdetailsService) {
		_businessmisdetailsService = businessmisdetailsService;
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _businessmisdetailsService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _businessmisdetailsService.getOSGiServiceIdentifier();
	}

	@Override
	public businessmisdetailsService getWrappedService() {
		return _businessmisdetailsService;
	}

	@Override
	public void setWrappedService(
		businessmisdetailsService businessmisdetailsService) {
		_businessmisdetailsService = businessmisdetailsService;
	}

	private businessmisdetailsService _businessmisdetailsService;
}