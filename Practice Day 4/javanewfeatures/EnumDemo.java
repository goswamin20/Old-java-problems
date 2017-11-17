package javanewfeatures;

public class EnumDemo {
public static void main(String[] args) {
	Apple ap;
	ap= Apple.RedDel;
	System.out.println(ap);
	switch(ap){
	case Cortland: System.out.println("Cortland");
	break;
	case GoldenDel: System.out.println("GoldenDel");
	break;
	case Jonathan: System.out.println("Jonathan");
	break;
	case RedDel:System.out.println("RedDel");
	break;
	case Winesap: System.out.println("Winesap");
	break;
	
	}
}
}
