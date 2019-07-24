package com.sahil.inheritance;

class Vehicle {

	private String color;
	private int no_of_wheels;
	private String model;
	
	public Vehicle()
	{
		color="white";
		no_of_wheels=4;
		model="basic";
	}

	public String getColor() {
		return color;
	}

	public int getNo_of_wheels() {
		return no_of_wheels;
	}

	public String getModel() {
		return model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setNo_of_wheels(int no_of_wheels) {
		this.no_of_wheels = no_of_wheels;
	}

	public void setModel(String model) {
		this.model = model;
	}

}

class Truck extends Vehicle {

	int load_capacity;
	
	public void showInfo() {
		System.out.println("I am from truck class with color " + getColor() + ",no of wheels " + getNo_of_wheels()
				+ " and model as " + getModel()+" and load capacity is "+load_capacity);
	}

}

class Bus extends Vehicle {
	public void showInfo() {
		System.out.println("I am from Bus class with color " + getColor() + ",no of wheels " + getNo_of_wheels()
				+ " and model as " + getModel());
	}
}

class Car extends Vehicle {
	
	int numgears;
	boolean isConvertible;
	
	public void showInfo() {
		System.out.println("I am from Car class with color " + getColor() + ",no of wheels " + getNo_of_wheels()
				+ " and model as " + getModel()+" and no of gears is "+numgears+" and the car is convertible "+isConvertible);
	}
}

public class Road {
	
	public static void main(String []args)
	{
		Truck tobj=new Truck();
		tobj.setColor("Black");
		tobj.setNo_of_wheels(12);
		tobj.setModel("basic");
		tobj.load_capacity=100;
		tobj.showInfo();
		
		Bus bobj=new Bus();
		bobj.setColor("Blue");
		bobj.setModel("AC/Sleeper");
		bobj.setNo_of_wheels(10);
		bobj.showInfo();
		
		Car cobj=new Car();
		cobj.setColor("Red");
		cobj.setModel("Luxury");
		cobj.setNo_of_wheels(4);
		cobj.numgears=6;
		cobj.isConvertible=true;
		cobj.showInfo();
		
		Vehicle vobj=new Car();
		System.out.println("color is "+vobj.getColor()+" model is "+vobj.getModel()+" no_of wheels is "+vobj.getNo_of_wheels());
	}

}
