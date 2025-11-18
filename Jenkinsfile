pipeline{
    agent any
    stages{
        stage('stag1'){
            steps {
                echo "1 ----> Task"
                bat "mvn test"
            }
        }
        stage('stage2'){
            steps {
                echo "2 -----> Task"
                bat "mvn test"
            }
        }
        stage('stage3'){
            steps {
                echo "3 ------> Task"
                bat "mvn test"
            }
        }
    }
}
