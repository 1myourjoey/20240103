package optional;

import java.util.Optional;

public class OptionalEx {
	public static void main(String[] args) {
		String str = "Hello, World!"; // 널이 아닌 값을 가지는 문자열 변수
		// 옵셔널 객체생성, 값이 널이 아니믈  of()메소드 사용
		Optional<String> optionalStr = Optional.of(str);
		System.out.println(optionalStr); // 출력 옵셔널[헬로월드]
		
		String nullStr = null; // 널값을 가지는 문자열 변수
		// 옵셔널 객체생성, 값이 널이므로 오브널러블 메서드 사용
		Optional<String> optionalNullStr = Optional.ofNullable(nullStr);
		System.out.println(optionalNullStr);// 출력 Optional.empty
		//값을 갖지 않는 빈 옵셔널 객체 생성
		Optional<String> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);// 출력 Optional.empty
	}
}
