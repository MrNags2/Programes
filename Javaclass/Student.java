package Javaclass;

public class Student {
	String emp_name;
	int emp_id;
	double emp_sal;
	Student(String emp_name,int emp_id,double emp_sal)
	{
		this.emp_name=emp_name;
		this.emp_id=emp_id;
		this.emp_sal=emp_sal;
	}
	public String toString()
	{
		return "employe name is "+emp_name+"\nemployee id is "+emp_id+"\n employee salary is "+emp_sal;
	}
	public static void main(String[] args) {
		Student s1=new Student("Suresh",125,52937.48);
				System.out.println(s1);
				Student s2=new Student("mukesh",124,43246.4);
				System.out.println(s2);
	}

}
