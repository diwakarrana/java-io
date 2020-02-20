package serialization;

import java.io.Serializable;

public class Student implements Serializable {
	
	int rollNumber;
	String name;
	
	Student(int rollNumber, String name)
	{
		this.rollNumber = rollNumber;
		this.name = name;
	}
}
