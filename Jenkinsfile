pipeline { 
    agent any  
    stages { 
        stage('Build') { 
            steps { 
               echo 'This is a minimal pipeline.' 
         stage('maven') {
             steps {
                 sh 'mvn install'
                  }
               }       
            }
        }
    }
}

