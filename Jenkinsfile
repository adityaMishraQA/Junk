pipeline {
    agent any

    stages {
        stage('BesantProject') {
            steps {
                echo "1 ----> Task"
                bat "mvn test"
            }
        }

        stage('1st try') {
            steps {
                echo "2 -----> Task"
                bat "mvn test"
            }
        }

        stage('SauceDemo WebSite Automation') {
            steps {
                echo "3 ------> Task"
                bat "mvn test"
            }
        }
    }
}
