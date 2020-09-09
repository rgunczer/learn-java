IF EXISTS(select * from sys.databases where name='sampledb')
DROP DATABASE sampledb;
go

create database sampledb;
use sampledb;
go

create table gender
(
    id int Not Null Primary Key,
    [name] nvarchar(50)
)
go

insert into gender
(
    id,
    [name]
) values
    (1, 'female'),
    (2, 'male')
go

select * from gender


--drop database sampledb;
