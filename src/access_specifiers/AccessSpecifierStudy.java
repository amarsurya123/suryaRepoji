package access_specifiers;

public class AccessSpecifierStudy {
	
	private int a=10;  //private global veribles
	public int b=20;   //public global veribles
	protected int c=30; //protected global veribles
     int d=40;   //default global veribles
	public static void main(String[] args) 
	{
		AccessSpecifierStudy as=new AccessSpecifierStudy();
		as.study1();
		as.study2();
		as.study3();
		as.study4();
		
		System.out.println(as.a);
		System.out.println(as.b);
		System.out.println(as.c);
		System.out.println(as.d);

	}
	public void study1()  //public method
	{    
		int add=a+b+c+d;
	    System.out.println("this is public "+add);	
	}
	
	private void study2()  //private method
	{
		int sub=a-b-c-d;
		System.out.println("this is private "+sub);
	}
	
	void study3()  //default method
	{
		int mul=a*b*c*d;
		System.out.println("this is default "+mul);
	}
	protected void study4() //protected global veribles
	{
		int add1=a+b+c+d;
		System.out.println("this is protected "+add1);
	}
 
}
