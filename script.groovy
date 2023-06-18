def buildApp(){
    echo "===============Building Application==============="
    sh "docker build --tag golebu2020/maven-repo:django-payment-app-1.0 ."
}
return this


def deployApp(){
    echo "===============Deploying Application================="
    withCredentials([usernamePassword(credentialsId: 'dockerhub-credentials', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]){
        sh "echo $PASSWORD | docker login -u $USERNAME --password-stdin"
        sh "docker push golebu2020/maven-repo:django-payment-app-1.0"
    }
} 
return this