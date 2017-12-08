create index IX_957586D5 on chola_BuySellProducts (category_id, location, title[$COLUMN_LENGTH:75$]);
create index IX_D7BC73DE on chola_BuySellProducts (category_id, title[$COLUMN_LENGTH:75$]);
create index IX_407B8FA1 on chola_BuySellProducts (location, category_id);
create index IX_74F2B13D on chola_BuySellProducts (location, title[$COLUMN_LENGTH:75$]);
create index IX_3B83C88F on chola_BuySellProducts (title[$COLUMN_LENGTH:75$], category_id, location);
create index IX_D5B5822F on chola_BuySellProducts (title[$COLUMN_LENGTH:75$], location);

create index IX_F89FAF39 on chola_BuySellProductsImages (product_id);