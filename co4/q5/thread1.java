package q5;
import java.util.*;

class threada extends Thread
{
	public int a;

	public threada(int a) {
		this.a = a;
	}

	public void run()
	{
		System.out.println("\nExecuting First Thread......  \n");
		
	
		System.out.println("Multiplication table of 5 : ");
		
		for(int i =1;i<=a;i++)
		{
			
			System.out.println("5 x "+ i+ " = " +(5*i));
			try {
				threada.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("===== First Thread executed successfully =====");
		}
	}


class threadb extends Thread
{
	
	public int d;
	public threadb(int d) {
		
		this.d = d;
	}

	public void run()
	{
		
		System.out.println("\nExecuting Second Thread..... \n");
	
		System.out.println("Displaying first "+ d  + " prime numbers......");
		int count = 0;
		int prime_count = 1;
		for(int i =2;i<=1000;i++)
	    {
	        count = 0;
	        if(prime_count <=d)
	        {
	        for(int j= i-1;j>=1;j--)
	        {
	            if(i % j == 0)
	          {
	              ++count;
	          }
	          else
	          {
	              continue;
	          }
	        }
	        if(count  == 1)
	      {
	          System.out.println(i);
	          prime_count++;
	      }
	        try {
				threadb.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        }
	        
	  
	       
	    }
		System.out.println("===== Second Thread executed sucessfully =====");
		
	}
}
public class thread1 {
	
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in);
		int a,b;
		System.out.println("Enter Limit of Multiplication Table : ");
		a = inp.nextInt();
		System.out.println("Enter Limit for displaying Prime Numbers :");
		b=inp.nextInt();
		
		threada obj1 = new threada(a);
		obj1.start();
		try {
			obj1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		threadb obj2 = new threadb(b);
		obj2.start();
	
		
	
	}

}
