package q6;

import java.io.IOException;

import java.util.*;

class threada implements Runnable
{
	int n,t1=0,t2=1,next=t1+t2;
	public threada(int n) {
		this.n = n;
	}

	public void run()
	{
		System.out.println("\nExecuting First Thread......  \n");
		System.out.println("Fibonacci Series : ");
		System.out.print(t1 + " "+ t2);
		for(int i =3;i<=n;++i)		
		{
			System.out.print( " " + next );
			t1 = t2;
			t2 = next;
			next = t1+t2;
			
		
		}
		System.out.println("\n\n===== First Thread executed successfully =====");
	}


}
class threadb implements Runnable
{
	int n;
	public threadb(int n) {
	this. n =n;
	}

	public void run()
	{
		System.out.println("\nExecuting Second Thread......  \n");
		
		
		System.out.println("Even Numbers : ");
		for(int i = 2;i<=n;i++)
		{
			if(i %2 == 0)
			{
				System.out.print( i + " ");
			}
		}
		System.out.println("\n\n===== Second Thread executed successfully =====");
	}
}
public class thread2 {
	
	public static void main(String[] args)
	{
		int n;
	   
	   Scanner inp = new Scanner(System.in);
	   System.out.println("Enter Limit :  ");
	   n = inp.nextInt();
	   threada obj_f = new threada(n);
	   threadb obj_e = new threadb(n);
	   
	   
	   Thread obj1 = new Thread(obj_f);
	   Thread obj2 = new Thread(obj_e);
	   obj1.start();
	   try {
		obj1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   obj2.start();
	}

}
