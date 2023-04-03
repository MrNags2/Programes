package Nags;

public class Encapsulation {
	private int x=1234;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}
class Nagraj
{
	public static void main(String[] args) {
		Encapsulation e1=new Encapsulation();
		System.out.println(e1.getX());
	}
}
