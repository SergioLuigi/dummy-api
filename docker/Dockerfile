FROM eclipse-temurin:21-jdk AS build

WORKDIR /app

COPY ../gradle ./gradle
COPY ../gradlew ../build.gradle.kts ../settings.gradle.kts ./

RUN gradle build --no-daemon || return 0

RUN chmod +x gradlew

COPY ../src ./src

RUN ./gradlew clean bootJar --no-daemon

FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY --from=build /app/build/libs/*.jar app.jar

EXPOSE 8089

ENTRYPOINT ["java", "-jar", "app.jar"]
