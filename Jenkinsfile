pipeline {
    agent any

     tools {
            // Specify the Maven installation defined in Jenkins global tools
            maven 'maven'
        }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from your Git repository
                git branch: 'master', url: 'https://github.com/vsrepalle/UnitConversion.git'
            }
        }

        stage('Build') {
            steps {
                // Build your project using Maven
                bat 'mvn clean package' // Use 'bat' for Windows command execution
            }
            post {
                success {
                    // Archive the built artifact (e.g., JAR file)
                    archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
                }
            }
        }
    }
}
