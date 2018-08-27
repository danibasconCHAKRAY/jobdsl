project_name = "jenkins-pipeline-python"
repo = "git@github.com:danibasconCHAKRAY/ansible-jnekins-cicd.git"
repo_name = "repo"

pipelineJob(project_name) {
	definition {
		triggers {
			scm ("M/1 * * * *")
		}

		sps5cm {
			scm {
				git {
					remote {
						name(repo_name)
						url{repo}
					}
				}
				scriptPath("Jenkinsfile")
			}
		}
	}
}
