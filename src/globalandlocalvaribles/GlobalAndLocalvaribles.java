package globalandlocalvaribles;

public class GlobalAndLocalvaribles {
	   
	    int a=10;          // non-static global varibles
	    int b=20;          //non-static global varibles
	    static int c=30;   //static global varibles
	    static int d=40;   //static global varibles
	    
		public static void main(String[] args)
		{
			GlobalAndLocalvaribles g=new GlobalAndLocalvaribles(); //object created
			g.add();  //calling non-static method using object
			add1();   //calling static method in same class
		}
		public void add()   //non-static method
		{   //we can call static & non-static varibles in non-static method
			int sum=a+b;
			int sum1=c+d;
			System.out.println("addition is "+sum);
			System.out.println("addition is "+sum1);
		}
	    public static void add1()   //static method
	    {  //we can call static veribles in static method
	    	int sum2=c+d; //static varibles
	    	System.out.println("addition is "+sum2);
	    }
	}


