# Sistema Transaccional de Gestión de Ventas

[![Java](https://img.shields.io/badge/Java-21-orange?logo=java)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?logo=springboot)](https://spring.io/projects/spring-boot)
[![Spring Data JPA](https://img.shields.io/badge/Spring%20Data-JPA-blue?logo=spring)](https://spring.io/projects/spring-data-jpa)
[![MySQL](https://img.shields.io/badge/Database-MySQL-blue?logo=mysql)](https://www.mysql.com/)

---

## Información del Estudiante
* **Nombre:** Diego Panez
* **Curso:** Desarrollo de Aplicaciones Web

---

## Descripción del Proyecto
Esta solución backend proporciona una **API RESTful** diseñada para la gestión integral de transacciones comerciales en entornos retail y de ventas.

El sistema administra la persistencia de datos mediante operaciones **CRUD** (Create, Read, Update, Delete) estandarizadas sobre un modelo relacional de base de datos, garantizando la integridad de la información en el registro de productos, stock, clientes, personal comercial y comprobantes de venta.

---

## Arquitectura de Software
El desarrollo sigue el patrón de **Arquitectura N-Capas (Clean Architecture)** para mantener una separación clara de responsabilidades y facilitar la escalabilidad del sistema:

```text
src/main/java/com/tecsup/
├── controller/     # Capa de Exposición: Controladores REST y manejo de rutas HTTP
├── service/        # Capa de Lógica de Negocio: Procesamiento de operaciones y reglas de dominio
├── repository/     # Capa de Acceso a Datos: Interfaces JpaRepository para consultas a la BD
└── model/          # Capa de Dominio: Entidades JPA con mapeo ORM
