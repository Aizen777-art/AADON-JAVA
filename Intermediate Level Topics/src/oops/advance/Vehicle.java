package oops.advance;

public abstract class Vehicle {
	abstract public void start(); // Abstract method (no implementation)
	
	void stop() {
		System.out.println("Vehicle stopped.");
	}
}
