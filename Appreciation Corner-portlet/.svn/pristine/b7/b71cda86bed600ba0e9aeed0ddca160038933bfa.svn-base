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

package com.chola.app.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link repliedService}.
 *
 * @author CloverLiferay02
 * @see repliedService
 * @generated
 */
@ProviderType
public class repliedServiceWrapper implements repliedService,
	ServiceWrapper<repliedService> {
	public repliedServiceWrapper(repliedService repliedService) {
		_repliedService = repliedService;
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _repliedService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _repliedService.getOSGiServiceIdentifier();
	}

	@Override
	public repliedService getWrappedService() {
		return _repliedService;
	}

	@Override
	public void setWrappedService(repliedService repliedService) {
		_repliedService = repliedService;
	}

	private repliedService _repliedService;
}