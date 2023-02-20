package crt_classes;

abstract class Bank{
	abstract double getIntrestRate();
}

class Citi extends Bank{
	double getIntrestRate() {
		return 7;
	}
}

class HSBC extends Bank{
	double getIntrestRate() {
		return 6.8;
	}
}

class SBI extends Bank{
	double getIntrestRate() {
		return 6.5;
	}
}
public class Abstract {

	public static void main(String[] args) {
		Bank b;
		b =new Citi();
		System.out.println("Citi intrest rates are "+b.getIntrestRate()+" %");
		b =new HSBC();
		System.out.println("HSBC intrest rates are "+b.getIntrestRate()+" %");
		b =new SBI();
		System.out.println("HSBC intrest rates are "+b.getIntrestRate()+" %");
	}
}