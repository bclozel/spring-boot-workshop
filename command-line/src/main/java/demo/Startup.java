package demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Startup implements CommandLineRunner {

	@Override
	public void run(String... strings) throws Exception {
		System.out.println("Hello World!");
	}
}
