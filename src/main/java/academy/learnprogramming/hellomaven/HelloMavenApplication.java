package academy.learnprogramming.hellomaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloMavenApplication {

	public static void main(String[] args) {

		System.out.println("Hello Maven");

		SpringApplication.run(HelloMavenApplication.class, args);
	}

}
