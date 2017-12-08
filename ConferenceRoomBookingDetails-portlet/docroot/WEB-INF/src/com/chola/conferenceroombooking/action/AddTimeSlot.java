package com.chola.conferenceroombooking.action;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class AddTimeSlot
{
	private static Log _log = LogFactoryUtil.getLog(AddTimeSlot.class);
	public static void main(String[] args) {
		TimePart d1 = TimePart.parse("10:45");
		TimePart d2 = TimePart.parse("0:15");
		_log.info(d1);
		_log.info(d2);
		//System.out.println(d1);
		//System.out.println(d2);
		// System.out.println(d3);
		TimePart d4 = d1.add(d2);
		_log.info(d4);
		//System.out.println(d4);
	}

	public static String getAddTimeSlot(String starttime, String endtime) {
		TimePart d1 = TimePart.parse(starttime);
		TimePart d2 = TimePart.parse(endtime);
		_log.info(d1);
		_log.info(d2);
		//System.out.println(d1);
		//System.out.println(d2);
		// System.out.println(d3);
		TimePart d4 = d1.add(d2);
		String addtime=d4.toString();
	//	System.out.println("Add Time Slot......"+addtime);
		return addtime;
	}

}
