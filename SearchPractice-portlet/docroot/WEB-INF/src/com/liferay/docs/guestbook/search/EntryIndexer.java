package com.liferay.docs.guestbook.search;

import com.google.common.collect.Multiset.Entry;
import com.liferay.portal.kernel.search.BaseIndexer;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Summary;

import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

public class EntryIndexer extends BaseIndexer {
	
    public static final String CLASS_NAMES =Entry.class.getName();

    public static final String PORTLET_ID = "guestbook-portlet";

    public EntryIndexer() {

        setPermissionAware(true);
}
    
	@Override
	public String getClassName() {
		// TODO Auto-generated method stub
		return CLASS_NAMES;
	}
	@Override
	public String getPortletId() {
		// TODO Auto-generated method stub
		return PORTLET_ID;
	}

	@Override
	protected void doDelete(Object arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Document doGetDocument(Object arg0) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Summary doGetSummary(Document arg0, Locale arg1, String arg2, PortletRequest arg3, PortletResponse arg4)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void doReindex(String[] arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void doReindex(Object arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void doReindex(String arg0, long arg1) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
