package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;



import config.AppCtx;
import spring.Client;
import spring.Client2;

public class Main2 {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		
		Client2 client = ctx.getBean(Client2.class);
		client.send();
		ctx.close();
	}

}
