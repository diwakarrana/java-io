package input_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamexa1 {

	public static void main(String[] args){
	
		try {
			FileInputStream fis = new FileInputStream("D://io/b.txt");
			int i = fis.read();
			while(i!=-1)
			{
				System.out.print((char)i);
				i = fis.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
