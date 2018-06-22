FROM java:8

VOLUME /tmp

ADD demo-test-build-docker-0.0.1-SNAPSHOT.jar demo-test-build-docker.jar

EXPOSE 8585

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo-test-build-docker.jar"]