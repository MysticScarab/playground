set current schema btg;

insert into status (gruppe, name) values ('BTG', 'unvollständig');
insert into status (gruppe, name) values ('BTG', 'versandt');
--insert into status (gruppe, name) values ('BTG', 'bearbeitet, Kontrolle erforderlich');
-- zu lang wg. varchar(20)
insert into status (gruppe, name) values ('BTG', 'bearbeitet');
insert into status (gruppe, name) values ('BTG', 'kontrolliert');

insert into status (gruppe, name) values ('ARM', 'akzeptiert');
insert into status (gruppe, name) values ('ARM', 'zurückgewiesen');

insert into status (gruppe, name) values ('NCA', 'akzeptiert');
insert into status (gruppe, name) values ('NCA', 'zurückgewiesen');

insert into basisdaten (status_btg, status_arm, status_nca, transaktionsnummer, user_field_3, user_field_2, meldetag) values (2, 5, 7, '1234567890', 'ABCD', '4711', current_date);
insert into basisdaten (status_btg, status_arm, status_nca, transaktionsnummer, user_field_3, user_field_2, meldetag) values (1, 5, 7, '9876543210', 'WASD', '0815', current_date);

insert into feld (nummer, csv_name, datentyp) values ('AA001', 'Feld AA001', 'string');
insert into feld (nummer, csv_name, datentyp) values ('AA002', 'Feld AA002', 'string');
insert into feld (nummer, csv_name, datentyp) values ('AA003', 'Feld AA003', 'string');
insert into feld (nummer, csv_name, datentyp) values ('BB001', 'Feld BB001', 'string');
insert into feld (nummer, csv_name, datentyp) values ('CC001', 'Feld CC001', 'string');
