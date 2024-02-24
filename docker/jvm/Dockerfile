FROM openjdk:17

# Set the working directory in the container
WORKDIR /app

# Copy the executable JAR file from the host filesystem to the container
COPY graal-test-0.0.1-SNAPSHOT.jar /app/graal.jar

# Expose port 8080 to the outside world
EXPOSE 8080

# Command to run the executable JAR file
CMD ["java", "-jar", "graal.jar"]