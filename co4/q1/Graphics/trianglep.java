package Graphics;
import java.util.*;
public class trianglep implements figure
{
	int b,h;
	double area;
	public void getdata()
	{
		Scanner inp1 = new Scanner(System.in);
		System.out.println("Enter Base : ");
		b = inp1.nextInt();
		System.out.println("Enter Height : ");
		h = inp1.nextInt();
		
		
	}
	
	public void area()
	{
		area = 0.5 * b*h;
		System.out.println("Area of Triangle is "+ area);
		System.out.println("\n");

		
	}
}
