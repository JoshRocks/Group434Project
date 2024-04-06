

pipeline {
	agent any
    stages {
        stage('build') {
            steps {
				bat 'mvn --version'
			}
        }
		
		stage('Test') {
            steps {
                bat 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
		}
    }
}


