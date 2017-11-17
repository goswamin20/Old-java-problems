package javanewfeatures;



public class Varargs {
	static void vaTest(String msg,int...v){
		System.out.println(msg+" "+v.length+"contents: ");
		for(int x:v)
			System.out.println(x+" ");
	}
static void arrTest(int...v){
	System.out.println("no og arguments:"+v.length);
	for(int x:v){
		System.out.println(x+" ");
	}
	
}
public static void main(String[] args) {
	arrTest(10,20);
	arrTest(10,20,30);
	vaTest("one varags", 10);
	vaTest("three varargs", 1,2,3);
}
}
