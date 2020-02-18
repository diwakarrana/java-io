package output_stream;
import java.io.FileOutputStream;

public class FileOutputStreamExa1 {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("D://io/f.txt");
			fos.write(66);
			fos.write(66);
			fos.write(75);
			fos.close();
			System.out.println("successfully data insrted");
		}catch(Exception e)
		{
			System.out.println("file not found at specified location");
			e.printStackTrace();
		}
	}
}
