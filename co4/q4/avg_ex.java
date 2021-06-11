package q4;
import java.util.*;

class neg extends Exception
{
	neg()
	{
		super("*** Negative Number Not Allowed \nTry again :  ");
	}
}

public class avg_ex {

	
	public static void main(String[] args) throws neg
	{
		int n,sum=0,d;
		double avg;
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter limit : ");
		n = inp.nextInt();
		
		
		for(int i=1 ; i<=n;i++)
		{
			try
			{
				System.out.println("Enter Number " + i + " : ");
				d = inp.nextInt();
				if (d < 0)
				{
					i--;
					throw new neg();
					
				}
				else
				{
					sum = sum+d;
				}
			}
			catch(neg e)
			{
				System.out.println(e.getMessage());
				
			}
		}
		
		avg = (double)sum / n ;
		
		System.out.println("\nAverage is : " + avg);
		
	}
}
		
		
	
