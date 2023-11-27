pipeline {
    agent any

    tools {
        gradle "jenkis-gradle"
    }

    stages {
        stage('Build') {
            steps {
                echo "Building"

                sh "java --version"
                sh "gradle --version"

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