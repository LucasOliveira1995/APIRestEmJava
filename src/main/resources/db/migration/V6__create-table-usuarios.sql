create table usuarios(

    id serial not null,
    login varchar(100) not null,
    senha varchar(400) not null unique,

    primary key (id)

);