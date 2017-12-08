create table Branch_conferenceroombookingdetails (
	bookid LONG not null primary key,
	startdate DATE null,
	startime VARCHAR(75) null,
	endtime VARCHAR(75) null,
	roomid INTEGER,
	meeting_emailid VARCHAR(75) null,
	meeting_title VARCHAR(100) null,
	meeting_agenda VARCHAR(500) null,
	status INTEGER,
	userid LONG,
	username VARCHAR(100) null,
	createdate DATE null
);

create table Branch_facilitymaster (
	facility_id LONG not null primary key,
	facility_name VARCHAR(100) null,
	facility_description VARCHAR(100) null
);

create table Branch_floorwing (
	floorwing_id LONG not null primary key,
	state_id LONG,
	location_id LONG,
	floor_name VARCHAR(100) null
);

create table Branch_location (
	location_id LONG not null primary key,
	location_name VARCHAR(100) null,
	state_id LONG
);

create table Branch_room (
	room_id LONG not null primary key,
	state_id LONG,
	location_id LONG,
	floor_id LONG,
	room_name VARCHAR(100) null,
	room_capacity LONG,
	room_extension LONG,
	room_values VARCHAR(75) null
);

create table Branch_state (
	state_id LONG not null primary key,
	state_name VARCHAR(100) null
);

create table branch_city (
	city_id LONG not null primary key,
	city_name VARCHAR(75) null,
	state_id LONG
);

create table branch_conferenceroombookingdetails (
	bookid LONG not null primary key,
	startdate DATE null,
	startime VARCHAR(75) null,
	endtime VARCHAR(75) null,
	roomid INTEGER,
	meeting_emailid VARCHAR(75) null,
	meeting_title VARCHAR(100) null,
	meeting_agenda VARCHAR(500) null,
	status INTEGER,
	userid LONG,
	username VARCHAR(100) null,
	createdate DATE null
);

create table branch_facilitymaster (
	facility_id LONG not null primary key,
	facility_name VARCHAR(100) null,
	facility_description VARCHAR(100) null
);

create table branch_floorwing (
	floorwing_id LONG not null primary key,
	state_id LONG,
	location_id LONG,
	floor_name VARCHAR(100) null
);

create table branch_location (
	location_id LONG not null primary key,
	location_name VARCHAR(100) null,
	state_id LONG
);

create table branch_room (
	room_id LONG not null primary key,
	state_id LONG,
	location_id LONG,
	floor_id LONG,
	room_name VARCHAR(100) null,
	room_capacity LONG,
	room_extension LONG,
	room_values VARCHAR(75) null
);

create table branch_state (
	state_id LONG not null primary key,
	state_name VARCHAR(100) null
);