# --------------------------------------
# Stage 1: Build the Angular app using nodejs
# --------------------------------------
FROM node:16.10 AS build
WORKDIR /app
COPY package*.json ./
RUN npm ci
COPY . .
RUN npm run build -- --configuration production

# --------------------------------------
# Stage 2: Serve with Nginx
# --------------------------------------
FROM nginx:alpine
COPY --from=build /app/dist/ServerManagementApp-Angular-web-FrontEnd-v2 /usr/share/nginx/html
COPY nginx.conf /etc/nginx/conf.d/default.conf
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]

# --------------------------------------------------
# HOW TO BUILD AND RUN CONTAINER
# --------------------------------------------------
# Once Dockerfile saved at project's root, Build then run using below cmd
#   > docker build -t {image-name}[:tag] .
#   > docker run -p 8080:80 {image-name}[:tag]
