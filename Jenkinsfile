pipeline {
    agent {label "linux"}
    options{
        buildDiscarder logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '5'. days ToKeepStr: '', numToKeepStr: '5')
        disableConcurrentBuilds()
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
