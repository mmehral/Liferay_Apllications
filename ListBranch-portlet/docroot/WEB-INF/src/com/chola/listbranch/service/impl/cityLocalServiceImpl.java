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

package com.chola.listbranch.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.List;

import com.chola.listbranch.service.base.cityLocalServiceBaseImpl;
import com.chola.listbranch.service.persistence.cityFinderUtil;

/**
 * The implementation of the city local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.chola.listbranch.service.cityLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author adms.java1
 * @see cityLocalServiceBaseImpl
 * @see com.chola.listbranch.service.cityLocalServiceUtil
 */
@ProviderType
public class cityLocalServiceImpl extends cityLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.chola.listbranch.service.cityLocalServiceUtil} to access the city local service.
	 */
	
		public List<String> getCity()
		{
			return cityFinder.getCity();
		}
		public List<String> getCities(long stateID)
		{
			return cityFinder.getCities(stateID);
		}
		
		public List<String> getProduct()
		{
			return cityFinder.getProducts();
		}
		
		public List<String> getState()
		{
			return cityFinder.getState();
		}
		
		public List getBranchNamedetails(long cityId)
		{
			return cityFinder.getBranchNamedetails(cityId);
		}
		
		public String getstateName(long stateId)
		{
			System.out.println("StateId :"+stateId);
			return cityFinderUtil.getstateName(stateId);
		}
		public String getcityName(long cityId)
		{
			System.out.println("cityId :"+cityId);
			return cityFinderUtil.getcityName(cityId);
		}
		public String getproductName(long productId)
		{
			System.out.println("productId :"+productId);
			return cityFinderUtil.getproductName(productId);
		}
		public String getbranchName(long branchId)
		{
			System.out.println("branch id :"+branchId);
			return cityFinderUtil.getbranchName(branchId);
		}
		
}