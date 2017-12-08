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

package com.chola.listbranch.exception;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.exception.NoSuchModelException;

/**
 * @author adms.java1
 */
@ProviderType
public class NoSuchbranchdetailsException extends NoSuchModelException {

	public NoSuchbranchdetailsException() {
	}

	public NoSuchbranchdetailsException(String msg) {
		super(msg);
	}

	public NoSuchbranchdetailsException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchbranchdetailsException(Throwable cause) {
		super(cause);
	}

}