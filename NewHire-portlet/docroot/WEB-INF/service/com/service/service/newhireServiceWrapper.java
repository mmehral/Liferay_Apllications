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

package com.service.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link newhireService}.
 *
 * @author adms.java1
 * @see newhireService
 * @generated
 */
@ProviderType
public class newhireServiceWrapper implements newhireService,
	ServiceWrapper<newhireService> {
	public newhireServiceWrapper(newhireService newhireService) {
		_newhireService = newhireService;
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _newhireService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _newhireService.getOSGiServiceIdentifier();
	}

	@Override
	public newhireService getWrappedService() {
		return _newhireService;
	}

	@Override
	public void setWrappedService(newhireService newhireService) {
		_newhireService = newhireService;
	}

	private newhireService _newhireService;
}