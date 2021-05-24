package nhk;

import java.util.*;


class Publisher
{
	String pub;
	public Publisher()
	{
		Scanner inp1 = new Scanner(System.in);
		System.out.println("Enter the publisher : ");
		pub = inp1.next();
		
	}
}

 class cbook extends Publisher
{
	String bn,category;
	
	
	public cbook()
	{
		Scanner inp2 = new Scanner(System.in);
		System.out.println("Enter Book name : ");
		bn = inp2.next();
		System.out.println("Enter Category : ");
		category = inp2.next();
		
		
		
	}
	
	public void display()
	{
		System.out.println("Publisher : "+pub);
		System.out.println("Book  : "+bn);
		
	}
}

class literature extends  cbook
{
	public void l_display()
	{
		System.out.println("Category : Literature");
	}
}

class fiction extends  literature
{
	public void f_display()
	{
		System.out.println("Category : Fiction");
	}
}

public class Book {
	
	
	public static void main(String [] args)
	{
		String cat;
		int no;
		Scanner inp3 = new Scanner(System.in);
		System.out.println("Enter no of books");
		no = inp3.nextInt();
		
		fiction obj[] = new fiction[10];
		
		System.out.println("====== Enter book details ====== ");
		
		for(int i=0;i<no;i++)
		{
			System.out.println("Book : "+(i+1));
			System.out.println("--------");
			obj[i] = new fiction();
		}
		
		
		System.out.println("Which category of the books you want to display (fiction / literature) ? ");
		cat = inp3.next();
	
		int cf =1,cl=1;
		boolean end = false;
		for(int i = 0;i<no;i++) {
			
		
	    if(cat.equals(obj[i].category) && cat.equals("fiction") )
	    {
	        System.out.println("====== Book : "+cf+" ======" );
	    	obj[i].display();
	    	obj[i].f_display();
	    	++cf;
	    	end = true;
	    
	    }
	    if (cat.equals(obj[i].category) && cat.equals("literature"))
	    {
	    	System.out.println("====== Book : "+cl+" ======" );
	    	obj[i].display();
	    	obj[i].l_display();
	    	++cl;
	    	end = true;
	    		
	    }
	    
	    	
	}
		if(end == false)
		{
			System.out.println("Enter category correctly..!!");
		}
		
		
	}

}
