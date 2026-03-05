FROM jenkins/jenkins:lts

USER root

# Instala Docker CLI y otras herramientas necesarias
RUN apt-get update && \
    apt-get install -y docker.io maven git && \
    rm -rf /var/lib/apt/lists/*

USER jenkins