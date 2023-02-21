# Smartbear Academy - Intro to Docker and GitHub Actions - Backend
This directory contains a Spring Boot application that will serve as the REST API 
backend for this workshop.  
The backend serves 3 API routes:

| Endpoint         | Example Request                      | Example Response              |
|------------------|--------------------------------------|-------------------------------|
| `GET /api/hello` | N/A                                  | `"Hello world!"`              |
| `GET /api/time`  | N/A                                  | `{ "timestamp": "12:00:59" }` |
| `POST /api/add`  | `{ "firstNum": 1, "secondNum": 2 } ` | `{ "result": 3 }`             |

## Running locally
This project is built using Maven.  
To run the application quickly from the CLI:  
```
chmod +x ./mvnw

./mvnw spring-boot:run
```
If you open the project in Intellij, it should automatically recognise it as a Spring Boot application.

Once it's ready, the API will be available at http://localhost:8080

## Running with Docker
To build and run the docker image for this app:
```
docker build -t sba-backend .
```
This will create a production with just the JAR and JRE.  
To run the docker image:
```
docker run -p 8080:8080 sba-backend
```
