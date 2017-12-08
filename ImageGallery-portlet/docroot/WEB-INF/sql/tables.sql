create table chola_imagegallery (
	Id LONG not null primary key,
	albumName VARCHAR(75) null,
	albumDesc VARCHAR(75) null,
	albumImagePath VARCHAR(75) null,
	uploadDate DATE null,
	flag VARCHAR(75) null
);

create table cholam_imagegallery (
	id_ LONG not null primary key,
	content_id LONG,
	albumName VARCHAR(200) null,
	albumDesc VARCHAR(500) null,
	albumId VARCHAR(75) null,
	createdDate DATE null,
	createdBy VARCHAR(75) null,
	flag VARCHAR(75) null
);

create table cholam_imagegallerypath (
	id_ LONG not null primary key,
	albumId VARCHAR(75) null,
	content_id LONG,
	albumImagePath TEXT null,
	createdDate DATE null,
	createdBy VARCHAR(75) null,
	updatedDate DATE null,
	updatedBy VARCHAR(75) null,
	flag VARCHAR(75) null
);