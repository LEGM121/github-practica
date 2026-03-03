pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "luisgo121/api-rest-world-image"
        DOCKER_TAG = "${BUILD_NUMBER}"
        DOCKER_CREDENTIALS_ID = "github-practica"
    }

    tools {
         maven 'Maven Apache'

    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'master',credentialsId: 'github-practica', url: '\'https://github.com/LEGM121/github-practica.git'
            }
        }
    }
}