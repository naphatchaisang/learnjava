# Use a base image with JDK 22
FROM openjdk:22-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the jar file generated by Maven
COPY target/todolist-0.0.1-SNAPSHOT.jar app.jar

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
