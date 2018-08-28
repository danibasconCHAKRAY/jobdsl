project_name = "jenkins-pipeline-python2"
//repo = "git@github.com:danibasconCHAKRAY/test-jenkins-1.git"
repo = "https://github.com/danibasconCHAKRAY/test-jenkins-1"
repo_name = "repo"

pipelineJob(project_name) {
	definition {
		triggers{
			scm('* * * * *')
		}

		cpsScm{
			scm {
				git {
					remote {
					name(repo_name)
					url(repo)
					}
				}
				scriptPath("Jenkinsfile")
			}
		}
	}
}
