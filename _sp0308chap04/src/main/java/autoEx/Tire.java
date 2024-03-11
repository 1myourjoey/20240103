package autoEx;

import lombok.Setter;

@Setter
public class Tire {
	private String postion;
	 public void roll() {
		 System.out.println(postion + ",");
		 System.out.println("바퀴가 돈다");
	 }

}
