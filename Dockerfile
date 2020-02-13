FROM openjdk:8-alpine
MAINTAINER Tom Bradshaw <tom@codeshaw.com>

# Add the service itself
ARG JAR_FILE
ADD target/${JAR_FILE} /app.jar

ENTRYPOINT ["/usr/bin/java", "-jar", "/app.jar"]
