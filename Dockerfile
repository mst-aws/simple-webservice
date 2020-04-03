FROM openjdk:12-jdk-alpine
VOLUME /tmp
ADD target/java-webservice-1.0.jar application.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /application.jar" ]