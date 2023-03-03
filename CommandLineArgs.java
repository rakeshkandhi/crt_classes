package crt_classes;

//import java.awt.*;
import java.util.Arrays;
public class CommandLineArgs extends Thread {

	public static void main(String[] args) {
//		for (int i = 0; i < args.length; i++)
//			System.out.println(args[i]);
		System.out.println(Arrays.toString(args));
		Thread t1 = Thread.currentThread();
		System.out.println(t1.isAlive());
		Thread t = Thread.currentThread();
		t.setName("New Thread");
		System.out.println(t.getName());
		new newthread();
	}
}

class newthread implements Runnable {
	Thread t1, t2;

	newthread() {
		t1 = new Thread(this, "Thread_l");
		t2 = new Thread(this, "Thread");
		t1.start();
		t2.start();
	}

	public void run() {
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.equals(t2));
	}
}