# Entrega Final - EventTick

### Materia / Curso:

Laboratorio de Desarrollo de Software

### Alumno/Grupo:

Balderrama Gustavo, Lopez Juan Ignacio, Fenoy Nicolas - Grupo 1

### Link al Repositorio de GitHub:

https://github.com/UCH-LDS-2026/grupo-1

---

# 1. Estrategia de Ramas Definida

El proyecto utiliza una estrategia basada en GitFlow simplificado:

## main

Rama principal protegida. Contiene únicamente versiones estables y funcionales del sistema.
No se permiten cambios directos; todas las modificaciones deben ingresar mediante Pull Request revisados previamente.

## develop

Rama de integración y desarrollo.
Aquí se unen y prueban las nuevas funcionalidades antes de pasar a producción.

## feature/*

Ramas creadas desde develop para trabajar funcionalidades específicas del sistema.

Ejemplos:

* feature/login
* feature/crud-eventos
* feature/compras
* feature/comprobantes
* feature/dashboard-organizador

Una vez terminada la funcionalidad, la rama se fusiona nuevamente con develop mediante Pull Request.

## hotfix/*

Ramas destinadas a solucionar errores críticos detectados en producción o en la rama principal.

---

# 2. Entorno Configurado e Instalación

## Requisitos Previos (SDK y Versiones)

* PHP 8.x
* XAMPP
* Apache
* MySQL / MariaDB
* Git 2.x
* Navegador Web (Google Chrome o Mozilla Firefox)

---

## Captura / Descripción de Instalación Exitosa

El sistema fue configurado y ejecutado correctamente en los equipos de todos los integrantes del grupo, validando el correcto funcionamiento del frontend, backend y conexión con la base de datos local mediante XAMPP.

---

## Pasos de ejecución

1. Clonar el repositorio:

```bash
git clone https://github.com/UCH-LDS-2026/grupo-1
```

2. Copiar la carpeta del proyecto dentro de:

```bash
C:\xampp\htdocs\
```

3. Iniciar Apache y MySQL desde XAMPP.

4. Crear la base de datos desde phpMyAdmin:

```sql
CREATE DATABASE eventtick;
```

5. Configurar las tablas necesarias para el proyecto.

6. Ejecutar el sistema desde el navegador:

```bash
http://localhost/eventtick
```

---

# 3. Diagramas de Casos de Uso

## Actores Identificados

### Usuario / Comprador

Persona que utiliza la plataforma para visualizar eventos y comprar entradas.

### Organizador

Usuario encargado de crear y administrar eventos.

### Administrador

Usuario con permisos de control general del sistema.

---

## Casos de Uso Principales

### Registrarse / Iniciar Sesión

El usuario crea una cuenta y accede al sistema.

### Visualizar Eventos

El usuario puede consultar eventos disponibles publicados por organizadores.

### Comprar Entrada

El usuario selecciona un evento y adquiere entradas disponibles.
(<<include>> Verificar Stock)
(<<include>> Generar Comprobante)

### Crear Evento

El organizador registra un nuevo evento en el sistema.
(<<include>> Validar Datos)

### Gestionar Eventos

El organizador puede editar o eliminar eventos existentes.
(<<extend>> Crear Evento)

### Ver Estadísticas

El organizador consulta ventas, ingresos y cantidad de entradas vendidas.

---

# 4. Diagrama de Clases

A continuación se describen las principales clases del dominio del sistema:

## Usuario

* id : int
* nombre : string
* email : string
* password : string
* rol : string

## Evento

* id : int
* nombre : string
* descripcion : string
* fecha : date
* ubicacion : string
* entradasDisponibles : int
* precioEntrada : decimal

## Compra

* id : int
* usuarioId : int
* fechaCompra : datetime
* total : decimal

## Entrada

* id : int
* eventoId : int
* codigoEntrada : string
* estado : string

## Comprobante

* id : int
* compraId : int
* fechaEmision : datetime
* codigoQR : string

---

## Relaciones y Multiplicidades

* Un Usuario puede realizar muchas Compras.
* Una Compra pertenece a un Usuario.
* Un Evento puede tener muchas Entradas.
* Una Entrada pertenece a un Evento.
* Una Compra puede generar un Comprobante.
* Un Organizador puede crear múltiples Eventos.

---

# 5. Justificación del Stack Tecnológico

La elección de HTML, CSS y JavaScript para el frontend se basa en su simplicidad, compatibilidad y facilidad para desarrollar interfaces web dinámicas e intuitivas. Para el backend se utiliza PHP, debido a su integración sencilla con formularios web y bases de datos, además de ser una tecnología adecuada para proyectos académicos y aplicaciones CRUD. Como sistema gestor de base de datos se eligió MySQL/MariaDB mediante XAMPP, ya que permite administrar correctamente la información relacionada con usuarios, eventos, compras y entradas, garantizando persistencia y control del stock mediante triggers SQL. Este stack tecnológico resulta apropiado para el desarrollo de una plataforma web de gestión de eventos y venta de entradas en tiempo real.
