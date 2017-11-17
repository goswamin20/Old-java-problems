package mamassgnmnt;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read extends Thread {
	Value v;
	static int[] arr= new int[5];
public int[] getArr() {
		return arr;
	}
	
public void run() {
	BufferedReader fr=null;
	int i=0;
	try {
	 fr= new BufferedReader(new FileReader("Number.txt"));
	 String data;
	 int a;
	 while((data=fr.readLine())!=null){
		 
		a=Integer.parseInt(data);
		
		arr[i]=a;
		System.out.println(arr[i]);
		
		v.n= arr[i];
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		v.n=1;
		i++;
	 }

	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally{
		try {
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}

public Read(Value v) {
	super();
	this.v = v;
}

}
