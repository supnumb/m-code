FROM java
WORKDIR /ROOT
ARG JAR_FILE
EXPOSE 8070
COPY ${JAR_FILE} /ROOT/app.jar
ENTRYPOINT ["java", "-jar","-Dspring.profiles.active=test", "app.jar"]