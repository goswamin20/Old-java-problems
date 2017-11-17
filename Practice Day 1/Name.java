package collection;

import java.util.Vector;

public class Name implements UserInt {
	private String firstName,LastName;
	static Vector<Name> v= new Vector<Name>();


	public void display() {
		System.out.println(v);
		/*for(Enumeration<Name> e= v.elements();e.hasMoreElements();e.nextElement() ){
	System.out.println(e);
		}*/
	}


	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", LastName=" + LastName + "]";
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public void exit() {
		System.exit(0);

	}


	public void accept(String next, String next2) {
		this.firstName= next;
		this.LastName=next2;
		v.add(this);
		
	}


	


	

}
