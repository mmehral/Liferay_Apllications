create table chola_kbdetails (
	id_ LONG not null primary key,
	kbtitle VARCHAR(75) null,
	kbdesc VARCHAR(75) null,
	createdDate DATE null,
	createdBy LONG,
	modifiedDate DATE null,
	modifiedBy LONG,
	flag VARCHAR(75) null
);

create table chola_kbpath (
	id_ LONG not null primary key,
	kbfiledoc VARCHAR(75) null,
	kbfilepath VARCHAR(75) null,
	createdDate DATE null,
	createdBy LONG,
	flag VARCHAR(75) null,
	kbdetails_id LONG,
	kbfilename VARCHAR(75) null
);

create table chola_kbusers (
	id_ LONG not null primary key,
	user_id LONG,
	kbdetails_id LONG
);