pipeline {
  agent any

  options {
    ansiColor('xterm')
  }


  stages {

    stage('ConfigFile') {
      steps {
        configFileProvider([configFile(fileId: 'trivia-dev-application.yml', targetLocation: 'src/main/resources/application.yml')]) {
          sh """ echo 'application.yml has been replaced.'"""
        }
      }
    }
    stage('Build') {
      steps {
        sh 'mvn clean install'
      }
    }

    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }

    stage('Login') {
      steps {
        withCredentials([azureServicePrincipal('azure-credentials-for-jenkins')]) {
          sh 'az login --service-principal -u $AZURE_CLIENT_ID -p $AZURE_CLIENT_SECRET -t $AZURE_TENANT_ID'
        }
      }
    }

    stage('Deploy') {
      steps {
        sh 'mvn package azure-webapp:deploy'
      }
    }

  }
}