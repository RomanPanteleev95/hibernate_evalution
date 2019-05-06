-- drop table user_roles

create table user_role (
  id serial primary key,
  user_id int not null,
  role_id int not null
)

insert into users (ID, USERNAME, PASSWORD)
values (1, 'Roman', '$2a$10$QfqlwPrt5uBqelZOo7YdCuN.qUms80Y3EED9HkaHPriZFS.X.r4w6');

insert into users (ID, USERNAME, PASSWORD)
values (2, 'RomanAdmin', '$2a$10$pxD.jECDnM70PFdgLE7ks.ZG5NeZlKtBsf8whL5MfJYxpFKY7CPVa');


insert into user_role (ID, USER_ID, ROLE_ID)
values (1, 1, 1);

insert into user_role (ID, USER_ID, ROLE_ID)
values (2, 2, 1);

insert into user_role (ID, USER_ID, ROLE_ID)
values (3, 2, 2);