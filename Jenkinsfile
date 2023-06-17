pipeline{
    agent any
    stages{
        stage("build"){
            steps{
                script{
                    echo "===============Building Application==============="
                    sh "docker build --tag django-payment-app:1.0 ."
                }
            }
        }

        stage("deploy"){
            steps{
                script{
                    echo "===============Deploying Application================="
                    sh "docker login docker -u golebu2020 -p Nedu123@#"
                    sh "docker push golebu2020/maven-repo:djangoapp-1.0"
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