FROM openjdk:17-jdk-alpine
ARG WAR_FILE=target/*.war
COPY ./target/HalcyonArtBackoffice-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]