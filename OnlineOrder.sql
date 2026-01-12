-- 2] Online Order Billing System

-- 1] Creating an database
Create database order_billing_db;

-- 2] Selecting an database
use order_billing_db;

-- 3] Creating an order table
create table Orders(
order_id  int ,
customer_name varchar(50),
order_amount float ,
tax_percentage float ,
order_date date
);

-- 4] Inserting an record

Insert into orders values (1,'samiksha',1890,5,'2026-01-12') , (2,'dhanashri',1000,12,'2026-01-17') , (3,'priyanka',1200,15,'2026-01-23');

-- 5] Display all orders
select  * from orders;

