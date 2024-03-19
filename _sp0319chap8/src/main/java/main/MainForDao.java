package main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppCtx;
import spring.Member;
import spring.MemberDao;

public class MainForDao {
	private static Logger LOGGER = LoggerFactory.getLogger(MainForDao.class);
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext
				                         (AppCtx.class );
		
		MemberDao dao = ctx.getBean(MemberDao.class);
		Member member = dao.selectByEmail3("madvirus@madvirus.net");
		LOGGER.info("id:{}, email:{}, pw:{}, name:{}, date:{}",
				member.getId(), member.getEmail(), member.getPassword()
				,member.getName(),member.getRegisterDateTime());
		ctx.close();
	}

}
