FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar Spring.jar
ENTRYPOINT ["java","-jar","/Spring.jar"]
EXPOSE 8080