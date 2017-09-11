multibranchPipelineJob('lambdas-snaphosts') {
    triggers {
        periodic(1)
    }
    branchSources {
        git {
            remote("git@github.com:videocursoscloud/lambda-snapshots.git")
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
