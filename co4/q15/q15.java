package nhk;

import java.util.*;

public class q15 {
	
		public static void main(String[] args) {
			
			LinkedHashSet<String> l = new LinkedHashSet<String>();
			
			//  Inserting data 
			l.add("Nihal");
			l.add("Nithin");
			l.add("Shad");
			l.add("Amjiyad");
			
			
			System.out.println("The LinkedHashSet is : "+l);
			
			//Size  
			System.out.println("Size is "+l.size());
			
			
			//removing
			l.remove("Amjiyad");
			System.out.println("Updated Set : "+l);
			
		
			//Checking
			System.out.println(l.contains("Nihal"));
			
			
	}
}
