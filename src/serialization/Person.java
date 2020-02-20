package serialization;

import java.io.Serializable;

public class Person implements Serializable {
	
	String name;
	int age;
	transient float amt ;
	
	Person(int age, String name, float amt)
	{
		this.age = age;
		this.name = name;
		this.amt = amt;
	}
}
