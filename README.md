# Universidad Champagnat - Laboratorio de Desarrollo de Software 2026
## Proyecto Final - Grupo N°1

### Integrantes
* [cite_start]Gustavo Balderrama [cite: 1]
* [cite_start]Juan Ignacio Lopez [cite: 1]
* [cite_start]Nicolas Fenoy [cite: 1]

---

## Descripcion del Proyecto
[cite_start]EventTick es una plataforma web orientada a la gestion de eventos y venta de entradas online. [cite: 1] [cite_start]El sistema permite a los organizadores crear y administrar eventos, mientras que los usuarios compradores pueden visualizar los shows disponibles, adquirir pases en tiempo real y recibir un comprobante digital con identificacion unica. [cite: 2]

---

## Problematica que resuelve
[cite_start]La plataforma busca solucionar problemas frecuentes en la organizacion y comercializacion de espectaculos, tales como: [cite: 3]
* [cite_start]Sobreventa de entradas (control de capacidad). [cite: 3]
* [cite_start]Falta de control del stock disponible en tiempo real. [cite: 4]
* [cite_start]Gestion manual de reservas y eventos. [cite: 4]
* [cite_start]Procesos de compra incompletos o inseguros. [cite: 5]
* [cite_start]Dificultad para centralizar el control de ventas y ganancias. [cite: 5]

---

## [cite_start]Tipos de Usuarios y Accesos [cite: 6]

### [cite_start]Administrador [cite: 6]
* [cite_start]Gestion general y auditoria del sistema. [cite: 6]
* [cite_start]Supervision integral de eventos y cuentas de usuarios. [cite: 7]

### [cite_start]Organizador [cite: 7]
* [cite_start]ABM (Alta, Baja, Modificacion) de sus propios eventos. [cite: 7]
* [cite_start]Consulta de estadisticas de ventas e ingresos generados. [cite: 8]

### [cite_start]Usuario / Comprador [cite: 8]
* [cite_start]Registro e inicio de sesion seguro. [cite: 8]
* [cite_start]Visualizacion de la cartelera de eventos disponibles. [cite: 9]
* [cite_start]Compra de entradas y obtencion de comprobantes digitales. [cite: 9]

---

## [cite_start]Funcionalidades Principales [cite: 10]
* [cite_start]CRUD completo de eventos. [cite: 10]
* [cite_start]Sistema de autenticacion y control de roles. [cite: 10]
* [cite_start]Procesamiento de compra de entradas online. [cite: 11]
* [cite_start]Control logico de disponibilidad y cupos en tiempo real. [cite: 11]
* [cite_start]Generacion de comprobantes y tokens de validacion. [cite: 12]

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
* [cite_start]usuario: Registra datos de acceso, nombres y roles del sistema. [cite: 12]
* [cite_start]evento: Contiene la informacion logistica y las entradas disponibles por show. [cite: 13]
* [cite_start]compra: Entidad central que unifica las transacciones vinculando usuarios con eventos. [cite: 14]

---

## Flujo General del Sistema
1. [cite_start]El usuario inicia sesion o se registra en la plataforma. [cite: 15]
2. [cite_start]Explora la cartelera con los eventos que tienen stock disponible. [cite: 16]
3. [cite_start]Selecciona un show y confirma la intencion de compra. [cite: 17]
4. [cite_start]El sistema valida los cupos del evento en el backend. [cite: 18]
5. [cite_start]Se efectua el cobro, se descuenta la entrada y se actualiza la tabla evento. [cite: 19]
6. [cite_start]Se genera un comprobante digital en pantalla asociando un identificador unico de transaccion. [cite: 20]

---

## [cite_start]Guia de Instalacion desde Cero (Paso a Paso) [cite: 21]

[cite_start]Este instructivo está pensado para preparar el entorno de desarrollo si no tenés ninguna herramienta instalada en tu computadora. [cite: 21]

### [cite_start]Paso 1: Descargar e instalar los programas necesarios [cite: 22]
[cite_start]Primero tenés que bajarte e instalar estas cuatro herramientas en tu sistema (dejas todas las opciones que vienen por defecto durante la instalacion): [cite: 22]

1. [cite_start]**XAMPP**: Es el programa que va a transformar tu computadora en un servidor local para que funcionen las páginas web y la base de datos. [cite: 22]
   * [cite_start]Descarga: Buscá "Descargar XAMPP" en Google (elegí la versión para Windows con PHP 8.x). [cite: 23]
2. [cite_start]**Visual Studio Code**: Es el editor de texto que usamos para abrir las carpetas y escribir el código. [cite: 24]
   * [cite_start]Descarga: Buscá "Descargar Visual Studio Code" e instalalo. [cite: 25]
3. [cite_start]**Git**: Es la herramienta que nos permite descargar el proyecto desde GitHub y trabajar en equipo sin pisarnos. [cite: 25]
   * [cite_start]Descarga: Buscá "Git for Windows" y bajá el instalador. [cite: 26]
4. [cite_start]**Java SDK (Versión 11 o superior)**: Es el motor que necesita la computadora para entender y ejecutar el archivo de lógica pura (.java). [cite: 27]
   * [cite_start]Descarga: Buscá "Descargar OpenJDK 11" o "Java SE 11" e instalalo. [cite: 28]

---

### [cite_start]Paso 2: Clonar y ubicar el proyecto en tu PC [cite: 29]
[cite_start]Para que las páginas web de PHP funcionen, el proyecto **SÍ O SÍ** tiene que estar guardado adentro de una carpeta especial que administra XAMPP llamada `htdocs`. [cite: 29] [cite_start]No sirve si lo dejás en el Escritorio o en Descargas. [cite: 30]

1. [cite_start]Abrí la carpeta general de tu computadora y navegá hasta esta ruta física: `C:\xampp\htdocs\` [cite: 31]
2. [cite_start]Hacé clic derecho en un espacio blanco de esa carpeta y elegí **"Git Bash Here"** (se abrirá una consola de comandos negra). [cite: 31]
3. [cite_start]Copiá, pegá el siguiente comando y presioná Enter para traerte los archivos del repositorio: 
   ```bash
   git clone URL_DEL_REPOSITORIO gestion-tickets-app
