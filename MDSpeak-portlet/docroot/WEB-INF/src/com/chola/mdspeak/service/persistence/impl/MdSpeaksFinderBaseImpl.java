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

package com.chola.mdspeak.service.persistence.impl;

import com.chola.mdspeak.model.MdSpeaks;
import com.chola.mdspeak.service.persistence.MdSpeaksPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

/**
 * @author adms.java1
 * @generated
 */
public class MdSpeaksFinderBaseImpl extends BasePersistenceImpl<MdSpeaks> {
	/**
	 * Returns the md speaks persistence.
	 *
	 * @return the md speaks persistence
	 */
	public MdSpeaksPersistence getMdSpeaksPersistence() {
		return mdSpeaksPersistence;
	}

	/**
	 * Sets the md speaks persistence.
	 *
	 * @param mdSpeaksPersistence the md speaks persistence
	 */
	public void setMdSpeaksPersistence(MdSpeaksPersistence mdSpeaksPersistence) {
		this.mdSpeaksPersistence = mdSpeaksPersistence;
	}

	@BeanReference(type = MdSpeaksPersistence.class)
	protected MdSpeaksPersistence mdSpeaksPersistence;
}