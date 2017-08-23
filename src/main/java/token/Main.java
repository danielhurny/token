package token;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;



//@Configuration
//@SpringBootApplication
//
//public class Main {
//
//	public static void main(String[] args) {
//		SpringApplication.run(Main.class, args);
//
//	}
//	
//}

@SpringBootApplication
public class Main extends SpringBootServletInitializer {
 
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Main.class);
    }
 
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}