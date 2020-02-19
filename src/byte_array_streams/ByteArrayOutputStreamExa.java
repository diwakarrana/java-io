package byte_array_streams;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;


public class ByteArrayOutputStreamExa {
// ByteArrayInputStream is used to write common data into multiple files
	public static void main(String[] args) throws Exception {
		
		FileOutputStream fout1 = new FileOutputStream("d://io/file1.txt");
		FileOutputStream fout2 = new FileOutputStream("d://io/file2.txt");
		FileOutputStream fout3 = new FileOutputStream("d://io/file3.txt");
		
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		String str = "Diwakar Rana is writing common data to multiple files";
		byte[] arr = str.getBytes();
		bout.write(arr);
		bout.writeTo(fout1);
		bout.writeTo(fout2);
		bout.writeTo(fout3);
		System.out.println("data is inserted into multiple files successfully");
		bout.close();
		fout1.close();
		fout2.close();
		fout3.close();
	}
}
