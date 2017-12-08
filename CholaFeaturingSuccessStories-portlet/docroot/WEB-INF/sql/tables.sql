create table chola_ssdetails (
	id_ LONG not null primary key,
	sstitle VARCHAR(75) null,
	ssdesc VARCHAR(75) null,
	createdDate DATE null,
	createdBy LONG,
	modifiedDate DATE null,
	modifiedBy LONG,
	flag VARCHAR(75) null
);

create table chola_sspath (
	id_ LONG not null primary key,
	ssfiledoc VARCHAR(75) null,
	ssfilepath VARCHAR(75) null,
	createdDate DATE null,
	createdBy LONG,
	flag VARCHAR(75) null,
	ssdetails_id LONG,
	ssfilename VARCHAR(75) null
);

create table chola_ssusers (
	id_ LONG not null primary key,
	user_id LONG,
	ssdetails_id LONG
);