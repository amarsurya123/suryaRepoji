package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) 
	{
		MethodOverloading p=new MethodOverloading();
		p.add1();
		p.add1(30,20);
		p.add1(22,33f);

	}
	public void add1()
	{
		System.out.println("addition");
	}
	public void add1(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public void add1(int a,float b)
	{
	    float sum1=a+b;
		System.out.println(sum1);
	}

}
