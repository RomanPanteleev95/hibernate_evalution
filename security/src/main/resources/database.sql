-- drop table user_roles

create table user_role (
  id serial primary key,
  user_id int not null,
  role_id int not null
)

insert into users (ID, USERNAME, PASSWORD)
values (2, 'dbuser1', '$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu');

insert into users (ID, USERNAME, PASSWORD)
values (3, 'dbadmin1', '$2a$10$PrI5Gk9L.tSZiW9FXhTS8O8Mz9E97k2FZbFvGFFaSsiTUIl.TCrFu');

insert into user_role (ID, USER_ID, ROLE_ID)
values (1, 2, 1);

insert into user_role (ID, USER_ID, ROLE_ID)
values (2, 3, 1);

insert into user_role (ID, USER_ID, ROLE_ID)
values (3, 3, 2);