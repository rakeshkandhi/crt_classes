package crt_classes;

class parents {
	String myStr;

	public parents(String name) {
		myStr = name;
	}
}

class child extends parents {
	String myStr;

	public child(String name1, String name2) {
		super(name1);
		this.myStr = name2;
	}

	public void print() {
		System.out.println("parent class\t" + super.myStr + "\nChild class\t" + myStr);
	}
}

public class SuperKey {

	public static void main(String[] args) {
		child ch = new child("Rakesh", "Rohith");
		ch.print();
	}

}
