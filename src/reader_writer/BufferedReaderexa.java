package reader_writer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderexa {

	public static void main(String[] args) {
	
	try{
		BufferedReader bf = new BufferedReader(new FileReader("d://io/jaggi.txt"));
		int i =0;
		while((i=bf.read())!=-1)
		{
			System.out.print((char)i);
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
