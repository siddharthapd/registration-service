#!/bin/sh
while ! nc -z config-server 18081 ; do
    echo "Waiting for Config Server to initialize"
    sleep 2
done
while ! nc -z eureka-server 18082 ; do
    echo "Waiting for Eureka/Discovery Server to initialize"
    sleep 2
done
java -jar /opt/registration-service-1.0-SNAPSHOT.jar
