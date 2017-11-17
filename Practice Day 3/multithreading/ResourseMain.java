package multithreading;

public class ResourseMain {
public static void main(String[] args) {
	Resource r= new Resource();
	new ResourceThread("good",  r);
	new ResourceThread("better",r);
	 new ResourceThread("best",r);
}
}
