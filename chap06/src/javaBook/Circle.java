package javaBook;

public class Circle {

	int radius; // 원의 반지름
	String name; // 원의 이름

	public double getArea() { // 멤버 메소드
		return 3.14 * radius * radius;
	}

	public Circle(int radius) {
		this(radius, "어떤 원");

	}

	public Circle(int radius, String name) {

		this.radius = radius;
		this.name = name;
	}

	public static void main(String[] args) {

		Circle pizza;
		pizza = new Circle(10);
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적" + area);

		Circle donut = new Circle(2);
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적" + area);

	}
}
