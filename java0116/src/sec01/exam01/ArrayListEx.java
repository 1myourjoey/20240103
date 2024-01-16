package sec01.exam01;

import java.util.ArrayList;
import java.util.List;

class Student {
	String name;
	int kor;
	public Student(String name, int kor) {
		
		this.name = name;
		this.kor = kor;
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + "]";
	}
	
}

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<Student> alist = new ArrayList<Student> ();
		List<Student> slist = new ArrayList<>();
		slist.add(new Student("홍길동",90));
		slist.add(new Student("강감찬",80));
		slist.add(new Student("이순신",70));
		for (Student na : slist) {
			System.out.println(na);
		}
		
		
//		ArrayList<String> alist = new ArrayList<String> ();
//		List<String> list = new ArrayList<>();
//
//		
//		list.add("홍길동");
//		list.add("김하나");
//		list.add("강하나");
//		
//		for (String str : list) {
//			System.out.println(str);
//		}
//		list.set(1, "박하나");
//		for(String str : list) {
//			System.out.println(str);
//		}
	}

}
