package output_stream;
import java.io.FileOutputStream;

public class FileOutputStreamExa2 {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("D://io/b.txt");
			String s = "Diwakar Rana is doing good today";
			byte[] arr = s.getBytes();
			fos.write(arr);
			fos.close();
			System.out.println("successfully data insrted");
		}catch(Exception e)
		{
			System.out.println("file not found at specified location");
			e.printStackTrace();
		}
	}
}
