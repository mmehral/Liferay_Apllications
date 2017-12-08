create table Branch_branchdetails (
	branch_id LONG not null primary key,
	branch_code VARCHAR(75) null,
	branch_address VARCHAR(75) null,
	city_id LONG
);

create table Branch_city (
	city_id LONG not null primary key,
	city_name VARCHAR(75) null,
	state_id LONG
);

create table Branch_mapping (
	mapping_id LONG not null primary key,
	product_id LONG,
	state_id LONG,
	city_id LONG,
	branch_id LONG
);

create table Branch_product (
	product_id LONG not null primary key,
	product_name VARCHAR(75) null
);

create table Branch_state (
	state_id LONG not null primary key,
	state_name VARCHAR(75) null
);

create table branch_branchdetails (
	branch_id LONG not null primary key,
	branch_code VARCHAR(75) null,
	branch_address VARCHAR(75) null,
	city_id LONG
);

create table branch_city (
	city_id LONG not null primary key,
	city_name VARCHAR(75) null,
	state_id LONG
);

create table branch_mapping (
	mapping_id LONG not null primary key,
	product_id LONG,
	state_id LONG,
	city_id LONG,
	branch_id LONG
);

create table branch_product (
	product_id LONG not null primary key,
	product_name VARCHAR(75) null
);

create table branch_state (
	state_id LONG not null primary key,
	state_name VARCHAR(75) null
);