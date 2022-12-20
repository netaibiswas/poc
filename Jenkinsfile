pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building...'
        sh 'make'
        archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
      }
    }
  }
}
