package collection;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee>{
	public int compare(Employee arg0, Employee arg1) {
		String i1,i2;
		i1=arg0.getEmpName();
		i2=arg1.getEmpName();
		/*if(arg0.getEmpId()>arg1.getEmpId()){
			return 1;
		}
		else if(arg0.getEmpId()==arg1.getEmpId()){
			return 0;
		}
		else {
			return -1;
		}*/
		return i1.compareTo(i2);
	}
}
