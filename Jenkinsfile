pipeline{
    agent any
    stages{
        stage("build"){
            steps{
                script{
                    echo "===============Building Application Discard old builds==============="
                    sh "docker build --tag golebu2020/maven-repo:django-payment-app-1.0 ."
                }
            }
        }

        stage("deploy"){
            steps{
                script{
                    echo "===============Deploying Application================="
                    withCredentials([usernamePassword(credentialsId: 'dockerhub-credentials', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]){
                        sh "echo $PASSWORD | docker login -u $USERNAME --password-stdin"
                        sh "docker push golebu2020/maven-repo:django-payment-app-1.0"
                    }

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