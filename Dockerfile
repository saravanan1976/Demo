FROM openjdk:21
COPY target/Demo-*.jar Demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/Demo.jar"]