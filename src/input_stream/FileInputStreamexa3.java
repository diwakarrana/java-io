package input_stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamexa3 {

	public static void main(String[] args){
	
		try {
			FileInputStream fis = new FileInputStream("D://io/a.txt");
			BufferedInputStream bfis =new BufferedInputStream(fis);
			int i = bfis.read();
			System.out.println((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
