package file_operations;
import java.io.File;
import java.io.IOException;

public class File_Creation {

	public static void main(String[] args) {
		
		boolean bool =false;
	
		File file = new File("d://io/filecreated.txt");
		try {
			if(file.createNewFile())
				{
				System.out.println("created");
				}
			else{
				System.out.println("not created");
				System.out.println(file);
				File f2 = file.getCanonicalFile();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}
}
