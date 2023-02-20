package crt_classes;

abstract class Bank{
	abstract int getIntrestRate();
}

class Citi extends Bank{
	int getIntrestRate() {
		return 7;
	}
}
class HSBC extends Bank{
	int getIntrestRate() {
		return 6;
	}
}
public class Abstract {

	public static void main(String[] args) {
		Bank b;
		b =new Citi();
		System.out.println("Citi intrest rates are "+b.getIntrestRate()+"%");
		b =new HSBC();
		System.out.println("HSBC intrest rates are "+b.getIntrestRate()+"%");
	}
}