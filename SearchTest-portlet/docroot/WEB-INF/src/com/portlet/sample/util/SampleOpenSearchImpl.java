package com.portlet.sample.util;

import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.HitsOpenSearchImpl;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;

import java.util.LinkedHashMap;

public class SampleOpenSearchImpl extends HitsOpenSearchImpl {

	public static final String SEARCH_PATH = "/c/sampleEntry/open_search";
	public static final String TITLE = "Liferay Sample Search: ";	
	
	@Override
	public String getSearchPath() {
		// TODO Auto-generated method stub
				return SEARCH_PATH;
			}
	
	public Hits getHits(long companyId,String firstName,String middleName,String lastName,String screenName,String emailAddress,int status,LinkedHashMap<String,Object> params,boolean andSearch,Sort sort, int keywords, int start, int end) throws Exception {
		        return UserLocalServiceUtil.search(companyId, firstName, middleName, lastName, screenName, emailAddress, status, params, andSearch, start, end, sort);
		    }
	@Override
	public String getTitle(String keywords) {
		// TODO Auto-generated method stub
		return TITLE + keywords;
	}

}
