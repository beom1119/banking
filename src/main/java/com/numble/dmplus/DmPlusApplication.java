package com.numble.dmplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.numble.dmplus.dm")
public class DmPlusApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmPlusApplication.class, args);
	}

}
