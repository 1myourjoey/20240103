package practice;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	private static Logger LOGGER = LoggerFactory.getLogger(Main.class);
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx 
		= new AnnotationConfigApplicationContext
		(DbConfig.class, DbQueryConfig.class);
		
		MemberDao dbQuery = ctx.getBean(MemberDao.class);
		int count = dbQuery.count();
		LOGGER.info("인원 {}명",count);
		String Name = dbQuery.memberName(1);
		LOGGER.info("{}", Name);
//		Member dto = new Member("Kim", "kim@korea.com", "김한나");
//		dbQuery.insert(dto);
		
		Member dto1 = new Member(2,"hong1","kim@korea.com", "김하나");
		dbQuery.update(dto1);
		
		dbQuery.delete(3);
		
		List<Member> list = dbQuery.selectAll2();
		for (Member member : list ) {
			LOGGER.info("{},{},{},{}", 
					member.getMemberno(),member.getId(),
					member.getPw(),member.getName());;
		}
		
	}

}
