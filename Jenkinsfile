pipeline {
    agent any

    tools {
        gradle "Gradle 8.4"
    }

    stages {
        stage('Build') {
            steps {
                echo "Building"

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