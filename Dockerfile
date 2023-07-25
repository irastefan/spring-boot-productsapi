FROM alpine

RUN apk add openjdk17

COPY build/libs/products-api.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]