FROM openjdk:11
VOLUME /tmp
COPY target/*.jar reader.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/reader.jar"]