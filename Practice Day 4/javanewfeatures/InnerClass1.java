package javanewfeatures;

public class InnerClass1 {
int x=100;
void show(){
	System.out.println("x is:"+x);
}
static class Inner_class {
	static int y= 200;
	static void add(){
		InnerClass1 i= new InnerClass1();
		i.show();
		int z= i.x+y;
		System.out.println("z is "+z);
	}
	
}
public static void main(String[] args) {
		Inner_class.add();
}
}
