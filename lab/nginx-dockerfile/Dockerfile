FROM ubuntu:22.04

MAINTAINER stuetz

RUN apt update
RUN apt install -y nginx
COPY index.html /var/www/html/index.html

EXPOSE 80
ENTRYPOINT ["/usr/sbin/nginx", "-g", "daemon off;"]