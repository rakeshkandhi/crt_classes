package crt_classes;

abstract class car{
	abstract void accelerate();
}

class Suzuki extends car{
	void accelerate() {
		System.out.println("Suzuki::Acceleration");
	}
}
public class Abstract {

	public static void main(String[] args) {
		car obj =new Suzuki();
		obj.accelerate();
	}

}
