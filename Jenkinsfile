/* groovylint-disable-next-line CompileStatic */
pipeline {
    agent any
        stages {
            stage('Build Maven') {
                steps {
                    checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/MATHANKUMARR/demo']])
                    bat 'mvn clean install'
                }
            }

            stage('Build Docker Image'){
                steps{
                    script{
                        bat 'docker build -t rmathankumarcpm/demo .'
                    }
                }
            }
        }
}
