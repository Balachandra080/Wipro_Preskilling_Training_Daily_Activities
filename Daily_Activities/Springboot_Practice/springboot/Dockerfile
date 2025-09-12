# 1. Use OpenJDK image
# for docker
FROM openjdk:17-jdk-slim

# 2. Set working directory in container
WORKDIR /app

# 3. Copy jar file into container
COPY target/springboot-0.0.1-SNAPSHOT.jar app.jar

# 4. Port number from docker
EXPOSE 8080

# 5. Run jar file -> java -jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

