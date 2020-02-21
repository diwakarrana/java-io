package file_operations;
import java.io.File;
import java.io.IOException;

public class File_Creation2 {

	public static void main(String[] args) throws IOException {
		
		File fi = new File("d://io/filex.txt");
		fi.createNewFile(); 
		System.out.println(fi);
		System.out.println("does file exist -> "+ fi.exists());	
		System.out.println(fi.getAbsolutePath());
	}
}
