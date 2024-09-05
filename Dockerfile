FROM amazoncorretto:21


ARG jarToCopy

COPY /target/$jarToCopy /app/app.jar

CMD ["java", "-cp", "/app/app.jar", "com.example.App"]