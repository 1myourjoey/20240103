package sec02.exam01;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now); // 아래처럼 안하고 이렇게 써도 됨
		String strNow1=now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss ");
		System.err.println(sdf.format(now));
		// 여기까지 예전에 쓰던 것들
		
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);
		
	}

}
