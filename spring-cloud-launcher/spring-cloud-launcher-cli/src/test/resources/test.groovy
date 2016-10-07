import org.springframework.cloud.launcher.deployer.Deployer

//@Grab("io.projectreactor:reactor-core:3.0.2.RELEASE")
@Grab("org.springframework.cloud.launcher:spring-cloud-launcher-deployer:1.2.0.BUILD-SNAPSHOT")
//@Grab("org.springframework.cloud:spring-cloud-deployer-cloudfoundry:1.0.1.RELEASE")
@Grab("org.springframework.cloud:spring-cloud-deployer-local:1.0.3.BUILD-SNAPSHOT")
@Import(org.springframework.cloud.launcher.deployer.DeployerConfiguration)
class Main {

	private Deployer deployer
	
	Main(Deployer deployer) {
		this.deployer = deployer
	}
	
	@Bean
	CommandLineRunner runner() {
		{ args ->
			println "Starting..."
			deployer.deploy()
		}
	}
	
}