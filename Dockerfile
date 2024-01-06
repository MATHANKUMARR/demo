FROM openjdk:21-jdk

EXPOSE 8080

ADD target/demo.jar demo.jar

ENTRYPOINT [ "java", "-jar", "demo.jar" ]