package crt_classes;

abstract class Car{
	abstract void accelerate();
}

class Suzuki extends Car{
	void accelerate() {
		System.out.println("Suzuki::Acceleration");
	}
}
public class Abstract {

	public static void main(String[] args) {
		Suzuki car =new Suzuki();
		car.accelerate();
	}

}
