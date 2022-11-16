create table fabricantes(
codigo int not null primary key,
nombre varchar(100)
);

create table articulos(
codigo int not null primary key,
nombre varchar(100),
precio int,
fabricante int,
foreign key (fabricante) references fabricantes(codigo)
);

insert into fabricantes(codigo,nombre)values(1,'LogiTech');
insert into fabricantes(codigo,nombre)values(2,'Samsumg');
insert into fabricantes(codigo,nombre)values(3,'Xiami');

insert into articulos(codigo,nombre,precio,fabricante)values(1,'Mouse',30,1);
insert into articulos(codigo,nombre,precio,fabricante)values(2,'Pantalla',300,2);
insert into articulos(codigo,nombre,precio,fabricante)values(3,'Tablet',800,2);
insert into articulos(codigo,nombre,precio,fabricante)values(4,'SmartPhone X10',250,3);
insert into articulos(codigo,nombre,precio,fabricante)values(5,'SmartPhone X11 PRO',600,3);