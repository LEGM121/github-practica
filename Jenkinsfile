pipeline {
    agent any

    environment {
        IMAGE_NAME = 'luisgo121/api-rest-world-image'
        DOKERHUB_CREDENTIALS = credentials('dockerhub')


    }

    Stages {
        stage ('chekout') {
            steps {
                echo "Checking salida code SCM"
                checkout scm
            }

        }
    }
    stage('Clean Workspace') {
      steps{
          sh 'mvn clean'
      }
    }
    




}
