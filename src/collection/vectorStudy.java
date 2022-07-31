 package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vectorStudy {

	public static void main(String[] args)
	{

		Vector v=new Vector();
		v.add('A');
		v.add('B');
		v.add('C');
		v.add("amar");
		v.add(22);
		v.add(33);
		v.add(44);
		
		System.out.println(v);
		v.remove(2);
		System.out.println(v);
		v.add(2,'s');
		System.out.println(v);
		
		Enumeration at = v.elements();
		while(at.hasMoreElements())
		{
			System.out.println(at.nextElement());
		}
		System.out.println("====1====");
		Iterator ay = v.iterator();
		while(ay.hasNext())
		{
			System.out.println(ay.next());
		}
		System.out.println("====2====");
		ListIterator au = v.listIterator();
		while(au.hasNext())
		{
			System.out.println(au.next());
		}
		
		
		
		
	}

}
