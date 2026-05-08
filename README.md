#### Universidad Champagnat - Laboratorio de Desarrollo de Software - 2026

# Proyecto Final
## Grupo N° 1

## Integrantes:
- Gustavo Balderrama
- Juan Ignacio Lopez
- Nicolas Fenoy

## Problema que resuelve

El proyecto se ocupa de la necesidad de una plataforma eficaz para administrar eventos y vender boletos en tiempo real. Aspira a resolver problemas habituales, como por ejemplo los datos que sean necesarios y esten incompletos, el exceso en la venta de entradas y de llevar el control de la disponibilidad de entradas.

## Usuarios

-Organizadores
-Usuarios/Compradores
-Administradores
## Funcionalidades principales

-Gestión de Eventos (CRUD): Creación, lectura, actualización y eliminación de eventos por parte de organizadores.
-Control de Stock Automatizado: Uso de triggers en la base de datos para descontar entradas automáticamente tras una compra.
-Generación de Comprobantes: Creación de un código único (QR o ID) por cada entrada vendida.
-Sistema de Roles y Autenticación: Login y registro con diferentes niveles de acceso (usuario, organizador, admin)

## Stack tecnológico

Frontend:
-HTML + CSS
-Interfaz de usuario (cliente + organizador)

Backend:
- Login / registro
- CRUD de eventos
- Gestión de compras de entradas
- Roles: comprador / organizador / administrador

Base de datos:
- usuarios
- eventos
- entradas
- compras
- detalle_compra
- triggers para control de stock
  
## Cómo funciona el proyecto

1. El usuario se registra o inicia sesión.
2. Visualiza los eventos disponibles.
3. Selecciona un evento.
4. Elige la cantidad de entradas.
5. Confirma la compra.
6. El sistema verifica la disponibilidad de entradas.
7. Se descuenta automáticamente el stock.
8. Se genera un comprobante con ID único de entrada.
9. El organizador puede ver sus eventos y estadísticas de ventas.

