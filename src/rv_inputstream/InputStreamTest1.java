package rv_inputstream;

import java.io.*;

public class InputStreamTest1 {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("input.txt");
			int i;
			while((i=is.read()) !=-1) {
				System.out.print((char)(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}