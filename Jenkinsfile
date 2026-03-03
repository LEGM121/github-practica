pipeline {
    agent any
    tools {
        nodejs 'NodeJS'
    }
    environment {
        DOCKER_HUB_CREDENTIALS_ID = 'luisgo121'
        DOCKER_HUB_REPO = 'luisgo121/api-rest-world-image'
    }
    stages {
        stage('Checkout Github') {
            steps {
                git branch: 'master',  credentialsId: 'github-practica', url: 'https://github.com/LEGM121/github-practica.git'
            }
        }
        stage('Build Docker Image'){
            steps {
                script {
                    dockerImage = docker.build("${DOCKER_HUB_REPO}:latest")
                }
            }
        }
    }





    }
