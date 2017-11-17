package multithreading;

public class MultipleThreads {
public static void main(String[] args) {
	//create 3 threads
	MyThread t1= new MyThread("One");
	MyThread t2= new MyThread("two");
	MyThread t3= new MyThread("three");

	System.out.println(t1);
	System.out.println(t2);
	System.out.println(t3);
	//t1.start();
	//t2.start();
	//t3.start();
}
}
