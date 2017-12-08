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

package com.chola.book.model;

import aQute.bnd.annotation.ProviderType;

import com.chola.book.service.ClpSerializer;
import com.chola.book.service.bookpathLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @generated
 */
@ProviderType
public class bookpathClp extends BaseModelImpl<bookpath> implements bookpath {
	public bookpathClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return bookpath.class;
	}

	@Override
	public String getModelClassName() {
		return bookpath.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("book", getBook());
		attributes.put("bookpath", getBookpath());
		attributes.put("createddate", getCreateddate());
		attributes.put("createdby", getCreatedby());
		attributes.put("flag", getFlag());
		attributes.put("book_id", getBook_id());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String book = (String)attributes.get("book");

		if (book != null) {
			setBook(book);
		}

		String bookpath = (String)attributes.get("bookpath");

		if (bookpath != null) {
			setBookpath(bookpath);
		}

		Date createddate = (Date)attributes.get("createddate");

		if (createddate != null) {
			setCreateddate(createddate);
		}

		String createdby = (String)attributes.get("createdby");

		if (createdby != null) {
			setCreatedby(createdby);
		}

		String flag = (String)attributes.get("flag");

		if (flag != null) {
			setFlag(flag);
		}

		Long book_id = (Long)attributes.get("book_id");

		if (book_id != null) {
			setBook_id(book_id);
		}

		_entityCacheEnabled = GetterUtil.getBoolean("entityCacheEnabled");
		_finderCacheEnabled = GetterUtil.getBoolean("finderCacheEnabled");
	}

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_bookpathRemoteModel != null) {
			try {
				Class<?> clazz = _bookpathRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_bookpathRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBook() {
		return _book;
	}

	@Override
	public void setBook(String book) {
		_book = book;

		if (_bookpathRemoteModel != null) {
			try {
				Class<?> clazz = _bookpathRemoteModel.getClass();

				Method method = clazz.getMethod("setBook", String.class);

				method.invoke(_bookpathRemoteModel, book);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBookpath() {
		return _bookpath;
	}

	@Override
	public void setBookpath(String bookpath) {
		_bookpath = bookpath;

		if (_bookpathRemoteModel != null) {
			try {
				Class<?> clazz = _bookpathRemoteModel.getClass();

				Method method = clazz.getMethod("setBookpath", String.class);

				method.invoke(_bookpathRemoteModel, bookpath);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateddate() {
		return _createddate;
	}

	@Override
	public void setCreateddate(Date createddate) {
		_createddate = createddate;

		if (_bookpathRemoteModel != null) {
			try {
				Class<?> clazz = _bookpathRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateddate", Date.class);

				method.invoke(_bookpathRemoteModel, createddate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCreatedby() {
		return _createdby;
	}

	@Override
	public void setCreatedby(String createdby) {
		_createdby = createdby;

		if (_bookpathRemoteModel != null) {
			try {
				Class<?> clazz = _bookpathRemoteModel.getClass();

				Method method = clazz.getMethod("setCreatedby", String.class);

				method.invoke(_bookpathRemoteModel, createdby);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFlag() {
		return _flag;
	}

	@Override
	public void setFlag(String flag) {
		_flag = flag;

		if (_bookpathRemoteModel != null) {
			try {
				Class<?> clazz = _bookpathRemoteModel.getClass();

				Method method = clazz.getMethod("setFlag", String.class);

				method.invoke(_bookpathRemoteModel, flag);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getBook_id() {
		return _book_id;
	}

	@Override
	public void setBook_id(long book_id) {
		_book_id = book_id;

		if (_bookpathRemoteModel != null) {
			try {
				Class<?> clazz = _bookpathRemoteModel.getClass();

				Method method = clazz.getMethod("setBook_id", long.class);

				method.invoke(_bookpathRemoteModel, book_id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getbookpathRemoteModel() {
		return _bookpathRemoteModel;
	}

	public void setbookpathRemoteModel(BaseModel<?> bookpathRemoteModel) {
		_bookpathRemoteModel = bookpathRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _bookpathRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_bookpathRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() {
		if (this.isNew()) {
			bookpathLocalServiceUtil.addbookpath(this);
		}
		else {
			bookpathLocalServiceUtil.updatebookpath(this);
		}
	}

	@Override
	public bookpath toEscapedModel() {
		return (bookpath)ProxyUtil.newProxyInstance(bookpath.class.getClassLoader(),
			new Class[] { bookpath.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		bookpathClp clone = new bookpathClp();

		clone.setId(getId());
		clone.setBook(getBook());
		clone.setBookpath(getBookpath());
		clone.setCreateddate(getCreateddate());
		clone.setCreatedby(getCreatedby());
		clone.setFlag(getFlag());
		clone.setBook_id(getBook_id());

		return clone;
	}

	@Override
	public int compareTo(bookpath bookpath) {
		long primaryKey = bookpath.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof bookpathClp)) {
			return false;
		}

		bookpathClp bookpath = (bookpathClp)obj;

		long primaryKey = bookpath.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", book=");
		sb.append(getBook());
		sb.append(", bookpath=");
		sb.append(getBookpath());
		sb.append(", createddate=");
		sb.append(getCreateddate());
		sb.append(", createdby=");
		sb.append(getCreatedby());
		sb.append(", flag=");
		sb.append(getFlag());
		sb.append(", book_id=");
		sb.append(getBook_id());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.chola.book.model.bookpath");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>book</column-name><column-value><![CDATA[");
		sb.append(getBook());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>bookpath</column-name><column-value><![CDATA[");
		sb.append(getBookpath());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createddate</column-name><column-value><![CDATA[");
		sb.append(getCreateddate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdby</column-name><column-value><![CDATA[");
		sb.append(getCreatedby());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>flag</column-name><column-value><![CDATA[");
		sb.append(getFlag());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>book_id</column-name><column-value><![CDATA[");
		sb.append(getBook_id());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _book;
	private String _bookpath;
	private Date _createddate;
	private String _createdby;
	private String _flag;
	private long _book_id;
	private BaseModel<?> _bookpathRemoteModel;
	private Class<?> _clpSerializerClass = ClpSerializer.class;
	private boolean _entityCacheEnabled;
	private boolean _finderCacheEnabled;
}