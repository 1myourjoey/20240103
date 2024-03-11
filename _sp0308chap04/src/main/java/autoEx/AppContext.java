package autoEx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

	@Bean 
	public Car car() {
		return new Car();
	}
	
	@Bean
	public Engine engine() {
		return new Engine();
	}
	@Bean
	public Tire tire () {
		return new Tire();
	}


}
