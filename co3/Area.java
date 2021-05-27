package nhk;

import java.util.*;

 interface shapes
{
	void area();
	void perimeter();
}

class circle implements shapes
{
	int r ;
	double pi = 3.14,area,perimeter;
	
    public circle()
	{
    	Scanner inp1 = new Scanner(System.in);
		System.out.println("Enter Radius : ");
		r = inp1.nextInt();
	}
	public void area()
	{
		
		area = pi * r  *r;
		System.out.println("Area of circle with radius "+r+" is " + area);
		
	}
	public void perimeter()
	{
		perimeter = 2 * pi * r;
		System.out.println("Perimeter of circle with radius "+r+" is " + perimeter);
	}
}

class rectangle implements shapes
{
   int l ,b;
   int area,perimeter;
   
   public rectangle()
   {
	   Scanner inp2 = new Scanner(System.in);
		System.out.println("Enter Length of rectangle : ");
		l = inp2.nextInt();
		System.out.println("Enter Breadth of rectangle : ");
		b = inp2.nextInt(); 
   }
    public void area()
    {
    	
		area = l *b;
		System.out.println("Area of rectangle is  : " + area);
		
    }
    public void perimeter()
    {
    	perimeter = 2 *(l+b);
    	System.out.println("Perimeter of rectangle is  : " + perimeter);
    }
}



public class Area {

	
	public static void main(String[] args)
	{
		int ch1,ch2;
		Scanner inp3 = new Scanner(System.in);
		System.out.println("Select a shape \n 1.Circle \n 2.Rectangle");
		System.out.println("Enter Your Choice : ");
		ch1 = inp3.nextInt();
		switch(ch1)
		{
			case 1 : circle objc = new circle();
					System.out.println("Find \n1.Area \n2.Perimeter");
					System.out.println("Enter Your Choice : ");
					ch2 = inp3.nextInt();
					switch(ch2)
					{
					case 1 : objc.area();
								break;
					case 2 : objc.perimeter();
					            break;
					default : System.out.println("Invalid choice");
					}
					break;
			
			case 2 :	rectangle objr = new rectangle();
						System.out.println("Find \n1.Area \n2.Perimeter");
						System.out.println("Enter Your Choice : ");
						ch2 = inp3.nextInt();
						switch(ch2)
						{
						case 1 : objr.area();
								break;
						case 2 : objr.perimeter();
			            		break;
						default : System.out.println("Invalid choice");
						}
						break;
			default : System.out.println("Invalid choice");
			
		}
	}
}
