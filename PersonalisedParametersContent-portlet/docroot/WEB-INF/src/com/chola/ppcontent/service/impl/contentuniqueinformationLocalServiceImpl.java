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

package com.chola.ppcontent.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.List;

import com.chola.ppcontent.model.contentuniqueinformation;
import com.chola.ppcontent.service.base.contentuniqueinformationLocalServiceBaseImpl;

/**
 * The implementation of the contentuniqueinformation local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.chola.ppcontent.service.contentuniqueinformationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author cloverliferay01
 * @see contentuniqueinformationLocalServiceBaseImpl
 * @see com.chola.ppcontent.service.contentuniqueinformationLocalServiceUtil
 */
@ProviderType
public class contentuniqueinformationLocalServiceImpl
	extends contentuniqueinformationLocalServiceBaseImpl {
	
	public List<contentuniqueinformation> getUniqueContentInfo(long contentId){
		return contentuniqueinformationPersistence.findByCONTENTID(contentId);
	}
}