/* groovylint-disable-next-line CompileStatic */
pipeline {
    agent any
        stages {
            stage('Build') {
                steps {
                    bat 'mvn clean install'
                }
            }

            stage('test') {
                steps {
                    bat 'mvn clean test'
                }
            }

            stage('deploy') {
                steps {
                    bat 'mvn spring-boot:run'
                }
            }
    }
}
