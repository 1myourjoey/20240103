package sec05.exam02;

public class StudentService {
	Student student = new Student(); // 싱글턴안에서 객체를 생성한 것임

	private static StudentService studentservice = new StudentService();

	private StudentService() {
	}

	public static StudentService getInstance() {
		return studentservice;
	}

}
