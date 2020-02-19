package reader_writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingCharacterFromFile2 {

	public static void main(String[] args) {
	
		try {
			FileReader fr = new FileReader("d://io/jaggi.txt");
			int i=0;
			while((i=fr.read())!=-1)
			{
			System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
