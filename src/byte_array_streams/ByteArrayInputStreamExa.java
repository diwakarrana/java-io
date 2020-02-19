package byte_array_streams;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;

public class ByteArrayInputStreamExa {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("d://io/file1.txt");
		int x = fis.available();
		byte[] arr = new byte[x];
		fis.read(arr);
		ByteArrayInputStream bais = new ByteArrayInputStream(arr); 
		int i=0;
		while((i=bais.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println(" done");
		bais.close();
		fis.close();

	}

}
