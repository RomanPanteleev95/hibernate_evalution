create table worker (
  id serial primary key,
  name varchar(255) not null,
  age int not null
);

insert into worker values (1, 'Ivan', 25);