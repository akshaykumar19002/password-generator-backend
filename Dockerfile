FROM openjdk:17-jdk-alpine
COPY target/Password-Generator-backend-0.0.1-SNAPSHOT.jar Password-Generator-backend-0.0.1-SNAPSHOT.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/Password-Generator-backend-0.0.1-SNAPSHOT.jar"]