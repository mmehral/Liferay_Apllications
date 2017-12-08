create table cholav_videogallery (
	id_ LONG not null primary key,
	content_id LONG,
	albumName VARCHAR(200) null,
	albumDesc VARCHAR(500) null,
	albumId VARCHAR(75) null,
	createdDate DATE null,
	createdBy VARCHAR(75) null,
	flag VARCHAR(75) null
);

create table cholav_videogallerypath (
	id_ LONG not null primary key,
	albumId VARCHAR(75) null,
	content_id LONG,
	albumVideoPath TEXT null,
	createdDate DATE null,
	createdBy VARCHAR(75) null,
	updatedDate DATE null,
	updatedBy VARCHAR(75) null,
	flag VARCHAR(75) null
);