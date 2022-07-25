package com.cg.methodOverriding;

public class vehicle {
 void run()
{
	System.out.println("vehicle is running");
}
}
class Bike extends vehicle{
	void run()
	{
		System.out.println("bike is running safely");
	}

	public static void main(String[] args) {
		Bike obj=new Bike();
		obj.run();
	
	}
}




