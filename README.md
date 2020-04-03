# java-webservice

Build Docker Image:
mvn clean install dockerfile:build

Run Docker Image:
docker run -p 8080:8080 -t localhost:5000/poc:latest  --name java-api
