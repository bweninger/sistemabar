create table comanda (
    id char(36) not null primary key,
    numero_comanda integer,
    id_usuario char(36),
    data_inicio_vigencia timestamp not null,
    data_fim_vigencia timestamp,
    tipo varchar(50) not null,
    status varchar(50) not null
);