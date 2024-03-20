package main;

import java.util.List;

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
		
		Member member3 = new Member("aaa@korea.com", "2345", "강감찬",null);
		dao.update(member3);
		LOGGER.info("----member 1행 업데이트----");
		
		Member member2 = new Member("aaa3@korea.com","1234","홍길동3",null);
		dao.insert(member2);
		LOGGER.info("----member 1행 삽입----");
		LOGGER.info("새로 입력된 회원 ID:	{}",member2.getId());
		
		int cnt = dao.count();
		LOGGER.info("----member 카운트 횟수----");
		LOGGER.info("ALL : {}", cnt);
		
		List<Member> list = dao.selectAll();
		LOGGER.info("----member 테이블 내용----");
		for(Member member : list) {
			LOGGER.info(member.toString());
		}
		LOGGER.info("----member 테이블 내용 끝----");
		Member member = dao.selectByEmail3("madvirus@madvirus.net");
		LOGGER.info("id:{}, email:{}, pw:{}, name:{}, date:{}",
				member.getId(), member.getEmail(), member.getPassword()
				,member.getName(),member.getRegisterDateTime());
		ctx.close();
	}

}
