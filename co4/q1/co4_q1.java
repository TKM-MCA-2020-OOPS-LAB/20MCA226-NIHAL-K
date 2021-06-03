package nhk;

import Graphics.*;

public class co4_q1 {
	
	public static void main(String[] args)
	{
		
		
		System.out.println("----- Rectangle -----");
		System.out.println("");
		rectanglep obj = new rectanglep();
					obj.getdata();
					obj.area();
		System.out.println("----- Square -----");
		System.out.println("");
				
			squarep obj2 = new squarep();
					obj2.getdata();
					obj2.area();
		System.out.println("----- Triangle -----");
		System.out.println("");
			trianglep obj3 = new trianglep();
					obj3.getdata();
					obj3.area();
		System.out.println("----- Circle -----");
		System.out.println("");
			circlep obj4 = new circlep();
					obj4.getdata();
					obj4.area();
					
		 
				
		
		
	}

}
