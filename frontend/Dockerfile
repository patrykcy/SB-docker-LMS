FROM node:18-alpine as build

WORKDIR /app

COPY . /app

RUN npm ci

RUN npm run build

FROM node:18-alpine

WORKDIR /app

COPY --from=build /app/dist/ ./dist/
COPY --from=build /app/package*.json .

ENV NODE_ENV=PRODUCTION

RUN npm install serve

ENTRYPOINT ["npm", "run", "serve"]