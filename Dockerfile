# Khadija Kobra
# G01120432
# Arnab Debnath
# G01120433
# Docker configuration

FROM openjdk:latest

# Copy war file
COPY target/spring-boot-2-rest-service-basic-0.0.1-SNAPSHOT.jar /echo.war

# run the app
CMD ["/usr/bin/java", "-jar", "/echo.war"]