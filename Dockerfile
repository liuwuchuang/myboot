FROM openjdk:8-jdk-alpine3.7
VOLUME /tmp

ARG JAR_FILE
ADD target/${JAR_FILE} target/app.jar

EXPOSE 8080

RUN touch target/app.jar
ENTRYPOINT ["java","-jar","target/app.jar"]
