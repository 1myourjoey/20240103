package sec02.exam03;

import java.util.ArrayList;
import java.util.List;

public class VehicleEx {

	public static void main(String[] args) {

		List<String> list = new ArrayList();
//		list.add(123);
		list.add("문자열");
//		list.add(3.14);
//		list.add(new Acc());
		
		for (Object obj : list) {
			String str = (String)obj;
			System.out.println(obj);
		
			
		}
		
		
		Vehicle vehicle = new Bus();
		vehicle.run();
		
		if (vehicle instanceof Bus) {
			System.out.println("가능");
		}

		Bus bus = (Bus) vehicle;

		bus.run();
		bus.checkFare();

	}

}
