create table Consultas(

    id serial not null,
    medico_id INTEGER REFERENCES medicos(id),
    paciente_id INTEGER REFERENCES pacientes(id),
    data DATE not null,

    primary key (id)

);