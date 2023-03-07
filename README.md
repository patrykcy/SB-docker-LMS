# SmartBear Academy - Intro to Docker and GitHub Actions

This repo is going to be used to teach us about Docker + GitHub Actions.
The repo contains 2 projects:
- `backend`: A [Spring Boot v3](https://spring.io/) REST API built with [Maven](https://maven.apache.org/)
- `frontend`: A [React v18](https://reactjs.org/) Single Page Application that talks to the `backend` API

Instructions for running these projects can be found in the appropriate directories.

## Running everything with Docker Compose
Now that we have Docker Compose set up, we can run both services with:
```
docker compose up
```
Note: At this point, we only have the backend set up with docker compose, and will need to add the config for the frontend image.   