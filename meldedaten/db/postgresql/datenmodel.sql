create schema btg;

/* DB2 */
--set current schema btg;
/* postgresql spezifisch */
set search_path to btg;

create table feld (
	--feld_id integer not null,
	feld_id serial not null,
	nummer varchar(10) not null,
	csv_name varchar(100) not null,
	datentyp varchar(100) not null
);

alter table feld add primary key (feld_id);

create table status (
	--status_id integer not null,
	status_id serial not null,
	gruppe varchar(20) not null,
	name varchar(20) not null
);

alter table status add primary key(status_id);

create table basisdaten (
	--meldung_id bigint not null,
	meldung_id bigserial not null,
	status_btg integer not null,
	status_arm integer not null,
	status_nca integer not null,
	transaktionsnummer varchar(60) not null,
	user_field_3 varchar(100) not null,
	user_field_2 varchar(100) not null,
	meldetag date not null
);

alter table basisdaten add primary key (meldung_id);
alter table basisdaten add constraint fk_basisdaten_status_btg foreign key (status_btg) references status (status_id) on delete restrict;
alter table basisdaten add constraint fk_basisdaten_status_arm foreign key (status_arm) references status (status_id) on delete restrict;
alter table basisdaten add constraint fk_basisdaten_status_nca foreign key (status_nca) references status (status_id) on delete restrict;

create table meldedaten (
	meldung_id bigint not null,
	feld_id integer not null,
	wert varchar(500) not null
);

alter table meldedaten add primary key (meldung_id, feld_id);
alter table meldedaten add constraint fk_meldedaten_meldung_id foreign key (meldung_id) references basisdaten (meldung_id) on delete cascade;
alter table meldedaten add constraint fk_meldedaten_feld_id foreign key (feld_id) references feld (feld_id) on delete restrict;

create table feldhinweis (
	meldung_id bigint not null,
	hinweis_id integer not null,
	feld_id integer,
	hinweis varchar(500) not null
);

alter table feldhinweis add primary key (meldung_id, hinweis_id);
alter table feldhinweis add constraint fk_feldhinweis_meldung_id foreign key (meldung_id) references basisdaten (meldung_id) on delete cascade;

create table historie (
	meldung_id bigint not null,
	feldname varchar(100) not null,
	wert_alt varchar(500),
	wert_neu varchar(500),
	benutzer varchar(10) not null,
	zeitstempel timestamp not null
);

alter table historie add primary key (meldung_id, feldname, zeitstempel);
alter table historie add constraint fk_historie_meldung_id foreign key (meldung_id) references basisdaten (meldung_id) on delete cascade;