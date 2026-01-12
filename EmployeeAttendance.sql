-- 1] Employee Attendance Tracking System

-- 1] Creating an Database
create database attendance_db;

-- 2] Selecting an Database
use attendance_db;

-- 3] Creating an Employee table

create table Employee(
Emp_id int ,
Emp_name varchar(50),
Department varchar(50)
);

-- 4] Creating an Attendance table

create table attendance (
attendance_id int ,
emp_id int,
attendance_date date,
is_present boolean
);

-- 5] Insert 2 employee
Insert into Employee values (1,'Suraj','EXTC') , (2,'Rohan','CSE');

-- 6] Insert attendance record
Insert into attendance values (101,1,'2026-01-12',true) ,(102,2,'2026-01-12',false);

-- 7] Display attendance record
select * from attendance;




