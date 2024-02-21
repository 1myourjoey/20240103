package exam01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx2 {

	public static void main(String[] args) {
		try (InputStream is = new FileInputStream("c:/temp/test2.db")) { // 해당파일을 연다.
			byte[] buffer = new byte[8];
			int num = is.read(buffer, 1, 4);
			if (num != -1) {
				for (int i = 0; i < buffer.length; i++) {
					System.out.println(buffer[i]);
				}
			}

//				while (true) {
//					int cnt = is.read(buffer);
//					if (cnt == -1) {
//						break;
//					}

		} catch (IOException e) {

		}

	}
}
