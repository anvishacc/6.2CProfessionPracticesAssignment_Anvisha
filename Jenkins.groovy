pipeline {
    agent any 
    
    stages {
        stage('Build') {
            steps {
                echo 'Stage 1: Build - Build the code using a build automation tool (e.g., Maven)'
                echo 'Tool: Maven'
                // As instructed in the task sheet we have just mentioned the name of the tool here: Maven
            }
        }
        
        stage('Unit and Integration Tests') {
            steps {
                echo 'Stage 2: Unit and Integration Tests - run unit tests and integration tests'
                echo 'Tools: JUnit (for unit tests), Custom Integration Test Framework (for integration tests)'
                // Ideally the test execution steps would be added here
            }
        }
        
        stage('Code Analysis') {
            steps {
                echo 'Stage 3: Code Analysis - integrate a code analysis tool (e.g., SonarQube)'
                echo 'Tool: SonarQube'
                // Ideally the SonarQube Analysis steps would be added here
            }
        }
        
        stage('Security Scan') {
            steps {
                echo 'Stage 4: Security Scan - perform a security scan on the code (e.g., OWASP ZAP)'
                echo 'Tool: OWASP ZAP'
                // Ideally the security scan steps would be added here
            }
        }
         stage('Security Scan 2') {
            steps {
                echo 'Stage 4: Security Scan - perform a security scan on the code (e.g., OWASP ZAP)'
                echo 'Tool: OWASP ZAP'
                // Ideally the security scan steps would be added here
            }
        }
        stage('Security Scan 3') {
            steps {
                echo 'Stage 4: Security Scan - perform a security scan on the code (e.g., OWASP ZAP)'
                echo 'Tool: OWASP ZAP'
                // Ideally the security scan steps would be added here
            }
        }
        
        stage('Deploy to Staging') {
            steps {
                echo 'Stage 5: Deploy to Staging - deploy the application to a staging server (e.g., AWS EC2)'
                echo 'Tool: Custom Deployment Script'
                // Add staging deployment steps here
            }
        }
        
        stage('Integration Tests on Staging') {
            steps {
                echo 'Stage 6: Integration Tests on Staging - run integration tests on the staging environment'
                echo 'Tool: Custom Integration Test Framework'
                // Add integration tests on staging step here
            }
        }
        
        stage('Deploy to Production') {
            steps {
                echo 'Stage 7: Deploy to Production - deploy the application to a production server (e.g., AWS EC2)'
                echo 'Tool: Custom Deployment Script'
                // Add production deployment steps here
            }
        }
    }
    
    post {
        failure {
            archiveArtifacts artifacts: 'C:/Program Files/Jenkins/sample.log', allowEmptyArchive: true // Archive sample log file
            emailext to: 'anvishacc@gmail.com', subject: 'Pipeline Failed', body: 'The pipeline has failed. See attached log files for details.', attachmentsPattern: 'C:/Program Files/Jenkins/sample.log'
        }
        success {
            archiveArtifacts artifacts: 'C:/Program Files/Jenkins/sample.log', allowEmptyArchive: true // Archive sample log file
            emailext to: 'anvishacc@gmail.com', subject: 'Pipeline Succeeded', body: 'The pipeline has succeeded. See attached log files for details.', attachmentsPattern: 'C:/Program Files/Jenkins/sample.log'
        }
    }
}
