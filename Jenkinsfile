pipeline {
    agent any
    stages {
        stage('test 1') {
            steps {
                sh 'mvn --version'
            }
        }
        stage('test 2') {
            steps {
                sh 'groovy --version'
            }
        }
        stage('test 3') {
            steps {
                sh 'java --version'
            }
        }
        stage('test 4') {
            steps {
                sh 'docker --version'
            }
        }
        stage('test 5') {
            steps {
                sh 'docker-compose --version'
            }
        }
        stage('test 6') {
            steps {
                sh 'ansible --version'
            }
        }
        stage('test 7') {
            steps {
                sh 'sshpass -V'
            }
        }
    }
}
