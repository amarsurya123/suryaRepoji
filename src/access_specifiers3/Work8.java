package access_specifiers3;

import access_specifiers2.Access_specifiers1;

public class Work8 extends Access_specifiers1 {

	public static void main(String[] args)
	{
		Access_specifiers1 as=new Access_specifiers1();
		as.study8();
	
		
		System.out.println(as.d);
		
		Work8 w1=new Work8();
		w1.study7();
		w1.study8();
		System.out.println(w1.c);
		System.out.println(w1.d);
		
		
	}

}
