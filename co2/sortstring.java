package nhk;

import java.util.*;

public class sortstring {
	

//	public static void main(String[] args)
//    {
//        String original = "nihal";
//        char[] chars = original.toCharArray();
//        Arrays.sort(chars);
//        String sorted = new String(chars);
//        System.out.println(sorted);
//    }
	public static void main(String[] args) {
		int count;
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  number of strings: ");
		count = sc.nextInt();
		
		String str_arr[]=new String[count];
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the strings: ");
		for(int i=0;i<count;i++)
		{
			str_arr[i]=sc1.nextLine();
		}
		sc.close();
		sc1.close();
	
		for(int i=0;i<count;i++)
		{
			for(int j=i+1;j<count;j++)
			{
				if(str_arr[i].compareTo(str_arr[j])>0)
				{
					str=str_arr[i];
					str_arr[i]=str_arr[j];
					str_arr[j]=str;
				}
			}
		}
		
		System.out.println("String after sorting: ");
		for(int i=0;i<count;i++)
		{
			System.out.println(str_arr[i]);
		}
		
		
	}
}
