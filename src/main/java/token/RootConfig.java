package token;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = { "classpath:application.properties" }, ignoreResourceNotFound = true)
public class RootConfig {

	@Bean
	public TokenProperties tokenProperties() {
		return new TokenProperties();
	}

}
