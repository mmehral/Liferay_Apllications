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

package com.chola.successstories.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ssusersService}.
 *
 * @author cloverliferay01
 * @see ssusersService
 * @generated
 */
@ProviderType
public class ssusersServiceWrapper implements ssusersService,
	ServiceWrapper<ssusersService> {
	public ssusersServiceWrapper(ssusersService ssusersService) {
		_ssusersService = ssusersService;
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _ssusersService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _ssusersService.getOSGiServiceIdentifier();
	}

	@Override
	public ssusersService getWrappedService() {
		return _ssusersService;
	}

	@Override
	public void setWrappedService(ssusersService ssusersService) {
		_ssusersService = ssusersService;
	}

	private ssusersService _ssusersService;
}