package multithreading;

public class PriorityThread extends Thread {
@Override
public void run() {
	for (int i = 0; i < 10; i++) {
		System.out.println(getName()+":"+getPriority()+":"+i);
	}
}
public static void main(String[] args) {
	PriorityThread p1= new PriorityThread();
	PriorityThread p2= new PriorityThread();
	PriorityThread p3= new PriorityThread();
	
	p1.setPriority(8);
	p2.setPriority(6);
	p3.setPriority(3);
	
	p1.start();
	p2.start();
	p3.start();
}
}
