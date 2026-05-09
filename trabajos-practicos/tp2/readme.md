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

## Flujo de Trabajo con Ramas

El proyecto utiliza una estrategia simple basada en ramas de funcionalidad y Pull Requests.

- `main`: rama principal protegida. Contiene el código estable del proyecto.
- `feature/nombre-funcionalidad`: rama creada para desarrollar de manera personal el proyecto.




# 2. Entorno Configurado e Instalación

## Requisitos Previos (SDK y Versiones)

* VIsual Studio Code
* XAMPP
* Apache
* MySQL 
* html
* php
* css


---

# 3. Diagrama de Casos de Uso

## Actores Identificados

1. **Usuario / Comprador:**  
Persona que utiliza la plataforma para visualizar eventos y comprar entradas.

2. **Organizador:**  
Usuario encargado de consultar reportes y estadísticas de ventas de los eventos organizados.

3. **Administrador:**  
Usuario con permisos generales de administración del sistema. Se encarga de gestionar usuarios, crear, editar y eliminar eventos.

---

## Casos de Uso Principales

1. **Registrarse / Iniciar Sesión:**  
El usuario crea una cuenta o accede al sistema mediante sus credenciales.

2. **Visualizar Eventos:**  
El usuario consulta los eventos disponibles publicados en la plataforma.

3. **Comprar Entrada:**  
El usuario selecciona un evento, elige la cantidad de entradas y confirma la compra.  
`<<include>> Verificar Disponibilidad de Entradas`  
`<<include>> Generar Comprobante`

4. **Ver Reporte de Ventas:**  
El organizador consulta estadísticas, ingresos y rendimiento de ventas de los eventos.  
`<<include>> Generar Reporte de Ventas`

5. **Gestionar Usuarios:**  
El administrador administra los usuarios registrados en el sistema.

6. **Crear Evento:**  
El administrador registra nuevos eventos dentro de la plataforma.

7. **Editar Evento:**  
El administrador modifica información de eventos existentes.

8. **Eliminar Evento:**  
El administrador elimina eventos del sistema.

9. **Generar Reporte de Ventas:**  
El sistema genera reportes con información estadística de ventas e ingresos.

10. **Configurar Parámetros del Sistema:**  
El administrador configura parámetros generales y funcionamiento del sistema.

---

## Observación

Todas las acciones relacionadas con la creación, edición y eliminación de eventos son realizadas únicamente por el administrador del sistema.

<img width="1536" height="1024" alt="image" src="https://github.com/user-attachments/assets/a76b407c-5ba4-46e2-b7b6-29002cd4a441" />



# 4. Diagrama de Clases

<img width="1536" height="1024" alt="image" src="https://github.com/user-attachments/assets/60239070-1286-4794-b2d7-3fe3e9b19077" />



# 5. Justificación del Stack Tecnológico

La elección de HTML, CSS para el frontend se basa en su simplicidad, compatibilidad y facilidad para desarrollar interfaces web dinámicas e intuitivas. Para el backend se utiliza PHP, debido a su integración sencilla con formularios web y bases de datos, además de ser una tecnología adecuada para proyectos académicos y aplicaciones CRUD. Como sistema gestor de base de datos se eligió MySQL mediante XAMPP, ya que permite administrar correctamente la información relacionada con usuarios, eventos, compras y entradas, garantizando persistencia y control del stock mediante triggers SQL. Este stack tecnológico resulta apropiado para el desarrollo de una plataforma web de gestión de eventos y venta de entradas en tiempo real.
