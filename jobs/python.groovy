project_name = "jenkins-pipeline-python"
//repo = "git@github.com:danibasconCHAKRAY/test-jenkins-1.git"
repo = "https://github.com/danibasconCHAKRAY/test-jenkins-1"
repo_name = "repo"

pipelineJob(project_name) {
	definition {
		triggers{
			scm('H/1 * * * *')
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
