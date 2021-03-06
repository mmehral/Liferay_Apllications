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

package com.chola.trainingcalendar.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.chola.trainingcalendar.model.trainingcontentuniqueinformation;
import com.chola.trainingcalendar.service.trainingcontentuniqueinformationLocalServiceUtil;

/**
 * The extended model base implementation for the trainingcontentuniqueinformation service. Represents a row in the &quot;chola_trainingcontentuniqueinformation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link trainingcontentuniqueinformationImpl}.
 * </p>
 *
 * @author CloverLiferay01
 * @see trainingcontentuniqueinformationImpl
 * @see trainingcontentuniqueinformation
 * @generated
 */
@ProviderType
public abstract class trainingcontentuniqueinformationBaseImpl
	extends trainingcontentuniqueinformationModelImpl
	implements trainingcontentuniqueinformation {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a trainingcontentuniqueinformation model instance should use the {@link trainingcontentuniqueinformation} interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			trainingcontentuniqueinformationLocalServiceUtil.addtrainingcontentuniqueinformation(this);
		}
		else {
			trainingcontentuniqueinformationLocalServiceUtil.updatetrainingcontentuniqueinformation(this);
		}
	}
}