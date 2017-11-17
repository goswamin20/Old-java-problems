package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList<Integer> arr= new ArrayList<Integer>();
	System.out.println("size: "+arr.size());
	arr.add(20);
	System.out.println("size: "+arr.size());
	arr.add(10);
	arr.add(35);
	arr.add(44);
	arr.add(56);
	System.out.println("size: "+arr.size());
	System.out.println(arr);
	arr.add(3, 22);//insertion
	System.out.println("size: "+arr.size());
	System.out.println(arr);
	System.out.println(arr.contains(56));//search
	arr.remove(0);//delete
	System.out.println("size: "+arr.size());
	System.out.println(arr);
	int i=0;
	/*for (int j = 0; j < arr.size(); j++) {
		i+=arr.get(j);
	}*/
	/*for (Integer integer : arr) {
		i+=integer;
	}*/
	Iterator<Integer> k=arr.iterator();
	System.out.println(k.getClass().getName());
	while(k.hasNext()){
		i+=k.next();
	}
	
	
	
	System.out.println("sum :"+i);
}
}
