#!/usr/bin/env groovy
def call (){
  echo " Building the code Hemanth......"
  stage("Build Application"){
            steps {
                sh "mvn clean package"
            }

       }
