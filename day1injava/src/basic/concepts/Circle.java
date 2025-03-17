package basic.concepts;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Circle {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	   
		 System.out.println("Enter the radious of the circle");
		 int a = in.nextInt();
				 
				 float f = (float) (3.14*(a * a));
				 
				 System.out.println("Answer="+f);
		

	}

}
