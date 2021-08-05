//localhost:8080/env-vars.html
//the link above shows all the variables that could be manipulated

pipeline {

    agent any

//     environment {
//         //environment variables go here
//     }

    parameters {
        choice(name: 'VERSION', choices: ['1.1', '1.2', '1.3'], description: 'The version of the application')
        booleanParam(name: 'ExecuteTest', defaultValue: true, description: 'Determines if tests will run')
    }

    stages {
        stage("Build") {
            steps {
                echo "Building from ${BUILD_ID}"
                echo "Version ${params.version}"
            }
        }

        stage("Test"){
            when {
                expression {
                    params.ExecuteTest == true
                }
            }
            steps {
                echo "Testing"
            }
        }

        stage("Deploy") {
            steps {
                echo "Deploying"
            }
        }
    }

    post {
        always {
            // this is triggered everytime
            echo 'Remember to restart your application'
        }

        success {
            // this is triggered when a post is successful
            echo 'Yay, it was completed'
        }

        failure {
            // this is triggered when a pipeline fails
            echo 'Something went wrong, debug time'
        }
    }
}