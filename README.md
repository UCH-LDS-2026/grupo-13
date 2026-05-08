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

### Instalación

1. Clonar el repositorio:

```bash
git clone URL_DEL_REPOSITORIO
# Objetivo del Proyecto

Desarrollar una solución web funcional, intuitiva y segura para la administración de eventos y venta de entradas en tiempo real.
