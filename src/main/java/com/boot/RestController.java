package com.boot;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	
	// mvn io.fabric8:fabric8-maven-plugin:3.5.33:setup
	
	/*If you are running with Windows with Git BASH:

		$ if [[ ! -d "$HOME/bin" ]]; then mkdir -p "$HOME/bin"; fi && \
		curl -L https://github.com/docker/machine/releases/download/v0.13.0/docker-machine-Windows-x86_64.exe > "$HOME/bin/docker-machine.exe" && \
		chmod +x "$HOME/bin/docker-machine.exe"*/
	
	String hostname = System.getenv().getOrDefault("HOSTNAME", "unknown");
	
	@RequestMapping("/")
	public String index() {
		return "Greeting from spring boot from "+hostname;
	}

}
