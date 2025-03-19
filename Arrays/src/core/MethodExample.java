package core;

public class MethodExample {
	
	// Member Variable can access to getter and setter
	private int a = 10;
	private String myName = "Sudhesh";
	
	public int getA() {
		return a;
	}

	public String getMyName() {
		return myName;
	}

//	public void setMyName(String myName) {
//		this.myName = myName;
//	}

	/**
	 * Function Syntax:
	 * access-specifiers return-type function-name(arguments){
	 * 	function statement
	 * }
	 */
	// Without argument without return type
	private void display() {
		System.out.println("Test Method");
	}
	
	// Without argument with return type
	
	public String display1() {
		display();
		return myName;
	}
	
	// with argument with return type
	public String display2(String fname, String lname, int age) {
		System.out.println(age);
		return fname + lname; 
	}
	
}
