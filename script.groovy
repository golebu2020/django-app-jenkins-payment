def buildApp(){
    echo "===============Building Application==============="
    sh "docker build --tag my-app:1.0 ."
}
return this


def deployApp(){
    echo "===============Deploying Application================="
    withCredentials([usernamePassword(credentialsId: 'nexus-credentials', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]){
        sh "echo $PASSWORD | docker login -u $USERNAME --password-stdin 159.203.28.198:8082"
        sh "docker tag my-app:1.0 159.203.28.198:8081/my-app:1.0"
        sh "docker push 159.203.28.198:8081/my-app:1.0"
    }
} 
return this
