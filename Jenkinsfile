pipeline {
  agent {
    docker {
      image 'maven:3.6.2-jdk-8'
    }

  }
  stages {
    stage('Intialize') {
      steps {
        sh '''echo PATH = ${PATH}
mvn clean'''
      }
    }
  }
}