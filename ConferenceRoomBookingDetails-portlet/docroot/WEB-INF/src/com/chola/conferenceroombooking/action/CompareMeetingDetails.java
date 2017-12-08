package com.chola.conferenceroombooking.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareMeetingDetails 
{
	public static void main(String[] args) {
		boolean flag1=false;
		boolean flag2=false;
		String time1 = "04:10";
		String time2 = "09:00";
		
		String time3="04:00";
		String time4="09:00";
		
		flag1=getComparevalue(time3,time1);
		flag2=getComparevalue(time2,time4);
		System.out.println("FLAG111===="+flag1);
		System.out.println("FLAG222===="+flag2);
		if(flag1 && flag2){
			System.out.println("Time is matching,,,,,,,");
		}else{
			System.out.println("time is not matching......");
		}
		
		
		
	}

	public static boolean getComparevalue(String time1, String time2) {
		boolean flag = false;
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		Date d1;
		try {
			d1 = format.parse(time1);

			Date d2 = format.parse(time2);
			// in milliseconds
			long diff = d2.getTime() - d1.getTime();
			if (diff < 0) {
				System.out.println("Negative......number");
				flag = false;
				// System.out.println(diff);
			} else {
				System.out.println("Postive......number");
				flag = true;
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return flag;

	}

}
