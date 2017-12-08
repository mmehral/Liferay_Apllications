create table cholaconference_facilitymaster (
	facility_id LONG not null primary key,
	facility_name VARCHAR(100) null,
	facility_description VARCHAR(200) null
);

create table cholaconference_floorwing (
	floorwing_id LONG not null primary key,
	state_id LONG,
	location_id LONG,
	floor_name VARCHAR(100) null
);

create table cholaconference_location (
	location_id LONG not null primary key,
	location_name VARCHAR(100) null,
	state_id LONG
);

create table cholaconference_room (
	room_id LONG not null primary key,
	state_id LONG,
	location_id LONG,
	floor_id LONG,
	room_name VARCHAR(100) null,
	room_capacity LONG,
	room_extension LONG,
	room_values TEXT null
);

create table cholaconference_state (
	state_id LONG not null primary key,
	state_name VARCHAR(100) null
);