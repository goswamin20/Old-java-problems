import java.util.Scanner;

//import STUD.*;
public class Student1 {
public float percentage(int phy, int chem, int bio){
	float per= (phy+chem+bio)/3.0F;
	return per;
}
public void display(Student s, float per){
	if(per>80.0f){
		
	System.out.println(s.getRollNo()+" "+s.getName()+" "+s.getMarkBio()+" "+s.getMarkPhy()+" "+s.getMarkChem()+" "+per);
}}
public static void main(String[] args) {
	Student[] s;
	s=new Student[5];
	
	Scanner a = new Scanner(System.in);
		for(Student i:s){
			Student1 o= new Student1();
		System.out.println("ENTER DETAIL OF STUDENT");
			i=new Student();
			
			int rollNo = a.nextInt();
			i.setRollNo(rollNo);
			
			String name= a.next();
			i.setName(name);
			
			
			int markche = a.nextInt();
			i.setMarkChem(markche);
			
			
			int markphy =a.nextInt();
			i.setMarkPhy(markphy);
			
			
			int markbio=a.nextInt();
			i.setMarkBio(markbio);
			float per= o.percentage(markphy, markche, markbio);
			o.display(i, per);
		
		}
	

}
}

