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

package com.chola.listbranch.service.messaging;

import aQute.bnd.annotation.ProviderType;

import com.chola.listbranch.service.ClpSerializer;
import com.chola.listbranch.service.branchdetailsLocalServiceUtil;
import com.chola.listbranch.service.branchdetailsServiceUtil;
import com.chola.listbranch.service.cityLocalServiceUtil;
import com.chola.listbranch.service.cityServiceUtil;
import com.chola.listbranch.service.mappingLocalServiceUtil;
import com.chola.listbranch.service.mappingServiceUtil;
import com.chola.listbranch.service.productLocalServiceUtil;
import com.chola.listbranch.service.productServiceUtil;
import com.chola.listbranch.service.stateLocalServiceUtil;
import com.chola.listbranch.service.stateServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

/**
 * @author adms.java1
 */
@ProviderType
public class ClpMessageListener extends BaseMessageListener {
	public static String getServletContextName() {
		return ClpSerializer.getServletContextName();
	}

	@Override
	protected void doReceive(Message message) throws Exception {
		String command = message.getString("command");
		String servletContextName = message.getString("servletContextName");

		if (command.equals("undeploy") &&
				servletContextName.equals(getServletContextName())) {
			branchdetailsLocalServiceUtil.clearService();

			branchdetailsServiceUtil.clearService();
			cityLocalServiceUtil.clearService();

			cityServiceUtil.clearService();
			mappingLocalServiceUtil.clearService();

			mappingServiceUtil.clearService();
			productLocalServiceUtil.clearService();

			productServiceUtil.clearService();
			stateLocalServiceUtil.clearService();

			stateServiceUtil.clearService();
		}
	}
}