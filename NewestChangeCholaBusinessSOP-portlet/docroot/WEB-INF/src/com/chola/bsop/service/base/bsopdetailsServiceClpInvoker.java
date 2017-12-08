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

package com.chola.bsop.service.base;

import aQute.bnd.annotation.ProviderType;

import com.chola.bsop.service.bsopdetailsServiceUtil;

import java.util.Arrays;

/**
 * @author cloverliferay01
 * @generated
 */
@ProviderType
public class bsopdetailsServiceClpInvoker {
	public bsopdetailsServiceClpInvoker() {
		_methodName30 = "getOSGiServiceIdentifier";

		_methodParameterTypes30 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName30.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
			return bsopdetailsServiceUtil.getOSGiServiceIdentifier();
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName30;
	private String[] _methodParameterTypes30;
}