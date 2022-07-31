package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add('A');
		al.add('B');
		al.add("sumit");
		al.add(null);
		al.add(12.33);
		
		System.out.println(al);
		
		al.add(2,"amar");
		System.out.println(al);

		al.remove(2);
		System.out.println(al);

		System.out.println(al.contains(12.33));
		
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("====1====");
		
		Iterator at = al.iterator();
		while(at.hasNext())
		{
			System.out.println(at.next());
		}
		System.out.println("====2====");
		
		ListIterator ay = al.listIterator();
		while(ay.hasNext())
		{
			System.out.println(ay.next());
		}
		System.out.println("====3====");
		
		for(Object b:al)
		{
			System.out.println(b);
		}

	}

}
