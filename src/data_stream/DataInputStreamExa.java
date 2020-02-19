package data_stream;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamExa {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("d://io/jaggi.txt");
		DataInputStream dfis = new DataInputStream(fis);
		int i =0;
		while((i=dfis.read())!=-1)
		{
			System.out.print((char)i);
		}
		dfis.close();

	}

}
