package com.cg.staticVariable;
public class Stud{
	int usn;
	String name;
	static String college="ITS";
	
	
	public Stud(int usn, String name) {
		super();
		this.usn = usn;
		this.name = name;
	}
	

void display() {
	System.out.println(usn+" "+name+" "+college);
}


	public static void main(String[] args) {
		Stud s1=new Stud(11,"Karan");
		Stud s2=new Stud(12,"Manya");
		s1.display();
		s2.display();

	}

}
