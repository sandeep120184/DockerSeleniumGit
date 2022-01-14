FROM maven:3.8-jdk-8

COPY src /Home/SeleniumProject/src

COPY testng.xml /Home/SeleniumProject

COPY pom.xml /Home/SeleniumProject

RUN mvn -f /Home/SeleniumProject/pom.xml clean test -DskipTests=true