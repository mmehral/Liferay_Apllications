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

package com.chola.TodaycholaNews.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TodayCholaNewsService}.
 *
 * @author adms.java1
 * @see TodayCholaNewsService
 * @generated
 */
@ProviderType
public class TodayCholaNewsServiceWrapper implements TodayCholaNewsService,
	ServiceWrapper<TodayCholaNewsService> {
	public TodayCholaNewsServiceWrapper(
		TodayCholaNewsService todayCholaNewsService) {
		_todayCholaNewsService = todayCholaNewsService;
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _todayCholaNewsService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _todayCholaNewsService.getOSGiServiceIdentifier();
	}

	@Override
	public TodayCholaNewsService getWrappedService() {
		return _todayCholaNewsService;
	}

	@Override
	public void setWrappedService(TodayCholaNewsService todayCholaNewsService) {
		_todayCholaNewsService = todayCholaNewsService;
	}

	private TodayCholaNewsService _todayCholaNewsService;
}