create database itrack;
use itrack;

create table gender
(
id int Not Null Primary Key,
[name] nvarchar(50)
)

insert into gender 
(
id, 
[name]
) values 
(1, 'female'),
(2, 'male')


select * from gender


drop database itrack;