create table chola_CholaContest (
	Id LONG not null primary key,
	content_id LONG,
	content VARCHAR(75) null,
	startdate DATE null,
	enddate DATE null,
	feedback VARCHAR(75) null,
	createDate DATE null,
	contest_code INTEGER,
	contest_val INTEGER,
	contest_desc VARCHAR(75) null,
	contest_doc VARCHAR(75) null,
	contest_path VARCHAR(75) null,
	contest_title VARCHAR(75) null,
	user_id VARCHAR(75) null
);

create table chola_ContestUserDetails (
	id_ LONG not null primary key,
	user_id VARCHAR(75) null,
	contestreference_id LONG
);