package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {


	public static void main(String[] args) {
		Set<Integer> s;
		
		s=new HashSet<Integer>();//no restriction, most efficient as fastest
		s.add(55);
		s.add(34);
		s.add(56);
		s.add(76);
		System.out.println("hashSet: "+s);
		
		s=new LinkedHashSet<Integer>();//by the order of insertion
		s.add(55);
		s.add(34);
		s.add(56);
		s.add(76);
		System.out.println("LinkedSet: "+s);
		
		s= new TreeSet<Integer>();//sorted
		s.add(55);
		s.add(34);
		s.add(56);
		s.add(76);
		System.out.println("TreeSet: "+s);
	}

}
