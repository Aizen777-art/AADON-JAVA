package oops.concepts;

//import java.io.PrintStream;

public class Vehicle {
	
	// PrintStream p = System.out;
	
	protected String Make, Color, Owner;
	protected float Price;
	
	// default constructor 
	public Vehicle() {
		Make = "";
		Color = "";
		Owner = "";
		Price = 0;
	}

	// parameterized constructor
	public Vehicle(String make, String color, String owner, float price) {
		Make = make;
		Color = color;
		Owner = owner;
		Price = price;
	}
	
	public void display() {
		System.out.println("Vehicle Particulars: ");
		System.out.println("Male : " + Make);
		System.out.println("Color: " + Color);
		System.out.println("Owner: " + Owner);
		System.out.println("Price: " + Price);

	}
	
}
