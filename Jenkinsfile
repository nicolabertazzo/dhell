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
    stage('Amplify') {
        when {branch 'jenkins_pullrequest'}
      steps {
        withMaven(maven: 'maven3', jdk: 'JDK8') {
          sh 'mvn eu.stamp-project:dspot-maven:amplify-unit-tests -Dpath-to-properties=dhell.dspot -Damplifiers=TestDataMutator -Dtest-criterion=JacocoCoverageSelector -Diteration=1'
        }
        sh 'cp -rf target/dspot/output/eu src/test/java/'
      }
    }
    stage('Pull Request') {
      when {branch 'jenkins_pullrequest'}
      steps {
        sh 'git checkout -b amplifybranch-${GIT_BRANCH}-${BUILD_NUMBER}'
        sh 'git commit -a -m "added tests"'
        // CREDENTIALID
        withCredentials([usernamePassword(credentialsId: 'github-user-password', passwordVariable: 'GIT_PASSWORD', usernameVariable: 'GIT_USERNAME')]) {
          // REPOSITORY URL  
          sh('git push https://${GIT_USERNAME}:${GIT_PASSWORD}@${GIT_URL} amplifybranch-${GIT_BRANCH}-${BUILD_NUMBER}')
          withEnv(['GITHUB_USER=${GIT_USERNAME}','GITHUB_PASSWORD=${GIT_PASSWORD}']) {
           sh 'hub pull-request -m "Amplify pull request from build ${BUILD_NUMBER} on ${GIT_BRANCH}"'
          }
        }
      }
    }
  }
   environment {
    GIT_URL = sh (script: 'git config remote.origin.url', returnStdout: true).trim().replaceAll('https://','')
  }
}