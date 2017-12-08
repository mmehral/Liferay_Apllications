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

package com.chola.productbuysell.exception;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author CloverLiferay03
 */
@ProviderType
public class NoSuchBuySellProductsException extends NoSuchModelException {

	public NoSuchBuySellProductsException() {
	}

	public NoSuchBuySellProductsException(String msg) {
		super(msg);
	}

	public NoSuchBuySellProductsException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchBuySellProductsException(Throwable cause) {
		super(cause);
	}

}