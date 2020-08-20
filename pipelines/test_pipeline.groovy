@Library("shared")
import gtvfx.jenkins.Helpers


pipeline {
    agent {label "master"}
    stages {
        stage('validate Helpers') {
            steps {
                script {
                    def helpers = new Helpers
                    println("helpers: " + helpers)
                }
            }
        }
    }
}