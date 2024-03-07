package spring;

import lombok.Setter;

@Setter
public class MemberInfoPrinter {
	private MemberDao memberDao; // 책은 memDao인데 롬복쓰려고 수정 appctx 부분에 맞추려고
	private MemberPrinter printer;
	
	public void printMemberInfo(String email) {
		Member member = memberDao.selectByEmail(email);
		if(member==null) {
			System.out.println("데이터 없음\n");
			return;
		}
		printer.print(member);
		System.out.println();
	}

//	public void setMemDao(MemberDao memDao) { // 여기 세터부분 롬복으로 사용가능
//		this.memDao = memDao;
//	}
//
//	public void setPrinter(MemberPrinter printer) {
//		this.printer = printer;
//	}
	
	
}
