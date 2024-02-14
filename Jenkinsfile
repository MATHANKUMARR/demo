/* groovylint-disable-next-line CompileStatic */
pipeline {
    agent any
        stages {
            stage('Build') {
                steps {
                    bat "mvn clean install -DskipTests"
                }
            }

            stage('test') {
                steps {
                    bat "mvn test"
                }
            }

            stage('deploy') {
                steps {
                    bat "mvn jar:jar deploy:deploy"
                }
            }

            stage('Archive Artifacts') {
                steps {
                    archiveArtifacts artifacts: 'target/*.jar', followSymlinks: false
                }
        }
    }
}
