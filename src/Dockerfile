# Construcción del JAR con MAVEN

FROM maven:3.9.9
LABEL authors="Fenando Arroyo"
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Ejecutar la app con el jar generado
FROM eclipse-temurin:23-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
ENTRYPOINT ["java", "-jar","app.jar"]
