create table promotion_users (
	Id LONG not null primary key,
	empId VARCHAR(75) null,
	empName VARCHAR(75) null,
	empImagePath VARCHAR(75) null,
	writeUp TEXT null,
	awardedDate DATE null
);