package cobie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = MenuController.class)
public class CobieMenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(CobieMenuApplication.class, args);
	}
}