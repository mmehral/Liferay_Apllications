create table chola_bookdetails (
	id_ LONG not null primary key,
	booktitle VARCHAR(100) null,
	bookname VARCHAR(200) null,
	bookpath VARCHAR(500) null,
	createddate DATE null,
	createdby LONG,
	modifieddate DATE null,
	modifiedby LONG,
	flag VARCHAR(75) null,
	content_id LONG
);

create table chola_bookpath (
	id_ LONG not null primary key,
	book VARCHAR(500) null,
	bookpath VARCHAR(500) null,
	createddate DATE null,
	createdby VARCHAR(75) null,
	flag VARCHAR(75) null,
	book_id LONG
);

create table chola_bookusers (
	id_ LONG not null primary key,
	user_id LONG,
	book_id LONG
);