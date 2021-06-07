package nhk;

import Arithmetic.*;
import java.util.*;
public class co4_q2 {
		
	public static void main(String[] args)
	{
		double a,b;
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter First Number");
		a= inp.nextDouble();
		System.out.println("Enter Second Number");
		b= inp.nextDouble();
		System.out.println("----- Addition -----");
		add obj = new add();
		obj.output(a,b);
		System.out.println("");
		System.out.println("----- Subtraction -----");
		subtraction obj1 = new subtraction();
		obj1.output(a,b);
		System.out.println("");
		System.out.println("----- Multiplication -----");
		multiplication obj2 = new multiplication();
		obj2.output(a,b);
		System.out.println("");
		System.out.println("----- Division -----");
		division obj3 = new division();
		obj3.output(a,b);
		System.out.println("");
		System.out.println("----- Modulus -----");
		modulo obj4 = new modulo();
		obj4.output(a,b);
	}

}
