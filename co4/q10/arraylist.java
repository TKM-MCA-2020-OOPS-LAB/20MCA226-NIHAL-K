package nhk;
import java.util.*;

public class arraylist {
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
//		adding elements
		System.out.println("adding elements");
		list.add("hello");
		list.add("world");
		
		System.out.println(list);
		
//		using iterator
		System.out.println("using iterator");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
//		for each loop
		System.out.println("for each loop");
		
		for(String e:list)
			System.out.println(e);
		
//		get method
		System.out.println("get method");
		System.out.println(list.get(1));
		
//		set method
		System.out.println("set method");
		list.set(1,"nihal");
		for(String e:list)
			System.out.println(e);
		
//		sort
		System.out.println("sort");
		Collections.sort(list);
		System.out.println(list);
		
//		
		System.out.println("size");
		System.out.println(list.size());
		
// removing element
		System.out.println("removing element");
		list.remove(1);
		System.out.println(list);
		
// removing all elements
		System.out.println("removing all elements");
		list.clear();
		System.out.println(list);
		
			
		
	}

}
