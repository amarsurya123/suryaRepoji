package practice1;

public class ConstractorPractice {
	int a,b;

	public static void main(String[] args)
	{
		ConstractorPractice c1=new ConstractorPractice();
		c1.Test();
		
		ConstractorPractice c2=new ConstractorPractice(20,30);
		c2.Test();
		

	}
	
	public ConstractorPractice()
	{
		 a=70;
		 b=20;
		
	}
	
	public void Test()
	{
		int add=a+b;
		System.out.println("addition is "+add);
		
	}
	
	public ConstractorPractice(int d,int c)
	{
		a=d;
		b=c;
		
		
	}

}
