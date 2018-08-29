job("k8s"){
	description("password user")
	keepDependencies(false)
	scm {
		git {
			remote {
				github("danibasconCHAKRAY/vagrant-esxi-nodes", "ssh")
			}
			branch("*/master")
		}
	}
	disabled(false)
	triggers {
		githubPush()
		scm("* * * * *") {
			ignorePostCommitHooks(false)
		}
	}
	concurrentBuild(false)
	steps {
		shell("""#!/bin/bash

set +x
vagrant plugin install vagrant-vmware-esxi
export esxi_password=\$VMWARE

vagrant up prueba  --provider=vmware_esxi --provision""")
	}
	wrappers {
		credentialsBinding {
			string("VMWARE","c8ca2f47-777a-4ac1-85c8-c4b50c880f32")
		}
	}
}
