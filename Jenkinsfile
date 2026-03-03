pipeline {
  pipeline {
  	agent any
  	tools {
  		nodejs 'NodeJS'
  	}

  	stages {
  		stage('Checkout Github'){
  			steps {
  				git branch: 'master', credentialsId: 'github-practica', url: 'https://github.com/LEGM121/github-practica.git'
  			}
  		}
  		stage('Install node dependencies'){
  			steps {
  				sh 'npm install'
  			}
  		}
  		stage('Test Code'){
  			steps {
  				sh 'npm test'
  			}
  		}
  		stage('Build Docker Image'){
  			steps {
  			    script {
     			    docker.build("nodeimage"+"$BUILD_NUMBER")
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