package mamassgnmnt;



public class CalFact extends Thread{
Value  v;
public CalFact(Value v) {

	this.v = v;
}
public void run() {
	
	fact(v);
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void fact(Value v) {
	while(true){
		if(v.n==1){
			break;
		}
	int n1=v.n;
	int i=v.n-1;
	System.out.println(n1);
	while(true){
		n1=n1*i;
		i=i-1;
		if(i==2){
			break;
		}
	}
	System.out.println("factorial:"+i);
}
}
}
