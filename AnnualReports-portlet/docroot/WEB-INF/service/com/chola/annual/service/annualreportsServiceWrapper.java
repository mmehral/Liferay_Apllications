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

package com.chola.annual.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link annualreportsService}.
 *
 * @author CloverLiferay02
 * @see annualreportsService
 * @generated
 */
@ProviderType
public class annualreportsServiceWrapper implements annualreportsService,
	ServiceWrapper<annualreportsService> {
	public annualreportsServiceWrapper(
		annualreportsService annualreportsService) {
		_annualreportsService = annualreportsService;
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _annualreportsService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _annualreportsService.getOSGiServiceIdentifier();
	}

	@Override
	public annualreportsService getWrappedService() {
		return _annualreportsService;
	}

	@Override
	public void setWrappedService(annualreportsService annualreportsService) {
		_annualreportsService = annualreportsService;
	}

	private annualreportsService _annualreportsService;
}