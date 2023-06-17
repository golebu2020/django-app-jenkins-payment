pipeline{
    agent any
    stages{
        stage("build"){
            steps{
                script{
                    echo "===============Building Application==============="
                }
            }
        }

        stage("deploy"){
            steps{
                script{
                    echo "===============Deploying Application================="
                }
            }  
        }
    }
    post{
        always{
            echo "========always========"
        }
        success{
            echo "========pipeline executed successfully ========"
        }
        failure{
            echo "========pipeline execution failed========"
        }
    }
}