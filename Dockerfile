FROM jenkins/jenkins:lts

USER root

# Instalar cliente Docker
RUN apt-get update && \
    apt-get install -y docker.io

USER jenkins