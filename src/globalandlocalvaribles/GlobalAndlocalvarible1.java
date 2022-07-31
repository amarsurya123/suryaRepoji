package globalandlocalvaribles;

public class GlobalAndlocalvarible1 {
	int a=10; //non-static global variable
	int b=20; //non-static global variable
	static int c=40; //static global variable

	public static void main(String[] args)   //main method
	{
		Test1();  //static method
		GlobalAndlocalvarible1 g=new GlobalAndlocalvarible1();//creating object by same class 
		g.Test(); //calling non-static method by object 
		System.out.println("addition1 is "+g.a); //calling global non-static varibale
		System.out.println(g.b); //calling global
		int add=100+c;
		System.out.println("add "+add); //
		int sub=c-g.b;
		System.out.println("sub "+sub);
		int add1=c+g.b;
		System.out.println("add1 "+add1);
		int add2=c+Sampal.n;
		System.out.println("add2 "+add2);
		Sampal s1=new Sampal(); //creating object by anthor class
	    int add3=g.a+g.b+s1.m;
		System.out.println("addition3 is "+add3);
		
		
	  Sampal.Disply1(); //static variable
	  Sampal s=new Sampal();
	  s.Disply();
	  System.out.println("multiplicatin is "+s.m); 
	  System.out.println(s.n);
	  
	}
 
	public void Test()
	{
		int add=a+b;
		System.out.println("addition is "+add);
	}
	public static void Test1()
	{
		int sub=10+c;
		System.out.println("substraction is "+sub);
	}
}
