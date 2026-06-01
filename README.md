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
## Guia de Instalacion desde Cero (Paso a Paso)

Este instructivo está pensado para preparar el entorno de desarrollo si no tenés ninguna herramienta instalada en tu computadora.

### Paso 1: Descargar e instalar los programas necesarios
Primero tenés que bajarte e instalar estas cuatro herramientas en tu sistema (dejas todas las opciones que vienen por defecto durante la instalacion):

1. **XAMPP**: Es el programa que va a transformar tu computadora en un servidor local para que funcionen las páginas web y la base de datos.
   * Descarga: Buscá "Descargar XAMPP" en Google (elegí la versión para Windows con PHP 8.x).
2. **Visual Studio Code**: Es el editor de texto que usamos para abrir las carpetas y escribir el código.
   * Descarga: Buscá "Descargar Visual Studio Code" e instalalo.
3. **Git**: Es la herramienta que nos permite descargar el proyecto desde GitHub y trabajar en equipo sin pisarnos.
   * Descarga: Buscá "Git for Windows" y bajá el instalador.
4. **Java SDK (Versión 11 o superior)**: Es el motor que necesita la computadora para entender y ejecutar el archivo de lógica pura (.java).
   * Descarga: Buscá "Descargar OpenJDK 11" o "Java SE 11" e instalalo.

---

### Paso 2: Clonar y ubicar el proyecto en tu PC
Para que las páginas web de PHP funcionen, el proyecto **SÍ O SÍ** tiene que estar guardado adentro de una carpeta especial que administra XAMPP llamada `htdocs`. No sirve si lo dejás en el Escritorio o en Descargas.

1. Abrí la carpeta general de tu computadora y navegá hasta esta ruta física:
   `C:\xampp\htdocs\`
2. Hacé clic derecho en un espacio blanco de esa carpeta y elegí **"Git Bash Here"** (se abrirá una consola de comandos negra).
3. Copiá, pegá el siguiente comando y presioná Enter para traerte los archivos del repositorio:
   ```bash
   git clone URL_DEL_REPOSITORIO gestion-tickets-app

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
