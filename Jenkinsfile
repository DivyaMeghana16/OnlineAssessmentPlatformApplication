node {
  stage("Clone the project") {
    git branch: 'main', url: 'https://github.com/DivyaMeghana16/OnlineAssessmentPlatformApplication.git'
  }
 
 
 stage('Run unit tests') {
            steps {
                sh 'mvn test'
            }
        }
   stage("Deployment") {
      sh 'nohup ./mvnw spring-boot:run -Dserver.port=5050 &'
    }
}
