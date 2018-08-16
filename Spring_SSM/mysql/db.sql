create database test;

--用户表
create table user
(
  id        int primary key auto_increment,        
  username      varchar(50) not null,          
  password  varchar(50) not null,          
  age int not null            
);

select * from user

drop table user