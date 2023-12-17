FROM maven:3.8.5-openjdk-17

WORKDIR /var/www
COPY . /var/www
VOLUME /var/www