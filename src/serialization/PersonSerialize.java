package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class PersonSerialize {

	public static void main(String[] args) throws IOException {
		
		Person pr = new Person(21,"rana",400);
		FileOutputStream per_out = new FileOutputStream("d://io/per_file.ser");
		ObjectOutputStream oos = new ObjectOutputStream(per_out);
		oos.writeObject(pr);
		oos.flush();
		oos.close();
		System.out.println("succeed");
	}
}
