package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class StudentSerialize {

	public static void main(String[] args) throws IOException {
		
		Student st = new Student(21,"rana");
		FileOutputStream stu_out = new FileOutputStream("d://io/stu_file.txt");
		ObjectOutputStream oos = new ObjectOutputStream(stu_out);
		oos.writeObject(st);
		oos.flush();
		oos.close();
		System.out.println("succeed ...");
	}
}
