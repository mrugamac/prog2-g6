-- Crear base de datos
CREATE DATABASE IF NOT EXISTS facturacion;
USE facturacion;

-- Tabla: cliente
CREATE TABLE cliente (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    direccion VARCHAR(255),
    fecha_nacimiento DATE,
    telefono VARCHAR(20),
    email VARCHAR(100)
);

-- Tabla: categoria
CREATE TABLE categoria (
    id_categoria INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(255)
);

-- Tabla: producto
CREATE TABLE producto (
    id_producto INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    precio DECIMAL(10,2) NOT NULL,
    stock INT NOT NULL,
    id_categoria INT,
    FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria)
);

-- Tabla: modo_pago
CREATE TABLE modo_pago (
    num_pago INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    otros_detalles VARCHAR(255)
);

-- Tabla: factura
CREATE TABLE factura (
    num_factura INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT,
    fecha DATE,
    num_pago INT,
    FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente),
    FOREIGN KEY (num_pago) REFERENCES modo_pago(num_pago)
);

-- Tabla: detalle
CREATE TABLE detalle (
    num_detalle INT AUTO_INCREMENT PRIMARY KEY,
    id_factura INT,
    id_producto INT,
    cantidad INT,
    precio DECIMAL(10,2),
    FOREIGN KEY (id_factura) REFERENCES factura(num_factura),
    FOREIGN KEY (id_producto) REFERENCES producto(id_producto)
);
