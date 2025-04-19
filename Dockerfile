# Construcción del JAR con MAVEN
FROM jelastic/maven:3.9.9-openjdk-17.0.14-almalinux-9
LABEL authors="Fenando Arroyo"
WORKDIR /SD_Practica02
COPY . .
CMD mvn spring-boot:run
# RUN mvn clean install

#CMD ["mvn", "spring-boot:run"]