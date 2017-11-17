package multithreading;

public class MyThread extends Thread {
	public MyThread(String name) {
		super(name);
		//or
		setName(name);
		this.start();
	}
	
	
	public void run() {
		for (int i = 0; i <10; i++) {
		
			System.out.println(getName()+" "+i);
			
		}

		
	}

	/*public static void main(String[] args) {
	//create thread-new state
		MyThread t1= new MyThread();
		//stastTthread-ready state
		t1.start();
		for (int i = 0; i < 10; i++) {
			
			System.out.println("main"+i);
		}
	}*/
}
