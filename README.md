# 📘 Proyecto Final – Programación II (Grupo 6)

### Universidad Americana – BIS-11

**Profesor(a):** María Daniela Madriz Pereira  
**Curso:** Programación II  
**Grupo:** 6  

---

## 👨‍💻 Integrantes del grupo

- Daniel Steven Calderón Padilla
- Jean Paul Fernández Alvarado
- Paul Anthony López Sandí
- Enyel Gabriel Padilla Toledo
- Marlon Ricardo Rugama Carmona

---

## 🎯 Descripción del Proyecto

Este proyecto consiste en desarrollar una aplicación de escritorio en **Java con NetBeans**, conectada a una base de datos **MySQL**, que implemente operaciones básicas **CRUD** (Crear, Leer, Actualizar, Eliminar).

La aplicación debe:

- Seguir el **paradigma de programación orientada a objetos**.
- Usar **arquitectura MVC** (Modelo - Vista - Controlador).
- Tener una **interfaz gráfica amigable** construida con **Swing**.
- Utilizar únicamente la lógica enseñada en clase.
- Definir nombres claros en cada componente (`txtNombre`, `tblDatos`, `btnGuardar`, etc.).

---

## 📁 Estructura del Proyecto

```
prog2-g6/
├── src/
│   ├── controlador/
│   ├── modelo/
│   │   ├── Cliente.java
│   │   ├── Producto.java
│   │   ├── Categoria.java
│   │   ├── ModoPago.java
│   │   └── Conexion.java
│   └── vista/
│       └── FacturaVista.java
└── README.md
```

---

## 🗄️ Script de Base de Datos

El proyecto incluye un script para la creación de la base de datos en MySQL.

- 📁 Carpeta: `sql/`
- 📄 Archivo: `facturacion.sql`
- 💾 Base de datos: `facturacion`
- Tablas creadas: `cliente`, `producto`, `categoria`, `modo_pago`, `factura`, `detalle`.

> **Importante:** Ejecutar este script antes de correr el proyecto para asegurar que las tablas existan.

---

## 🛠️ Funcionalidades

- Insertar registros
- Buscar registros
- Modificar registros
- Eliminar registros
- Mostrar datos en tablas (`JTable`)
- Validaciones básicas en campos
- Conexión segura a MySQL con `PreparedStatement`
- Diseño de factura con productos, cantidades, precios, y total automático.

---

## 🌟 Arquitectura Utilizada: MVC

| Componente | Descripción |
|------------|-------------|
| Modelo     | Representa los datos y lógica de negocio (base de datos) |
| Vista      | Formulario gráfico construido en Swing |
| Controlador| Manejo de eventos, validaciones y lógica de interacción entre modelo y vista |

---
