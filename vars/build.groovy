def call (){
  echo " Building the code"
  stage("Build Application"){
            steps {
                sh "mvn clean package"
            }

       }
