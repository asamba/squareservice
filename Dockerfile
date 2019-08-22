FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar square.jar
ENTRYPOINT ["java","-jar","/square.jar"]