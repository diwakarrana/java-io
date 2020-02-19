package reader_writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WritingCharacterFromFile {

	public static void main(String[] args) {
	
		try {
			FileReader fr = new FileReader("d://io/jaggi.txt");
			FileWriter fw = new FileWriter("d://io/jaggi_copy.txt");
			int i=0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
				fw.write((char)i);
			}
			fr.close();
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
