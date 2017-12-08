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

package com.chola.birthday.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link predefinedmessagesService}.
 *
 * @author CloverLiferay02
 * @see predefinedmessagesService
 * @generated
 */
@ProviderType
public class predefinedmessagesServiceWrapper
	implements predefinedmessagesService,
		ServiceWrapper<predefinedmessagesService> {
	public predefinedmessagesServiceWrapper(
		predefinedmessagesService predefinedmessagesService) {
		_predefinedmessagesService = predefinedmessagesService;
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _predefinedmessagesService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _predefinedmessagesService.getOSGiServiceIdentifier();
	}

	@Override
	public predefinedmessagesService getWrappedService() {
		return _predefinedmessagesService;
	}

	@Override
	public void setWrappedService(
		predefinedmessagesService predefinedmessagesService) {
		_predefinedmessagesService = predefinedmessagesService;
	}

	private predefinedmessagesService _predefinedmessagesService;
}