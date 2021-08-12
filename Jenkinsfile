node {

    stage("checkout repo") {
        git branch: 'master',
        credentialsId: '975b8af9-ff8d-47e0-ab38-42f798902f5c',
        url: 'https://gitlab.com/semen4ik20/java_jan_2019.git'
    }

    stage("build"){
        sh "./gradlew clean assemble"
    }

    stage("run api tests"){
        sh "./gradlew test"
    }

    allure([
             includeProperties: false,
             jdk: '',
             properties: [],
             reportBuildPolicy: 'ALWAYS',
             results: [[path: 'build/allure-results']]
    ])
}
