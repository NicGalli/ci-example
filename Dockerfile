FROM amazoncorretto:21

COPY /target/ci-example-1.0-SNAPSHOT.jar /app/app.jar

CMD ["java", "-cp", "/app/app.jar", "com.example.App"]