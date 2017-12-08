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

package com.portlet.sample.service.base;

import aQute.bnd.annotation.ProviderType;

import com.portlet.sample.service.SampleEntryServiceUtil;

import java.util.Arrays;

/**
 * @author CloverLiferay01
 * @generated
 */
@ProviderType
public class SampleEntryServiceClpInvoker {
	public SampleEntryServiceClpInvoker() {
		_methodName24 = "getOSGiServiceIdentifier";

		_methodParameterTypes24 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName24.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
			return SampleEntryServiceUtil.getOSGiServiceIdentifier();
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName24;
	private String[] _methodParameterTypes24;
}