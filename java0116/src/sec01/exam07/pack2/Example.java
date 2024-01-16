package sec01.exam07.pack2;
class A {
//    public A() {
//        System.out.println("A의 기본 생성자");
//    }

//    public A(int x) {
//        System.out.println("A의 매개변수가 있는 생성자");
//    }
}

class B extends A {
    // super(5)로 A의 매개변수가 있는 생성자 호출
    public B() {
//        super(5);
        System.out.println("B의 기본 생성자");
    }
}

public class Example {
    public static void main(String[] args) {
        B b = new B();
    }
}
