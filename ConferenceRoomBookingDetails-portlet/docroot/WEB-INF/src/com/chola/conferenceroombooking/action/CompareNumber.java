package com.chola.conferenceroombooking.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareNumber {
	public static void main(String[] args) {
		String time1 = "13:00";
		String time2 = "13:10";
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		Date d1;
		try {
			d1 = format.parse(time1);

			Date d2 = format.parse(time2);
			// in milliseconds
			long diff = d2.getTime() - d1.getTime();
			if (diff <= 0) {
				System.out.println("negative=====");
				// System.out.println(diff);
			} else {
				System.out.println("Postive......number");
			}
			if(false && false){
				System.out.println("DDDDDD");
			}else{
				System.out.println("DSSSS");
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
