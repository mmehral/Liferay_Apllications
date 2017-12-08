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

package com.popular.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link externallinksService}.
 *
 * @author CloverLiferay02
 * @see externallinksService
 * @generated
 */
@ProviderType
public class externallinksServiceWrapper implements externallinksService,
	ServiceWrapper<externallinksService> {
	public externallinksServiceWrapper(
		externallinksService externallinksService) {
		_externallinksService = externallinksService;
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _externallinksService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _externallinksService.getOSGiServiceIdentifier();
	}

	@Override
	public externallinksService getWrappedService() {
		return _externallinksService;
	}

	@Override
	public void setWrappedService(externallinksService externallinksService) {
		_externallinksService = externallinksService;
	}

	private externallinksService _externallinksService;
}