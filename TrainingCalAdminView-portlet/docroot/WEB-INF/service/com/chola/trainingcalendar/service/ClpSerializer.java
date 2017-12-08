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

package com.chola.trainingcalendar.service;

import aQute.bnd.annotation.ProviderType;

import com.chola.trainingcalendar.model.trainingcalendarClp;
import com.chola.trainingcalendar.model.trainingcalendardataClp;
import com.chola.trainingcalendar.model.trainingcontentuniqueinformationClp;
import com.chola.trainingcalendar.model.trainingintendedtableClp;
import com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstoreClp;

import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CloverLiferay01
 */
@ProviderType
public class ClpSerializer {
	public static String getServletContextName() {
		if (Validator.isNotNull(_servletContextName)) {
			return _servletContextName;
		}

		synchronized (ClpSerializer.class) {
			if (Validator.isNotNull(_servletContextName)) {
				return _servletContextName;
			}

			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Class<?> portletPropsClass = classLoader.loadClass(
						"com.liferay.util.portlet.PortletProps");

				Method getMethod = portletPropsClass.getMethod("get",
						new Class<?>[] { String.class });

				String portletPropsServletContextName = (String)getMethod.invoke(null,
						"TrainingCalAdminView-portlet-deployment-context");

				if (Validator.isNotNull(portletPropsServletContextName)) {
					_servletContextName = portletPropsServletContextName;
				}
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info(
						"Unable to locate deployment context from portlet properties");
				}
			}

			if (Validator.isNull(_servletContextName)) {
				try {
					String propsUtilServletContextName = PropsUtil.get(
							"TrainingCalAdminView-portlet-deployment-context");

					if (Validator.isNotNull(propsUtilServletContextName)) {
						_servletContextName = propsUtilServletContextName;
					}
				}
				catch (Throwable t) {
					if (_log.isInfoEnabled()) {
						_log.info(
							"Unable to locate deployment context from portal properties");
					}
				}
			}

			if (Validator.isNull(_servletContextName)) {
				_servletContextName = "TrainingCalAdminView-portlet";
			}

