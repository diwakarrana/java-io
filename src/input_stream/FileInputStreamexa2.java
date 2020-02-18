package input_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamexa2 {

	public static void main(String[] args){
	
		try {
			FileInputStream fis = new FileInputStream("D://io/a.txt");
			int i = fis.read();
			System.out.println((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
