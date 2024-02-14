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

            stage('Push Docker image to DockerHub'){
                steps{
                    script{
                        withCredentials([string(credentialsId: '', variable: 'dockerhub-password')]) {
                            bat 'docker login -u rmathankumarcpm@gmail.com ${dockerhub-password}'

                            bat 'docker push rmathankumarcpm/demo'
                        }           
                    }
                }
            }
        }
}
