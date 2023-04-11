node {
  stage("Clone the project") {
    git branch: 'main', url: 'https://github.com/DivyaMeghana16/phase2.git'
  }
 
  stage("Compilation") {
    bat "./mvnw clean install -DskipTests"
  }
 
  stage("Tests and run") {
    stage("Running unit tests") {
      bat "./mvnw test -Punit"
    }
    
  }
}
