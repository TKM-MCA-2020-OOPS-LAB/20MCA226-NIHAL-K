package nhk;

import java.util.*; 

public class addcomplex {
	
	public static void main(String [] args)
	{
		int a1,b1,a2,b2; //complex no = a+ib or a-ib
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the real part of first complex no : ");
		a1 = inp.nextInt();
		
		System.out.println("Enter the imaginary part of first complex no : ");
		b1 = inp.nextInt();
		
		System.out.println("Enter the real part of second complex no : ");
		a2 = inp.nextInt();
		
		System.out.println("Enter the imaginary part of second complex no : ");
		b2 = inp.nextInt();
		
		System.out.println("The Complex numbers are  ");
		System.out.println("First = " +a1 + "+" +b1 + "i");
		System.out.println("Second = " +a2 + "+" +b2+ "i" );
		
		int a3 = a1+a2;
		int b3 = b1+b2;
		System.out.println("Sum of the complex numbers is "+a3 + "+"+b3+"i");
		
		
	
	}

}
