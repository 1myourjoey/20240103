package sec05.exam02;

public class StudentEx {

	public static void main(String[] args) {
		StudentService ss = StudentService.getInstance();
			ss.student.name = "홍길동";
			ss.student.hakbun = "241010";
			ss.student.kor = 92;
			ss.student.eng = 86;
			ss.student.math = 95;
	
			StudentService ss1 = StudentService.getInstance();
			System.out.println(ss.student.name);
			System.out.println(ss1.student.name);
			
			if (ss.student==ss1.student) {
				System.out.println("같음");
			}
			if (ss.student.equals(ss1.student)) {
				System.out.println("same");
			}

	} // 싱글턴으로 만들어서 개발하는게아니라 프레임워크에서 객체를 만들어 서비스를 할때는
	// 싱글턴으로 서비스가 된다는 것임
		// 그냥 싱글턴은 하나만 만든다는 것임
}
