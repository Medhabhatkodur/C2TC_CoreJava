package com.cg.absttointerface;
interface inter{
	void java();
	void python();
	void c();
}
abstract class student implements inter{

	@Override
	public void java() {
		System.out.println("java programming language");
		
	}

	@Override
	public void python() {
		System.out.println("python programming language");
		
	}

	@Override
	public void c() {
		System.out.println("c programming language");
		
	}
	
}
 class school extends student{
	 public void c() {
		System.out.println("prog lang"); 
	 }
	 
 }
public class Main {

	public static void main(String[] args) {
	school s = new school();
	s.java();
	s.python();
	s.c();
	}

}
