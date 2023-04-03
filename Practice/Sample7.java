package Practice;

import java.util.ArrayList;

public class Sample7 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	ArrayList a2=new ArrayList();
	a2.add(50);
	a2.add(20);
	a2.add(898);
	a1.retainAll(a2);
	System.out.println(a1);
	System.out.println(a2);
}
}
