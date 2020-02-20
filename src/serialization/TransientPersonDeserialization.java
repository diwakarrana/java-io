package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TransientPersonDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d://io/per_file.ser"));
		Person pr = (Person)ois.readObject();
		ois.close();
		System.out.println("student roll no "+pr.age);
		System.out.println("student name is "+pr.name);
		System.out.println("person amount amt = "+pr.amt);
	}

}
