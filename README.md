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
- Utilizar únicamente la lógica enseñada en clase.
- Definir nombres claros en cada componente (`txtNombre`, `tblDatos`, `btnGuardar`, etc.).

---

## 📁 Estructura del Proyecto

``` 
/src
├── modelo/         # Clases de entidad y conexión a la base de datos
├── vista/          # Formularios gráficos con Swing
├── controlador/    # Manejo de eventos y conexión entre vista y modelo
└── main/           # Clase principal con el método main() 
``` 


---

## 🧪 Funcionalidades

- Insertar registros
- Buscar registros
- Modificar registros
- Eliminar registros
- Mostrar datos en tablas (`JTable`)
- Validaciones básicas en campos
- Conexión segura a MySQL con `PreparedStatement`

---

## 🧩 Arquitectura Utilizada: MVC

| Componente  | Descripción |
|-------------|-------------|
| Modelo      | Representa los datos y lógica de negocio (base de datos) |
| Vista       | Formulario gráfico con componentes Swing |
| Controlador | Coordina la interacción entre Vista y Modelo |

---

## 💾 Base de Datos

- **Nombre:** `biblioteca`
- **Script:** `Script_Biblioteca.sql`
- **Gestor:** MySQL 5.7+ o superior
- **Tablas:** Diseñadas según los requerimientos del proyecto de biblioteca
- **Índices y vistas:** Aplicados en la estructura si son necesarios

---

## 🛠️ Requisitos Técnicos

- Java JDK 8 o superior
- NetBeans IDE 8.2 o superior
- MySQL Server instalado
- Conector JDBC (`mysql-connector-java-x.x.x.jar`)
- Sistema operativo: Windows 10+ o equivalente

---

## 🚀 Instrucciones de Ejecución

1. Descargar o clonar el proyecto.
2. Abrir el proyecto en NetBeans IDE.
3. Ejecutar el archivo `Script_Biblioteca.sql` en MySQL para crear la base de datos y las tablas.
4. Configurar los parámetros de conexión a base de datos en la clase `Conexion.java`.
5. Ejecutar la clase principal `Main.java` desde NetBeans.

---

## 📸 Capturas de pantalla (opcional)

- Las capturas de funcionamiento se encuentran en la carpeta `screenshots/` si fueron solicitadas.

---

## 📦 Entregables

- Código fuente del proyecto en Java (NetBeans)
- Script SQL de creación de base de datos
- Archivo `README.md`
- Capturas de pantalla del funcionamiento (si aplica)
- Entrega en archivo `.rar` enviado por correo oficial al profesor

---

## ✅ Evaluación según rúbrica

| Criterio                         | Puntaje |
|----------------------------------|---------|
| CRUD funcional y completo        | 20 pts  |
| Arquitectura MVC aplicada        | 10 pts  |
| Interfaz amigable en Swing        | 10 pts  |
| Conexión correcta a MySQL         | 10 pts  |
| Organización del proyecto         | 5 pts   |
| Entrega formal y participación    | 5 pts   |
| **Total**                        | **50 pts (50% del curso)** |

---
