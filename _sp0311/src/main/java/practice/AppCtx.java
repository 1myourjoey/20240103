package practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {

	@Bean
	public MemberDao memberDao () {
		return new MemberDao();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc()	{
		return new MemberRegisterService()	;
	}
	@Bean
	public ChangePasswordService changePwd() {
		return new ChangePasswordService();
	}
	
	
}
