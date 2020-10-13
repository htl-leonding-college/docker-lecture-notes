FROM node AS BUILDER
WORKDIR /app
COPY . .
RUN npm install && npm run build

FROM node:alpine
WORKDIR /app
COPY --from=builder /app/dist .
COPY --from=builder /app/package.json .
RUN npm install --only-prod
EXPOSE 8080
CMD ["node","app.js"]