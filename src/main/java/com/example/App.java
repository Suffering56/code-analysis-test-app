package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

	private static final String APP_VERSION = "0.1";

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("APP_VERSION = " + APP_VERSION);

		throwPmdWarning();
		throwSpotbugsWarning();
	}

	private void throwPmdWarning() {
		try {
			//throw pmd error
		} catch (Exception e) {
			//throw pmd error
		}
	}

	private void throwSpotbugsWarning() {
		final String s = "012345";

		Integer x = null;
		if (s.substring(0, 1).equals("0")) {
			x = 10;
		}

		boolean result = x.equals(15);

		if (result) {
			System.out.println("Unbelievable!");
		}
	}
}
