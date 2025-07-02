pipeline {
  agent any

  options {
    ansiColor('xterm')
  }

  stages {

    stage ('build') {
      steps {
          sh 'mvn clean install'
      }
    }

    stage ('test') {
      steps {
          sh 'mvn test'
      }
    }

    stage('login') {
      steps {
        withCredentials([azureServicePrincipal('azure-credentials')]) {
          sh 'az login --service-principal -u $AZURE_CLIENT_ID -p $AZURE_CLIENT_SECRET -t $AZURE_TENANT_ID'
        }
      }
    }

    stage('deploy') {
      steps {
        sh 'mvn package azure-webapp:deploy'
      }
    }
  }

}