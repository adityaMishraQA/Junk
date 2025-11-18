pipeline{
    agent any
    stages{
        stage('stag:1 --> cleaning project'){
            steps {
                echo "1 ----> Task"
                bat "mvn clean"
            }
        }
        stage('stage:2 --> Running Smoke Test'){
            steps {
                echo "2 -----> Task"
                bat "mvn test"
            }
        }
        stage('stage:3 --> Display results'){
            steps {
                echo "3 ------> Task"
                bat 'type target\\surefire-reports\\TestSuite.txt'
            }
        }
    }
}
