# Universidad Champagnat - Laboratorio de Desarrollo de Software 2026

# Proyecto Final - Grupo N°1

## Integrantes
- Gustavo Balderrama
- Juan Ignacio Lopez
- Nicolas Fenoy

---

# Descripción del Proyecto

EventTick es una plataforma web orientada a la gestión de eventos y venta de entradas online.

El sistema permite a organizadores crear y administrar eventos, mientras que los usuarios pueden visualizar eventos disponibles, comprar entradas y recibir un comprobante digital con identificación única.

Además, el sistema incorpora control automático de stock de entradas mediante triggers en la base de datos y un sistema de autenticación con distintos niveles de acceso.

---

# Problemática que resuelve

La plataforma busca solucionar problemas frecuentes en la organización y venta de entradas para eventos, tales como:

- Sobreventa de entradas.
- Falta de control del stock disponible.
- Gestión manual de eventos.
- Información incompleta en las compras.
- Dificultad para administrar ventas y ganancias.

---

# Tipos de Usuarios

## Administrador
- Gestión general del sistema.
- Supervisión de eventos y usuarios.

## Organizador
- Crear, editar y eliminar eventos.
- Consultar estadísticas de ventas.
- Visualizar ingresos generados.

## Usuario / Comprador
- Registrarse e iniciar sesión.
- Visualizar eventos disponibles.
- Comprar entradas.
- Descargar comprobantes de compra.

---

# Funcionalidades Principales

- CRUD de eventos.
- Sistema de autenticación y roles.
- Compra de entradas online.
- Control automático de stock mediante triggers.
- Generación de comprobantes digitales.
- Panel de estadísticas para organizadores.
- Gestión de disponibilidad de entradas en tiempo real.

---

# Tecnologías Utilizadas

## Frontend
- HTML5
- CSS3
- JavaScript

## Backend
- PHP

## Base de Datos
- MySQL
- Triggers SQL

---

# Estructura de Base de Datos

- usuarios
- eventos
- entradas
- compras
- detalle_compra

---

# Flujo General del Sistema

1. El usuario inicia sesión o se registra.
2. Visualiza los eventos disponibles.
3. Selecciona un evento.
4. Elige la cantidad de entradas.
5. Confirma la compra.
6. El sistema verifica disponibilidad.
7. Se actualiza automáticamente el stock.
8. Se genera un comprobante digital con ID único.

---

## Setup del Proyecto

### Requisitos previos

- XAMPP
- PHP 8.x
- MySQL / MariaDB
- Git
- Navegador web

INSTALACION

# Proyecto EventTick - Sistema de Gestion de Eventos y Entradas

Esta guia esta pensada para configurar el proyecto desde cero en el entorno local si todavia no tenes nada instalado en tu computadora.

---

## Objetivo del Proyecto
El objetivo es desarrollar una solucion web funcional, intuitiva y segura para la administracion de eventos y venta de entradas en tiempo real, evitando problemas criticos como la sobreventa de tickets.

---

## Requisitos Previos
Antes de empezar a trabajar con el codigo, necesitas instalar las siguientes herramientas:
1. Visual Studio Code (o el editor de codigo que prefieras).
2. XAMPP (Para levantar el servidor local Apache y la base de datos MySQL).
3. SDK de Java (Versioón 11 o superior para ejecutar la logica interna).

---

## Estrateregia de Carpetas en la PC
Para que el servidor de XAMPP pueda procesar las paginas web, el proyecto tiene que estar guardado dentro de la carpeta htdocs. 

La ruta exacta en el disco duro debe quedar de la siguiente manera:
C:\xampp\htdocs\gestion-tickets-app\

Dentro de esa carpeta se ubican los archivos esenciales:
* conexion.php -> Conecta el sitio web con la base de datos.
* comprobante.php -> Muestra el ticket en pantalla (HTML/CSS) y guarda los datos de la operacion.
* GeneradorComprobante.java -> El modulo de logica pura en Java.

---

## Pasos para Iniciar el Entorno Local

1. Iniciar el Servidor: Abrir el panel de XAMPP y hacer clic en Start en los modulos de Apache y MySQL (ambos deben cambiar a color verde).
2. Configurar la Base de Datos: Ingresar a http://localhost/phpmyadmin/, crear una base de datos nueva llamada gestion_eventos_db y ejecutar el script SQL para armar las tablas de usuario, evento y compra.
3. Probar la Aplicacion: Abrir el navegador de internet e ingresar a la direccion local para ver el archivo funcionando:
   http://localhost/gestion-tickets-app/comprobante.php

---

## Estrateregia de Ramas (Git)

Para trabajar organizados en equipo y evitar conflictos de codigo, usamos la siguiente estructura de ramas en el repositorio:

### Ramas principales
* main: Contiene la version estable del proyecto. Solo se suben funcionalidades completamente verificadas y funcionando. No se programa directo sobre esta rama.
* develop: Rama utilizada para integrar y probar los cambios de todos los integrantes antes de pasarlos a main.

### Ramas de funcionalidades
Cada integrante trabaja en ramas independientes para sus tareas diarias, creadas siempre a partir de develop.

Formato de nombre:
feature/nombre-funcionalidad

Ejemplo: feature/generador-comprobantes

### Comandos basicos para arrancar:

* Clonar el repositorio:
  git clone URL_DEL_REPOSITORIO

* Crear tu rama de trabajo:
  git checkout -b feature/nombre-funcionalidad

* Guardar tus cambios locales:
  git add .
  git commit -m "Explicacion breve de lo que hiciste"

* Subir tu rama a GitHub:
  git push origin feature/nombre-funcionalidad
