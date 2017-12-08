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

package com.chola.trainingcalendar.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link trainingcontentuniqueinformationService}.
 *
 * @author CloverLiferay01
 * @see trainingcontentuniqueinformationService
 * @generated
 */
@ProviderType
public class trainingcontentuniqueinformationServiceWrapper
	implements trainingcontentuniqueinformationService,
		ServiceWrapper<trainingcontentuniqueinformationService> {
	public trainingcontentuniqueinformationServiceWrapper(
		trainingcontentuniqueinformationService trainingcontentuniqueinformationService) {
		_trainingcontentuniqueinformationService = trainingcontentuniqueinformationService;
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _trainingcontentuniqueinformationService.invokeMethod(name,
			parameterTypes, arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _trainingcontentuniqueinformationService.getOSGiServiceIdentifier();
	}

	@Override
	public trainingcontentuniqueinformationService getWrappedService() {
		return _trainingcontentuniqueinformationService;
	}

	@Override
	public void setWrappedService(
		trainingcontentuniqueinformationService trainingcontentuniqueinformationService) {
		_trainingcontentuniqueinformationService = trainingcontentuniqueinformationService;
	}

	private trainingcontentuniqueinformationService _trainingcontentuniqueinformationService;
}