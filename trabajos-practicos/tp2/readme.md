# Entrega Final - EventTick

### Materia / Curso:

Laboratorio de Desarrollo de Software

### Alumno/Grupo:

Balderrama Gustavo, Lopez Juan Ignacio, Fenoy Nicolas

### Link al Repositorio de GitHub:

https://github.com/UCH-LDS-2026/grupo-13

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

# 3. Diagrama de Casos de Uso

## Actores Identificados

1. **Usuario / Comprador:** Persona que utiliza la plataforma para visualizar eventos disponibles y comprar entradas.

2. **Organizador:** Usuario encargado de crear, editar, eliminar y administrar sus propios eventos.

3. **Administrador:** Usuario con permisos generales para supervisar el sistema, gestionar usuarios y controlar eventos publicados.

---

## Casos de Uso Principales

1. **Registrarse / Iniciar Sesión:**  
   El usuario crea una cuenta o accede al sistema con sus credenciales.

2. **Visualizar Eventos:**  
   El usuario consulta los eventos disponibles publicados en la plataforma.

3. **Comprar Entrada:**  
   El usuario selecciona un evento, elige la cantidad de entradas y confirma la compra.  
   `<<include>> Verificar Disponibilidad de Entradas`  
   `<<include>> Generar Comprobante`

4. **Crear Evento:**  
   El organizador registra un nuevo evento indicando nombre, fecha, ubicación, cantidad de entradas, precio y descripción.  
   `<<include>> Validar Datos del Evento`

5. **Gestionar Eventos:**  
   El organizador administra los eventos creados.  
   `<<extend>> Editar Evento`  
   `<<extend>> Eliminar Evento`

6. **Ver Estadísticas de Ventas:**  
   El organizador consulta la cantidad de entradas vendidas, ingresos generados y rendimiento de sus eventos.  
   `<<include>> Generar Reporte de Ventas`

7. **Gestionar Usuarios:**  
   El administrador puede controlar los usuarios registrados en el sistema.

8. **Gestionar Eventos del Sistema:**  
   El administrador puede supervisar, modificar o eliminar eventos publicados en la plataforma.

<img width="1536" height="1024" alt="diagrama de uso" src="https://github.com/user-attachments/assets/086921b6-4ac3-4df6-9fdd-367fce169aec" />


# 4. 

# 5. Justificación del Stack Tecnológico

La elección de HTML, CSS y JavaScript para el frontend se basa en su simplicidad, compatibilidad y facilidad para desarrollar interfaces web dinámicas e intuitivas. Para el backend se utiliza PHP, debido a su integración sencilla con formularios web y bases de datos, además de ser una tecnología adecuada para proyectos académicos y aplicaciones CRUD. Como sistema gestor de base de datos se eligió MySQL/MariaDB mediante XAMPP, ya que permite administrar correctamente la información relacionada con usuarios, eventos, compras y entradas, garantizando persistencia y control del stock mediante triggers SQL. Este stack tecnológico resulta apropiado para el desarrollo de una plataforma web de gestión de eventos y venta de entradas en tiempo real.
