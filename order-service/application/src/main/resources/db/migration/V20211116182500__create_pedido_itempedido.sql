CREATE TABLE pedido (
    id char(36) primary key not null,
    data_pedido timestamp not null,
    status varchar(50) not null,
    id_comanda char(36) not null,
    foreign key (id_comanda) references comanda (id)
);

CREATE TABLE item_pedido (
    id char(36) primary key not null,
    id_pedido char(36) not null,
    id_produto char(36) not null,
    quantidade integer not null default 1,
    status varchar(50) not null,
    foreign key (id_pedido) references pedido(id)
);
