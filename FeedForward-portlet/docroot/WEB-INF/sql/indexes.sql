create index IX_4DC6B706 on chola_feedforwardgallery (content_id);

create index IX_D4127044 on chola_feedforwardgallerypath (albumId[$COLUMN_LENGTH:75$]);
create index IX_3F8EC8EB on chola_feedforwardgallerypath (content_id);

create index IX_81E0E022 on chola_feedforwardgalleryusers (album_id);
create index IX_C7743E1C on chola_feedforwardgalleryusers (user_id);