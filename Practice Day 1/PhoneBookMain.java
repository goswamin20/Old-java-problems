package collection;

import java.util.Scanner;

public class PhoneBookMain {


	public static void main(String[] args) {
		PhoneBook p= new PhoneBook();
		Scanner sc= new Scanner(System.in);
		int i;
		do{
	System.out.println("enter: 1.add new phone book entry 2.search phone number 3.quit");
	
	 i= sc.nextInt();
	switch (i) {
	case 1:System.out.println("enter name and phone number ");
		p.addNewPhoneBook(sc.next(), sc.next());
		
		break;
case 2:System.out.println("enter phone number whose name is to be searched");
		String name=p.searchPhoneBook(sc.next());
		System.out.println(name);
		break;
case 3:System.out.println("thank you for using app");
	p.Quit();
	
	break;
	default:
		break;
	}}while(i!=3);

	}

}
