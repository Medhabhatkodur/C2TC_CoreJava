package com.cg.interfacedemo;
interface Bike
{
	void getMileage();
}
class R15 implements Bike
{

	@Override
	public void getMileage() {
		System.out.println("mileage is 40km/l");
		
	}
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		R15 bike = new R15();
		bike.getMileage();
	}

}
