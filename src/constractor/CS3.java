package constractor;

public class CS3 {
     int a,b,sum;
	public static void main(String[] args)  //main method
	{
		
	CS3 t=new CS3();
	t.sum();
		
	}
    
	CS3()
	{
	    a=30;
	    b=40;
	    sum=a+b;
		System.out.println("addition is "+sum);
	}
	
	public void sum()  //non-static method
	{
		int a=70,b=80;
		int sum=a+b;
		 System.out.println("Addition is "+sum);
	}
}
