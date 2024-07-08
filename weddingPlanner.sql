create database weddingPlanner;
use weddingPlanner ;
create table user(id int(20) ,
contactnum varchar(11),
name varchar(40),
age int(20),
username varchar(20),
password varchar(20),
primary key(id)
);
use weddingPlanner;
select * from user;

create table halls(hallname varchar(10),price int(10),histoy date);
insert into halls values('egypt',100,'2002-12-2');
insert into halls values('Kanada',200,'2002-12-2');
insert into halls values('UK',100,'2002-12-2');
insert into halls values('Usa',100,'2002-12-2');
insert into halls values('France',100,'2002-12-2');
insert into halls values('Maldives',100,'2002-12-2');
use weddingPlanner;
select * from halls;


create table menue(meuname varchar(15),price int(100));
insert into menue values('Cakke1',200);
insert into menue values('Cakke2',200);
insert into menue values('Cakke3',500);
insert into menue values('Food1',400);
insert into menue values('Food2',600);
insert into menue values('Food2',800);
use weddingPlanner;
select * from menue;

create table teamname(name varchar(40),position varchar(40) );
insert into teamname values('Lillian','Manager');
insert into teamname values('Amir','Assistant');
insert into teamname values('mahe','WeddingPlanner');
insert into teamname values('sogo','Marketing');
insert into teamname values('Lolo','Food');
insert into teamname values('Luci','Relation');
use weddingPlanner;
select * from teamname;


