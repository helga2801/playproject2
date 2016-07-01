# --- First database schema

# --- !Ups
create table fruit (
  id                        bigint not null,
  name                      varchar(255),
  sum                       varchar(255),
  description               varchar(255),
  constraint fr_fruit primary key (id))
;
create sequence fruit_seq start with 5;

# --- !Downs
SET REFERENTIAL_INTEGRITY FALSE;
drop table if exists fruit;

SET REFERENTIAL_INTEGRITY TRUE;
drop sequence if exists fruit_seq;

