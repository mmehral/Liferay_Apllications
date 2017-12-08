create table chola_cholacontest (
	id_ LONG not null primary key,
	content_id LONG,
	content VARCHAR(75) null,
	startdate DATE null,
	enddate DATE null,
	feedback VARCHAR(500) null,
	createDate DATE null,
	contest_code INTEGER,
	contest_val INTEGER,
	contest_desc TEXT null,
	contest_doc VARCHAR(500) null,
	contest_path VARCHAR(500) null,
	contest_title VARCHAR(500) null,
	user_id VARCHAR(75) null
);