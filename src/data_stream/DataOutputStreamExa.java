package data_stream;

import java.io.FileOutputStream;
import java.io.DataOutputStream;

public class DataOutputStreamExa {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("d://io/data_output_stream.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		String str = "welcome to java DataOutputStream";
		byte[] byteArray = str.getBytes();
		dos.write(byteArray);
		System.out.println("..........data inserted successful");
		dos.close();
		fos.close();
	}
}
