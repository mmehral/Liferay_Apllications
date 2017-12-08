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

package com.chola.bsop.service.messaging;

import aQute.bnd.annotation.ProviderType;

import com.chola.bsop.service.ClpSerializer;
import com.chola.bsop.service.bsopdetailsLocalServiceUtil;
import com.chola.bsop.service.bsopdetailsServiceUtil;
import com.chola.bsop.service.bsoppathLocalServiceUtil;
import com.chola.bsop.service.bsoppathServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

/**
 * @author cloverliferay01
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
			bsopdetailsLocalServiceUtil.clearService();

			bsopdetailsServiceUtil.clearService();
			bsoppathLocalServiceUtil.clearService();

			bsoppathServiceUtil.clearService();
		}
	}
}