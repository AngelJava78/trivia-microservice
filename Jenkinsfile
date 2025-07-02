pipeline {
  agent any

  options {
    ansiColor('xterm')
  }

  stages {

//     stage('Replace application.yml') {
//       steps {
//         configFileProvider([configFile(fileId: 'trivia-dev-application.yml', targetLocation: 'src/main/resources/application.yml')]) {
//             echo 'application.yml has been replaced with the secret file.'
//         }
//       }
//     }

    stage('Replace application.yml with Secret File') {
      steps {
        withCredentials([file(credentialsId: 'trivia-dev-application.yml', variable: 'APP_YML')]) {
          sh """
            mkdir -p src/main/resources
            cp -f "$APP_YML" src/main/resources/application.yml
            echo 'application.yml has been replaced with the secret file.'
          """
        }
      }
    }

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