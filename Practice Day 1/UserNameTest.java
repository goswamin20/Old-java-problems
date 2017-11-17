package collection;

import java.util.Scanner;


public class UserNameTest {

	public static void main(String[] args) {
		Name n =  new Name();
		
		Scanner sc= new Scanner(System.in);
		int i;
		
		do{
			System.out.println("enter : 1.accept 1st name & lasname 2.diplay name 3.exit");
			 i= sc.nextInt();
		switch(i){
		case 1: System.out.println("enter 1st name & last name");
		 n= new Name();
			n.accept(sc.next(), sc.next());
		break;
		case 2: n.display();
		break;
		case 3:n.exit();
		break;
		default: System.out.println("wrong choice entered");
		}
		}while(i!=3);
			
		}	
	}


