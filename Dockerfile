FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} coffee-app.jar
ENTRYPOINT ["java","-jar","coffee-app.jar"]