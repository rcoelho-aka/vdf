FROM openjdk:17.0.2

COPY target/students.jar .

ENTRYPOINT ["java","-jar","students.jar"]