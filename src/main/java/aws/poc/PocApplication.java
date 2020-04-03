package aws.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PocApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		new PocApplication().configure(new SpringApplicationBuilder(PocApplication.class)).run(args);
	}

}
