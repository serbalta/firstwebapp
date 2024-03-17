pipeline {
    agent any
    }
    stages {
        stage('Checkout') {
            steps {
               checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/serbalta/firstwebapp.git']])
            }
        }
        stage('git'){
            steps{
            git 'https://github.com/serbalta/firstwebapp.git'
            }
        }
    }
}
