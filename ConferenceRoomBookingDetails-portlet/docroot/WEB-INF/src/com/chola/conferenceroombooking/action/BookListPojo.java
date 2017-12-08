package com.chola.conferenceroombooking.action;

import java.util.List;

public class BookListPojo {
	private String roomname;
	private String floor;
	private String facility;
	private String capcity;
	private String extension;
	private String startime;
	private String endtime;
	private String stardate;
	private String statename;
	private String locname;
	private Integer roomid;

	private List<BookListPojo> bookpojo;
	
	public Integer getRoomid() {
		return roomid;
	}

	public void setRoomid(Integer roomid) {
		this.roomid = roomid;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public String getLocname() {
		return locname;
	}

	public void setLocname(String locname) {
		this.locname = locname;
	}

	



	public String getRoomname() {
		return roomname;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getFacility() {
		return facility;
	}

	public void setFacility(String facility) {
		this.facility = facility;
	}

	public String getCapcity() {
		return capcity;
	}

	public void setCapcity(String capcity) {
		this.capcity = capcity;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getStartime() {
		return startime;
	}

	public void setStartime(String startime) {
		this.startime = startime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public String getStardate() {
		return stardate;
	}

	public void setStardate(String stardate) {
		this.stardate = stardate;
	}

	public List<BookListPojo> getBookpojo() {
		return bookpojo;
	}

	public void setBookpojo(List<BookListPojo> bookpojo) {
		this.bookpojo = bookpojo;
	}
}
