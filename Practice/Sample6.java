package Practice;

import java.util.ArrayList;

public class Sample6 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	ArrayList a2=new ArrayList();
	a2.add(20);
	a2.add(20);
	a2.add(70);
	a2.add(35);
	a1.removeAll(a2);
	System.out.println(a1);
	System.out.println(a2);
}
}
