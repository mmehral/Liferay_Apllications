create table chola_shutterspeedgallery (
	id_ LONG not null primary key,
	albumName VARCHAR(100) null,
	albumDesc VARCHAR(500) null,
	albumId VARCHAR(75) null,
	createdDate DATE null,
	createdBy VARCHAR(75) null,
	updatedDate DATE null,
	updatedBy VARCHAR(75) null,
	flag VARCHAR(75) null,
	content_id LONG
);

create table chola_shutterspeedgallerypath (
	id_ LONG not null primary key,
	albumId VARCHAR(75) null,
	albumImagePath VARCHAR(500) null,
	imageTitle VARCHAR(200) null,
	createdDate DATE null,
	createdBy VARCHAR(75) null,
	updatedDate DATE null,
	updatedBy VARCHAR(75) null,
	flag VARCHAR(75) null,
	content_id LONG
);

create table chola_shutterspeedgalleryusers (
	id_ LONG not null primary key,
	user_id LONG,
	album_id LONG
);