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

package com.chola.productbuysell.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.List;

import com.chola.productbuysell.model.BuySellProducts;
import com.chola.productbuysell.service.base.BuySellProductsLocalServiceBaseImpl;

/**
 * The implementation of the buy sell products local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.chola.productbuysell.service.BuySellProductsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CloverLiferay03
 * @see BuySellProductsLocalServiceBaseImpl
 * @see com.chola.productbuysell.service.BuySellProductsLocalServiceUtil
 */
@ProviderType
public class BuySellProductsLocalServiceImpl
	extends BuySellProductsLocalServiceBaseImpl {
	
	public List<BuySellProducts>
	getProductsCategorySearchWise(int category_id,String title){
	return  buySellProductsPersistence.findBycategoryAndSearch(category_id, title)	;
	}
	
	public List<BuySellProducts>
	getProductsLocationSearchWise(int location,String title){
	return  buySellProductsPersistence.findBylocationAndSearch(location, title);
	}
	
	public List<BuySellProducts>
	getProductsCategoryLocationSearchWise(int category_id,int location,String title){
	return  buySellProductsPersistence.findBycategoryLocationAndSearch(category_id, location, title);
	}
	
	public List<BuySellProducts>
	getProductsCategoryWise(int category_id){
	return  buySellProductsPersistence.findByCATEGORY(category_id)	;
	}
	
	public List<com.chola.productbuysell.model.BuySellProducts>
	getProductsLocationWise(int location_id){
	return  buySellProductsPersistence.findByLOCATION(location_id);
	}
	
	public List<BuySellProducts>
	getProductsCategoryAndLocationWise(int location_id,int category_id){
	return  buySellProductsPersistence.findByCATEGORYANDLOCATION(location_id, category_id);
	}
	
	public List<BuySellProducts>
	getProductsTitleBasedSearch(String title){
	return  buySellProductsPersistence.findByTITLEBASEDSEARCH(title);
	}
}