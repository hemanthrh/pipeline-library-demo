#!/usr/bin/env groovy
def call (){
  stage("Build Application"){
            steps {
                sh "mvn clean package"
            }

       }
}
