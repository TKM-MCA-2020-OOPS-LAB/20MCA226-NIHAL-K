package Graphics;

import java.util.*;

public class squarep implements figure
{
	int s,area;
	public void getdata()
	{
		Scanner inp1 = new Scanner(System.in);
		System.out.println("Enter the length of a side : ");
		s = inp1.nextInt();
	
		
		
	}
	
	public void area()
	{
		area = s*s;
		System.out.println("Area of Square is "+ area);
		System.out.println("\n");

		
	}
}
