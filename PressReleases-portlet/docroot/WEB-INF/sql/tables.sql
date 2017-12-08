create table chola_pressrelease (
	id_ LONG not null primary key,
	details TEXT null,
	updatedon DATE null,
	updatedby LONG,
	uniquecontentid LONG
);