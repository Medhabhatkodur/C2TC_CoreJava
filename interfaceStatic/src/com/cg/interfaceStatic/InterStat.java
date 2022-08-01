package com.cg.interfaceStatic;
interface in1
{
	int a=5;
	 static void display()
	{
		System.out.println("static method");
	}
}
public class InterStat implements in1{

	public static void main(String[] args) {
		in1.display();
	}

}
