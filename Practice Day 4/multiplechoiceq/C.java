package multiplechoiceq;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class C {
@SuppressWarnings("unused")
public static void main(String[] args) {
	B b= new B();
	ObjectOutputStream o;
	try {
		o = new ObjectOutputStream(new FileOutputStream("datatfile.txt"));
		o.writeObject(b);
		ObjectInputStream oin= new ObjectInputStream(new FileInputStream("datatfile.txt"));
		B z= (B) oin.readObject();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
