create table Add_birthdaywish (
	id_ LONG not null primary key,
	userId VARCHAR(75) null,
	wishedBy VARCHAR(75) null,
	message VARCHAR(75) null,
	createdDate DATE null
);

create table Add_predefinedmessages (
	id_ LONG not null primary key,
	message VARCHAR(75) null
);