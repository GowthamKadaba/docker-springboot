FROM openjdk:8
ADD target/dockerApp.jar dockerApp.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "dockerApp.jar"]