package nhk;
import java.util.*;


public class areaofshapes {
	
	void area(double r)
	{
		double area = 3.14 *r*r;
		System.out.println("Area of circle is "+area);
		
	}
	
	void area(int a)
	{
		int area = a*a;
		System.out.println("Area of square is "+area);
		
	}
	void area(int l , int b)
	{
		int area = l*b;
		System.out.println("Area of rectangle is "+area);
		
	}

	public static void main(String args[])
	{
		areaofshapes obj = new areaofshapes();
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter radius of circle : ");
		double r = inp.nextDouble();
		obj.area(r);
		System.out.println("Enter the side of the square : ");
		int a = inp.nextInt();
		obj.area(a);
		System.out.println("Enter length and breadth of rectangle : ");
		int l = inp.nextInt();
		int b = inp.nextInt();
		inp.close();
		obj.area(l, b);
		
	
	}
	
}
