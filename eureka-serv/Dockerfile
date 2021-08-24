FROM openjdk:11-jdk-slim
LABEL maintainer="dilshoddan@gmail.com"
VOLUME /main-app
ADD build/libs/eureka-serv-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar","/app.jar"]