# syntax=docker/dockerfile:1

FROM openjdk:17

WORKDIR Downloads/Shit/spring-boot

COPY build/libs/spring-boot-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
