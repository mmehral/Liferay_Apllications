create table chola_contentuniqueinformation (
	id_ LONG not null primary key,
	content_id LONG,
	status LONG,
	udflag LONG,
	content_type VARCHAR(75) null,
	notification_text VARCHAR(75) null,
	pageurl VARCHAR(75) null
);

create table chola_contentupdate (
	id_ LONG not null primary key,
	content_id LONG
);

create table chola_personalisedparameterscontentstore (
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