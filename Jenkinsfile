pipeline{
    agent any
    stages{
        stage('First Job'){
            steps{
                echo "Running 1st"
                script{
                    build job: '1st try'
                }
            }
        }
        stage('Second Job'){
            steps{
                echo "Running 2nd"
                script{
                    build job: 'BesantProject'
                }
            }
        }
    }
}