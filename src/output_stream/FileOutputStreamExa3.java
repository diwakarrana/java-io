package output_stream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExa3 {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("D://io/c.txt");
			BufferedOutputStream bfos = new BufferedOutputStream(fos);
			String s = "Diwakar Rana is doing good today in c file";
			byte[] arr = s.getBytes();
			bfos.write(arr);
			bfos.close();
			System.out.println("successfully data insrted");
		}catch(Exception e)
		{
			System.out.println("file not found at specified location");
			e.printStackTrace();
		}
	}
}
