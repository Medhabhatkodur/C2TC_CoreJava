package com.cg.inheritance;

public class Mobile {
private String manufacturer;
private String os;
private String model;
public Mobile(String manufacturer, String os, String model) {
	super();
	this.manufacturer = manufacturer;
	this.os = os;
	this.model = model;
}
public String getModel() {
	return model;
}
@Override
public String toString() {
	return "Mobile [manufacturer=" + manufacturer + ", os=" + os + ", model=" + model + "]";
}
}