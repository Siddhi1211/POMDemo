pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven-3.9'
    }

    stages {
        stage('Checkout Code') {
            steps {
                git 'https://github.com/Siddhi1211/POMDemo.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {
        success {
            echo 'Build and Tests Successful 🎉'
        }
        failure {
            echo 'Build or Tests Failed ❌'
        }
    }
}
