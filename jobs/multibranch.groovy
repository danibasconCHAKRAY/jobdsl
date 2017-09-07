multibranchPipelineJob('python-deploy') {
    triggers {
        periodic(1)
    }
    branchSources {
        git {
            remote("git@github.com:videocursoscloud/test-jenkins-1.git")
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
