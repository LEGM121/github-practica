pipeline {
    agent any

    environment {
        DOCKER_IMAGE = "luisgo121/api-rest-world-image"
        DOCKER_TAG = "${BUILD_NUMBER}"
        credentialsId: 'github-token'
    }

  

    stages {

        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/LEGM121/github-practica.git'
            }
        }

        stage('Build con Maven') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh "docker build -t ${DOCKER_IMAGE}:${DOCKER_TAG} ."
            }
        }

        stage('Push Docker Image') {
            steps {
                sh "docker push ${DOCKER_IMAGE}:${DOCKER_TAG}"
            }
        }

        stage('Deploy') {
            steps {
                sh """
                docker stop api-rest-world || true
                docker rm api-rest-world || true
                docker run -d -p 8080:8080 --name api-rest-world ${DOCKER_IMAGE}:${DOCKER_TAG}
                """
            }
        }
    }
}