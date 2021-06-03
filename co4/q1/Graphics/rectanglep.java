package Graphics;

import java.util.*;
public class rectanglep implements figure {
	int l,b,area;
	public void getdata()
	{
		Scanner inp1 = new Scanner(System.in);
		System.out.println("Enter Length : ");
		l = inp1.nextInt();
		System.out.println("Enter Breadth : ");
		b = inp1.nextInt();
		
		
	}
	
	public void area()
	{
		area = l*b;
		System.out.println("Area of rectangle is : "+ area);
		System.out.println("\n");

		
	}

}
