package Javaclass;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Sample3 {
	static int x;
	public static void main(String[] args) {
		System.out.println("MAIN STARTS");
		try
		{
		 x = Integer.parseInt("HEllo");
	
		}
		catch(NumberFormatException e)
		{
			System.out.println(x);
			System.out.println("Handeled....");
		}
		System.out.println("Main ends ");
	}

}
