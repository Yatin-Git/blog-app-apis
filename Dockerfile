FROM adoptopenjdk/openjdk11:latest

WORKDIR /app

COPY target/blog-app-apis-0.0.1-SNAPSHOT.jar /app/

ENTRYPOINT ["java", "-jar", "/app/blog-app-apis-0.0.1-SNAPSHOT.jar"]