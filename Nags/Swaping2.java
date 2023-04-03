package Nags;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Swaping2 {
public static void main(String[] args)
{
	int a=50;
	int b=100;
	a=b-a;
	b=b-a;
	a=a+a;
	System.out.println(a);
	System.out.println(b);
}
}
