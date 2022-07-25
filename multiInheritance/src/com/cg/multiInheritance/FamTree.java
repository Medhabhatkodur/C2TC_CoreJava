package com.cg.multiInheritance;


class grandfather { 

	void display1() {
		System.out.println("grandfather");
	}
}
class father extends grandfather
{
	void display2() {
		System.out.println("father");
	}
}
class grandson extends father 
{
	void display3() {
		System.out.println("grandson");
	}
}
public class FamTree {
	public static void main(String[] args) {
		grandson gs=new grandson();
		gs.display1();
		gs.display2();
		gs.display3();
	}

}
