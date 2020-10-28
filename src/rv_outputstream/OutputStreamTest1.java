package rv_outputstream;

import java.io.*;

public class OutputStreamTest1 {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("output.txt");
			byte[] bs = new byte[26];
			byte data = 'A';
			for(int i=0; i<bs.length; i++) {
				bs[i] = data;
				data++;
			}
			os.write(bs);  //A~Z
			os.write(10);  //한줄 뛰우기
			os.write(bs, 2, 10);  //CDEFGHIJKL
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 수행 완료");
	}

}
