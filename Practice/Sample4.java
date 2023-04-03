package Practice;

import java.util.ArrayList;

public class Sample4 {
	public static void main(String[] args) {
		
	
	ArrayList a1=new ArrayList();
	a1.add(58);
	a1.add("ulti");
	a1.add(25.25);
	a1.add(true);
	a1.add('r');
	System.out.println(a1);
	ArrayList a2=new ArrayList();
	a2.add(32);
	a2.add("Kantara");
	a2.add(82.365);
	System.out.println(a2);
	a1.addAll(3,a2);
	System.out.println(a1);
	}
}
