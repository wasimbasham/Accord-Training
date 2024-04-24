package j14l2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Students implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;

	public Students(String name, int age) {
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class LabThree {
	public static void main(String[] args) {
		Students student = new Students("Wasim", 24);
		serializeStudent(student);
	}

	public static void serializeStudent(Students student) {
		try {
			String filename = student.getName() + ".ser";
			FileOutputStream fileOut = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(student);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in " + filename);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
