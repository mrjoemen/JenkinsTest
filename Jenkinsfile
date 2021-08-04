//localhost:8080/env-vars.html
//the link above shows all the variables that could be manipulated

pipeline {

    agent any

//     environment {
//         //environment variables go here
//     }

    stages {
        stage("Build") {
            steps {
                echo "Building from ${NODE_NAME}"
            }
        }

        stage("Test") {
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