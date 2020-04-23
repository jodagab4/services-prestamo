FROM openjdk:13
VOLUME /tmp
EXPOSE 8807
ADD ./target/services-prestamo-0.0.1-SNAPSHOT.jar service-prestamo.jar
ENTRYPOINT  ["java","-jar","/service-prestamo.jar"]