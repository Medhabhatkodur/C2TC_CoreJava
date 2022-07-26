package com.cg.abstractMethod;
abstract class Bike{
	abstract void run();
	
}
class Honda extends Bike{

	@Override
	void run() {
		System.out.println("running safely");
		
	}
	
}
public class Main {

	public static void main(String[] args) {
		Honda h=new Honda();
		h.run();

	}

}
