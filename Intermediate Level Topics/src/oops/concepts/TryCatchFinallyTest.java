package oops.concepts;

import java.util.Scanner;

// Exception Handling
public class TryCatchFinallyTest {
	
	Scanner in = new Scanner(System.in);
	
	// member variable
	int result;
	// private int[] b = {1, 2, 3, 4, 5}; 
	
	// member function
	public void exceptionTest() {
		System.out.println("Enter Value A: ");
		int a = in.nextInt();
		System.out.println("Enter Value B: ");
		int b = in.nextInt();
		try {
			result = a/b;
			System.out.println("result " + result);
		} catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
			// System.out.println("Error: Wrong Input.. try again..");
		} finally {
			System.out.println("Program End...");
		}
	}

}
