package j9l1;

class parentClass {
	void parentMethod() {
		System.out.println("This is a parent class");

	}
}

class childClass extends parentClass {
	void childMethod() {
		System.out.println("This is a child class");
	}
}

public class LabOne {
	public static void main(String[] args) {
		parentClass p = new parentClass();
		childClass c = new childClass();
		p.parentMethod();
		c.childMethod();
		c.parentMethod();

	}

}
