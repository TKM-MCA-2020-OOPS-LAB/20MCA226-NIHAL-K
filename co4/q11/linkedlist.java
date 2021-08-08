package collection_framework;

import java.util.*;

public class linkedlist {
	
	 public static void main(String[] args) {
	        int n;
	        String data;
	        LinkedList<String> ll = new LinkedList<String>();
	        System.out.println("Enter  number of data");
	        Scanner sc = new Scanner(System.in);
	        n = sc.nextInt();
	        System.out.println("Enter the data");
	        sc.nextLine();
	        for(int i=0;i<n;i++)
	        {
	            data = sc.nextLine();
	            ll.add(data);
	        }
	        System.out.println("LinkedList: "+ll);
	        System.out.println("Removing all the elements....");
	        ll.clear();
	        System.out.println(ll);
	    }
	


}
