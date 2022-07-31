package constractor;

public class CS1 {
     int c,d,add;
	public static void main(String[] args)  //main method
	{
		
	CS1 t=new CS1();
	t.sum();	
	}
    
	CS1()
	{
	    c=30;
	    d=50;
	    add=c+d;
		System.out.println("addition is "+add);
	}
	
	public void sum()  //non-static method
	{
		int a=70,b=80;
		int sum=a+b;
		 System.out.println("Addition is "+sum);
	}
}
