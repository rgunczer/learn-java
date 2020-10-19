create database springsecuritydemo;
use springsecuritydemo

insert into user (username, password) values ('trevor', '$2a$10$86zFFtmPu126oeeWmuW/COf/vXaEQWRV8VnKdK1qmRRnYL2JqWpo.');

insert into authorities(authority, user_id) values ('ROLE_USER', 1)

select * from user;
select * from authorities;