package collections.Framework;

import java.util.ArrayList;
import java.util.List;

public class CollectionArrayList {
	// A) List (Allows Duplicates, Ordered)
	public void checkArrayList() {
		
		// Creating an ArrayList
		List<String> list = new ArrayList<>();
		
		 // Adding elements
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		
		// Inserting at a specific index
		list.add(1, "Mango");
		
		// Accessing elements by index
		System.out.println("First fruit: " + list.get(1)); // Apple
		
		// Updating an element
        list.set(2, "Grapes");
        
        // Removing an element
        list.remove("Orange");
        
        // Iterating using a loop
        for(String fruit: list) {
        	System.out.println(fruit);
        }
        
		// System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
