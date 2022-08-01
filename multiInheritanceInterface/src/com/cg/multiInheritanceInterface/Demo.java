package com.cg.multiInheritanceInterface;
interface FirstInter{
	public void myMethod();
}
interface SecondInter {
	public void myOtherMethod();
}
class Democlass implements FirstInter,SecondInter {

	@Override
	public void myOtherMethod() {
		System.out.println("second interface");
		
	}

	@Override
	public void myMethod() {
		System.out.println("first interface");
		
	}
	
}
public class Demo {

	public static void main(String[] args) {
		Democlass myObj = new Democlass();
		myObj.myMethod();
		myObj.myOtherMethod();
	}

}
