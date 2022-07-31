package practice1;

public class Static1 {

	public static void main(String[] args) //main method
	{
//		test(40,20); //calling from same class
//		
//		StaticAnotherClass.Test2(); //calling from anthor class of static method
      Static1 s=new Static1();
      s.Work(20,30);
		
      StaticAnotherClass t=new StaticAnotherClass();
      t.Test3();
      
      
		
		
	}
	
//	public static void test(int a,int b)    //regular method -static methode
//	{
//		
//		int add=a+b;
//		System.out.println("addition is "+add);
//		
//	}

	
	 public void Work(int e,int r)  //non-static method of same class
	 {
		 int mul=e*r;
		 System.out.println("multiplication is "+mul);
	 }
	
	
	
}
