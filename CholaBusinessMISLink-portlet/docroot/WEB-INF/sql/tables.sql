create table chola_businessmisdetails (
	id_ LONG not null primary key,
	content_id LONG,
	businesstitle VARCHAR(100) null,
	businessDesc VARCHAR(200) null,
	businessLink VARCHAR(200) null,
	filepath VARCHAR(75) null,
	filename VARCHAR(75) null,
	createdDate DATE null,
	createdBy VARCHAR(75) null,
	modifiedDate DATE null,
	modifiedBy LONG,
	flag VARCHAR(75) null
);

create table chola_businessmisusers (
	id_ LONG not null primary key,
	user_id LONG,
	businessdetails_id LONG
);