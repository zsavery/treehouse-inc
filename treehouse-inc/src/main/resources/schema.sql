/*
Treehouse Inc has

CUSTOMER
	- customer_id
	- address
	- first_name
	- last_name
	- dob
	- email


INVOICE
	- invoice_id
	- order_date
	- fulfillment_date
	- price

MATERIAL
	- wood_id
	- name
	- color
	- price

Window
	- window_id
	- name
	- price

Treehouse_model
	- model_id
	- name
	- price

*/

create table customers (
	customer_id serial ,
	address varchar(40) not null,
	first_name varchar(20) not null,
	last_name varchar(20) not null,
	dob date not null,
	email varchar(40) unique not null
);

create table materials (
	material_id serial,
	name varchar(20) not null,
	color varchar(20) default 'brown',
	price double not null
);

create table window_frames (
	window_id serial,
	frame_name varchar(20) not null,
	price double
);

create table treehouse_models (
	model_id serial,
	model_name varchar(20) not null,
	window_number int default 0,
	size_category int default 1,
	price double not null
);



--create table invoices (
--	invoice_id serial,
--	order_date date,
--	fulfillment_date date,
--	foreign key (customer_id) references customers,
--	foreign key (material_id) references materials,
--	foreign key (window_id) references window_frames,
--	foreign key (model_id) references treehouse_models,
--	price double
--
--);
