Estructura del proyecto Backend
La estructura de carpetas y archivos del backend es la siguiente:

Copiar
BackEnd \ Tasks
├── src
│   └── main
│       ├── java
│       │   └── com
│       │       └── tareas
│       │           ├── controllers
│       │           │   ├── TaskController.java
│       │           │   └── UserController.java
│       │           ├── models
│       │           │   ├── Task.java
│       │           │   └── User.java
│       │           ├── repositories
│       │           │   ├── TaskRepository.java
│       │           │   └── UserRepository.java
│       │           ├── services
│       │           │   ├── TaskService.java
│       │           │   ├── UserService.java
│       │           │   └── NotificationService.java
│       │           ├── factories
│       │           │   └── TaskFactory.java
│       │           └── TareasApplication.java
│       └── resources
│           ├── application.properties
│           └── data.sql
├── pom.xml

controllers: Contiene los controladores REST que exponen los endpoints de la API.
TaskController.java: Maneja las operaciones CRUD de tareas.
UserController.java: Maneja las operaciones CRUD de usuarios.
models: Contiene las clases de modelo de datos para las entidades Task y User.
repositories: Contiene las interfaces de repositorio para acceder a los datos de las entidades.
TaskRepository.java: Proporciona métodos para interactuar con la tabla de tareas.
UserRepository.java: Proporciona métodos para interactuar con la tabla de usuarios.
services: Contiene las implementaciones de los servicios de lógica de negocio.
TaskService.java: Implementa la lógica de negocio relacionada con las tareas.
UserService.java: Implementa la lógica de negocio relacionada con los usuarios.
NotificationService.java: Implementa la lógica de notificación a los líderes técnicos cuando una tarea se completa.
factories:
TaskFactory.java: Implementa el patrón Factory para crear objetos de tarea con diferentes tipos de prioridad.
TareasApplication.java: Clase principal de la aplicación Spring Boot.
application.properties: Archivo de configuración de la aplicación.
data.sql: Archivo SQL para inicializar datos de prueba.
pom.xml: Archivo de configuración de Maven.
README.md: Este archivo de documentación.
Estructura del proyecto Frontend
La estructura de carpetas y archivos del frontend es la siguiente:

Copiar
FrontEnd \ Tasks
├── src
│   └── app
│       ├── components
│       │   ├── users
│       │   │   ├── user-form
│       │   │   │   ├── user-form.component.css
│       │   │   │   ├── user-form.component.html
│       │   │   │   ├── user-form.component.spec.ts
│       │   │   │   └── user-form.component.ts
│       │   │   └── user-list
│       │   │       ├── user-list.component.css
│       │   │       ├── user-list.component.html
│       │   │       ├── user-list.component.spec.ts
│       │   │       └── user-list.component.ts
│       │   └── tasks
│       │       ├── task-assign
│       │       │   ├── task-assign.component.css
│       │       │   ├── task-assign.component.html
│       │       │   ├── task-assign.component.spec.ts
│       │       │   └── task-assign.component.ts
│       │       └── task-list
│       │           ├── task-list.component.css
│       │           ├── task-list.component.html
│       │           ├── task-list.component.spec.ts
│       │           └── task-list.component.ts
│       ├── services
│       │   ├── user.service.ts
│       │   └── task.service.ts
│       ├── models
│       │   ├── user.model.ts
│       │   └── task.model.ts
│       ├── app.component.css
│       ├── app.component.html
│       ├── app.component.ts
│       ├── app.module.ts
│       └── app-routing.module.ts
├── angular.json
├── package.json

components:
users:
user-form: Componente para crear nuevos usuarios.
user-list: Componente para listar usuarios filtrados por rol.
tasks:
task-assign: Componente para asignar tareas a usuarios.
task-list: Componente para listar tareas filtradas por estado o usuario.
services:
user.service.ts: Servicio para interactuar con la API de usuarios.
task.service.ts: Servicio para interactuar con la API de tareas.
models:
user.model.ts: Modelo de datos para la entidad Usuario.
task.model.ts: Modelo de datos para la entidad Tarea.
app.component.*: Componente raíz de la aplicación Angular.
app.module.ts: Módulo principal de la aplicación Angular.
app-routing.module.ts: Módulo de enrutamiento de la aplicación.
angular.json: Archivo de configuración de Angular.
package.json: Archivo de configuración de dependencias de Node.js.
README.md: Este archivo de documentación.

Esta estructura de proyectos backend y frontend permite una separación clara de responsabilidades y facilita el mantenimiento y la evolución del proyecto a largo plazo.


Ejecución de los proyectos
Requisitos previos:

Tener Docker y Docker Compose instalados en tu sistema.
Clonar el repositorio:


Ejecutar el proyecto backend:

Copiar
cd BackEnd/Tasks
docker-compose up -d
Este comando levantará los siguientes servicios:

Servicio del backend (Spring Boot)
Servicio de la base de datos PostgreSQL
El backend estará disponible en http://localhost:8080/api.

Ejecutar el proyecto frontend:

Copiar
cd FrontEnd/Tasks
docker-compose up -d
Este comando levantará el servicio del frontend (Angular).

El frontend estará disponible en http://localhost:4200.

Verificar la ejecución:

Abre un navegador y visita http://localhost:4200 para acceder a la aplicación frontend.
Puedes probar los diferentes módulos y funcionalidades, como crear usuarios, asignar tareas, listar tareas, etc.
Estructura de los archivos Docker
Backend (Spring Boot)
Dockerfile:


Este archivo docker-compose.yml define el servicio frontend, que construye la imagen a partir del Dockerfile y expone el puerto 4200 (que se mapea al puerto 80 del contenedor Nginx).

Al ejecutar docker-compose up -d en los directorios respectivos, Docker Compose se encargará de construir y ejecutar los contenedores de backend y frontend, permitiendo que la aplicación completa funcione de manera integrada.