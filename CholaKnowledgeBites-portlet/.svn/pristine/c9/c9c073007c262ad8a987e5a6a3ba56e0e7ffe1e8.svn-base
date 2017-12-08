

package com.chola.knowledgebites.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.List;

import com.chola.knowledgebites.model.kbdetails;
import com.chola.knowledgebites.service.base.kbdetailsLocalServiceBaseImpl;
import com.chola.knowledgebites.service.persistence.kbdetailsFinderUtil;


@ProviderType
public class kbdetailsLocalServiceImpl extends kbdetailsLocalServiceBaseImpl {
	public List<kbdetails> getkbdetail(long contentId){
		return kbdetailsPersistence.findByCONTENT_ID(contentId);
	}

}