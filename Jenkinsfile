pipeline {
    agent any
    stages {
        stage("checkout repo") {
            steps {
               git branch: 'master',
               credentialsId: '187607e9-da15-459f-8cda-89667b6ff92c',
               url: 'https://github.com/SergeyPirogov/graphql-training.git'
            }
        }

        stage("build"){
            steps {
                sh "./gradlew clean assemble"
            }
        }

        stage("run api tests"){
            steps {
                sh "./gradlew test"
            }
        }
    }

    post {
            always {
                allure([
                         includeProperties: false,
                         jdk: '',
                         properties: [],
                         reportBuildPolicy: 'ALWAYS',
                         results: [[path: 'build/allure-results']]
                ])
            }
    }
}







