drop view jartvf;
drop table jar_content;
drop table jar;
drop table jar_entry;

create table jar (
	id serial primary key,
	description varchar(255) not null,
	platform_name varchar(20),
	download_url varchar(255),
	direct_url boolean  not null,
	file_name varchar(100) not null,
	version varchar(50) not null,
	build varchar(50),
	size numeric not null,
	stamp timestamp without time zone not null
);

create table jar_entry (
	id serial primary key,
	name varchar(100) not null,
	package_name varchar(255),
	file_path varchar(255) not null,
	file_name varchar(100) not null,
	size numeric not null,
	stamp timestamp with time zone not null
);

create table jar_content (
	jar_id int not null,
	entry_id int not null,
	primary key (jar_id, entry_id)
);

create view jartvf as (
	select jar.file_name || ':' || jar_entry.file_path || '/' || jar_entry.file_name as jar_entry_file_name
	from jar_content
	join jar on jar.id = jar_content.jar_id
	join jar_entry on jar_entry.id = jar_content.entry_id
);

insert into jar (description, platform_name, download_url, direct_url, file_name, version, build, size, stamp) values ('Java Runtime', 'Linux', 'http://java.sun.com/javase/downloads/', FALSE, 'rt.jar', '1.5.0_08', '1.5.0_08-b03', 39933077, TIMESTAMP '2006-08-17 18:48:00');
insert into jar (description, platform_name, download_url, direct_url, file_name, version, build, size, stamp) values ('Java Tools', 'Linux', 'http://java.sun.com/javase/downloads/', FALSE, 'tools.jar', '1.5.0_08', '1.5.0_08-b03', 7035707, TIMESTAMP '2006-08-17 18:48:00');

insert into jar_entry (name, package_name,file_path,file_name,size,stamp) values ('String', 'java.lang', 'java/lang', 'String.class', 15070, TIMESTAMP WITH TIME ZONE 'Jul 11 10:33:22 CDT 2006');
insert into jar_entry (name, package_name,file_path,file_name,size,stamp) values ('Integer', 'java.lang', 'java/lang', 'Integer.class', 8164, TIMESTAMP WITH TIME ZONE 'Jul 11 10:33:32 CDT 2006');
insert into jar_entry (name, package_name,file_path,file_name,size,stamp) values ('Parser', 'java.lang', 'sun/tools/java', 'Parser.class', 28996, TIMESTAMP WITH TIME ZONE 'Tue Jul 11 10:34:40 CDT 2006');
insert into jar_entry (name, package_name,file_path,file_name,size,stamp) values ('Scanner', 'java.lang', 'sun/tools/java', 'Scanner.class', 13185, TIMESTAMP WITH TIME ZONE 'Tue Jul 11 10:34:40 CDT 2006');

insert into jar_content (jar_id, entry_id) values (1,1);
insert into jar_content (jar_id, entry_id) values (1,2);
insert into jar_content (jar_id, entry_id) values (2,3);
insert into jar_content (jar_id, entry_id) values (2,4);

select * from jar;
select * from jar_entry;
select * from jartvf;

select jar.file_name
from jar_content
join jar on jar.id = jar_content.jar_id
join jar_entry on jar_entry.id = jar_content.entry_id
where jar_entry.name = 'Scanner';
