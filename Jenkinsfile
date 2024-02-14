pipeline {
    agent any
        stages {
            stage('Build') {
                steps {
                    sh 'mvn clean package'
                }
                post{
                    success{
                        echo 'Archiving the Artifects'
                        archiveArtifects artifects: '**/target/*.war'
                    }
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
