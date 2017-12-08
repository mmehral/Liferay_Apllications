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

package com.chola.calendar.service.base;

import aQute.bnd.annotation.ProviderType;

import com.chola.calendar.service.corporatecontentuniqueinformationServiceUtil;

import java.util.Arrays;

/**
 * @author adms.java1
 * @generated
 */
@ProviderType
public class corporatecontentuniqueinformationServiceClpInvoker {
	public corporatecontentuniqueinformationServiceClpInvoker() {
		_methodName46 = "getOSGiServiceIdentifier";

		_methodParameterTypes46 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName46.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
			return corporatecontentuniqueinformationServiceUtil.getOSGiServiceIdentifier();
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName46;
	private String[] _methodParameterTypes46;
}