pipeline {
    agent any
    tools {
        maven 'maven-3.6.3'
    }

    stages {

        stage('checkout') {
            steps {
                git 'https://github.com/LEGM121/github-practica.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}
