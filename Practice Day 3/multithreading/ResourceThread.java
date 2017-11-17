package multithreading;

public class ResourceThread extends Thread {
String msg;
Resource r;
public ResourceThread(String msg, Resource r) {
	super();
	this.msg = msg;
	this.r = r;
	start();
}


	public void run() {
		r.printMsg(msg);
	}
	
}
