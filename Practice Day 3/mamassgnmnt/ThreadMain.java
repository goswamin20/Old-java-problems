package mamassgnmnt;

public class ThreadMain {
	public static void main(String[] args) {
		Value v= new Value();
		Read r= new Read(v);
		
		CalFact c= new CalFact(v);
		r.start();
		c.start();
	}
}
