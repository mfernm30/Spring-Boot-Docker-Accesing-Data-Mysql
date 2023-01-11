# spring-boot-docker-accesing-data-mysql

## Overview
This is a simple Spring Boot application that list and add data into a MySql database running in two separate Docker containers.

## Compile the app
You can open the project with IntelliJ IDEA and the project will be compile and the jar will be created with Maven. Or execute the next command to compile the project manually.
```
./mvnw clean package
```

## Create MySQL database
```
mysql> create database db_example; -- Creates the new database
mysql> create user 'springuser'@'%' identified by 'ThePassword'; -- Creates the user
mysql> grant all on db_example.* to 'springuser'@'%'; -- Gives all privileges to the new user on the newly created database
```

## Create app Docker image
Build Dockerfile.
```
docker build -t mfxeridia/accessing-data-mysql .
```

## Docker-compose
This docker-compose create a network with two separate services. One run the app and the other run a MySql database.
```
docker-compose up -d
```

## Test the app
This app can list and add users to a database. To access the list you can access to the next link [localhost:8080/demo/all](localhost:8080/demo/all).

To add users to the database you can make some POST request to the next link [localhost:8080/demo/add](https/localhost:8080/demo/add) using next command in your terminal.
```
curl localhost:8080/demo/add -d name=First -d email=someemail@someemailprovider.com
```

## Further information
This project was based on this tutorial: [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
