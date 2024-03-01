# Use AdoptOpenJDK as base image
#FROM adoptopenjdk/openjdk17:alpine-jre
FROM amazoncorretto:17.0.7-alpine

RUN apk --no-cache add curl

# Set working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/todo-k8s-0.0.1-SNAPSHOT.jar /app/todo-k8s-0.0.1-SNAPSHOT.jar

# Expose the port that your application runs on
EXPOSE 8080

# Define the command to run your application
CMD ["java", "-jar", "TODO-0.0.1-SNAPSHOT.jar"]