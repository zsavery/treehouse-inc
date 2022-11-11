create table customers (
	customer_id serial  primary key,
	address varchar(40) not null,
	first_name varchar(20) not null,
	last_name varchar(20) not null,
	dob date not null,
	email varchar(40) unique not null
);

create table materials (
	material_id serial primary key,
	name varchar(20) not null,
	color varchar(20) default 'brown',
	price double not null
);

create table window_frames (
	window_id serial primary key,
	frame_name varchar(20) not null,
	price double
);

create table treehouse_models (
	model_id serial primary key,
	model_name varchar(20) not null,
	window_number int default 1,
	window_id bigint,
	foreign key (window_id) references window_frames(window_id),
	price double not null
);

create table invoices (
	invoice_id serial primary key,
	order_date date,
	fulfillment_date date,
	customer_id bigint,
	foreign key (customer_id) references customers(customer_id),
	material_id bigint,
	foreign key (material_id) references materials(material_id),
	model_id bigint,
	foreign key (model_id) references treehouse_models(model_id),
	price double
);
