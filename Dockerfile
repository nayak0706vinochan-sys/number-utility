FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# Copy the built JAR file from Maven build output
COPY target/number-utility-1.0-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]