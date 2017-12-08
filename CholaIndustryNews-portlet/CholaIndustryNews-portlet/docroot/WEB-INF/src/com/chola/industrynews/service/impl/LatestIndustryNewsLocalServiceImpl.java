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

package com.chola.industrynews.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.List;

import com.chola.industrynews.service.base.LatestIndustryNewsLocalServiceBaseImpl;
import com.chola.industrynews.service.persistence.LatestIndustryNewsFinderUtil;

/**
 * The implementation of the latest industry news local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.chola.industrynews.service.LatestIndustryNewsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloverLiferay01
 * @see LatestIndustryNewsLocalServiceBaseImpl
 * @see com.chola.industrynews.service.LatestIndustryNewsLocalServiceUtil
 */
@ProviderType
public class LatestIndustryNewsLocalServiceImpl
	extends LatestIndustryNewsLocalServiceBaseImpl {
	public List<String> getContent(String createdate)
	{
	return LatestIndustryNewsFinderUtil.getContent(createdate);
	}
	public List<String> getContentNews()
	{
	return LatestIndustryNewsFinderUtil.getContentNews();
	}
}