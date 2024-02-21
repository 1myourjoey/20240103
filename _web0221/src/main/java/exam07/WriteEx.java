package exam07;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteEx {

	public static void main(String[] args) {
		try(Writer writer = new FileWriter("C:/temp/test7.txt")) {
			char a = 'A';
			char b = 'B';
			char c = 'C';
			
			writer.write(a);
			writer.write(b);
			writer.write(c);
			
			writer.flush();
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace()	;
		}

	}

}
