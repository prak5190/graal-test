FROM ubuntu:22.04

# Set the working directory in the container
WORKDIR /app

# Copy the executable JAR file from the host filesystem to the container
COPY graal-test /app/graal

# Expose port 8080 to the outside world
EXPOSE 8080

# Command to run the executable JAR file
CMD ["./graal"]