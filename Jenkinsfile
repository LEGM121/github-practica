pipeline {
    agent any
    tools {
        nodejs 'NodeJS'
    }

    stages {
        stage('Checkout Github') {
            steps {
                git branch: 'master', credentialsId: 'github-practica', url: 'https://github.com/LEGM121/github-practica.git'
            }
        }


        }



    post {
        success {
            echo 'Pipeline CD ejecutado correctamente'
        }
        failure {
            echo 'Pipeline CD falló'
        }
    }
}
