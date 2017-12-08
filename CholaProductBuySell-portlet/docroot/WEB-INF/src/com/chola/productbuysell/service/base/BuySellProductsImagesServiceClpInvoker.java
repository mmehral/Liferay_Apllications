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

package com.chola.productbuysell.service.base;

import aQute.bnd.annotation.ProviderType;

import com.chola.productbuysell.service.BuySellProductsImagesServiceUtil;

import java.util.Arrays;

/**
 * @author CloverLiferay03
 * @generated
 */
@ProviderType
public class BuySellProductsImagesServiceClpInvoker {
	public BuySellProductsImagesServiceClpInvoker() {
		_methodName38 = "getOSGiServiceIdentifier";

		_methodParameterTypes38 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName38.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes38, parameterTypes)) {
			return BuySellProductsImagesServiceUtil.getOSGiServiceIdentifier();
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName38;
	private String[] _methodParameterTypes38;
}