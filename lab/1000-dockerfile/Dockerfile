FROM debian:latest
RUN apt update && apt install -y openjdk-25-jdk
COPY ./src .
RUN java -version
RUN javac HelloWorld.java
CMD ["java", "HelloWorld"]
