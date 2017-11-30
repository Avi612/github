pipeline { 
    agent any  
    stages { 
        stage('Build') { 
            steps { 
               echo 'This is a minimal pipeline.' 
         stage('compile') {
             steps {
               sh 'mvn clean install'
               }       
            }
        }
    }
}
