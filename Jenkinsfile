pipeline {
  agent any
  stages {
    stage('Configuration') {
      steps {
        sh '''echo ${pom}
echo ${artefactName}
echo ${mvnHome}'''
      }
    }
    stage('Build') {
      steps {
        sh 'sh "${mvnHome}/bin/mvn clean compile"'
      }
    }
    stage('Unit Tests') {
      steps {
        sh '${mvnHome}/bin/mvn test'
        junit(testResults: 'target/surefire-reports/*.xml', allowEmptyResults: true)
      }
    }
  }
  environment {
    pom = 'readMavenPom file:\'pom.xml\''
    artefactName = '"${pom.getArtifactId()}.${pom.getPackaging()}"'
    mvnHome = 'tool name: \'maven3\', type: \'hudson.tasks.Maven$MavenInstallation\''
  }
}