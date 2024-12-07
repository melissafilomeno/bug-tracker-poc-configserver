package com.myorg.bug_tracker_poc_configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class BugTrackerPocConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(BugTrackerPocConfigserverApplication.class, args);
	}

}
