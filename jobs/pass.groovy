job("vmware-pass") {
	description("password user")
	keepDependencies(false)
	scm {
		git {
			remote {
				github("danibasconCHAKRAY/prueba", "ssh")
			}
			branch("*/master")
		}
	}
	disabled(false)
	concurrentBuild(false)
	steps {
		shell("""#!/bin/bash

cd vagrant-esxi
pwd
ls
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
