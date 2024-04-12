package com.acarajecorp.sbfipe;

import com.acarajecorp.sbfipe.application.Program;
import com.acarajecorp.sbfipe.service.ConsumeAPI;
import com.acarajecorp.sbfipe.service.ConvertData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbFipeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SbFipeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Program mainProgram = new Program();
		mainProgram.showMenu();

	}
}
