package constractor;

//cst without parameter

public class CS2 {
	
	int c,d; 

	public static void main(String[] args) {
		
		CS2 c=new CS2();
		c.add();
		
		c.sum();
		
	}
    
 	public void add() //non-static method without parameter
	{
		int a=10,b=20;
		int add=a+b;
	System.out.println("addition of this no. is "+add);
	
	} 
	
	CS2() //cst
	{
		c=30;
		d=40;
	}
	
	public void sum()  
	{
		int sum=c+d;
		System.out.println("sum is "+sum);	
	}
}
