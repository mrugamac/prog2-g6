# 📘 Proyecto Final – Programación II (Grupo 6)
### Universidad Americana – BIS-11

**Profesor(a):** María Daniela Madriz Pereira  
**Curso:** Programación II  
**Grupo:** 6

---

## 👥 Integrantes del grupo

- Daniel Steven Calderón Padilla  
- Jean Paul Fernández Alvarado  
- Paul Anthony López Sandí  
- Enyel Gabriel Padilla Toledo  
- Marlon Ricardo Rugama Carmona  

---

## 🎯 Descripción del Proyecto

Este proyecto consiste en desarrollar una aplicación de escritorio en **Java con NetBeans**, conectada a una base de datos **MySQL**, que implemente operaciones **CRUD** (Crear, Leer, Actualizar, Eliminar).

La aplicación debe:
- Seguir el **paradigma de programación orientado a objetos**.
- Usar **arquitectura MVC** (Modelo - Vista - Controlador).
- Tener una **interfaz gráfica amigable** construida con **Swing**.
- Basarse únicamente en la lógica enseñada en clase.
- Utilizar nombres claros y consistentes (`txtNombre`, `tblDatos`, `btnGuardar`, etc.).

---

## 📂 Estructura del Proyecto

```
/src  
├── modelo/        # Clases de entidad y conexión a la base de datos  
├── vista/         # Formularios gráficos construidos en Swing  
├── controlador/   # Manejo de eventos y conexión entre vista y modelo  
└── main/          # Clase principal con el método main()
```

---

## 🧪 Funcionalidades

- Registrar clientes
- Registrar productos y categorías
- Registrar modos de pago
- Crear facturas
- Agregar productos a facturas
- Consultar, modificar y eliminar registros
- Mostrar datos en tablas (`JTable`)
- Conexión segura a MySQL utilizando `PreparedStatement`

---

## 🌟 Arquitectura Utilizada: MVC

| Componente  | Descripción |
|-------------|-------------|
| Modelo      | Representa los datos y la lógica de la base de datos |
| Vista       | Formularios de usuario construidos con Swing |
| Controlador | Administra los eventos de usuario y coordina entre Vista y Modelo |

---

## 💾 Base de Datos

- **Nombre de la Base de Datos:** `facturacion`
- **Script de Creación:** `Script_Facturacion.sql`
- **Motor:** MySQL Server 5.7 o superior
- **Descripción:** Base de datos diseñada para registrar clientes, productos, facturas, detalles y modos de pago.

---

## 🛠️ Requisitos Técnicos

- Java JDK 8 o superior
- NetBeans IDE 8.2 o superior
- MySQL Server
- Conector JDBC (`mysql-connector-java-x.x.x.jar`)
- Sistema operativo: Windows 10 o superior

---

## 🚀 Instrucciones de Ejecución

1. Descargar o clonar el proyecto.
2. Abrir el proyecto en NetBeans IDE.
3. Ejecutar el script `Script_Facturacion.sql` en MySQL para crear la base de datos y sus tablas.
4. Configurar los parámetros de conexión en la clase `Conexion.java`.
5. Ejecutar la clase principal `Main.java` desde NetBeans.

---

## 📦 Entregables

- Código fuente del proyecto (NetBeans).
- Script de base de datos en SQL.
- Archivo `README.md`.
- Archivo `.rar` con toda la documentación enviada al correo oficial del curso.

---

## ✅ Evaluación según Rúbrica

| Criterio                         | Puntaje |
|----------------------------------|---------|
| CRUD funcional y completo        | 20 pts  |
| Aplicación correcta de MVC       | 10 pts  |
| Interfaz gráfica amigable (Swing) | 10 pts  |
| Conexión a base de datos funcional| 10 pts  |
| Organización del proyecto        | 5 pts   |
| Participación y entrega formal    | 5 pts   |
| **Total**                        | **50 pts (50% del curso)** |

---
