FROM adoptopenjdk/openjdk11-openj9:alpine-slim

ENV JAVA_OPTS="-Xms64m -Xmx128m -XX:MaxPermSize=128m"
COPY /target/*.jar /deployment/app.jar

ENTRYPOINT java -jar $JAVA_OPTS /deployment/app.jar