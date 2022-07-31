package access_specifiers2;

public class Access_specifiers1 {
	private int a=10; 
	int b=20;
	protected int  c=30;
	public int d=40;

	public static void main(String[] args) 
	{
		Access_specifiers1 ac=new Access_specifiers1();
		ac.study5();
		ac.study6();
		ac.study7();
		ac.study8();
		
		System.out.println(ac.a);
		System.out.println(ac.b);
		System.out.println(ac.c);
		System.out.println(ac.d);
		
		
	}

	
	private void study5()
	{
		int add=a+b+c+d;
		System.out.println("this is private "+add);
	}
	 void study6()
	{
		int add=a+b+c+d;
		System.out.println("this is default "+add);
	}
	 protected void study7()
		{
			int add=a+b+c+d;
			System.out.println("this is protected "+add);
		}
	 public void study8()
		{
			int add=a+b+c+d;
			System.out.println("this is public "+add);
		}
	 
}
