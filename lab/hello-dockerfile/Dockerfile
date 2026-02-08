FROM ubuntu:latest
RUN apt update
RUN apt dist-upgrade -y
RUN echo Hallo > greet.txt
RUN ( . /etc/os-release ; echo Ubuntu $VERSION )
RUN ls -lah
WORKDIR /app2
RUN ls -lah
COPY *.txt .
CMD ["/bin/bash"]
