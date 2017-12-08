create table chola_businessSOPppusers (
	id_ LONG not null primary key,
	businesssop_uniqueid VARCHAR(75) null,
	user_id VARCHAR(75) null
);

create table chola_businesssopDetails (
	id_ LONG not null primary key,
	businesstitle VARCHAR(500) null,
	businessDesc VARCHAR(500) null,
	createdDate DATE null,
	createdBy VARCHAR(75) null,
	modifiedDate DATE null,
	modifiedBy LONG,
	flag VARCHAR(75) null
);

create table chola_businesssoppath (
	id_ LONG not null primary key,
	businessdoc VARCHAR(500) null,
	businessPath TEXT null,
	createdDate DATE null,
	createdBy VARCHAR(75) null,
	flag VARCHAR(75) null,
	businessdetails_id LONG
);

create table chola_businesssopusers (
	id_ LONG not null primary key,
	user_id LONG,
	businessdetails_id LONG
);