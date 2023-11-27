pipeline {
    agent any

    tools {
        gradle "jenkis-gradle"
    }

    options {
     buildDiscarder(logRotator(numToKeepStr: '1'))
    }

    stages {
        stage('Build') {
            steps {
                echo "Building"

                echo "Java VERSION"
                sh 'java --version'
                echo "Gradle VERSION"
                sh 'gradle --version'

                sh "./gradlew clean && ./gradlew build -x test"
            }
        }
        stage('Test') {
            steps {
                echo "Testing"

                sh "./gradlew test"
            }
        }
        stage('Deploy') {
            steps {
                echo "Deploying"
            }
        }
    }
}