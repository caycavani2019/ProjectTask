# Usar una imagen base de Java
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo
WORKDIR /app

# Copiar el JAR de la aplicación
COPY target/tareas-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto en el que la aplicación escucha
EXPOSE 8080

# Establecer variables de entorno (opcional)
ENV SPRING_DATASOURCE_URL=jdbc:postgresql://db:5432/TaskDB
ENV SPRING_DATASOURCE_USERNAME=postgres
ENV SPRING_DATASOURCE_PASSWORD=Niva2033$#

# Comando para ejecutar la aplicación
ENTRYPOINT ["java","-jar","/app.jar"]
