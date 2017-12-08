package com.chola.conferenceroombooking.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;


import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class Date1
{
	private static Log _log = LogFactoryUtil.getLog(Date1.class);
public static void main(String[] args) throws ParseException {
	String str="02/04/2015";
	SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat format1=new SimpleDateFormat("yyyy-MM-dd");
	java.util.Date d1=format.parse(str);
	_log.info("ssss"+d1);
	_log.info("str1");
	//System.out.println("ssss"+d1);
	String str1=format1.format(d1);
	//System.out.println(str1);
	
}
}
