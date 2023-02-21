FROM eclipse-temurin:17-jdk-focal as build

COPY . .

RUN ./mvnw clean package

FROM eclipse-temurin:17-jdk-focal

WORKDIR /app

COPY --from=build target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]