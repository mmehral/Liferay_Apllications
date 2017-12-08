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

package com.chola.conferenceroombooking.service.messaging;

import aQute.bnd.annotation.ProviderType;

import com.chola.conferenceroombooking.service.ClpSerializer;
import com.chola.conferenceroombooking.service.cityLocalServiceUtil;
import com.chola.conferenceroombooking.service.cityServiceUtil;
import com.chola.conferenceroombooking.service.conferenceroombookingdetailsLocalServiceUtil;
import com.chola.conferenceroombooking.service.conferenceroombookingdetailsServiceUtil;
import com.chola.conferenceroombooking.service.facilitymasterLocalServiceUtil;
import com.chola.conferenceroombooking.service.facilitymasterServiceUtil;
import com.chola.conferenceroombooking.service.floorwingLocalServiceUtil;
import com.chola.conferenceroombooking.service.floorwingServiceUtil;
import com.chola.conferenceroombooking.service.locationLocalServiceUtil;
import com.chola.conferenceroombooking.service.locationServiceUtil;
import com.chola.conferenceroombooking.service.roomLocalServiceUtil;
import com.chola.conferenceroombooking.service.roomServiceUtil;
import com.chola.conferenceroombooking.service.stateLocalServiceUtil;
import com.chola.conferenceroombooking.service.stateServiceUtil;

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
			cityLocalServiceUtil.clearService();

			cityServiceUtil.clearService();
			conferenceroombookingdetailsLocalServiceUtil.clearService();

			conferenceroombookingdetailsServiceUtil.clearService();
			facilitymasterLocalServiceUtil.clearService();

			facilitymasterServiceUtil.clearService();
			floorwingLocalServiceUtil.clearService();

			floorwingServiceUtil.clearService();
			locationLocalServiceUtil.clearService();

			locationServiceUtil.clearService();
			roomLocalServiceUtil.clearService();

			roomServiceUtil.clearService();
			stateLocalServiceUtil.clearService();

			stateServiceUtil.clearService();
		}
	}
}