package core;

public class OneDimensional {
	
	// Member Variable
	int[] marks; // Array Declaration
	
	public OneDimensional() {
		
		// 1. One of the way of initialization
		/*
		marks = new int[5]; // Reserve Memory
		
		marks[0] = 10;
		marks[1] = 20;
		marks[2] = 30;
		marks[3] = 40;
		marks[4] = 50;
		*/
		
		// Another way 
		marks = new int[] { 10, 20, 30, 400, 50, 60, 70, 2, 55, 10000 };
	}


	public void displayUsigForLoop() {
		System.out.println("Display using normal for loop");
		for(int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
	}

	public void Normaldisplay() {
		System.out.println("Normal Display: ");
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
	}
	
	public void minmax() {
		System.out.println("Find Minimum Maximum: ");
		int min, max;
		min = marks[0];
		max = marks[0];
		for(int i = 0; i < marks.length; i++) {
			// find the minimum
			if(min > marks[i]) min = marks[i];
			// find the Maximum
			if(max < marks[i]) max = marks[i];
		}
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
	}

}
