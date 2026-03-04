pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "luisgo121/api-rest-world-image"
        DOCKER_TAG = "${BUILD_NUMBER}"
        DOCKER_HOST = "tcp://localhost:2375"
    }

    tools {
         maven 'Maven'

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
                powershell '''
                docker build -t $env:IMAGE_NAME:$env:IMAGE_TAG .
                '''
            }
        }

        stage('Push Docker Image') {
            steps {
                powershell '''
                docker tag $env:IMAGE_NAME:$env:IMAGE_TAG usuario/$env:IMAGE_NAME:$env:IMAGE_TAG
                docker push usuario/$env:IMAGE_NAME:$env:IMAGE_TAG
                '''
            }
        }


    }
}