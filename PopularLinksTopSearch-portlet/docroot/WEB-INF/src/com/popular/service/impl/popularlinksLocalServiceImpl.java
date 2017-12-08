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

package com.popular.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.List;

import com.popular.service.base.popularlinksLocalServiceBaseImpl;

/**
 * The implementation of the popularlinks local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.popular.service.popularlinksLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloverLiferay02
 * @see popularlinksLocalServiceBaseImpl
 * @see com.popular.service.popularlinksLocalServiceUtil
 */
@ProviderType
public class popularlinksLocalServiceImpl
	extends popularlinksLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.popular.service.popularlinksLocalServiceUtil} to access the popularlinks local service.
	 */
	//Internal Links 
		public boolean findurl(String url,long userid){
			return popularlinksFinder.findurl(url,userid);
		}
		
		public Object[] getcount(String url,long userid){
			return popularlinksFinder.fetchvalue(url, userid);
		}
		
		//External Links
		public boolean findexternalurl(String url,long userid){
			return popularlinksFinder.findexternalurl(url,userid);
		}
		
		public List<Object[]> getinternallinks(long userid){
			return popularlinksFinder.getinternallinks(userid); 
		}
		public List<Object[]> getExternallinks(long userid){
			return popularlinksFinder.getExternallinks(userid); 
		}
		public List<Object[]> getExtLinks(){
			return popularlinksFinder.getExtLinks(); 
		}
		public String externalurl(String url) {
			return popularlinksFinder.externalurl(url); 
		}
}