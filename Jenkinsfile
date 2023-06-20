#!/usr/bin/env groovy

def gv
pipeline{
    agent any
    stages{
        stage("init"){
            steps{
                script{
                    gv = load "script.groovy"
                }
            }
        }
        stage("build"){
            steps{
                script{
                   gv.buildApp()
                }
            }
        }

        stage("login"){
            steps{
                script{
                    gv.login()
                }
            }
        }

        stage("deploy"){
            steps{
                script{
                   gv.deployApp()
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