package com.chola.conferenceroombooking.action;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
public class TimeSlot {
	public static String getTimeslots(String time1,String time2) {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm");
		String  difft=null;
		try {
		Date d1 = format.parse(time1);
		
		Date d2 = format.parse(time2);
		// in milliseconds
		long diff = d2.getTime() - d1.getTime();

	//	System.out.println("Time difference-->" + diff);

		long diffSeconds = diff / 1000 % 60;
		long diffMinutes = diff / (60 * 1000) % 60;
		long diffHours = diff / (60 * 60 * 1000) % 24;
		long diffDays = diff / (24 * 60 * 60 * 1000);
		int diffInDays = (int) (d2.getTime() - d1.getTime());

	//	System.out.println("Difference--> " + diffInDays);
		difft = diffHours + ":" + diffMinutes;
//		System.out.println("Duration Time:" + difft);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return difft;
	}
}
