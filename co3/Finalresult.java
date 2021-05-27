package nhk;

import java.util.*;

class student 
{
	String name = "Nihal";
	int roll ;
	int phy ;
	int chem ;
	int maths ;
	public  student()
	{
		Scanner inp1 = new Scanner(System.in);
		System.out.println("Enter Name : ");
		 name = inp1.next();
		 System.out.println("Enter Roll No : ");
		 roll = inp1.nextInt();
		 System.out.println("Enter Marks in physics");
		 phy = inp1.nextInt();
		 System.out.println("Enter Marks in chemistry");
		 chem = inp1.nextInt();
		 System.out.println("Enter Marks in maths");
		 maths = inp1.nextInt();
		
	}
}

class sports extends student
{
	int sc;
	
	public sports()
	{
		Scanner inp2 = new Scanner(System.in);
		System.out.println("Enter Sports Score");
		 sc = inp2.nextInt();
	}
}

class result extends sports
{
	
	public void display()
	{
		System.out.println("Student Academic  Details");
		System.out.println("=========================");
		System.out.println("Name : " + name);
		System.out.println("Roll No : " + roll);
		System.out.println("");
		System.out.println("MARKS");
		System.out.println("==========");
		System.out.println("Physics :" + phy);
		System.out.println("Chemistry :" + chem);
		System.out.println("Maths :" + maths);
		System.out.println("");
		System.out.println("SPORTS SCORE");
		System.out.println("==========");
		System.out.println("Score : " + sc);
		System.out.println("");
	}
}

public class Finalresult {
	
	public static void main(String[] args)
	{
		result obj = new result();
		obj.display();
		
		
	}
	

}
