FROM adoptopenjdk/maven-openjdk11
ARG JAR_FILE=target/*.jar
ADD / /
RUN mvn clean install
#COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","target/gateway-0.0.1-SNAPSHOT.jar"]