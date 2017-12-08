create table socho_idea (
	id_ LONG not null primary key,
	userId LONG,
	topic VARCHAR(75) null,
	sharedIdea VARCHAR(75) null,
	sharedFile VARCHAR(1000) null,
	sharedDate DATE null
);

create table socho_topics (
	id_ LONG not null primary key,
	topics VARCHAR(75) null,
	flag LONG,
	createdBy LONG,
	createdOn DATE null,
	modifiedBy LONG,
	modifiedOn DATE null
);