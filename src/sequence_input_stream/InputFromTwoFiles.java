package sequence_input_stream;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class InputFromTwoFiles {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis1 = new FileInputStream("d://io/jaggi.txt");
		FileInputStream fis2 = new FileInputStream("d://io/read.txt");
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		int i=0;
		while((i=sis.read())!=-1)
		{
			System.out.print((char)i);
		}
		sis.close();
	}//end of main function
}// end of class
