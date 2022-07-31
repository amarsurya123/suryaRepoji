package practice1;    
                            //method- 1.main method
                                 //   2.regular method- 1)static method
           //classname                                            //  2)non-static method
public class Practice1 {

	public static void main(String[] args)  //main method
	{  
		Test();
		
		Practice1 p=new Practice1(); //creating object in non-static by same class
		p.Test1(); //calling method name by same class
		
		Study1.work(); //calling static method from another class 
		
		Study1 s=new Study1(); //creating object in non-static by another class
		s.work1(); //calling method name by another class
		
	}
	                 //methodname
	public static void Test()  //static method  = methodname()
	{  int a=10;
	   int b=20;
	   int add=a+b;
	   System.out.println("addition is "+add);
	   
		
	}
	public void Test1()//non-static method = classname.methodname()
	{
		 int c=30;
		 int d=40;
		 int sub=c-d;
		 System.out.println("substraction is "+sub);
		
	}
	

}
