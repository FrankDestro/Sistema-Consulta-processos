INSERT INTO tb_process (number_Process, title, description, court_Origin, value_Cause, date_Process, process_Type, judge, nature_Process, status_Process, moment)
				  VALUES (00004105020148260607, 'Marcos Teixeira Johan x BBS BankFour S/A','Reclamação de X sobre uma conta Y','TJSP · Foro · Foro Distrital de Tamapó da Comarca de Greenwitch, OP', 26590.0, '2013-2-04', 'Cível', 'Patrícia da Rosa Melton', 'Cumprimento de sentença', '0', Now() );

INSERT INTO tb_progress_process (description, moment, title, id_process) VALUES ('Lorem ipsum dolor sit amet. Non rerum ipsum et deleniti omnis sed quasi quam eos corporis explicabo est consequatur praesentium.', Now(), 'Petição realizada', 1);
INSERT INTO tb_progress_process (description, moment, title, id_process) VALUES ('Lorem ipsum dolor sit amet. Non rerum ipsum et deleniti omnis sed quasi quam eos corporis explicabo est consequatur praesentium.', Now(), 'Recurso negado', 1);
INSERT INTO tb_progress_process (description, moment, title, id_process) VALUES ('Lorem ipsum dolor sit amet. Non rerum ipsum et deleniti omnis sed quasi quam eos corporis explicabo est consequatur praesentium.', Now(), 'Sentença deferida', 1);
INSERT INTO tb_progress_process (description, moment, title, id_process) VALUES ('Lorem ipsum dolor sit amet. Non rerum ipsum et deleniti omnis sed quasi quam eos corporis explicabo est consequatur praesentium.', Now(), 'Petição Recusada', 1);

INSERT INTO tb_attachment (url, moment, id_process) VALUES ('peticao.pdf', Now(), 1);
INSERT INTO tb_attachment (url, moment, id_process) VALUES ('intimacao.pdf', Now(), 1);
INSERT INTO tb_attachment (url, moment, id_process) VALUES ('audiencia.pdf', Now(), 1);
INSERT INTO tb_attachment (url, moment, id_process) VALUES ('recurso.pdf', Now(), 1);
INSERT INTO tb_attachment (url, moment, id_process) VALUES ('assinatura.pdf', Now(), 1);

INSERT INTO tb_user (first_Name, last_Name, cpf, email, password, telephone, mobile, address, city, state, bar_Associaton, admission_Data, status, party)
VALUES ('Kevin', 'Lomax', 38909845677, 'kevin.lomax@gmail.com','$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG', 2490085768, 551199990987, 'Av. Oitenta e nove',
'Greenwich', 'State Island', 23456, '2019-04-10', 0, 'Advogado');

INSERT INTO tb_user (first_Name, last_Name, cpf, email, password, telephone, mobile, address, city, state, bar_Associaton, admission_Data, status, party)
VALUES ('Lohan', 'Milton', 35104859830, 'lohan.milton@gmail.com','$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG', 2490085768, 551199990987, 'Av. noventa e nove',
'Browcity', 'Illinois', 39570, '2022-07-25', 0, 'Advogado');


INSERT INTO tb_user (first_Name, last_Name, cpf, email, password, telephone, mobile, address, city, state,bar_Associaton, admission_Data, status, party)
VALUES ('Mary', 'Santos', 35104859830, 'mary.santos@gmail.com','$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG', 2490085768, 551199990987, 'Av. cento e nove',
'BlueCity', 'California', 09123, '2010-03-01', 0, 'Advogado');


INSERT INTO tb_user (first_Name, last_Name, cpf, email, password, telephone, mobile, address, city, state, bar_Associaton, admission_Data, status, party)
VALUES ('Joao', 'Oliveira', 38909845677, 'joao.oliveira@gmail.com','$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG', 2490085768, 551199990987, 'Av. Oitenta e nove',
'Greenwich', 'State Island', null, null, null, 'Requerente');

INSERT INTO tb_user (first_Name, last_Name, cpf, email, password, telephone, mobile, address, city, state, bar_Associaton, admission_Data, status, party)
VALUES ('Maria', 'Santos', 35104859830, 'maria.santos@gmail.com','$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG', 2490085768, 551199990987, 'Av. noventa e nove',
'Browcity', 'Illinois', null, null, null, 'Testemunha acusação');


INSERT INTO tb_user (first_Name, last_Name, cpf, email, password, telephone, mobile, address, city, state, bar_Associaton, admission_Data, status, party)
VALUES ('Alex', 'Brown', 35104859830, 'alex.brown@gmail.com','$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG', 2490085768, 551199990987, 'Av. cento e nove',
'BlueCity', 'California', null, null, null, 'Requerido');

INSERT INTO tb_user (first_Name, last_Name, cpf, email, password, telephone, mobile, address, city, state, bar_Associaton, admission_Data, status, party)
VALUES ('Bob', 'White', 35104859830, 'bob.white@gmail.com','$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG', 2490085768, 551199990987, 'Av. noventa e nove',
'Browcity', 'Illinois', null, null, null, 'Testemunha defesa');


INSERT INTO tb_role (authority) VALUES ('ROLE_LAWYER');
INSERT INTO tb_role (authority) VALUES ('ROLE_CLIENT');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);


INSERT INTO tb_user_role (user_id, role_id) VALUES (4, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (5, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (6, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (7, 2);

INSERT INTO tb_assigned (moment_Assigned, process_id, user_id) VALUES (Now(), 1, 1);
INSERT INTO tb_assigned (moment_Assigned, process_id, user_id) VALUES (Now(), 1, 2);
INSERT INTO tb_assigned (moment_Assigned, process_id, user_id) VALUES (Now(), 1, 3);

INSERT INTO tb_assigned (moment_Assigned, process_id, user_id) VALUES (Now(), 1, 4);
INSERT INTO tb_assigned (moment_Assigned, process_id, user_id) VALUES (Now(), 1, 5);
INSERT INTO tb_assigned (moment_Assigned, process_id, user_id) VALUES (Now(), 1, 6);
INSERT INTO tb_assigned (moment_Assigned, process_id, user_id) VALUES (Now(), 1, 7);


INSERT INTO tb_event (title, event_Date, event_Hour, locality, description, id_user) VALUES ('Reunião com juiz', '2022-11-13', '14:30', 'Forum State St.', 'Lorem ipsum dolor sit amet. Non rerum ipsum et deleniti omnis', 1);
INSERT INTO tb_event (title, event_Date, event_Hour, locality, description, id_user) VALUES ('Audiencia', '2022-11-13', '14:30', 'Forum State St.', 'Lorem ipsum dolor sit amet. Non rerum ipsum et deleniti omnis', 1);
INSERT INTO tb_event (title, event_Date, event_Hour, locality, description, id_user) VALUES ('Reunião com equipe', '2022-11-13', '14:30', 'Forum State St.', 'Lorem ipsum dolor sit amet. Non rerum ipsum et deleniti omnis', 1);
