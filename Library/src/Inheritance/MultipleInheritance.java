package Inheritance;
 class A {
	A(){
		System.out.println("a");
	}
	}
class B extends A{
	B(){
		System.out.println("B");
	}
}
class C extends B{
	C(){
		System.out.println("C");
	}
}

public class MultipleInheritance {
public static void main(String[] args) {
	new C();
}
}
