package input_output;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWriteFile {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("d://io/read.txt");
		BufferedInputStream bfis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("d://io/bufferedwrite.txt");
		BufferedOutputStream bfos = new BufferedOutputStream(fos);
		int i = bfis.read();
		while(i!=-1)
		{
			bfos.write(i);
			i = bfis.read();
		}
		System.out.println("data successfully copied");
		bfis.close();
		bfos.close();
	}

}
