FROM amazoncorretto:17-alpine-jdk
COPY target/segundaapi-0.0.1-SNAPSHOT.jar /miapiv1.jar

ENTRYPOINT ["java","-jar","/miapiv1.jar"]
