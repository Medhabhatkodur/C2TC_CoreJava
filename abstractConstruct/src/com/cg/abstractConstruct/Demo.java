package com.cg.abstractConstruct;
abstract class Bike{
 public Bike()
{
	System.out.println("bike is created");
}
 abstract void run();
 void changeGear() {
	 System.out.println("gear changed");
 }
}
class Honda extends Bike{
	void run() {
		System.out.println("running safely");
	}
}
public class Demo {

	public static void main(String[] args) {
		Honda h =new Honda();
		h.run();
		h.changeGear();

	}

}
