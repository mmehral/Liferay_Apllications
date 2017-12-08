package com.chola.conferenceroombooking.action;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class GetDates
{
	private static Log _log = LogFactoryUtil.getLog(GetDates.class);
	public static String[] getdates(){
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, -7);
		_log.info("Date = " + cal.getTime());
		//System.out.println("Date = " + cal.getTime());
		String startdate = dateFormat.format(date);
		String endate=dateFormat.format(cal.getTime());
		String[] str=new String[2];
		str[0]=startdate;
		str[1]=endate;
		return str;
	}
}
