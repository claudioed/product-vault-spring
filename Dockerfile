FROM openjdk:11-jdk-slim
WORKDIR /home/product
COPY target/product-vault-spring-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]