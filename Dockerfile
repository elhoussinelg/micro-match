FROM openjdk:8
EXPOSE 8084
ARG JAR_FILE=target/microservice-Match-1-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]