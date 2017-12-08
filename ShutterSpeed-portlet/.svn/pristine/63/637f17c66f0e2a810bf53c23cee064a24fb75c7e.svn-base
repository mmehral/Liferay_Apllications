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

package com.chola.shutterspeed.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.List;
import com.chola.shutterspeed.model.shutterspeedgallery;
import com.chola.shutterspeed.model.shutterspeedgalleryusers;
import com.chola.shutterspeed.service.base.shutterspeedgalleryusersLocalServiceBaseImpl;

/**
 * The implementation of the shutterspeedgalleryusers local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.chola.shutterspeed.service.shutterspeedgalleryusersLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloverLiferay02
 * @see shutterspeedgalleryusersLocalServiceBaseImpl
 * @see com.chola.shutterspeed.service.shutterspeedgalleryusersLocalServiceUtil
 */
@ProviderType
public class shutterspeedgalleryusersLocalServiceImpl
	extends shutterspeedgalleryusersLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.chola.shutterspeed.service.shutterspeedgalleryusersLocalServiceUtil} to access the shutterspeedgalleryusers local service.
	 */
	public List<shutterspeedgalleryusers> getAlbumUsers(long id)
	{
		return shutterspeedgalleryusersPersistence.findByALBUM_ID(id);
	}
	
	
}