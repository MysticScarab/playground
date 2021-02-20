insert into status (STATUS_ID, GRUPPE, NAME)
values (1, 'BTG', 'unvollständig');
insert into status (STATUS_ID, GRUPPE, NAME)
values (2, 'BTG', 'versandt');
insert into status (STATUS_ID, GRUPPE, NAME)
values (3, 'BTG', 'bearbeitet');
insert into status (STATUS_ID, GRUPPE, NAME)
values (4, 'BTG', 'kontrolliert');
insert into status (STATUS_ID, GRUPPE, NAME)
values (5, 'ARM', 'akzeptiert');
insert into status (STATUS_ID, GRUPPE, NAME)
values (6, 'ARM', 'zurückgewiesen');
insert into status (STATUS_ID, GRUPPE, NAME)
values (7, 'NCA', 'akzeptiert');
insert into status (STATUS_ID, GRUPPE, NAME)
values (8, 'NCA', 'zurückgewiesen');
insert into basisdaten (MELDUNG_ID, STATUS_BTG, STATUS_ARM, STATUS_NCA, TRANSAKTIONSNUMMER, USER_FIELD_2, USER_FIELD_3,
                        MELDETAG)
values (1, 2, 5, 7, '1234567890', 'ABCD', '4711', current_date);
insert into basisdaten (MELDUNG_ID, STATUS_BTG, STATUS_ARM, STATUS_NCA, TRANSAKTIONSNUMMER, USER_FIELD_2, USER_FIELD_3,
                        MELDETAG)
values (2, 1, 5, 7, '9876543210', 'WASD', '0815', current_date);
insert into feld (FELD_ID, NUMMER, CSV_NAME, DATENTYP)
values (1, 'AA001', 'Feld AA001', 'string');
insert into feld (FELD_ID, NUMMER, CSV_NAME, DATENTYP)
values (2, 'AA002', 'Feld AA002', 'string');
insert into feld (FELD_ID, NUMMER, CSV_NAME, DATENTYP)
values (3, 'AA003', 'Feld AA003', 'string');
insert into feld (FELD_ID, NUMMER, CSV_NAME, DATENTYP)
values (4, 'BB001', 'Feld BB001', 'string');
insert into feld (FELD_ID, NUMMER, CSV_NAME, DATENTYP)
values (5, 'CC001', 'Feld CC001', 'string');
