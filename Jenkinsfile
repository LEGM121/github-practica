pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "luisgo121/api-rest-world-image"
        DOCKER_TAG = "${BUILD_NUMBER}"
        DOCKER_CREDENTIALS_ID = "github-practica"
    }

    tools {
        maven 'Maven'
        jdk 'JDK'
    }
}