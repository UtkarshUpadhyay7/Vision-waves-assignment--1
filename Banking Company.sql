-- 1] Creating an database
create database bank_db;
 
-- 2] Using an database
use bank_db;

-- 3] creating an customer table
create table customer (
customer_id int,
name varchar(100),
mobile varchar(20),
city varchar(100)
);

-- 4] Insering an customer
Insert into customer (customer_id , name , mobile , city) values
(1,'Utkarsh','9356666123','Mumbai') , (2,'Dhanashri','856397412','Pune') , (3,'Samiksha','7836912458','Pune') , (4,'Priyanka','8563129751','Mumbai');

-- 5] Display customer details
select * from customer;