pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        withMaven(maven: 'maven3', jdk: 'JDK8') {
          sh 'mvn compile'
        }
      }
    }
    stage('Unit Tests') {
      steps {
        withMaven(maven: 'maven3', jdk: 'JDK8') {
          sh 'mvn test'
        }
        junit(testResults: 'target/surefire-reports/*.xml', allowEmptyResults: true)
      }
    }
    stage('Test your tests') {
      steps {
        withMaven(maven: 'maven3', jdk: 'JDK8') {
          sh 'mvn org.pitest:pitest-maven:mutationCoverage -DoutputFormats=HTML'
        }
        publishHTML (target: [
      		allowMissing: false,
      		alwaysLinkToLastBuild: false,
      		keepAll: true,
      		reportDir: 'target/pit-reports',
      		reportFiles: '**/index.html',
      		reportName: "Pit Decartes"
    	])
      }
    }
    stage('Amplify') {
      steps {
       withEnv(['MAVEN_HOME=/var/jenkins_home/tools/hudson.tasks.Maven_MavenInstallation/maven3']) {
          dspot(showReports: true)
       }
      }
    }
  }
   environment {
    GIT_URL = sh (script: 'git config remote.origin.url', returnStdout: true).trim().replaceAll('https://','')
  }
}
