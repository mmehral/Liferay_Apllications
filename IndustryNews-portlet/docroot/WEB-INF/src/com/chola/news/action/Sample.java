package com.chola.news.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sample {
public static void main(String[] args) throws ParseException {
	String str="13-04-2017";
	SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat dateFormat1=new SimpleDateFormat("dd-MM-yyyy");
	System.out.println();
	String dt=dateFormat.format(dateFormat1.parse(str)); 
	System.out.println("Date======"+dt);
	//System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
}
}
