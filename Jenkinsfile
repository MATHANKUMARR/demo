pipeline {
    agent any
        stages {
            stage('build') {
                steps {
                    echo 'Building the application.......'
                    script {
                        def test = 2+2 > 3 ? 'Woww... Mathankumar!':'Keep Try...!'
                        echo test
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