			return _servletContextName;
		}
	}

	public static Object translateInput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(trainingcalendarClp.class.getName())) {
			return translateInputtrainingcalendar(oldModel);
		}

		if (oldModelClassName.equals(trainingcalendardataClp.class.getName())) {
			return translateInputtrainingcalendardata(oldModel);
		}

		if (oldModelClassName.equals(
					trainingcontentuniqueinformationClp.class.getName())) {
			return translateInputtrainingcontentuniqueinformation(oldModel);
		}

		if (oldModelClassName.equals(trainingintendedtableClp.class.getName())) {
			return translateInputtrainingintendedtable(oldModel);
		}

		if (oldModelClassName.equals(
					trainingpersonalisedparameterscontentstoreClp.class.getName())) {
			return translateInputtrainingpersonalisedparameterscontentstore(oldModel);
		}

		return oldModel;
	}

	public static Object translateInput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateInput(curObj));
		}

		return newList;
	}

	public static Object translateInputtrainingcalendar(BaseModel<?> oldModel) {
		trainingcalendarClp oldClpModel = (trainingcalendarClp)oldModel;

		BaseModel<?> newModel = oldClpModel.gettrainingcalendarRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputtrainingcalendardata(
		BaseModel<?> oldModel) {
		trainingcalendardataClp oldClpModel = (trainingcalendardataClp)oldModel;

		BaseModel<?> newModel = oldClpModel.gettrainingcalendardataRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputtrainingcontentuniqueinformation(
		BaseModel<?> oldModel) {
		trainingcontentuniqueinformationClp oldClpModel = (trainingcontentuniqueinformationClp)oldModel;

		BaseModel<?> newModel = oldClpModel.gettrainingcontentuniqueinformationRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputtrainingintendedtable(
		BaseModel<?> oldModel) {
		trainingintendedtableClp oldClpModel = (trainingintendedtableClp)oldModel;

		BaseModel<?> newModel = oldClpModel.gettrainingintendedtableRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInputtrainingpersonalisedparameterscontentstore(
		BaseModel<?> oldModel) {
		trainingpersonalisedparameterscontentstoreClp oldClpModel = (trainingpersonalisedparameterscontentstoreClp)oldModel;

		BaseModel<?> newModel = oldClpModel.gettrainingpersonalisedparameterscontentstoreRemoteModel();

		newModel.setModelAttributes(oldClpModel.getModelAttributes());

		return newModel;
	}

	public static Object translateInput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateInput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateInput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Object translateOutput(BaseModel<?> oldModel) {
		Class<?> oldModelClass = oldModel.getClass();

		String oldModelClassName = oldModelClass.getName();

		if (oldModelClassName.equals(
					"com.chola.trainingcalendar.model.impl.trainingcalendarImpl")) {
			return translateOutputtrainingcalendar(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.chola.trainingcalendar.model.impl.trainingcalendardataImpl")) {
			return translateOutputtrainingcalendardata(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.chola.trainingcalendar.model.impl.trainingcontentuniqueinformationImpl")) {
			return translateOutputtrainingcontentuniqueinformation(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.chola.trainingcalendar.model.impl.trainingintendedtableImpl")) {
			return translateOutputtrainingintendedtable(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		if (oldModelClassName.equals(
					"com.chola.trainingcalendar.model.impl.trainingpersonalisedparameterscontentstoreImpl")) {
			return translateOutputtrainingpersonalisedparameterscontentstore(oldModel);
		}
		else if (oldModelClassName.endsWith("Clp")) {
			try {
				ClassLoader classLoader = ClpSerializer.class.getClassLoader();

				Method getClpSerializerClassMethod = oldModelClass.getMethod(
						"getClpSerializerClass");

				Class<?> oldClpSerializerClass = (Class<?>)getClpSerializerClassMethod.invoke(oldModel);

				Class<?> newClpSerializerClass = classLoader.loadClass(oldClpSerializerClass.getName());

				Method translateOutputMethod = newClpSerializerClass.getMethod("translateOutput",
						BaseModel.class);

				Class<?> oldModelModelClass = oldModel.getModelClass();

				Method getRemoteModelMethod = oldModelClass.getMethod("get" +
						oldModelModelClass.getSimpleName() + "RemoteModel");

				Object oldRemoteModel = getRemoteModelMethod.invoke(oldModel);

				BaseModel<?> newModel = (BaseModel<?>)translateOutputMethod.invoke(null,
						oldRemoteModel);

				return newModel;
			}
			catch (Throwable t) {
				if (_log.isInfoEnabled()) {
					_log.info("Unable to translate " + oldModelClassName, t);
				}
			}
		}

		return oldModel;
	}

	public static Object translateOutput(List<Object> oldList) {
		List<Object> newList = new ArrayList<Object>(oldList.size());

		for (int i = 0; i < oldList.size(); i++) {
			Object curObj = oldList.get(i);

			newList.add(translateOutput(curObj));
		}

		return newList;
	}

	public static Object translateOutput(Object obj) {
		if (obj instanceof BaseModel<?>) {
			return translateOutput((BaseModel<?>)obj);
		}
		else if (obj instanceof List<?>) {
			return translateOutput((List<Object>)obj);
		}
		else {
			return obj;
		}
	}

	public static Throwable translateThrowable(Throwable throwable) {
		if (_useReflectionToTranslateThrowable) {
			try {
				UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

				objectOutputStream.writeObject(throwable);

				objectOutputStream.flush();
				objectOutputStream.close();

				UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
						0, unsyncByteArrayOutputStream.size());

				Thread currentThread = Thread.currentThread();

				ClassLoader contextClassLoader = currentThread.getContextClassLoader();

				ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
						contextClassLoader);

				throwable = (Throwable)objectInputStream.readObject();

				objectInputStream.close();

				return throwable;
			}
			catch (ClassNotFoundException cnfe) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (SecurityException se) {
				if (_log.isInfoEnabled()) {
					_log.info("Do not use reflection to translate throwable");
				}

				_useReflectionToTranslateThrowable = false;
			}
			catch (Throwable throwable2) {
				_log.error(throwable2, throwable2);

				return throwable2;
			}
		}

		Class<?> clazz = throwable.getClass();

		String className = clazz.getName();

		if (className.equals(
					"com.chola.trainingcalendar.exception.NoSuchtrainingcalendarException")) {
			return new com.chola.trainingcalendar.exception.NoSuchtrainingcalendarException(throwable.getMessage(),
				throwable.getCause());
		}

		if (className.equals(
					"com.chola.trainingcalendar.exception.NoSuchtrainingcalendardataException")) {
			return new com.chola.trainingcalendar.exception.NoSuchtrainingcalendardataException(throwable.getMessage(),
				throwable.getCause());
		}

		if (className.equals(
					"com.chola.trainingcalendar.exception.NoSuchtrainingcontentuniqueinformationException")) {
			return new com.chola.trainingcalendar.exception.NoSuchtrainingcontentuniqueinformationException(throwable.getMessage(),
				throwable.getCause());
		}

		if (className.equals(
					"com.chola.trainingcalendar.exception.NoSuchtrainingintendedtableException")) {
			return new com.chola.trainingcalendar.exception.NoSuchtrainingintendedtableException(throwable.getMessage(),
				throwable.getCause());
		}

		if (className.equals(
					"com.chola.trainingcalendar.exception.NoSuchtrainingpersonalisedparameterscontentstoreException")) {
			return new com.chola.trainingcalendar.exception.NoSuchtrainingpersonalisedparameterscontentstoreException(throwable.getMessage(),
				throwable.getCause());
		}

		return throwable;
	}

	public static Object translateOutputtrainingcalendar(BaseModel<?> oldModel) {
		trainingcalendarClp newModel = new trainingcalendarClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.settrainingcalendarRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputtrainingcalendardata(
		BaseModel<?> oldModel) {
		trainingcalendardataClp newModel = new trainingcalendardataClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.settrainingcalendardataRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputtrainingcontentuniqueinformation(
		BaseModel<?> oldModel) {
		trainingcontentuniqueinformationClp newModel = new trainingcontentuniqueinformationClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.settrainingcontentuniqueinformationRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputtrainingintendedtable(
		BaseModel<?> oldModel) {
		trainingintendedtableClp newModel = new trainingintendedtableClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.settrainingintendedtableRemoteModel(oldModel);

		return newModel;
	}

	public static Object translateOutputtrainingpersonalisedparameterscontentstore(
		BaseModel<?> oldModel) {
		trainingpersonalisedparameterscontentstoreClp newModel = new trainingpersonalisedparameterscontentstoreClp();

		newModel.setModelAttributes(oldModel.getModelAttributes());

		newModel.settrainingpersonalisedparameterscontentstoreRemoteModel(oldModel);

		return newModel;
	}

	private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
	private static String _servletContextName;
	private static boolean _useReflectionToTranslateThrowable = true;
}