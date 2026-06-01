# Universidad Champagnat - Laboratorio de Desarrollo de Software 2026
## Proyecto Final - Grupo N°1

### Integrantes
* Gustavo Balderrama
* Juan Ignacio Lopez
* Nicolas Fenoy

---

## Descripcion del Proyecto
EventTick es una plataforma web orientada a la gestion de eventos y venta de entradas online. El sistema permite a los organizadores crear y administrar eventos, mientras que los usuarios compradores pueden visualizar los shows disponibles, adquirir pases en tiempo real y recibir un comprobante digital con identificacion unica.

---

## Problematica que resuelve
La plataforma busca solucionar problemas frecuentes en la organizacion y comercializacion de espectaculos, tales como:
* Sobreventa de entradas (control de capacidad).
* Falta de control del stock disponible en tiempo real.
* Gestion manual de reservas y eventos.
* Procesos de compra incompletos o inseguros.
* Dificultad para centralizar el control de ventas y ganancias.

---

## Tipos de Usuarios y Accesos

### Administrador
* Gestion general y auditoria del sistema.
* Supervision integral de eventos y cuentas de usuarios.

### Organizador
* ABM (Alta, Baja, Modificacion) de sus propios eventos.
* Consulta de estadisticas de ventas e ingresos generados.

### Usuario / Comprador
* Registro e inicio de sesion seguro.
* Visualizacion de la cartelera de eventos disponibles.
* Compra de entradas y obtencion de comprobantes digitales.

---

## Funcionalidades Principales
* CRUD completo de eventos.
* Sistema de autenticacion y control de roles.
* Procesamiento de compra de entradas online.
* Control logico de disponibilidad y cupos en tiempo real.
* Generacion de comprobantes y tokens de validacion.

---

## Tecnologías Utilizadas

### Frontend
* HTML5
* CSS3
* JavaScript

### Backend y Logica de Negocio
* PHP 8.x (Procesamiento del servidor web)
* Java Puro / SDK 11+ (Modulo de logica independiente para algoritmos unicos)

### Base de Datos
* MySQL / MariaDB

---

## Estructura de la Base de Datos
El sistema persiste la informacion de manera relacional mediante las siguientes tablas core mapeadas en el script:
* usuario: Registra datos de acceso, nombres y roles del sistema.
* evento: Contiene la informacion logistica y las entradas disponibles por show.
* compra: Entidad central que unifica las transacciones vinculando usuarios con eventos.

---

## Flujo General del Sistema
1. El usuario inicia sesion o se registra en la plataforma.
2. Explora la cartelera con los eventos que tienen stock disponible.
3. Selecciona un show y confirma la intencion de compra.
4. El sistema valida los cupos del evento en el backend.
5. Se efectua el cobro, se descuenta la entrada y se actualiza la tabla evento.
6. Se genera un comprobante digital en pantalla asociando un identificador unico de transaccion.

---

## Guia de Instalacion y Setup Local

### Requisitos previos necesarios
Antes de comenzar, asegurate de contar con las siguientes herramientas en tu entorno:
1. XAMPP (Para levantar los servicios locales de Apache y MySQL).
2. Visual Studio Code (O tu editor de codigo preferido).
3. SDK de Java (Version 11 o superior para compilar el componente logico).
4. Git instalado en el sistema.

### Estrategia de Carpetas en la PC
Para que el servidor Apache de XAMPP pueda compilar e interpretar las paginas web del sistema, el repositorio debe ubicarse dentro del directorio htdocs.

La ruta fisica exacta en tu disco duro debe ser:
C:\xampp\htdocs\gestion-tickets-app\

Dentro de ese directorio vas a encontrar los archivos clave de ejecucion:
* conexion.php -> Archivo encargado de establecer el puente con MySQL.
* comprobante.php -> Renderiza el ticket en pantalla (HTML/CSS) y procesa el guardado de datos.
* GeneradorComprobante.java -> Modulo independiente que contiene la logica del token.

### Pasos para Iniciar el Entorno Local
1. Iniciar Servidores: Abrir el panel de control de XAMPP y hacer clic en "Start" en los modulos de Apache y MySQL (ambos deben cambiar al estado verde).
2. Importar Base de Datos: Ingresar desde el navegador web a http://localhost/phpmyadmin/, crear una base de datos con el nombre exacto de `gestion_eventos_db` y ejecutar el archivo de script SQL adjunto para estructurar las tablas.
3. Levantar la App: Abrir una pestaña en el navegador web e ingresar a la URL local del proyecto:
   http://localhost/gestion-tickets-app/comprobante.php

---

## Estrategia de Ramas (Gitflow Simplificado)

Para mantener la prolijidad en el trabajo grupal y evitar colisiones de codigo, el repositorio se maneja bajo el siguiente esquema de ramas:

### Ramas principales
* main: Contiene la version oficial, estable de produccion. Solo se integra codigo testeado y funcionando. Nunca se suben cambios de forma directa a esta rama.
* develop: Rama de integracion. Aqui convergen las tareas de todos los miembros para realizar pruebas integrales antes de pasar a la rama principal.

### Ramas de funcionalidades (Features)
Cada tarea o issue asignado se desarrolla en una rama independiente creada a partir de develop, usando la nomenclatura establecida:

Formato de nombre:
feature/nombre-funcionalidad

Ejemplo practico: feature/generador-comprobantes

### Comandos basicos de trabajo:

* Clonar el repositorio por primera vez:
  git clone URL_DEL_REPOSITORIO

* Crear y cambiarse a una nueva rama de desarrollo:
  git checkout -b feature/nombre-funcionalidad

* Guardar los avances en el entorno local:
  git add .
  git commit -m "Mensaje corto describiendo el cambio realizado"

* Subir la rama de trabajo hacia el repositorio remoto de GitHub:
  git push origin feature/nombre-funcionalidad
