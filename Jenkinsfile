pipeline{
    agent any
    stages{
        stage("build"){
            steps{
                script{
                    echo "===============Building Applicationfdd==============="
                    sh "docker build --tag golebu2020/maven-repo:django-payment-app-1.0 ."
                }
            }
        }

        stage("deploy"){
            steps{
                script{
                    echo "===============Deploying Application================="
                    sh "echo Nedu123@# | docker login -u golebu2020 --password-stdin"
                    sh "docker push golebu2020/maven-repo:django-payment-app-1.0"
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