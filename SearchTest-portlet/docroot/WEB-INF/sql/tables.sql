create table Sample_SampleEntry (
	uuid_ VARCHAR(75) null,
	entryId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	title VARCHAR(75) null,
	content VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	status BOOLEAN
);