FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY target/myApp-0.0.1-SNAPSHOT.jar webapp.jar
ENTRYPOINT ["java","-jar","/webapp.jar"]