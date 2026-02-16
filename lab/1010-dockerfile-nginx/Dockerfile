FROM debian:trixie-slim

LABEL maintainer="Max Mustermann <max@example.com>"

RUN apt update
RUN apt install -y nginx
COPY index.html /usr/share/nginx/html/index.html

EXPOSE 80
ENTRYPOINT ["/usr/sbin/nginx", "-g", "daemon off;"]
