package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import spring.Client;
import spring.Client2;

@Configuration
public class AppCtx {

	@Bean
	@Scope("prototype")
	public Client clietn() {
		Client client = new Client ();
		client.setHost("host");
		return client;
	}
	@Bean(initMethod = "conncet")
	@Scope("Singleton")
	public Client2 client2 () {
		Client2 client = new Client2();
		client.setHost("host");
		return client;
	}
	
}
