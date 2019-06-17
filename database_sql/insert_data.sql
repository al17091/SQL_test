/****** insert data ******/
/*order_menu.Table_menu*/
INSERT order_menu.Table_menu (menu_id, menu_name, storage) VALUES (0, '生協', 100);
INSERT order_menu.Table_menu (menu_id, menu_name, storage) VALUES (1, 'A', 100);
INSERT order_menu.Table_menu (menu_id, menu_name, storage) VALUES (2, 'B', 100);
INSERT order_menu.Table_menu (menu_id, menu_name, storage) VALUES (3, 'C', 100);
GO

/*seat.Table_seat*/
INSERT seat.Table_seat (seat_number, student_id, time_choose, booked) VALUES ('A1', NULL , 0, 0);
INSERT seat.Table_seat (seat_number, student_id, time_choose, booked) VALUES ('A2', NULL , 0, 0);
INSERT seat.Table_seat (seat_number, student_id, time_choose, booked) VALUES ('A3', NULL , 0, 0);
INSERT seat.Table_seat (seat_number, student_id, time_choose, booked) VALUES ('B1', NULL , 0, 0);
INSERT seat.Table_seat (seat_number, student_id, time_choose, booked) VALUES ('B2', NULL , 0, 0);
INSERT seat.Table_seat (seat_number, student_id, time_choose, booked) VALUES ('B3', NULL , 0, 0);
GO

/*student.Table_student_done*/
INSERT student.Table_student_done (student_id, done_id) VALUES ('al17091', '0');
INSERT student.Table_student_done (student_id, done_id) VALUES ('al17091', '1');
INSERT student.Table_student_done (student_id, done_id) VALUES ('al17092', '2');
INSERT student.Table_student_done (student_id, done_id) VALUES ('al17093', '3');
GO

/*student.Table_student_data*/
INSERT student.Table_student_data (student_id, seat_number, bank) VALUES ('al17020', NULL, 4000);
INSERT student.Table_student_data (student_id, seat_number, bank) VALUES ('al17067', NULL, 1500);
INSERT student.Table_student_data (student_id, seat_number, bank) VALUES ('al17084', NULL, 7000);
INSERT student.Table_student_data (student_id, seat_number, bank) VALUES ('al17091', NULL, 10000);
INSERT student.Table_student_data (student_id, seat_number, bank) VALUES ('al17092', NULL, 2000);
INSERT student.Table_student_data (student_id, seat_number, bank) VALUES ('al17093', NULL, 20000);
GO

/*student.Table_Table_student_name*/
INSERT student.Table_student_name (student_id, student_name, pass_word) VALUES ('al17020', 'ueda', 'rask');
INSERT student.Table_student_name (student_id, student_name, pass_word) VALUES ('al17067', 'takahashi', 'macpro');
INSERT student.Table_student_name (student_id, student_name, pass_word) VALUES ('al17084', 'namiki', 'eeeo');
INSERT student.Table_student_name (student_id, student_name, pass_word) VALUES ('al17091', 'higashi', 'rark');
INSERT student.Table_student_name (student_id, student_name, pass_word) VALUES ('al17092', 'hikita', 'zodori');
INSERT student.Table_student_name (student_id, student_name, pass_word) VALUES ('al17093', 'hidai', 'hessho');
INSERT student.Table_student_name (student_id, student_name, pass_word) VALUES ('al17000', 'unknown', 'better');
GO
