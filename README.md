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

Este proyecto consiste en desarrollar una aplicación de escritorio en **Java con NetBeans**, conectada a una base de datos **MySQL**, que implemente las operaciones básicas **CRUD** (Crear, Leer, Actualizar, Eliminar).  

La aplicación debe:
- Seguir el **paradigma de programación orientado a objetos**.
- Usar **arquitectura MVC** (Modelo - Vista - Controlador).
- Tener una **interfaz gráfica amigable** construida con **Swing**.
- Usar únicamente la lógica enseñada en clase (no se permite código copiado de internet).
- Contar con nombres correctamente definidos en cada componente (`txtNombre`, `tblDatos`, `btnGuardar`, etc.).

---

## 📁 Estructura del Proyecto

/src ├── modelo/ # Clases de entidad y conexión a la base de datos (DAO) ├── vista/ # Formularios gráficos con Swing (JFrame, JPanel) ├── controlador/ # Manejo de eventos y lógica entre modelo y vista └── main/ # Clase principal con método main()


---

## 🧪 Funcionalidades

- Insertar registros
- Buscar registros
- Modificar registros
- Eliminar registros
- Mostrar datos en tabla (JTable)
- Validaciones básicas en campos
- Conexión a MySQL con `PreparedStatement`

---

## 🧩 Arquitectura Utilizada: MVC

| Componente  | Descripción |
|-------------|-------------|
| Modelo      | Representa los datos y lógica de base de datos |
| Vista       | Formulario gráfico con botones, tablas, campos de texto |
| Controlador | Escucha eventos y coordina entre Vista y Modelo |

---

## 💾 Base de Datos

- **Nombre:** `proyecto_final_grupo6`
- **Script:** Incluido como `script.sql`
- **Gestor:** MySQL 5.7+
- **Tablas:** Definidas en base al esquema entregado por la profesora
- **Índices y vistas:** Aplicados si fueron solicitados en prácticas o tareas

---

## 🛠️ Requisitos Técnicos

- Java JDK 8+
- NetBeans IDE 8.2 o superior
- MySQL Server
- Conector JDBC (`mysql-connector-java-x.x.x.jar`)
- Sistema operativo: Windows 10+ o equivalente

---

## 🚀 Instrucciones de Ejecución

1. Clonar el repositorio o descomprimir el `.zip` del proyecto.
2. Importar el proyecto en NetBeans.
3. Ejecutar el script SQL `script.sql` en MySQL para crear la base de datos y las tablas.
4. Ajustar los datos de conexión en la clase correspondiente (`Conexion.java`).
5. Ejecutar el archivo principal (`Main.java`) desde NetBeans.

---

## 📦 Entregables

- Código fuente del proyecto en Java
- Script SQL de la base de datos
- Archivo `README.md`
- Capturas de pantalla (si aplica)
- Correo de entrega con copia a todos los integrantes y nota de participación individual

---

## ✅ Evaluación según rúbrica

| Criterio                         | Puntaje |
|----------------------------------|---------|
| CRUD funcional y completo        | 20 pts  |
| Arquitectura MVC                 | 10 pts  |
| Interfaz amigable (Swing)        | 10 pts  |
| Conexión correcta a MySQL        | 10 pts  |
| Organización del proyecto        | 5 pts   |
| Participación y entrega formal   | 5 pts   |
| **Total**                        | **60 pts (50%)** |

