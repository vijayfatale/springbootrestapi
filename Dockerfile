FROM openjdk:17
ADD target/SpringBootRestAPI-0.0.1-SNAPSHOT.jar spring-boot-docker.jar
EXPOSE 8081
ENTRYPOINT [ "java","-jar","spring-boot-docker.jar" ]