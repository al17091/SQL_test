/****** create database ******/
CREATE DATABASE order_menu;
CREATE DATABASE seat;
CREATE DATABASE student;
GO

/****** create table ******/
CREATE TABLE order_menu.Table_menu(
	menu_id int NOT NULL,
	menu_name varchar(50) NOT NULL,
	storage int NOT NULL
);
GO

CREATE TABLE seat.Table_seat(
	seat_number varchar(50) NOT NULL,
	student_id nvarchar(50),
	time_choose int NOT NULL,
	booked int NOT NULL
);
GO

CREATE TABLE student.Table_done(
	done_id int NOT NULL,
	done_name nchar(10) NOT NULL
);
GO

CREATE TABLE student.Table_student_done(
    student_id nchar(10) NULL,
	done_id nchar(10) NULL
);
GO

CREATE TABLE student.Table_student_data(
	student_id varchar(50) NOT NULL,
	seat_number varchar(50) NULL,
	bank int NOT NULL
);
GO

CREATE TABLE student.Table_student_name(
	student_id varchar(50) NOT NULL,
    student_name varchar(50) NOT NULL,
	pass_word varchar(max) NOT NULL
);
GO
