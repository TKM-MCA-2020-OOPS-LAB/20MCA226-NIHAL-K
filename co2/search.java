package nhk;

import java.util.Scanner;

public class search {
	public static void main(String [] args)
	{
		int flag = 0,pos=0;
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter no of elements : ");
		int no = inp.nextInt();
		
		
		int arr[] = new int[no];
		
		System.out.println("Enter Elements :");
		
		for(int i=0;i<no;i++)
		{
			arr[i]=inp.nextInt();
		}
		
		
		System.out.println("Enter Element to be searched :");
		int search = inp.nextInt();
		
		
		for(int i=0;i<no;i++)
		{
			if(arr[i] == search)
			{
				 pos = i+1;
	            flag = 1;
			}
			else
			{
				continue;
			}
		}
		
		if(flag ==1)
		{
            System.out.println("Element "+search+" is found at position "+ pos);
		}
		else
		{
			System.out.println("Element is not present");
		}
		
		
	
	}


}
