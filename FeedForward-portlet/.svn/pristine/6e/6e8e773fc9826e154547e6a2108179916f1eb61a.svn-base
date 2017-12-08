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

package com.chola.feedforward.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link feedforwardgalleryusersService}.
 *
 * @author CloverLiferay02
 * @see feedforwardgalleryusersService
 * @generated
 */
@ProviderType
public class feedforwardgalleryusersServiceWrapper
	implements feedforwardgalleryusersService,
		ServiceWrapper<feedforwardgalleryusersService> {
	public feedforwardgalleryusersServiceWrapper(
		feedforwardgalleryusersService feedforwardgalleryusersService) {
		_feedforwardgalleryusersService = feedforwardgalleryusersService;
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _feedforwardgalleryusersService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _feedforwardgalleryusersService.getOSGiServiceIdentifier();
	}

	@Override
	public feedforwardgalleryusersService getWrappedService() {
		return _feedforwardgalleryusersService;
	}

	@Override
	public void setWrappedService(
		feedforwardgalleryusersService feedforwardgalleryusersService) {
		_feedforwardgalleryusersService = feedforwardgalleryusersService;
	}

	private feedforwardgalleryusersService _feedforwardgalleryusersService;
}