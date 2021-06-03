package Graphics;

import java.util.*;
public class circlep implements figure
{
	int r;
	double pi = 3.14;
	double area;
	public void getdata()
	{
		Scanner inp1 = new Scanner(System.in);
		System.out.println("Enter radius : ");
		r = inp1.nextInt();
		
		
		
	}
	
	public void area()
	{
		area = pi *(r*r);
		System.out.println("Area of Circle is "+ area);
		System.out.println("\n");

		
	}
}
