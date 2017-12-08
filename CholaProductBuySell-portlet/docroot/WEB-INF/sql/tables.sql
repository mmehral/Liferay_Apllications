create table chola_BuySell (
	id_ LONG not null primary key,
	name VARCHAR(75) null
);

create table chola_BuySellProducts (
	id_ LONG not null primary key,
	sellerName VARCHAR(75) null,
	contactNumber VARCHAR(75) null,
	content_id LONG,
	category_id LONG,
	title VARCHAR(75) null,
	description VARCHAR(75) null,
	askingPrice VARCHAR(75) null,
	userScreenName VARCHAR(75) null,
	location LONG,
	status LONG,
	approvedstatus LONG,
	created_date DATE null
);

create table chola_BuySellProductsImages (
	id_ LONG not null primary key,
	content_id LONG,
	image_name VARCHAR(75) null,
	image_path VARCHAR(75) null,
	product_id LONG
);