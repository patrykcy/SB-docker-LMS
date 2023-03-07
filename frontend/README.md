# Smartbear Academy - Intro to Docker and GitHub Actions - Backend
This directory contains a React Single Page Application talks to the `backend` Spring Boot API.  

## Running locally
This project is built using NPM and Vite.  
To run the application quickly from the CLI:
```
npm install

npm run dev
```
Once this is ready, you can reach the app by going to http://localhost:5173  

## Running with Docker
To build and run the docker image for this app:  
```
docker build -t sba-frontend .
```
This will create a production build of the SPA.  
To run the docker image:  
```
docker run -p 3000:3000 sba-frontend
```
