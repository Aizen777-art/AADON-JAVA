package oops.concepts;


//Implementing the Interface in a Class
public class Dog implements Animal, Birds{

	@Override
	public void fly() {
		System.out.println("This is Bird Interface class");
	}

	@Override
	public void makesound() {
		System.out.println("This is Animal Interface class");		
	}

}
