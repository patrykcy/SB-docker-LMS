FROM node:18-alpine

WORKDIR /app

COPY . /app

RUN npm ci

ENTRYPOINT ["npm", "run", "dev"]