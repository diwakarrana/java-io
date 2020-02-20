package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d://io/stu_file.txt"));
		Student stud = (Student)ois.readObject();
		ois.close();
		System.out.println("student roll no "+stud.rollNumber);
		System.out.println("student name is "+stud.name);
	}

}
