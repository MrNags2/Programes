package Practice;

import java.util.AbstractList;
import java.util.ArrayList;

public class Sample1 {
public static void main(String[] args) {
	AbstractList a1=new ArrayList();
	a1.add(58);
	a1.add("ulti");
	a1.add(25.54);
	a1.add(true);
	a1.add('r');
	System.out.println(a1);
	a1.add(65);
	System.out.println(a1);
}
}
