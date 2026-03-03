pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "luisgo121/api-rest-world-image"
        DOCKER_TAG = "${BUILD_NUMBER}"
        DOCKER_CREDENTIALS_ID = "dockerhub-credentials"
    }

    tools {
         maven 'Maven Apache'

    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'master',  url: 'https://github.com/LEGM121/github-practica.git'
            }
        }
        stage('Build with Maven') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {

                "docker build -t ${IMAGE_NAME}:${IMAGE_TAG} ."
                }

        }

    }
}