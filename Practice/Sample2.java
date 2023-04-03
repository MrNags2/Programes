package Practice;

import java.util.ArrayList;

public class Sample2 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(58);
	a1.add("ulti");
	a1.add(25.25);
	a1.add(true);
	a1.add('r');
	System.out.println(a1);
	a1.add(2,56);
	System.out.println(a1);
}
}
