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

package com.popular.service.persistence;

import aQute.bnd.annotation.ProviderType;

/**
 * @author CloverLiferay02
 * @generated
 */
@ProviderType
public interface popularlinksFinder {
	public boolean findurl(java.lang.String url, long userid);

	public java.lang.Object[] fetchvalue(java.lang.String url, long userid);

	public boolean findexternalurl(java.lang.String url, long userid);

	public java.util.List<java.lang.Object[]> getinternallinks(long userid);

	public java.util.List<java.lang.Object[]> getExternallinks(long userid);

	public java.util.List<java.lang.Object[]> getExtLinks();

	public java.lang.String externalurl(java.lang.String url);
}