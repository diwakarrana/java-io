package data_stream;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamExa2 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("d://io/jaggi.txt");
		DataInputStream dfis = new DataInputStream(fis);
		int count = fis.available();
		byte[] array = new byte[count];
		dfis.read(array);
		for(byte b :array)
		{
			System.out.print((char)b);
		}
		dfis.close();
	}
}
