create table chola_trainingcalendar (
	trainingid LONG not null primary key,
	name VARCHAR(75) null
);

create table chola_trainingcalendardata (
	id_ LONG not null primary key,
	title VARCHAR(75) null,
	description VARCHAR(75) null,
	schedulestartdate DATE null,
	scheduleenddate DATE null,
	location VARCHAR(75) null
);

create table chola_trainingcontentuniqueinformation (
	id_ LONG not null primary key,
	training_id LONG,
	content_id LONG,
	status LONG,
	udflag LONG,
	content_type VARCHAR(75) null,
	notification_text VARCHAR(75) null,
	pageurl VARCHAR(75) null
);

create table chola_trainingintendedtable (
	id_ LONG not null primary key,
	trainingid LONG,
	userid VARCHAR(75) null,
	screenname VARCHAR(75) null,
	createddate DATE null,
	flag INTEGER
);

create table chola_trainingpersonalisedparameterscontentstore (
	id_ LONG not null primary key,
	content_id LONG,
	business VARCHAR(75) null,
	unit VARCHAR(75) null,
	function VARCHAR(75) null,
	department VARCHAR(75) null,
	designation VARCHAR(75) null,
	product VARCHAR(75) null,
	zone VARCHAR(75) null,
	branch VARCHAR(75) null,
	grade VARCHAR(75) null,
	region VARCHAR(75) null,
	location VARCHAR(75) null,
	user_id VARCHAR(75) null,
	gender VARCHAR(75) null,
	age_type VARCHAR(75) null,
	age_value VARCHAR(75) null,
	notification_type LONG
);