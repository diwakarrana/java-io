package reader_writer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferedwriterexa {

	public static void main(String[] args) {
	
	try{
		BufferedReader bf = new BufferedReader(new FileReader("d://io/jaggi.txt"));
		BufferedWriter buffer = new BufferedWriter(new FileWriter("d://io/buffer_writer.txt"));
		int i =0;
		while((i=bf.read())!=-1)
		{
			System.out.print((char)i);
			buffer.write((char)i);
		}
	}catch(FileNotFoundException fnfe) {
	fnfe.printStackTrace();
	}
	catch (IOException ioe) {
		// TODO: handle exception
		ioe.printStackTrace();
	}
	}
}
