# Dockerfile_Example
Simple springboot project with dockerfile

Create jar

cd C:\Users\Sasikala\eclipse-workspace-ee\Demo

mvn clean package -DskipTests

Create Dockerfile

Build docker image 

docker build -t demodocker .

Create container and run

docker run -d -p 8080:8080
