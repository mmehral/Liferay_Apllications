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

package com.chola.trainingcalendar.service.messaging;

import aQute.bnd.annotation.ProviderType;

import com.chola.trainingcalendar.service.ClpSerializer;
import com.chola.trainingcalendar.service.trainingcalendarLocalServiceUtil;
import com.chola.trainingcalendar.service.trainingcalendardataLocalServiceUtil;
import com.chola.trainingcalendar.service.trainingcalendardataServiceUtil;
import com.chola.trainingcalendar.service.trainingcontentuniqueinformationLocalServiceUtil;
import com.chola.trainingcalendar.service.trainingcontentuniqueinformationServiceUtil;
import com.chola.trainingcalendar.service.trainingintendedtableLocalServiceUtil;
import com.chola.trainingcalendar.service.trainingintendedtableServiceUtil;
import com.chola.trainingcalendar.service.trainingpersonalisedparameterscontentstoreLocalServiceUtil;
import com.chola.trainingcalendar.service.trainingpersonalisedparameterscontentstoreServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

/**
 * @author CloverLiferay01
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
			trainingcalendarLocalServiceUtil.clearService();

			trainingcalendardataLocalServiceUtil.clearService();

			trainingcalendardataServiceUtil.clearService();
			trainingcontentuniqueinformationLocalServiceUtil.clearService();

			trainingcontentuniqueinformationServiceUtil.clearService();
			trainingintendedtableLocalServiceUtil.clearService();

			trainingintendedtableServiceUtil.clearService();
			trainingpersonalisedparameterscontentstoreLocalServiceUtil.clearService();

			trainingpersonalisedparameterscontentstoreServiceUtil.clearService();
		}
	}
}