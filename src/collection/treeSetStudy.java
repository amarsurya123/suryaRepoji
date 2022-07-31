package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSetStudy {

	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		ts.add(23);
		ts.add(32);
		ts.add(42);
		ts.add(11);
		ts.add(3);
		ts.add(31);
		ts.add(39);
		System.out.println(ts);
		System.out.println(ts.contains(31));
		System.out.println(ts.size());
		System.out.println(ts.contains(3));
		System.out.println("===========");
		
		Iterator s3 = ts.iterator();
		while(s3.hasNext())
		{
			System.out.println(s3.next());
		}
		

	}

}
