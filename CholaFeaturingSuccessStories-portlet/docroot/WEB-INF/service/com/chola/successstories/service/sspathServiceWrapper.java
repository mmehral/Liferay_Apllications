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
 * Provides a wrapper for {@link sspathService}.
 *
 * @author cloverliferay01
 * @see sspathService
 * @generated
 */
@ProviderType
public class sspathServiceWrapper implements sspathService,
	ServiceWrapper<sspathService> {
	public sspathServiceWrapper(sspathService sspathService) {
		_sspathService = sspathService;
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _sspathService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _sspathService.getOSGiServiceIdentifier();
	}

	@Override
	public sspathService getWrappedService() {
		return _sspathService;
	}

	@Override
	public void setWrappedService(sspathService sspathService) {
		_sspathService = sspathService;
	}

	private sspathService _sspathService;
}