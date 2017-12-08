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

package com.chola.trainingcalendar.service.base;

import aQute.bnd.annotation.ProviderType;

import com.chola.trainingcalendar.service.trainingpersonalisedparameterscontentstoreLocalServiceUtil;

import java.util.Arrays;

/**
 * @author CloverLiferay01
 * @generated
 */
@ProviderType
public class trainingpersonalisedparameterscontentstoreLocalServiceClpInvoker {
	public trainingpersonalisedparameterscontentstoreLocalServiceClpInvoker() {
		_methodName0 = "addtrainingpersonalisedparameterscontentstore";

		_methodParameterTypes0 = new String[] {
				"com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstore"
			};

		_methodName1 = "createtrainingpersonalisedparameterscontentstore";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deletetrainingpersonalisedparameterscontentstore";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deletetrainingpersonalisedparameterscontentstore";

		_methodParameterTypes3 = new String[] {
				"com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstore"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchtrainingpersonalisedparameterscontentstore";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "gettrainingpersonalisedparameterscontentstore";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getActionableDynamicQuery";

		_methodParameterTypes12 = new String[] {  };

		_methodName13 = "getIndexableActionableDynamicQuery";

		_methodParameterTypes13 = new String[] {  };

		_methodName15 = "deletePersistedModel";

		_methodParameterTypes15 = new String[] {
				"com.liferay.portal.kernel.model.PersistedModel"
			};

		_methodName16 = "getPersistedModel";

		_methodParameterTypes16 = new String[] { "java.io.Serializable" };

		_methodName17 = "gettrainingpersonalisedparameterscontentstores";

		_methodParameterTypes17 = new String[] { "int", "int" };

		_methodName18 = "gettrainingpersonalisedparameterscontentstoresCount";

		_methodParameterTypes18 = new String[] {  };

		_methodName19 = "updatetrainingpersonalisedparameterscontentstore";

		_methodParameterTypes19 = new String[] {
				"com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstore"
			};

		_methodName56 = "getOSGiServiceIdentifier";

		_methodParameterTypes56 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return trainingpersonalisedparameterscontentstoreLocalServiceUtil.addtrainingpersonalisedparameterscontentstore((com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstore)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return trainingpersonalisedparameterscontentstoreLocalServiceUtil.createtrainingpersonalisedparameterscontentstore(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return trainingpersonalisedparameterscontentstoreLocalServiceUtil.deletetrainingpersonalisedparameterscontentstore(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return trainingpersonalisedparameterscontentstoreLocalServiceUtil.deletetrainingpersonalisedparameterscontentstore((com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstore)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return trainingpersonalisedparameterscontentstoreLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return trainingpersonalisedparameterscontentstoreLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return trainingpersonalisedparameterscontentstoreLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return trainingpersonalisedparameterscontentstoreLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator<?>)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return trainingpersonalisedparameterscontentstoreLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return trainingpersonalisedparameterscontentstoreLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return trainingpersonalisedparameterscontentstoreLocalServiceUtil.fetchtrainingpersonalisedparameterscontentstore(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return trainingpersonalisedparameterscontentstoreLocalServiceUtil.gettrainingpersonalisedparameterscontentstore(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return trainingpersonalisedparameterscontentstoreLocalServiceUtil.getActionableDynamicQuery();
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return trainingpersonalisedparameterscontentstoreLocalServiceUtil.getIndexableActionableDynamicQuery();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return trainingpersonalisedparameterscontentstoreLocalServiceUtil.deletePersistedModel((com.liferay.portal.kernel.model.PersistedModel)arguments[0]);
		}

		if (_methodName16.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
			return trainingpersonalisedparameterscontentstoreLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName17.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
			return trainingpersonalisedparameterscontentstoreLocalServiceUtil.gettrainingpersonalisedparameterscontentstores(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName18.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
			return trainingpersonalisedparameterscontentstoreLocalServiceUtil.gettrainingpersonalisedparameterscontentstoresCount();
		}

		if (_methodName19.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes19, parameterTypes)) {
			return trainingpersonalisedparameterscontentstoreLocalServiceUtil.updatetrainingpersonalisedparameterscontentstore((com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstore)arguments[0]);
		}

		if (_methodName56.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes56, parameterTypes)) {
			return trainingpersonalisedparameterscontentstoreLocalServiceUtil.getOSGiServiceIdentifier();
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName16;
	private String[] _methodParameterTypes16;
	private String _methodName17;
	private String[] _methodParameterTypes17;
	private String _methodName18;
	private String[] _methodParameterTypes18;
	private String _methodName19;
	private String[] _methodParameterTypes19;
	private String _methodName56;
	private String[] _methodParameterTypes56;
}