create table chola_bsopdetails (
	id_ LONG not null primary key,
	content_id LONG,
	btitle VARCHAR(100) null,
	bdesc VARCHAR(200) null,
	createddate DATE null,
	createdby VARCHAR(75) null,
	modifieddate DATE null,
	modifiedby LONG,
	flag VARCHAR(75) null
);

create table chola_bsoppath (
	id_ LONG not null primary key,
	bdoc VARCHAR(500) null,
	bpath VARCHAR(500) null,
	createddate DATE null,
	createdby VARCHAR(75) null,
	flag VARCHAR(75) null,
	bdetails_id LONG,
	bdetailscontent_id LONG,
	filename VARCHAR(500) null
);