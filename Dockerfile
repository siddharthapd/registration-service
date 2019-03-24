# Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine
MAINTAINER siddharthap <sid.cse2013@gmail.com>

VOLUME /opt/javadev/logs
COPY /target/registration-service-1.0-SNAPSHOT.jar /opt/registration-service-1.0-SNAPSHOT.jar
COPY registration-service-entrypoint.sh /opt/registration-service-entrypoint.sh
RUN chmod 755 /opt/registration-service-entrypoint.sh
EXPOSE 18084
