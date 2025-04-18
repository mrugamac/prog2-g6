-- Creacion de la base de datos
Create database Proyecto;

-- Uso de la base de datos
use Proyecto;

-- Creacion de las tablas
create table TB_Cliente
(
id_cliente int auto_increment primary key not null,
nombre varchar(20) not null,
apellido varchar(20) not null,
direccion varchar(50) not null,
nacimiento date,
telefono varchar(20) not null,
email varchar(50) not null
);

-- Mostramos la tabla cliente
select * from TB_Cliente;
-- insertamos valores en la tabla cliente
insert into TB_Cliente values(1,'Juan', 'Pérez'
							, 'Calle Falsa 123', '1990-05-15', '8765-4321'
							, 'juan.perez@correo.com');

create table TB_Factura
(
num_factura int auto_increment primary key not null,
pago int not null,
fecha date,
nombre int not null,
foreign key (nombre) references TB_Cliente(id_cliente),
foreign key (pago) references TB_ModoPago(num_pago)
);

-- Mostramos la tabla factura
select * from TB_Factura;
-- Insertamos valores en la tabla Factura
insert into TB_Factura values (1,1,'1990-05-15',1);

create table TB_ModoPago
(
num_pago int auto_increment primary key not null,
nombre varchar(50) not null,
otros_detalles varchar(100) not null
);

-- Mostramos las tabla
select * from TB_ModoPago;
-- Insertamos valores en 
insert into TB_ModoPago values(1,'Juan','Efectivo');

create table TB_Detalle
(
num_detalle int auto_increment primary key not null,
factura int not null,
producto int not null,
cantidad int,
precio float,
foreign key (producto) references TB_Producto(id_producto),
foreign key(factura) references TB_Factura(num_factura)
);

-- Mostrar la tablas
select * from TB_Detalle;
-- Insercion de datos
insert into TB_Detalle values (1,1,1,100,145.2);


create table TB_Producto
(
id_producto int auto_increment primary key not null,
nombre varchar(20) not null,
precio float not null,
stock int not null,
categoria int,
foreign key(categoria) references TB_Categoria(id_categoria)
);

-- Mostrar la tabla
select * from TB_Producto;
-- Insertar valores en la tabla producto
insert into TB_Producto values (1,'Helados',145.2,100,1);

create table TB_Categoria
(
id_categoria int auto_increment primary key not null,
nombre varchar(50) not null,
descripcion varchar(100) not null
);

-- Mostramos la tabla
select * from TB_Categoria;
-- Insertamos valores en la tabla Categoria
insert into TB_Categoria values (1,'Conveniencia','Varios');

