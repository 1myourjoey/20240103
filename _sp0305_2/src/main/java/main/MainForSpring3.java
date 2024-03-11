package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConf1;
import config.AppConf2;
import config.AppCtx;
import spring.ChangePasswordService;
import spring.DuplicateMemberException;
import spring.MemberInfoPrinter;
import spring.MemberListPrinter;
import spring.MemberNotFoundException;
import spring.MemberRegisterService;
import spring.RegisterRequest;
import spring.VersionPrinter;
import spring.WrongIdPasswordException;
import spring.MemberPrinter;

public class MainForSpring3 {
	
	private static ApplicationContext ctx = null;
	
	public static void main (String [] args) throws IOException {
		
		ctx = new AnnotationConfigApplicationContext
				(AppConf1.class, AppConf2.class);
		//@Configuraion의 해당 객체도 Bean으로 취급
		AppConf1 appConf1 = ctx.getBean(AppConf1.class);
		System.out.println(appConf1!=null); // 97p
	}

}
		
		
		
		
		
		
		
