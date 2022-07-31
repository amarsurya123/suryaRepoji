package practice1;

public class MwthodWithParametar {

	public static void main(String[] args) 
	{
		Test1();
		
		MwthodWithParametar mw=new MwthodWithParametar();
		mw.Test2();
		
		Methods.Study3();

	}
	
	public static void Test1()  //static method
	{
		int a=10;
		int b=20;
		int add=a+b;
		System.out.println("addition is "+add);
		
	}
	public void Test2() //non-static method
	{
		int c=30;
		int d=40;
		int sub=c-d;
		System.out.println("subtraction is "+sub);
	}

}
