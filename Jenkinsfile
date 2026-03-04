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
        
        stage('Build Docker Image') {
            steps {
                powershell '''
                docker build -t $env:IMAGE_NAME:$env:IMAGE_TAG .
                '''
            }
        }



    }
}