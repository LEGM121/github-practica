FROM eclipse-temurin:21-jdk-alpine
EXPOSE 8080
ADD target/api-rest-world-new.jar api-rest-world-new.jar
ENTRYPOINT ["java","-jar","/api-rest-world-new.jar"]