# Etapa 1: Compilar el proyecto con Maven
FROM maven:3.9.8-amazoncorretto-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa 2: Crear imagen ligera para producción
FROM amazoncorretto:17-alpine-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
