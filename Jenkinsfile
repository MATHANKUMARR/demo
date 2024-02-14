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
                    echo 'Testing the application.......'
                }
            }

            stage('deploy') {
                steps {
                    echo 'Deploying the application.......'
                }
            }
    }
}
