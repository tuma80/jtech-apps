package com.gcode.using.cloud.spring.config;



import org.cloudfoundry.runtime.env.CloudEnvironment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class CloudAppContextInitializer implements
		ApplicationContextInitializer<ConfigurableApplicationContext> {
	
	private static final Logger logger = LoggerFactory.getLogger(CloudAppContextInitializer.class);

	public void initialize(ConfigurableApplicationContext applicationContext) {
		CloudEnvironment env = new CloudEnvironment();
		if (env.getInstanceInfo() != null) {
			logger.info("Cloud API: " + env.getCloudApiUri());
			applicationContext.getEnvironment().setActiveProfiles("cloud");
		}
		else {
			applicationContext.getEnvironment().setActiveProfiles("default");
		}		
	}
	
	

}
