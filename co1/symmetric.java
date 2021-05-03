package nhk;

import java.util.Scanner;

public class symmetric {
	
	public static void main(String args[])
	{
	int row, col,i,j,val,flag = 1;
	Scanner in = new Scanner(System.in);
	 
	System.out.println("Enter the number of rows");
	row = in.nextInt();
	 
	System.out.println("Enter the number columns");
	col = in.nextInt();
	
	if(row != col)
	{
		System.out.println("Order should be same");
	}
	else
	{
	
	int mat[][] = new int[row][col];
	int trans[][] = new int[col] [row];
	
	System.out.println("Enter the elements of the matrix");
	 
	for ( i= 0 ; i < row ; i++ )
	{ 
	 
	for ( j= 0 ; j < col ;j++ )
	{
	val =in.nextInt();
	mat[i][j] = val;
	trans[i][j]=val;
	}
	 
	System.out.println();
	}
	
	System.out.println("Matrix is :-");
	 
	for ( i= 0 ; i < row ; i++ )
	{ 
	for ( j= 0 ; j < col ;j++ )
	System.out.print(mat[i][j]+"\t");
	 
	System.out.println();
	}
	
	System.out.println("Transpose of Given Matrix:-");
	 
	for ( i= 0 ; i < row ; i++ )
	{ 
	for ( j= 0 ; j < col ;j++ )
	System.out.print(trans[j][i]+"\t");
	 
	System.out.println();
	}
	
	for (i = 0; i < row; i++)
	{
	 for (j = 0; j < col; j++) 
	 {
	   if (mat[i][j] != trans[j][i]) 
	   {
	     flag = 0;
	     break;
	   }
	   
	 }
	}
	  if( flag == 1)
	  {
		  System.out.println("\nThe Given Matrix is Symmetric");
	  }
	  else
	  {
		  System.out.println("\nThe Given Matrix Is Not Symmetric");
	  }
	           
	 }
		
	}
	
	}




