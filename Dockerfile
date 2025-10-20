FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/simple-java-app-1.0.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]
