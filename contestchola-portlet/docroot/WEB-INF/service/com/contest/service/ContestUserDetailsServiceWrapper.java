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

package com.contest.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ContestUserDetailsService}.
 *
 * @author CloverLiferay01
 * @see ContestUserDetailsService
 * @generated
 */
@ProviderType
public class ContestUserDetailsServiceWrapper
	implements ContestUserDetailsService,
		ServiceWrapper<ContestUserDetailsService> {
	public ContestUserDetailsServiceWrapper(
		ContestUserDetailsService contestUserDetailsService) {
		_contestUserDetailsService = contestUserDetailsService;
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _contestUserDetailsService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _contestUserDetailsService.getOSGiServiceIdentifier();
	}

	@Override
	public ContestUserDetailsService getWrappedService() {
		return _contestUserDetailsService;
	}

	@Override
	public void setWrappedService(
		ContestUserDetailsService contestUserDetailsService) {
		_contestUserDetailsService = contestUserDetailsService;
	}

	private ContestUserDetailsService _contestUserDetailsService;
}