package excepEx;

public class NumberForMatEecep {

	public static void main(String[] args) {
		
		
		try {
			int x = Integer.parseInt("aa");
			System.out.println(x);
		}
		catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}

	}

}
