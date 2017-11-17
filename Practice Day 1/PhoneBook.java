package collection;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook implements UserInterface {
	static Map<String,String> map= new HashMap<String, String>();
	public void addNewPhoneBook(String name, String phoneNumber) {
		map.put(phoneNumber, name);
	}

	
	public String searchPhoneBook(String phoneNumber) {
		
		return map.get(phoneNumber);
	}


	public void Quit() {
	System.exit(0);
		
	}

	
	

}
