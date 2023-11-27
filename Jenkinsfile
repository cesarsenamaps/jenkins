pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "Building"

                sh "gradle clean && gradle build -x test"
            }
        }
        stage('Test') {
            steps {
                echo "Testing"

                sh "gradle test"
            }
        }
        stage('Deploy') {
            steps {
                echo "Deploying"
            }
        }
    }
}